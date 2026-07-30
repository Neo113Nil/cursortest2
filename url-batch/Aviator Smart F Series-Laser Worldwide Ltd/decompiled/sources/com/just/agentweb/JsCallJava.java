package com.just.agentweb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JsCallJava {
    private static final String[] IGNORE_UNSAFE_METHODS = {"getClass", "hashCode", "notify", "notifyAll", "equals", "toString", "wait"};
    private static final String KEY_ARGS = "args";
    private static final String KEY_METHOD = "method";
    private static final String KEY_OBJ = "obj";
    private static final String KEY_TYPES = "types";
    private static final String MSG_PROMPT_HEADER = "AgentWeb:";
    private static final String RETURN_RESULT_FORMAT = "{\"CODE\": %d, \"result\": %s}";
    private static final String TAG = "JsCallJava";
    private Object mInterfaceObj;
    private String mInterfacedName;
    private HashMap<String, Method> mMethodsMap;
    private String mPreloadInterfaceJs;

    public JsCallJava(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("injected name can not be null");
            }
            this.mInterfaceObj = obj;
            this.mInterfacedName = str;
            this.mMethodsMap = new HashMap<>();
            Method[] methods = this.mInterfaceObj.getClass().getMethods();
            StringBuilder sb = new StringBuilder("javascript:(function(b){console.log(\"");
            sb.append(this.mInterfacedName);
            sb.append(" init begin\");var a={queue:[],callback:function(){var d=Array.prototype.slice.call(arguments,0);var c=d.shift();var e=d.shift();this.queue[c].apply(this,d);if(!e){delete this.queue[c]}}};");
            for (Method method : methods) {
                Log.i("Info", "method:" + method);
                String genJavaMethodSign = genJavaMethodSign(method);
                if (genJavaMethodSign != null) {
                    this.mMethodsMap.put(genJavaMethodSign, method);
                    sb.append(String.format("a.%s=", method.getName()));
                }
            }
            sb.append("function(){var f=Array.prototype.slice.call(arguments,0);if(f.length<1){throw\"");
            sb.append(this.mInterfacedName);
            sb.append(" call result, message:miss method name\"}var e=[];for(var h=1;h<f.length;h++){var c=f[h];var j=typeof c;e[e.length]=j;if(j==\"function\"){var d=a.queue.length;a.queue[d]=c;f[h]=d}}var k = new Date().getTime();var l = f.shift();var m=prompt('");
            sb.append(MSG_PROMPT_HEADER);
            sb.append("'+JSON.stringify(");
            sb.append(promptMsgFormat("'" + this.mInterfacedName + "'", CmcdHeadersFactory.STREAM_TYPE_LIVE, "e", "f"));
            sb.append("));console.log(\"invoke \"+l+\", time: \"+(new Date().getTime()-k));var g=JSON.parse(m);if(g.CODE!=200){throw\"");
            sb.append(this.mInterfacedName);
            sb.append(" call result, CODE:\"+g.CODE+\", message:\"+g.result}return g.result};Object.getOwnPropertyNames(a).forEach(function(d){var c=a[d];if(typeof c===\"function\"&&d!==\"callback\"){a[d]=function(){return c.apply(a,[d].concat(Array.prototype.slice.call(arguments,0)))}}});b.");
            sb.append(this.mInterfacedName);
            sb.append("=a;console.log(\"");
            sb.append(this.mInterfacedName);
            sb.append(" init end\")})(window)");
            this.mPreloadInterfaceJs = sb.toString();
            sb.setLength(0);
        } catch (Exception e8) {
            if (LogUtils.isDebug()) {
                Log.e(TAG, "init js result:" + e8.getMessage());
            }
        }
    }

    private String genJavaMethodSign(Method method) {
        StringBuilder sb;
        String str;
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (String str2 : IGNORE_UNSAFE_METHODS) {
            if (str2.equals(name)) {
                if (!LogUtils.isDebug()) {
                    return null;
                }
                Log.w(TAG, "method(" + name + ") is unsafe, will be pass");
                return null;
            }
        }
        for (Class<?> cls : parameterTypes) {
            if (cls == String.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_S";
            } else if (cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_N";
            } else if (cls == Boolean.TYPE) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_B";
            } else if (cls == JSONObject.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_O";
            } else if (cls == JsCallback.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_F";
            } else {
                sb = new StringBuilder();
                sb.append(name);
                str = "_P";
            }
            sb.append(str);
            name = sb.toString();
        }
        return name;
    }

    static String getInterfacedName(JSONObject jSONObject) {
        return jSONObject.optString("obj");
    }

    static JSONObject getMsgJSONObject(String str) {
        try {
            return new JSONObject(str.substring(9));
        } catch (JSONException e8) {
            e8.printStackTrace();
            return new JSONObject();
        }
    }

    private String getReturn(JSONObject jSONObject, int i8, Object obj, long j8) {
        String format = String.format(RETURN_RESULT_FORMAT, Integer.valueOf(i8), obj == null ? "null" : obj instanceof String ? "\"".concat(String.valueOf(((String) obj).replace("\"", "\\\""))).concat("\"") : String.valueOf(obj));
        if (LogUtils.isDebug()) {
            Log.d(TAG, "call time: " + (SystemClock.uptimeMillis() - j8) + ", request: " + jSONObject + ", result:" + format);
        }
        return format;
    }

    static boolean isSafeWebViewCallMsg(String str) {
        return str.startsWith(MSG_PROMPT_HEADER);
    }

    private static String promptMsgFormat(String str, String str2, String str3, String str4) {
        return "{obj:" + str + SystemInfoUtil.COMMA + "method:" + str2 + SystemInfoUtil.COMMA + KEY_TYPES + ":" + str3 + SystemInfoUtil.COMMA + KEY_ARGS + ":" + str4 + "}";
    }

    public String call(WebView webView, JSONObject jSONObject) {
        StringBuilder sb;
        String sb2;
        int i8;
        long uptimeMillis = LogUtils.isDebug() ? SystemClock.uptimeMillis() : 0L;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("method");
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_TYPES);
                JSONArray jSONArray2 = jSONObject.getJSONArray(KEY_ARGS);
                int length = jSONArray.length();
                Object[] objArr = new Object[length];
                int i9 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    String optString = jSONArray.optString(i10);
                    Object obj = null;
                    if (TypedValues.Custom.S_STRING.equals(optString)) {
                        string = string + "_S";
                        if (!jSONArray2.isNull(i10)) {
                            obj = jSONArray2.getString(i10);
                        }
                        objArr[i10] = obj;
                    } else if ("number".equals(optString)) {
                        string = string + "_N";
                        i9 = (i9 * 10) + i10 + 1;
                    } else if (TypedValues.Custom.S_BOOLEAN.equals(optString)) {
                        string = string + "_B";
                        objArr[i10] = Boolean.valueOf(jSONArray2.getBoolean(i10));
                    } else if ("object".equals(optString)) {
                        string = string + "_O";
                        if (!jSONArray2.isNull(i10)) {
                            obj = jSONArray2.getJSONObject(i10);
                        }
                        objArr[i10] = obj;
                    } else if ("function".equals(optString)) {
                        string = string + "_F";
                        objArr[i10] = new JsCallback(webView, this.mInterfacedName, jSONArray2.getInt(i10));
                    } else {
                        string = string + "_P";
                    }
                }
                Method method = this.mMethodsMap.get(string);
                if (method == null) {
                    return getReturn(jSONObject, 500, "not found method(" + string + ") with valid parameters", uptimeMillis);
                }
                if (i9 > 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    while (i9 > 0) {
                        int i11 = (i9 - ((i9 / 10) * 10)) - 1;
                        Class<?> cls = parameterTypes[i11];
                        if (cls == Integer.TYPE) {
                            objArr[i11] = Integer.valueOf(jSONArray2.getInt(i11));
                        } else if (cls == Long.TYPE) {
                            objArr[i11] = Long.valueOf(Long.parseLong(jSONArray2.getString(i11)));
                        } else {
                            objArr[i11] = Double.valueOf(jSONArray2.getDouble(i11));
                        }
                        i9 /= 10;
                    }
                }
                return getReturn(jSONObject, 200, method.invoke(this.mInterfaceObj, objArr), uptimeMillis);
            } catch (Exception e8) {
                e = e8;
                LogUtils.safeCheckCrash(TAG, NotificationCompat.CATEGORY_CALL, e);
                if (e.getCause() != null) {
                    sb = new StringBuilder();
                    sb.append("method execute result:");
                    e = e.getCause();
                } else {
                    sb = new StringBuilder();
                    sb.append("method execute result:");
                }
                sb.append(e.getMessage());
                sb2 = sb.toString();
                i8 = 500;
            }
        } else {
            i8 = 500;
            sb2 = "call data empty";
        }
        return getReturn(jSONObject, i8, sb2, uptimeMillis);
    }

    public String getPreloadInterfaceJs() {
        return this.mPreloadInterfaceJs;
    }
}
