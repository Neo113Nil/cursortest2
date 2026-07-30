package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public class i {
    private i() {
    }

    public static byte[] a() {
        return g.a(-127, null);
    }

    public static byte[] a(CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        return g.a(113, new byte[]{(byte) cRPPeriodTimeInfo.getStartHour(), (byte) cRPPeriodTimeInfo.getStartMinute(), (byte) cRPPeriodTimeInfo.getEndHour(), (byte) cRPPeriodTimeInfo.getEndMinute()});
    }
}
