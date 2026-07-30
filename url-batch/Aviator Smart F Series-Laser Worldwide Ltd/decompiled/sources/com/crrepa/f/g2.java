package com.crrepa.f;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12549a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12550b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12551c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12552d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12553e = 1;

    private g2() {
    }

    public static byte[] a() {
        return g.a(81, new byte[]{2});
    }

    public static byte[] b() {
        return g.a(81, new byte[]{37, 0});
    }

    public static byte[] c() {
        return g.a(81, new byte[]{0});
    }

    public static byte[] d() {
        return g.a(-70, new byte[]{4});
    }

    public static byte[] e() {
        return g.a(-70, new byte[]{0});
    }

    public static byte[] f() {
        return g.a(-70, new byte[]{3, 0});
    }

    public static byte[] a(String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 20, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return null;
        }
        byte[] bArr = new byte[a8.length + 2];
        bArr[0] = 3;
        bArr[1] = 1;
        System.arraycopy(a8, 0, bArr, 2, a8.length);
        return g.a(-70, bArr);
    }
}
