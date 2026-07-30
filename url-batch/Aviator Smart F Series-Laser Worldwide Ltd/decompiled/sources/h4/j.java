package h4;

import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class j {
    private j() {
    }

    public static CRPPhysiologcalPeriodInfo a(byte[] bArr) {
        if (bArr == null || bArr.length < 14) {
            return null;
        }
        CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo = new CRPPhysiologcalPeriodInfo();
        byte b8 = bArr[0];
        if ((b8 & 1) == 1) {
            cRPPhysiologcalPeriodInfo.setMenstrualReminder(true);
        }
        if ((b8 & 2) == 2) {
            cRPPhysiologcalPeriodInfo.setOvulationReminder(true);
        }
        if ((b8 & 4) == 4) {
            cRPPhysiologcalPeriodInfo.setOvulationDayReminder(true);
        }
        if ((b8 & 8) == 8) {
            cRPPhysiologcalPeriodInfo.setOvulationEndReminder(true);
        }
        cRPPhysiologcalPeriodInfo.setPhysiologcalPeriod(bArr[2]);
        cRPPhysiologcalPeriodInfo.setMenstrualPeriod(bArr[3]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, bArr[4]);
        calendar.set(5, bArr[5]);
        cRPPhysiologcalPeriodInfo.setStartDate(calendar.getTime());
        cRPPhysiologcalPeriodInfo.setReminderHour(bArr[6]);
        cRPPhysiologcalPeriodInfo.setReminderMinute(bArr[7]);
        if (14 < bArr.length) {
            cRPPhysiologcalPeriodInfo.setAcrossYears(bArr[14] > 0);
        }
        return cRPPhysiologcalPeriodInfo;
    }
}
