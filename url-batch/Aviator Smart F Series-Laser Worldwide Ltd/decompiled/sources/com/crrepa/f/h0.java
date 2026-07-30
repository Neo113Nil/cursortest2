package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public class h0 {
    private h0() {
    }

    public static byte[] a() {
        return g.a(-126, null);
    }

    public static byte[] a(CRPPeriodTimeInfo cRPPeriodTimeInfo) {
        return g.a(114, new byte[]{(byte) cRPPeriodTimeInfo.getStartHour(), (byte) cRPPeriodTimeInfo.getStartMinute(), (byte) cRPPeriodTimeInfo.getEndHour(), (byte) cRPPeriodTimeInfo.getEndMinute()});
    }
}
