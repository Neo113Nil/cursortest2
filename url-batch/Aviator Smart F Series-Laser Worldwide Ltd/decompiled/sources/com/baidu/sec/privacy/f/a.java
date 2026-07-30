package com.baidu.sec.privacy.f;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static byte[] f10660a;

    public static String a(byte[] bArr) {
        byte[] b8;
        if (bArr != null) {
            try {
                if (bArr.length != 0 && (b8 = b(a(), bArr)) != null && b8.length > 0) {
                    return Base64.encodeToString(b8, 0);
                }
                return null;
            } catch (Throwable th) {
                c.a(th);
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.a(bArr2, bArr);
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(a(a(), Base64.decode(str, 0)));
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.b(bArr2, bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized byte[] a() {
        byte[] bArr;
        byte[] bArr2;
        synchronized (a.class) {
            try {
                bArr2 = f10660a;
            } finally {
                return bArr;
            }
            if (bArr2 != null) {
                if (bArr2.length != 16) {
                }
                bArr = f10660a;
            }
            f10660a = Base64.decode(new byte[]{77, 122, a4.a.I0, 121, 77, a4.a.Q0, 73, a4.a.f82s1, 77, a4.a.L0, 74, a4.a.f43h1, a4.a.X0, a4.a.R0, 78, 49, a4.a.T0, 71, a4.a.f47i1, a4.a.f31e1, a4.a.S0, a4.a.f27d1, 61, 61}, 0);
            bArr = f10660a;
        }
        return bArr;
    }
}
