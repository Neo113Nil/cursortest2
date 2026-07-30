package com.baidu.bdhttpdns;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
final class e {

    /* renamed from: b, reason: collision with root package name */
    private static String f4224b = a();

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f4223a = Pattern.compile("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$");

    private static String a() {
        try {
            byte[] bArr = new byte[20];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return a(bArr);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private static String b(String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(2, h(str), new IvParameterSpec("01020304".getBytes()));
            return new String(cipher.doFinal(bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c(String str) {
        return Pattern.matches("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$", str);
    }

    public static boolean d(String str) {
        return Pattern.matches("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$", str);
    }

    static String e(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(cn.hutool.core.util.l.UTF_8));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b8 : digest) {
                int i8 = b8 & 255;
                if (i8 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i8));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    static String f(String str) {
        return a(f4224b, str.getBytes());
    }

    static String g(String str) {
        return b(f4224b, Base64.decode(str, 0));
    }

    private static Key h(String str) {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes()));
    }

    private static String a(String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(1, h(str), new IvParameterSpec("01020304".getBytes()));
            return Base64.encodeToString(cipher.doFinal(bArr), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean b(String str) {
        String replaceAll = str.replaceAll("[\\[\\]]", "");
        return c(replaceAll) || d(replaceAll);
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b8 : bArr) {
            a(stringBuffer, b8);
        }
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, byte b8) {
        stringBuffer.append("0123456789ABCDEF".charAt((b8 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b8 & 15));
    }

    static boolean a(String str) {
        return f4223a.matcher(str).matches();
    }
}
