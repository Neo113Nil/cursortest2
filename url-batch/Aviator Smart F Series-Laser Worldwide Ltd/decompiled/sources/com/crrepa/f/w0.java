package com.crrepa.f;

import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12786b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12787c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12788d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12789e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12790f = 8;

    private w0() {
    }

    public static byte[] a() {
        return g.a(-77, new byte[]{0});
    }

    public static byte[] a(double d8, double d9) {
        byte[] bArr = new byte[9];
        bArr[0] = 4;
        byte[] d10 = com.crrepa.g1.c.d((long) (d8 * 1000000.0d));
        System.arraycopy(d10, 0, bArr, 1, d10.length);
        byte[] d11 = com.crrepa.g1.c.d((long) (d9 * 1000000.0d));
        System.arraycopy(d11, 0, bArr, 5, d11.length);
        return g.a(-77, bArr);
    }

    public static byte[] a(int i8, int i9) {
        BleLog.d("formatGetGpsDetailCmd index: " + i9);
        byte[] bArr = new byte[7];
        bArr[0] = 1;
        byte[] b8 = com.crrepa.g1.c.b((long) i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        byte[] a8 = com.crrepa.g1.c.a(i9);
        System.arraycopy(a8, 0, bArr, 5, a8.length);
        return g.a(-77, bArr);
    }
}
