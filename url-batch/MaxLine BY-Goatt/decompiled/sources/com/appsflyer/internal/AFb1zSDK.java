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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1zSDK {
    private static int AFInAppEventParameterName = 0;
    private static char AFInAppEventType = 21153;
    private static char AFKeystoreWrapper = 1632;
    private static int afInfoLog = 1;
    private static char valueOf = 18203;
    private static char values = 10764;

    public static String AFInAppEventParameterName(String str) {
        int i = afInfoLog + 49;
        AFInAppEventParameterName = i % 128;
        String str2 = null;
        try {
            if (i % 2 == 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes(Charset.defaultCharset()));
                String AFInAppEventParameterName2 = AFInAppEventParameterName(messageDigest.digest());
                AFInAppEventParameterName = (afInfoLog + 25) % 128;
                return AFInAppEventParameterName2;
            }
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            messageDigest2.update(str.getBytes(Charset.defaultCharset()));
            String AFInAppEventParameterName3 = AFInAppEventParameterName(messageDigest2.digest());
            try {
                throw null;
            } catch (Exception e) {
                str2 = AFInAppEventParameterName3;
                e = e;
                StringBuilder sb = new StringBuilder("Error turning ");
                sb.append(str.substring(0, 6));
                sb.append(".. to SHA-256");
                AFLogger.afErrorLog(sb.toString(), e);
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String AFKeystoreWrapper(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        valueOf("椆阘郁㎂㿑嬺샀蠆됰푗蝦\ude1f", 12 - (Process.myTid() >> 22), objArr);
        sb.append(map.get(((String) objArr[0]).intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String values2 = values(AFKeystoreWrapper(sb5.toString()));
        afInfoLog = (AFInAppEventParameterName + 19) % 128;
        return values2;
    }

    private static void valueOf(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = new char[cArr2.length];
                AFg1kSDK.AFInAppEventType = 0;
                char[] cArr4 = new char[2];
                while (true) {
                    int i2 = AFg1kSDK.AFInAppEventType;
                    if (i2 < cArr2.length) {
                        cArr4[0] = cArr2[i2];
                        cArr4[1] = cArr2[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr4[1];
                            char c2 = cArr4[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + values)) ^ ((c2 >>> 5) + valueOf)));
                            cArr4[1] = c3;
                            cArr4[0] = (char) (c2 - (((c3 >>> 5) + AFKeystoreWrapper) ^ ((c3 + i3) ^ ((c3 << 4) + AFInAppEventType))));
                            i3 -= 40503;
                        }
                        int i5 = AFg1kSDK.AFInAppEventType;
                        cArr3[i5] = cArr4[0];
                        cArr3[i5 + 1] = cArr4[1];
                        AFg1kSDK.AFInAppEventType = i5 + 2;
                    } else {
                        str2 = new String(cArr3, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    public static String values(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        Object[] objArr = new Object[1];
        valueOf("椆阘郁㎂㿑嬺샀蠆됰푗蝦\ude1f", View.getDefaultSize(0, 0) + 12, objArr);
        String str2 = (String) map.get(((String) objArr[0]).intern());
        String str3 = (String) map.get("uid");
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 7));
        sb.append(str3.substring(0, 7));
        sb.append(str2.substring(str2.length() - 7));
        String values2 = values(sb.toString());
        afInfoLog = (AFInAppEventParameterName + 115) % 128;
        return values2;
    }

    private static String values(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = AFInAppEventParameterName + 45;
            afInfoLog = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                objArr[1] = Byte.valueOf(bArr[i]);
                formatter.format("%02x", objArr);
                i += 85;
            } else {
                formatter.format("%02x", Byte.valueOf(bArr[i]));
                i++;
            }
            afInfoLog = (AFInAppEventParameterName + 77) % 128;
        }
        String obj = formatter.toString();
        formatter.close();
        int i3 = AFInAppEventParameterName + 9;
        afInfoLog = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
        return obj;
    }

    public static String values(String str) {
        String str2;
        AFInAppEventParameterName = (afInfoLog + 119) % 128;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            str2 = values(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.afErrorLog(sb.toString(), e);
            str2 = null;
        }
        int i = afInfoLog + 89;
        AFInAppEventParameterName = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            afInfoLog = (AFInAppEventParameterName + 121) % 128;
            sb.append(Integer.toString((bArr[i] & 255) + 256, 16).substring(1));
            i++;
            afInfoLog = (AFInAppEventParameterName + 15) % 128;
        }
        return sb.toString();
    }

    public static String values(String... strArr) {
        int i = afInfoLog + 111;
        AFInAppEventParameterName = i % 128;
        if (i % 2 == 0) {
            return TextUtils.join("\u2063", strArr);
        }
        TextUtils.join("\u2063", strArr);
        throw null;
    }

    public static boolean valueOf(Map<String, Object> map, String[] strArr, AFb1cSDK aFb1cSDK) {
        int i = AFInAppEventParameterName + 123;
        afInfoLog = i % 128;
        if (i % 2 != 0) {
            if (map == null || map.isEmpty()) {
                return false;
            }
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = AFInAppEventParameterName + 67;
                afInfoLog = i3 % 128;
                if (i3 % 2 != 0) {
                    if (!map.containsKey(strArr[i2])) {
                        return false;
                    }
                    i2++;
                    AFInAppEventParameterName = (afInfoLog + 83) % 128;
                } else {
                    map.containsKey(strArr[i2]);
                    throw null;
                }
            }
            String str = (String) map.remove("sig");
            if (str == null) {
                return false;
            }
            String AFInAppEventParameterName2 = AFb1cSDK.AFInAppEventParameterName();
            StringBuilder sb = new StringBuilder();
            sb.append(new JSONObject(map));
            sb.append(AFInAppEventParameterName2);
            return AFKeystoreWrapper(sb.toString(), AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType)).equals(str);
        }
        throw null;
    }

    public static String AFKeystoreWrapper(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
            int i = afInfoLog + 65;
            AFInAppEventParameterName = i % 128;
            if (i % 2 == 0) {
                return lowerCase;
            }
            throw null;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static String AFKeystoreWrapper(String str) {
        afInfoLog = (AFInAppEventParameterName + 1) % 128;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            String values2 = values(messageDigest.digest());
            AFInAppEventParameterName = (afInfoLog + 9) % 128;
            return values2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }
}
