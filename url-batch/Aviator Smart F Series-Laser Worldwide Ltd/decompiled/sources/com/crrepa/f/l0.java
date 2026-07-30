package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPSedentaryReminderPeriodInfo;

/* loaded from: classes3.dex */
public class l0 {
    private l0() {
    }

    public static byte[] a() {
        return g.a(-125, null);
    }

    public static byte[] a(CRPSedentaryReminderPeriodInfo cRPSedentaryReminderPeriodInfo) {
        return g.a(115, new byte[]{cRPSedentaryReminderPeriodInfo.getPeriod(), cRPSedentaryReminderPeriodInfo.getSteps(), cRPSedentaryReminderPeriodInfo.getStartHour(), cRPSedentaryReminderPeriodInfo.getEndHour()});
    }
}
