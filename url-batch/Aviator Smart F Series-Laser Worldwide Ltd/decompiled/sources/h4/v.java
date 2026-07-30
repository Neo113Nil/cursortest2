package h4;

import com.crrepa.ble.conn.bean.CRPSedentaryReminderPeriodInfo;

/* loaded from: classes3.dex */
public class v {
    private v() {
    }

    public static CRPSedentaryReminderPeriodInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        CRPSedentaryReminderPeriodInfo cRPSedentaryReminderPeriodInfo = new CRPSedentaryReminderPeriodInfo();
        cRPSedentaryReminderPeriodInfo.setPeriod(bArr[0]);
        cRPSedentaryReminderPeriodInfo.setSteps(bArr[1]);
        cRPSedentaryReminderPeriodInfo.setStartHour(bArr[2]);
        cRPSedentaryReminderPeriodInfo.setEndHour(bArr[3]);
        return cRPSedentaryReminderPeriodInfo;
    }
}
