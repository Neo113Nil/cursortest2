package com.anythink.core.common.q;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.v.k;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16148a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f16149b;

    /* renamed from: c, reason: collision with root package name */
    private static char[] f16150c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f16151d = {'5', 'P', 'V', 'u', '3', 'J', 'j', 'l', 'e', 'Q', 'b', 'H', '9', 'A', 'v', 'h', 't', 's', 'g', 'W', 'I', 'C', 'U', 'i', 'F', '2', 'a', 'd', 'M', '8', 'D', 'y', 'Z', 'O', 'N', 'k', '/', '4', 'R', '7', '0', 'f', 'n', '+', 'z', 'G', 'Y', 'L', 'X', 'p', 'm', '1', 'E', 'K', 'S', 'T', 'o', 'x', '6', 'q', 'w', 'r', 'c', 'B'};

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f16152e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, com.anythink.core.common.s.a.c.f16476c, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: f, reason: collision with root package name */
    private static String f16153f;

    /* renamed from: g, reason: collision with root package name */
    private static String f16154g;

    /* renamed from: h, reason: collision with root package name */
    private static String f16155h;

    public static b a(String str, String str2) {
        return c(str, str2);
    }

    private static byte[] b(String str) {
        int i;
        byte b9;
        int i4;
        byte b10;
        int i9;
        byte b11;
        int i10;
        byte b12;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i11 = 0;
        while (i11 < length) {
            while (true) {
                i = i11 + 1;
                b9 = f16152e[bytes[i11]];
                if (i >= length || b9 != -1) {
                    break;
                }
                i11 = i;
            }
            if (b9 == -1) {
                break;
            }
            while (true) {
                i4 = i + 1;
                b10 = f16152e[bytes[i]];
                if (i4 >= length || b10 != -1) {
                    break;
                }
                i = i4;
            }
            if (b10 == -1) {
                break;
            }
            byteArrayOutputStream.write((b9 << 2) | ((b10 & 48) >>> 4));
            while (true) {
                i9 = i4 + 1;
                byte b13 = bytes[i4];
                if (b13 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b11 = f16152e[b13];
                if (i9 >= length || b11 != -1) {
                    break;
                }
                i4 = i9;
            }
            if (b11 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b10 & 15) << 4) | ((b11 & 60) >>> 2));
            while (true) {
                i10 = i9 + 1;
                byte b14 = bytes[i9];
                if (b14 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b12 = f16152e[b14];
                if (i10 >= length || b12 != -1) {
                    break;
                }
                i9 = i10;
            }
            if (b12 == -1) {
                break;
            }
            byteArrayOutputStream.write(b12 | ((b11 & 3) << 6));
            i11 = i10;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static b c(String str, String str2) {
        b bVar = new b();
        try {
            if (TextUtils.isEmpty(f16154g)) {
                f16154g = k.b("UlNB");
            }
            KeyFactory keyFactory = KeyFactory.getInstance(f16154g);
            str.getBytes();
            PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
            int bitLength = generatePublic instanceof RSAPublicKey ? ((RSAPublicKey) generatePublic).getModulus().bitLength() : 0;
            if (TextUtils.isEmpty(f16155h)) {
                f16155h = k.b("UlNBL0VDQi9QS0NTMVBhZGRpbmc=");
            }
            Cipher cipher = Cipher.getInstance(f16155h);
            cipher.init(1, generatePublic);
            int i = (bitLength / 8) - 11;
            bVar.a(new String(Base64.encode(i > 0 ? a(cipher, str2.getBytes(), i) : cipher.doFinal(str2.getBytes()), 2)));
            return bVar;
        } catch (Throwable th) {
            bVar.b(th.getMessage());
            return bVar;
        }
    }

    private static byte[] a(Cipher cipher, byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i4 = 0;
        int i9 = 0;
        while (true) {
            int i10 = length - i4;
            if (i10 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byte[] doFinal = i10 > i ? cipher.doFinal(bArr, i4, i) : cipher.doFinal(bArr, i4, i10);
            byteArrayOutputStream.write(doFinal, 0, doFinal.length);
            i9++;
            i4 = i9 * i;
        }
    }

    public static String a(String str) {
        Character valueOf;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    char c4 = charArray[i];
                    if (f16149b == null) {
                        f16149b = new HashMap();
                        for (int i4 = 0; i4 < f16150c.length; i4++) {
                            f16149b.put(Character.valueOf(f16151d[i4]), Character.valueOf(f16150c[i4]));
                        }
                    }
                    if (f16149b.containsKey(Character.valueOf(c4))) {
                        valueOf = f16149b.get(Character.valueOf(c4));
                    } else {
                        valueOf = Character.valueOf(c4);
                    }
                    cArr[i] = valueOf.charValue();
                }
                str2 = new String(cArr);
            }
            return new String(b(str2));
        } catch (Exception e6) {
            e6.printStackTrace();
            return str2;
        }
    }

    public static b b(String str, String str2) {
        return a(str, str2, true);
    }

    private static Character a(char c4) {
        if (f16149b == null) {
            f16149b = new HashMap();
            for (int i = 0; i < f16150c.length; i++) {
                f16149b.put(Character.valueOf(f16151d[i]), Character.valueOf(f16150c[i]));
            }
        }
        if (f16149b.containsKey(Character.valueOf(c4))) {
            return f16149b.get(Character.valueOf(c4));
        }
        return Character.valueOf(c4);
    }

    public static b a(String str, String str2, boolean z8) {
        if (z8) {
            if (TextUtils.isEmpty(f16153f)) {
                f16153f = k.b(k.f16930a);
            }
            str = k.a(str, f16153f);
        }
        return c(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\\s", ""), str2);
    }
}
