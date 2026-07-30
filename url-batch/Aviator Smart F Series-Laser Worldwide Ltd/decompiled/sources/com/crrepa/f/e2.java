package com.crrepa.f;

/* loaded from: classes3.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12527a = 7;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12528b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12529c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12530d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12531e = 7;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12532f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12533g = 10;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12534h = 11;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12535i = 12;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12536j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f12537k = 15;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f12538l = 17;

    private e2() {
    }

    public static byte[] a() {
        return a((byte) 10);
    }

    public static byte[] b() {
        return a((byte) 17);
    }

    public static byte[] c() {
        return a((byte) 15);
    }

    public static byte[] d() {
        return a((byte) 7);
    }

    public static byte[] e() {
        return g.a(-73, new byte[]{7});
    }

    public static byte[] f() {
        return a((byte) 11);
    }

    public static byte[] g() {
        return a((byte) 12);
    }

    public static byte[] h() {
        return a((byte) 3);
    }

    private static byte[] a(byte b8) {
        return g.a(-73, new byte[]{10, b8});
    }

    public static byte[] b(int i8) {
        byte[] bArr = {8, 0, 0};
        byte[] a8 = com.crrepa.g1.c.a(i8);
        System.arraycopy(a8, 0, bArr, 1, a8.length);
        return g.a(-73, bArr);
    }

    public static byte[] a(int i8) {
        byte[] bArr = {9, 0, 0};
        byte[] a8 = com.crrepa.g1.c.a(i8);
        System.arraycopy(a8, 0, bArr, 1, a8.length);
        return g.a(-73, bArr);
    }
}
