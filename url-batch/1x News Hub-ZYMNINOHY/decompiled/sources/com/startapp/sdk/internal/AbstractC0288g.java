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
public abstract class AbstractC0288g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3839a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3840b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3841c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3842d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3843e;
    public static final String f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3844g;

    static {
        int i3 = p0.f4293a;
        "startapp.".concat("g");
        f3839a = new byte[]{10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};
        f3840b = "ts";
        f3841c = "tsh";
        f3842d = "afh";
        f3843e = "MD5";
        f = "UTF-8";
        f3844g = new byte[]{12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Pair pair) {
        return "&" + f3840b + "=" + ((String) pair.first) + "&" + f3842d + "=" + ((String) pair.second);
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
        String a3 = a();
        return new Pair(a3, a(str2 + a3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, String str2) {
        Pair c3 = c(str2);
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(f3840b, (String) c3.first).appendQueryParameter(f3842d, (String) c3.second).build().toString();
        } catch (Throwable unused) {
            return str + a(c3);
        }
    }

    public static String a() {
        int hashCode = Arrays.hashCode(f3839a);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i3 = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if ((((-hashCode) & hashCode) == hashCode ? (int) ((hashCode * i3) >> 31) : i3 % hashCode) == 0) {
                System.out.println();
            }
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f3839a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            byte b3 = bytes[i3];
            byte b4 = bArr[i3];
        }
        byte[] bytes2 = str.getBytes();
        byte b5 = f3839a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, (int) b5)];
        for (int i4 = 0; i4 < bytes2.length; i4++) {
            int i5 = i4 % b5;
            bArr2[i5] = (byte) (bArr2[i5] ^ bytes2[i4]);
        }
        byte[] bArr3 = f3839a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f3843e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = f3844g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = bArr.hashCode();
        if (hashCode > hashCode2) {
            int i3 = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i4 = i3 % hashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3 % bArr2.length]);
        }
        return bArr3;
    }
}
