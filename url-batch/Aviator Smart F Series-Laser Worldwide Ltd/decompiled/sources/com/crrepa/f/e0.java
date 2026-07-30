package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12517a = 12;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12518b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12519c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12520d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12521e = 3;

    private e0() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{12, 0});
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{12, 2});
    }

    public static byte[] a(CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        return g.a(-69, new byte[]{12, 3, (byte) cRPPeriodTimeInfo.getStartHour(), (byte) cRPPeriodTimeInfo.getStartMinute(), (byte) cRPPeriodTimeInfo.getEndHour(), (byte) cRPPeriodTimeInfo.getEndMinute()});
    }

    public static byte[] a(boolean z7) {
        return g.a(-69, new byte[]{12, 1, z7 ? (byte) 1 : (byte) 0});
    }
}
