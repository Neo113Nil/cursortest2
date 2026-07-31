package com.startapp.sdk.internal;

import android.net.Uri;
import android.util.Base64;
import com.startapp.sdk.common.utils.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f242a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final byte[] g;

    static {
        int i = m0.f327a;
        "startapp.".concat("g");
        f242a = new byte[]{10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};
        b = "ts";
        c = "tsh";
        d = "afh";
        e = "MD5";
        f = "UTF-8";
        g = new byte[]{12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Pair pair) {
        return "&" + b + "=" + ((String) pair.first) + "&" + d + "=" + ((String) pair.second);
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static Pair c(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String a2 = a();
        return new Pair(a2, a(str2 + a2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, String str2) {
        Pair c2 = c(str2);
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(b, (String) c2.first).appendQueryParameter(d, (String) c2.second).build().toString();
        } catch (Throwable unused) {
            return str + a(c2);
        }
    }

    public static String a() {
        int hashCode = Arrays.hashCode(f242a);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if ((((-hashCode) & hashCode) == hashCode ? (int) ((hashCode * i) >> 31) : i % hashCode) == 0) {
                System.out.println();
            }
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f242a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i = 0; i < length; i++) {
            byte b2 = bytes[i];
            byte b3 = bArr[i];
        }
        byte[] bytes2 = str.getBytes();
        byte b4 = f242a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, (int) b4)];
        for (int i2 = 0; i2 < bytes2.length; i2++) {
            int i3 = i2 % b4;
            bArr2[i3] = (byte) (bArr2[i3] ^ bytes2[i2]);
        }
        byte[] bArr3 = f242a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = bArr.hashCode();
        if (hashCode > hashCode2) {
            int i = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i2 = i % hashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }
}
