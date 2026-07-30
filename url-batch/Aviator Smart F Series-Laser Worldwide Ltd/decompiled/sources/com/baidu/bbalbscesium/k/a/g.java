package com.baidu.bbalbscesium.k.a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile byte[] f4111a;

    public static byte[] a() {
        if (f4111a == null) {
            synchronized (g.class) {
                try {
                    if (f4111a == null) {
                        byte[] bArr = new byte[16];
                        System.arraycopy(com.baidu.bbalbscesium.k.c.b.a(), 0, bArr, 0, 16);
                        c cVar = new c();
                        cVar.a(2, bArr, bArr);
                        f4111a = cVar.a(new byte[]{a4.a.f20b2, a4.a.M1, a4.a.F1, 26, 39, a4.a.B1, 14, 14, -31, -46, -56, 1, 25, a4.a.f100y1, -99, a4.a.K1, -54, 51, a4.a.f78r0, 14, a4.a.L0, a4.a.f32e2, -19, 28, 66, 19, a4.a.H1, 5, 25, a4.a.f56k2, a4.a.C1, 50});
                    }
                } finally {
                }
            }
        }
        return f4111a;
    }
}
