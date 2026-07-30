package com.baidu.mshield.b.f;

import android.util.Base64;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static byte[] f8332a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f8333b;

    /* renamed from: c, reason: collision with root package name */
    public static byte[] f8334c;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return c(bArr2, bArr);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return d(bArr2, bArr);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.b(bArr2, bArr);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return null;
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            return com.baidu.xclient.gdid.a.a(bArr2, bArr);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return null;
        }
    }

    public static synchronized byte[] a(int i8) {
        byte[] bArr;
        synchronized (a.class) {
            try {
                if (i8 == 16) {
                    byte[] bArr2 = f8332a;
                    if (bArr2 == null || bArr2.length != 16) {
                        f8332a = Base64.decode(new byte[]{77, 122, a4.a.I0, 121, 77, a4.a.Q0, 73, a4.a.f82s1, 77, a4.a.L0, 74, a4.a.f43h1, a4.a.X0, a4.a.R0, 78, 49, a4.a.T0, 71, a4.a.f47i1, a4.a.f31e1, a4.a.S0, a4.a.f27d1, 61, 61}, 0);
                    }
                    bArr = f8332a;
                } else if (i8 != 24) {
                    bArr = new byte[0];
                } else {
                    byte[] bArr3 = f8333b;
                    if (bArr3 == null || bArr3.length != 24) {
                        f8333b = Base64.decode(new byte[]{a4.a.Q0, 88, 112, 66, a4.a.f19b1, 85, 49, 85, a4.a.P0, 88, a4.a.f31e1, 78, a4.a.O0, a4.a.M0, 112, a4.a.f67n1, a4.a.S0, 86, a4.a.f15a1, 79, 77, 86, 112, 72, a4.a.Y0, 71, a4.a.f31e1, a4.a.T0, a4.a.T0, 122, 48, 57, 10}, 0);
                    }
                    bArr = f8333b;
                }
            } catch (Throwable th) {
                byte[] bArr4 = new byte[0];
                com.baidu.sec.privacy.f.c.a(th);
                bArr = bArr4;
            }
        }
        return bArr;
    }

    public static synchronized byte[] a() {
        byte[] bArr;
        byte[] bArr2;
        synchronized (a.class) {
            try {
                bArr2 = f8334c;
            } finally {
                return bArr;
            }
            if (bArr2 != null) {
                if (bArr2.length != 16) {
                }
                bArr = f8334c;
            }
            f8334c = Base64.decode(new byte[]{78, a4.a.L0, a4.a.I0, 121, 77, 122, 85, a4.a.f82s1, 78, 122, 74, a4.a.f47i1, a4.a.X0, 71, 78, a4.a.f55k1, a4.a.T0, a4.a.f51j1, a4.a.f47i1, a4.a.f39g1, a4.a.S0, a4.a.N0, 61, 61, 10}, 0);
            bArr = f8334c;
        }
        return bArr;
    }
}
