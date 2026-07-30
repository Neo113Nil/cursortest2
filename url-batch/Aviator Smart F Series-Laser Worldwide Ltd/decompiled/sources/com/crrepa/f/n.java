package com.crrepa.f;

import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12657a = 14;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12658b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12659c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12660d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12661e = 8;

    private n() {
    }

    public static byte[] a() {
        return g.a(-123, null);
    }

    private static byte b(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
        int i8 = cRPPhysiologcalPeriodInfo.isMenstrualReminder() ? GpsTrainingDaoProxy.GPS_TYPE : 240;
        if (cRPPhysiologcalPeriodInfo.isOvulationReminder()) {
            i8 += 2;
        }
        if (cRPPhysiologcalPeriodInfo.isOvulationDayReminder()) {
            i8 += 4;
        }
        if (cRPPhysiologcalPeriodInfo.isOvulationEndReminder()) {
            i8 += 8;
        }
        return (byte) i8;
    }

    public static byte[] a(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(cRPPhysiologcalPeriodInfo.getStartDate());
        return g.a(117, new byte[]{b(cRPPhysiologcalPeriodInfo), 15, (byte) cRPPhysiologcalPeriodInfo.getPhysiologcalPeriod(), (byte) cRPPhysiologcalPeriodInfo.getMenstrualPeriod(), (byte) calendar.get(2), (byte) calendar.get(5), (byte) cRPPhysiologcalPeriodInfo.getReminderHour(), (byte) cRPPhysiologcalPeriodInfo.getReminderMinute(), (byte) cRPPhysiologcalPeriodInfo.getReminderHour(), (byte) cRPPhysiologcalPeriodInfo.getReminderMinute(), (byte) cRPPhysiologcalPeriodInfo.getReminderHour(), (byte) cRPPhysiologcalPeriodInfo.getReminderMinute(), (byte) cRPPhysiologcalPeriodInfo.getReminderHour(), (byte) cRPPhysiologcalPeriodInfo.getReminderMinute()});
    }
}
