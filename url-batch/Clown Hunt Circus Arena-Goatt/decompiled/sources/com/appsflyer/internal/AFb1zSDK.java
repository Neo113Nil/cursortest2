package com.appsflyer.internal;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1zSDK {
    private static int AFInAppEventParameterName = 0;
    private static char AFInAppEventType = 21153;
    private static char AFKeystoreWrapper = 1632;
    private static int afInfoLog = 1;
    private static char valueOf = 18203;
    private static char values = 10764;

    public static String values(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = afInfoLog + 119;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            str2 = values(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to SHA1").toString(), e);
            str2 = null;
        }
        int i4 = afInfoLog + 89;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public static String AFKeystoreWrapper(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 1;
        afInfoLog = i2 % 128;
        int i3 = i2 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            String values2 = values(messageDigest.digest());
            int i4 = afInfoLog + 9;
            AFInAppEventParameterName = i4 % 128;
            int i5 = i4 % 2;
            return values2;
        } catch (Exception e) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to MD5").toString(), e);
            return null;
        }
    }

    public static String AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        int i2 = afInfoLog + 49;
        AFInAppEventParameterName = i2 % 128;
        String str2 = null;
        try {
            if (i2 % 2 == 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes(Charset.defaultCharset()));
                String AFInAppEventParameterName2 = AFInAppEventParameterName(messageDigest.digest());
                int i3 = afInfoLog + 25;
                AFInAppEventParameterName = i3 % 128;
                int i4 = i3 % 2;
                return AFInAppEventParameterName2;
            }
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            messageDigest2.update(str.getBytes(Charset.defaultCharset()));
            String AFInAppEventParameterName3 = AFInAppEventParameterName(messageDigest2.digest());
            try {
                super.hashCode();
                throw null;
            } catch (Exception e) {
                str2 = AFInAppEventParameterName3;
                e = e;
                AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to SHA-256").toString(), e);
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = AFInAppEventParameterName + 121;
            afInfoLog = i3 % 128;
            int i4 = i3 % 2;
            sb.append(Integer.toString((bArr[i2] & 255) + 256, 16).substring(1));
            i2++;
            int i5 = AFInAppEventParameterName + 15;
            afInfoLog = i5 % 128;
            int i6 = i5 % 2;
        }
        return sb.toString();
    }

    private static String values(byte[] bArr) {
        int i = 2 % 2;
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = AFInAppEventParameterName + 45;
            afInfoLog = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                objArr[1] = Byte.valueOf(bArr[i2]);
                formatter.format("%02x", objArr);
                i2 += 85;
            } else {
                formatter.format("%02x", Byte.valueOf(bArr[i2]));
                i2++;
            }
            int i4 = AFInAppEventParameterName + 77;
            afInfoLog = i4 % 128;
            int i5 = i4 % 2;
        }
        String obj = formatter.toString();
        formatter.close();
        int i6 = AFInAppEventParameterName + 9;
        afInfoLog = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
        return obj;
    }

    public static String AFKeystoreWrapper(String str, String str2) {
        int i = 2 % 2;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
            int i2 = afInfoLog + 65;
            AFInAppEventParameterName = i2 % 128;
            if (i2 % 2 == 0) {
                return lowerCase;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static boolean valueOf(Map<String, Object> map, String[] strArr, AFb1cSDK aFb1cSDK) throws IllegalStateException {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 123;
        afInfoLog = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (map == null || map.isEmpty()) {
            return false;
        }
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = AFInAppEventParameterName + 67;
            afInfoLog = i4 % 128;
            if (i4 % 2 == 0) {
                map.containsKey(strArr[i3]);
                super.hashCode();
                throw null;
            }
            if (!map.containsKey(strArr[i3])) {
                return false;
            }
            i3++;
            int i5 = afInfoLog + 83;
            AFInAppEventParameterName = i5 % 128;
            int i6 = i5 % 2;
        }
        String str = (String) map.remove("sig");
        if (str == null) {
            return false;
        }
        return AFKeystoreWrapper(new StringBuilder().append(new JSONObject(map)).append(AFb1cSDK.AFInAppEventParameterName()).toString(), AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType)).equals(str);
    }

    public static String values(Map<String, Object> map) {
        int i = 2 % 2;
        String str = (String) map.get("appsflyerKey");
        Object[] objArr = new Object[1];
        valueOf("椆阘郁㎂㿑嬺샀蠆됰푗蝦\ude1f", View.getDefaultSize(0, 0) + 12, objArr);
        String str2 = (String) map.get(((String) objArr[0]).intern());
        String values2 = values(new StringBuilder().append(str.substring(0, 7)).append(((String) map.get("uid")).substring(0, 7)).append(str2.substring(str2.length() - 7)).toString());
        int i2 = AFInAppEventParameterName + 115;
        afInfoLog = i2 % 128;
        int i3 = i2 % 2;
        return values2;
    }

    public static String AFKeystoreWrapper(Map<String, Object> map) {
        int i = 2 % 2;
        StringBuilder append = new StringBuilder().append((String) map.get("appsflyerKey"));
        Object[] objArr = new Object[1];
        valueOf("椆阘郁㎂㿑嬺샀蠆됰푗蝦\ude1f", 12 - (Process.myTid() >> 22), objArr);
        String values2 = values(AFKeystoreWrapper(new StringBuilder().append(new StringBuilder().append(new StringBuilder().append(new StringBuilder().append(append.append(map.get(((String) objArr[0]).intern())).toString()).append(map.get("uid")).toString()).append(map.get("installDate")).toString()).append(map.get("counter")).toString()).append(map.get("iaecounter")).toString()));
        int i2 = AFInAppEventParameterName + 19;
        afInfoLog = i2 % 128;
        int i3 = i2 % 2;
        return values2;
    }

    public static String values(String... strArr) {
        int i = 2 % 2;
        int i2 = afInfoLog + 111;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 == 0) {
            return TextUtils.join("\u2063", strArr);
        }
        TextUtils.join("\u2063", strArr);
        throw null;
    }

    private static void valueOf(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            char[] cArr3 = new char[cArr2.length];
            AFg1kSDK.AFInAppEventType = 0;
            char[] cArr4 = new char[2];
            while (AFg1kSDK.AFInAppEventType < cArr2.length) {
                cArr4[0] = cArr2[AFg1kSDK.AFInAppEventType];
                cArr4[1] = cArr2[AFg1kSDK.AFInAppEventType + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + values)) ^ ((c2 >>> 5) + valueOf)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + AFKeystoreWrapper) ^ ((c3 + i2) ^ ((c3 << 4) + AFInAppEventType))));
                    i2 -= 40503;
                }
                cArr3[AFg1kSDK.AFInAppEventType] = cArr4[0];
                cArr3[AFg1kSDK.AFInAppEventType + 1] = cArr4[1];
                AFg1kSDK.AFInAppEventType += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        objArr[0] = str2;
    }
}
