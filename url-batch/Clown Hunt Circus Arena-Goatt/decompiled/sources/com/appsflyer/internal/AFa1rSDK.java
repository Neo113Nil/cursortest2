package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1rSDK {
    public AFd1vSDK AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    public String AFKeystoreWrapper;
    String valueOf;
    public String values;

    public AFa1rSDK() {
    }

    public static JSONObject values(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventParameterName(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject valueOf(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Object AFInAppEventParameterName(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(AFInAppEventParameterName(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(AFInAppEventParameterName(Array.get(obj, i)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                return values((Map<String, ?>) obj);
            }
            return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> values(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = AFInAppEventParameterName((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = values((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> AFInAppEventParameterName(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = AFInAppEventParameterName((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = values((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    static AFe1oSDK AFKeystoreWrapper(Context context) {
        if (context instanceof Activity) {
            return AFe1oSDK.activity;
        }
        if (context instanceof Application) {
            return AFe1oSDK.application;
        }
        return AFe1oSDK.other;
    }

    public AFa1rSDK(String str, byte[] bArr, String str2, AFd1vSDK aFd1vSDK) {
        this.values = str;
        this.AFInAppEventType = bArr;
        this.valueOf = str2;
        this.AFInAppEventParameterName = aFd1vSDK;
    }

    public AFa1rSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.values = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.valueOf = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.valueOf);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventType = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.AFInAppEventParameterName = AFd1vSDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }

    public final byte[] valueOf() {
        return this.AFInAppEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFa1rSDK aFa1rSDK = (AFa1rSDK) obj;
            String str = this.valueOf;
            if (str == null ? aFa1rSDK.valueOf != null : !str.equals(aFa1rSDK.valueOf)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFa1rSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.values;
            if (str2 == null ? aFa1rSDK.values != null : !str2.equals(aFa1rSDK.values)) {
                return false;
            }
            String str3 = this.AFKeystoreWrapper;
            if (str3 == null ? aFa1rSDK.AFKeystoreWrapper != null : !str3.equals(aFa1rSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (this.AFInAppEventParameterName == aFa1rSDK.AFInAppEventParameterName) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.valueOf;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.AFInAppEventType)) * 31;
        String str2 = this.values;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFKeystoreWrapper;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFd1vSDK aFd1vSDK = this.AFInAppEventParameterName;
        return hashCode3 + (aFd1vSDK != null ? aFd1vSDK.hashCode() : 0);
    }
}
