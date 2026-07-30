package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPHandWashingPeriodInfo;

/* loaded from: classes3.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12449a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12450b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12451c = 0;

    private a1() {
    }

    public static byte[] a() {
        return g.a(-121, new byte[]{3});
    }

    public static byte[] a(CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo) {
        return g.a(119, new byte[]{3, cRPHandWashingPeriodInfo.isEnable(), (byte) cRPHandWashingPeriodInfo.getStartHour(), (byte) cRPHandWashingPeriodInfo.getStartMinute(), (byte) cRPHandWashingPeriodInfo.getCount(), (byte) cRPHandWashingPeriodInfo.getPeriod()});
    }
}
