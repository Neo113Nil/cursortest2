package com.crrepa.f;

/* loaded from: classes3.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12541a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12542b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12543c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12544d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12545e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12546f = 19;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12547g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12548h = 2;

    private g1() {
    }

    public static byte[] a() {
        return g.a(-85, new byte[]{0});
    }

    public static byte[] b() {
        return g.a(55, null);
    }

    public static byte[] c() {
        return g.a(47, null);
    }

    public static byte[] d(byte b8) {
        return g.a(53, new byte[]{b8});
    }

    public static byte[] a(byte b8) {
        return g.a(104, new byte[]{b8});
    }

    public static byte[] b(byte b8) {
        return g.a(52, new byte[]{b8});
    }

    public static byte[] c(byte b8) {
        return g.a(54, new byte[]{b8});
    }

    public static byte[] a(byte b8, byte b9) {
        return g.a(-74, new byte[]{2, b8, b9});
    }

    public static byte[] b(boolean z7) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) (z7 ? 0 : -1);
        return g.a(109, bArr);
    }

    public static byte[] a(int i8) {
        if (i8 <= 0) {
            i8 = 0;
        }
        return g.a(31, new byte[]{(byte) i8});
    }

    public static byte[] a(boolean z7) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) (z7 ? 0 : -1);
        return g.a(104, bArr);
    }
}
