package com.crrepa.f;

/* loaded from: classes3.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12666a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12667b = 17;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12668c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12669d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12670e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12671f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12672g = 4;

    private n1() {
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{17, 2});
    }

    public static byte[] b() {
        return g.a(-71, new byte[]{17, 1, 0});
    }

    public static byte[] c() {
        return g.a(-71, new byte[]{17, 4});
    }

    public static byte[] a(byte b8) {
        return g.a(-71, new byte[]{17, 3, b8});
    }

    public static byte[] b(boolean z7) {
        return g.a(-71, new byte[]{1, 1, z7 ? (byte) 1 : (byte) 0});
    }

    public static byte[] a(boolean z7) {
        byte[] bArr = new byte[3];
        bArr[0] = 1;
        bArr[1] = 0;
        bArr[2] = (byte) (z7 ? 0 : 255);
        return g.a(-71, bArr);
    }
}
