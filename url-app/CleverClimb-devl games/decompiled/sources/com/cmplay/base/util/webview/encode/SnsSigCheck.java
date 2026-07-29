package com.cmplay.base.util.webview.encode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class SnsSigCheck {
    private static final String CONTENT_CHARSET = "UTF-8";
    private static final String HMAC_ALGORITHM = "HmacSHA1";
    private static final String TAG = "SnsSigCheck";

    public static String encodeUrl(String str) throws OpensnsException {
        try {
            return URLEncoder.encode(str, CONTENT_CHARSET).replace("+", "%20").replace("*", "%2A");
        } catch (UnsupportedEncodingException e) {
            throw new OpensnsException(ErrorCode.MAKE_SIGNATURE_ERROR, e);
        }
    }

    public static String makeSig(String str, String str2, HashMap<String, String> hashMap, String str3) throws OpensnsException {
        try {
            Mac mac = Mac.getInstance(HMAC_ALGORITHM);
            mac.init(new SecretKeySpec(str3.getBytes(CONTENT_CHARSET), mac.getAlgorithm()));
            return new String(Base64.encode(mac.doFinal(makeSource(str, str2, hashMap).getBytes(CONTENT_CHARSET))));
        } catch (UnsupportedEncodingException e) {
            throw new OpensnsException(ErrorCode.MAKE_SIGNATURE_ERROR, e);
        } catch (InvalidKeyException e2) {
            throw new OpensnsException(ErrorCode.MAKE_SIGNATURE_ERROR, e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new OpensnsException(ErrorCode.MAKE_SIGNATURE_ERROR, e3);
        }
    }

    public static String makeSource(String str, String str2, HashMap<String, String> hashMap) throws OpensnsException {
        Object[] array = hashMap.keySet().toArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder(128);
        sb.append(str.toUpperCase());
        sb.append("&");
        sb.append(encodeUrl(str2));
        sb.append("&");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb2.append(array[i]);
            sb2.append("=");
            sb2.append(hashMap.get(array[i]));
            if (i != array.length - 1) {
                sb2.append("&");
            }
        }
        sb.append(encodeUrl(sb2.toString()));
        return sb.toString();
    }

    public static boolean verifySig(String str, String str2, HashMap<String, String> hashMap, String str3, String str4) throws OpensnsException {
        hashMap.remove("sig");
        codePayValue(hashMap);
        return makeSig(str, str2, hashMap, str3).equals(str4);
    }

    public static void codePayValue(Map<String, String> map) {
        for (String str : map.keySet()) {
            map.put(str, encodeValue(map.get(str)));
        }
    }

    public static String encodeValue(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer();
        Pattern compile = Pattern.compile("[0-9a-zA-Z!*\\(\\)]");
        for (int i = 0; i < stringBuffer.length(); i++) {
            String valueOf = String.valueOf(stringBuffer.charAt(i));
            if (!compile.matcher(valueOf).find()) {
                valueOf = hexString(valueOf);
            }
            stringBuffer2.append(valueOf);
        }
        return stringBuffer2.toString();
    }

    private static String hexString(String str) {
        String str2 = "";
        for (byte b2 : str.getBytes()) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            str2 = "%" + hexString.toUpperCase();
        }
        return str2;
    }
}
