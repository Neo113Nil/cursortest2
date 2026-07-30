package h4;

import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16677a = 6;

    private a0() {
    }

    public static CRPDrinkWaterPeriodInfo a(byte[] bArr) {
        if (bArr.length < 6) {
            return null;
        }
        return new CRPDrinkWaterPeriodInfo(bArr[1] == 1, bArr[2], bArr[3], bArr[4], bArr[5] & 255);
    }

    public static CRPNewDrinkWaterPeriodInfo b(byte[] bArr) {
        if (bArr.length < 8 || bArr[2] != 1) {
            return null;
        }
        return new CRPNewDrinkWaterPeriodInfo(bArr[3] == 1, bArr[4], bArr[5], bArr[6], com.crrepa.g1.c.a(bArr[7]));
    }

    public static int c(byte[] bArr) {
        if (bArr.length < 5 || bArr[2] != 1) {
            return -1;
        }
        return com.crrepa.g1.c.b(bArr[4], bArr[3]);
    }

    public static CRPWaterIntakeInfo d(byte[] bArr) {
        if (bArr.length < 9 || bArr[2] != 1) {
            return null;
        }
        CRPWaterIntakeInfo cRPWaterIntakeInfo = new CRPWaterIntakeInfo();
        cRPWaterIntakeInfo.setType(CRPWaterIntakeInfo.WaterIntakeType.getInstance(bArr[3]));
        cRPWaterIntakeInfo.setId(bArr[4]);
        cRPWaterIntakeInfo.setHour(bArr[5]);
        cRPWaterIntakeInfo.setMinutes(bArr[6]);
        cRPWaterIntakeInfo.setWaterIntake(com.crrepa.g1.c.b(bArr[8], bArr[7]));
        return cRPWaterIntakeInfo;
    }

    public static int e(byte[] bArr) {
        if (bArr.length < 5 || bArr[2] != 1) {
            return -1;
        }
        return com.crrepa.g1.c.b(bArr[4], bArr[3]);
    }

    public static List<CRPWaterIntakeInfo> f(byte[] bArr) {
        if (bArr.length < 4 || bArr[2] != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 4; i8 < bArr.length; i8 += 5) {
            CRPWaterIntakeInfo cRPWaterIntakeInfo = new CRPWaterIntakeInfo();
            cRPWaterIntakeInfo.setType(CRPWaterIntakeInfo.WaterIntakeType.WATCH);
            cRPWaterIntakeInfo.setId(bArr[i8]);
            cRPWaterIntakeInfo.setHour(bArr[i8 + 1]);
            cRPWaterIntakeInfo.setMinutes(bArr[i8 + 2]);
            cRPWaterIntakeInfo.setWaterIntake(com.crrepa.g1.c.b(bArr[i8 + 4], bArr[i8 + 3]));
            arrayList.add(cRPWaterIntakeInfo);
        }
        return arrayList;
    }

    public static CRPWaterIntakeInfo g(byte[] bArr) {
        if (bArr.length < 8 || bArr[2] != 1) {
            return null;
        }
        CRPWaterIntakeInfo cRPWaterIntakeInfo = new CRPWaterIntakeInfo();
        cRPWaterIntakeInfo.setType(CRPWaterIntakeInfo.WaterIntakeType.WATCH);
        cRPWaterIntakeInfo.setId(bArr[3]);
        cRPWaterIntakeInfo.setHour(bArr[4]);
        cRPWaterIntakeInfo.setMinutes(bArr[5]);
        cRPWaterIntakeInfo.setWaterIntake(com.crrepa.g1.c.b(bArr[7], bArr[6]));
        return cRPWaterIntakeInfo;
    }
}
