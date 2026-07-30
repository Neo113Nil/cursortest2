package h4;

import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;

/* loaded from: classes3.dex */
public class u {
    private u() {
    }

    public static CRPDailyGoalsInfo a(byte[] bArr) {
        if (bArr == null || bArr.length <= 2 || bArr.length % 5 != 2) {
            return null;
        }
        CRPDailyGoalsInfo cRPDailyGoalsInfo = new CRPDailyGoalsInfo();
        byte[] bArr2 = new byte[4];
        for (int i8 = 2; i8 < bArr.length; i8 += 5) {
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            int f8 = (int) com.crrepa.g1.c.f(bArr2);
            byte b8 = bArr[i8];
            if (b8 == 1) {
                cRPDailyGoalsInfo.setSteps(f8);
            } else if (b8 == 2) {
                cRPDailyGoalsInfo.setCalories(f8);
            } else if (b8 == 4) {
                cRPDailyGoalsInfo.setTrainingTime(f8);
            }
        }
        return cRPDailyGoalsInfo;
    }

    public static CRPTrainingDayInfo b(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        return new CRPTrainingDayInfo(bArr[2] > 0, bArr[3]);
    }
}
