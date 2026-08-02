package com.startapp.sdk.internal;

import android.net.Uri;
import android.util.Base64;
import com.startapp.sdk.common.utils.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.startapp.sdk.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0366g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6957a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f6958b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f6959c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f6960d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f6961e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f6962f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f6963g;

    static {
        int i4 = p0.f7428a;
        "startapp.".concat("g");
        f6957a = new byte[]{10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};
        f6958b = "ts";
        f6959c = "tsh";
        f6960d = "afh";
        f6961e = "MD5";
        f6962f = "UTF-8";
        f6963g = new byte[]{12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Pair pair) {
        return "&" + f6958b + "=" + ((String) pair.first) + "&" + f6960d + "=" + ((String) pair.second);
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static Pair c(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f6962f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String a3 = a();
        return new Pair(a3, a(str2 + a3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, String str2) {
        Pair c4 = c(str2);
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(f6958b, (String) c4.first).appendQueryParameter(f6960d, (String) c4.second).build().toString();
        } catch (Throwable unused) {
            return str + a(c4);
        }
    }

    public static String a() {
        int hashCode = Arrays.hashCode(f6957a);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i4 = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if ((((-hashCode) & hashCode) == hashCode ? (int) ((hashCode * i4) >> 31) : i4 % hashCode) == 0) {
                System.out.println();
            }
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f6957a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            byte b4 = bytes[i4];
            byte b5 = bArr[i4];
        }
        byte[] bytes2 = str.getBytes();
        byte b6 = f6957a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, (int) b6)];
        for (int i5 = 0; i5 < bytes2.length; i5++) {
            int i6 = i5 % b6;
            bArr2[i6] = (byte) (bArr2[i6] ^ bytes2[i5]);
        }
        byte[] bArr3 = f6957a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f6961e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f6962f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = f6963g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = bArr.hashCode();
        if (hashCode > hashCode2) {
            int i4 = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i5 = i4 % hashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4 % bArr2.length]);
        }
        return bArr3;
    }
}
