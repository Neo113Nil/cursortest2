package com.crrepa.f;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12791a = 240;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12792b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12793c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12794d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12795e = 3;

    private x() {
    }

    public static byte[] a() {
        return g.a(-67, new byte[]{0});
    }

    public static byte[] a(String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 240, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return null;
        }
        byte[] bArr = new byte[a8.length + 1];
        bArr[0] = 3;
        System.arraycopy(a8, 0, bArr, 1, a8.length);
        return g.a(-67, bArr);
    }
}
