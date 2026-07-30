package com.crrepa.f;

import com.crrepa.ble.conn.type.CRPHistoryDay;

/* loaded from: classes3.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12826a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12827b = 26;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12828c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12829d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12830e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12831f = 3;

    private z0() {
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{26, 2});
    }

    public static byte[] b() {
        return g.a(-71, new byte[]{26, 1});
    }

    public static byte[] a(CRPHistoryDay cRPHistoryDay) {
        return g.a(-71, new byte[]{26, 3, cRPHistoryDay.getValue()});
    }

    public static byte[] b(boolean z7) {
        byte[] bArr = new byte[3];
        bArr[0] = 10;
        bArr[1] = 0;
        bArr[2] = (byte) (z7 ? 0 : 255);
        return g.a(-71, bArr);
    }

    public static byte[] a(boolean z7) {
        return g.a(-71, new byte[]{10, 1, z7 ? (byte) 1 : (byte) 0});
    }
}
