package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1lSDK {
    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            sb.append(Integer.toString((b4 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e4) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e4);
            return null;
        }
    }

    public static byte[] values(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e4) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e4);
            return null;
        }
    }

    public static boolean AFInAppEventParameterName(Map<String, Object> map, String[] strArr, AFd1sSDK aFd1sSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String registerClient = AFd1sSDK.registerClient();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(registerClient);
        return AFKeystoreWrapper(sb.toString(), AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper)).equals(str2);
    }

    public static String AFKeystoreWrapper(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFInAppEventParameterName(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4, true);
            return e4.getMessage();
        }
    }
}
