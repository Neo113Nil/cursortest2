package com.cmplay.base.util.webview.encode;

import android.content.Context;
import com.cmplay.base.util.webview.util.WebUtils;
import com.cmplay.base.util.x;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class UrlEncoder {
    private static final String ANDROID_ID = "uuid";
    public static String SIGN_KEY = "Html5PianoTiles2&";
    private static final String TAG = "UrlEncoder";

    public static String encodeUrl(Context context, String str, boolean z) {
        String str2 = "";
        if (str.startsWith("http://")) {
            str = str.substring(7);
            str2 = "http://";
        } else if (str.startsWith("https://")) {
            str = str.substring(8);
            str2 = "https://";
        }
        int indexOf = str.indexOf("/");
        int indexOf2 = str.indexOf("?");
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        if (indexOf == -1 || indexOf >= indexOf2) {
            return null;
        }
        String str3 = str2 + str.substring(0, indexOf);
        String substring = str.substring(indexOf, indexOf2);
        String substring2 = str.substring(Math.min(indexOf2 + 1, str.length()));
        HashMap hashMap = new HashMap();
        for (String str4 : substring2.split("&")) {
            String[] split = str4.split("=");
            if (split.length != 2) {
                break;
            }
            hashMap.put(split[0], split[1]);
        }
        return encodeUrl(context, str3, substring, hashMap, z);
    }

    public static String encodeUrl(Context context, String str, String str2, HashMap<String, String> hashMap, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str2);
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append("?");
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (z) {
            hashMap.put(ANDROID_ID, x.c(context));
        }
        try {
            String makeSig = SnsSigCheck.makeSig("GET", stringBuffer2.toString(), paramEncodeSpec(hashMap), SIGN_KEY);
            try {
                makeSig = URLEncoder.encode(makeSig, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                stringBuffer.append(entry.getKey() + "=" + entry.getValue() + "&");
            }
            if (hashMap.size() > 0) {
                stringBuffer.append("sign=");
            } else {
                stringBuffer.append("&sign=");
            }
            stringBuffer.append(makeSig);
            return stringBuffer.toString();
        } catch (OpensnsException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getSign(Context context, String str) {
        String str2 = "";
        if (str.startsWith("http://")) {
            str = str.substring(7);
            str2 = "http://";
        } else if (str.startsWith("https://")) {
            str = str.substring(8);
            str2 = "https://";
        }
        int indexOf = str.indexOf("/");
        int indexOf2 = str.indexOf("?");
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        if (indexOf == -1 || indexOf >= indexOf2) {
            return null;
        }
        String str3 = str2 + str.substring(0, indexOf);
        String substring = str.substring(indexOf, indexOf2);
        String substring2 = str.substring(Math.min(indexOf2 + 1, str.length()));
        HashMap hashMap = new HashMap();
        for (String str4 : substring2.split("&")) {
            String[] split = str4.split("=", 2);
            if (split.length != 2) {
                break;
            }
            try {
                hashMap.put(split[0], split[1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return getSign(context, substring, str3, hashMap);
    }

    public static String getSign(Context context, String str, String str2, HashMap<String, String> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        stringBuffer.append(sb.toString());
        stringBuffer.append("?");
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        HashMap<String, String> resetActParams = WebUtils.resetActParams(context, hashMap);
        try {
            String makeSig = SnsSigCheck.makeSig("GET", sb.toString(), resetActParams, SIGN_KEY);
            try {
                makeSig = URLEncoder.encode(makeSig, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            HashMap<String, String> base64EncodeParams = WebUtils.base64EncodeParams(context, resetActParams);
            for (Map.Entry<String, String> entry : base64EncodeParams.entrySet()) {
                stringBuffer.append(entry.getKey() + "=" + entry.getValue() + "&");
            }
            if (base64EncodeParams.size() > 0) {
                stringBuffer.append("sign=");
            } else {
                stringBuffer.append("&sign=");
            }
            stringBuffer.append(makeSig);
            return stringBuffer.toString();
        } catch (OpensnsException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static HashMap<String, String> paramEncodeSpec(HashMap<String, String> hashMap) {
        String str;
        String str2;
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            try {
                str = URLEncoder.encode(key, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                str = "";
            }
            String replaceAll = str.replaceAll("\\+", "%20");
            try {
                str2 = URLEncoder.encode(value, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                str2 = "";
            }
            hashMap2.put(replaceAll, str2.replaceAll("\\+", "%20"));
        }
        return hashMap2;
    }
}
