package com.crrepa.f;

/* loaded from: classes3.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12581a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12582b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12583c = 19;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12584d = 2;

    private j0() {
    }

    public static byte[] a() {
        return g.a(-114, null);
    }

    public static byte[] b() {
        return g.a(-85, new byte[]{2});
    }

    public static byte[] c() {
        return g.a(-114, new byte[]{2});
    }

    public static byte[] a(int i8) {
        if (i8 <= 0) {
            i8 = 0;
        }
        return g.a(126, new byte[]{(byte) i8});
    }

    public static byte[] b(int i8) {
        return g.a(60, new byte[]{(byte) i8});
    }

    public static byte[] c(int i8) {
        return g.a(62, new byte[]{(byte) i8});
    }

    public static byte[] a(boolean z7) {
        byte[] bArr = new byte[1];
        if (!z7) {
            bArr[0] = -1;
        }
        return g.a(107, bArr);
    }

    public static byte[] b(boolean z7) {
        return g.a(126, new byte[]{2, z7 ? (byte) 1 : (byte) 0});
    }
}
