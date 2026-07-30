package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFj1jSDK {
    public static byte[] AFAdRevenueData(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e7) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e7);
            return null;
        }
    }

    public static String getCurrencyIso4217Code(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return getMediationNetwork(messageDigest.digest());
        } catch (Exception e7) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e7);
            return null;
        }
    }

    private static String getMediationNetwork(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b7 : bArr) {
            sb.append(Integer.toString((b7 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static boolean getRevenue(Map<String, Object> map, String[] strArr, AFc1kSDK aFc1kSDK) {
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
        String areAllFieldsValid = AFc1kSDK.areAllFieldsValid();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(areAllFieldsValid);
        return getCurrencyIso4217Code(sb.toString(), AFb1iSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code)).equals(str2);
    }

    public static long AFAdRevenueData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(bArr);
        allocate.flip();
        return allocate.getLong();
    }

    public static String getCurrencyIso4217Code(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return getMediationNetwork(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7, true);
            return e7.getMessage();
        }
    }
}
