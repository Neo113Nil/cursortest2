package com.just.agentweb;

import android.util.Log;
import android.webkit.WebView;
import com.baidu.ar.util.SystemInfoUtil;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JsCallback {
    private static final String CALLBACK_JS_FORMAT = "javascript:%s.callback(%d, %d %s);";
    private boolean mCouldGoOn = true;
    private int mIndex;
    private String mInjectedName;
    private int mIsPermanent;
    private WeakReference<WebView> mWebViewRef;

    public static class JsCallbackException extends Exception {
        public JsCallbackException(String str) {
            super(str);
        }
    }

    public JsCallback(WebView webView, String str, int i8) {
        this.mWebViewRef = new WeakReference<>(webView);
        this.mInjectedName = str;
        this.mIndex = i8;
    }

    private boolean isJavaScriptObject(Object obj) {
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return true;
        }
        String obj2 = obj.toString();
        try {
            try {
                new JSONObject(obj2);
            } catch (JSONException unused) {
                new JSONArray(obj2);
            }
            return true;
        } catch (JSONException unused2) {
            return false;
        }
    }

    public void apply(Object... objArr) {
        if (this.mWebViewRef.get() == null) {
            throw new JsCallbackException("the WebView related to the JsCallback has been recycled");
        }
        if (!this.mCouldGoOn) {
            throw new JsCallbackException("the JsCallback isn't permanent,cannot be called more than once");
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(SystemInfoUtil.COMMA);
            boolean z7 = obj instanceof String;
            boolean isJavaScriptObject = isJavaScriptObject(obj);
            if (z7 && !isJavaScriptObject) {
                sb.append("\"");
            }
            sb.append(String.valueOf(obj));
            if (z7 && !isJavaScriptObject) {
                sb.append("\"");
            }
        }
        String format = String.format(CALLBACK_JS_FORMAT, this.mInjectedName, Integer.valueOf(this.mIndex), Integer.valueOf(this.mIsPermanent), sb.toString());
        if (LogUtils.isDebug()) {
            Log.d("JsCallBack", format);
        }
        this.mWebViewRef.get().loadUrl(format);
        this.mCouldGoOn = this.mIsPermanent > 0;
    }

    public void setPermanent(boolean z7) {
        this.mIsPermanent = z7 ? 1 : 0;
    }
}
