package h4;

import com.crrepa.ble.conn.bean.CRPPerformanceInsightsInfo;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final CRPPerformanceInsightsInfo f16693a = new CRPPerformanceInsightsInfo();

    private f() {
    }

    public static CRPPerformanceInsightsInfo a(byte[] bArr) {
        if (!com.crrepa.g1.c.h(bArr) && bArr.length >= 2) {
            byte[] bArr2 = new byte[4];
            byte b8 = bArr[1];
            if (b8 == 0) {
                System.arraycopy(bArr, 2, bArr2, 0, 4);
                CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo = f16693a;
                cRPPerformanceInsightsInfo.setMaxOxygenIntake(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                System.arraycopy(bArr, 6, bArr2, 0, 4);
                cRPPerformanceInsightsInfo.setLactateSpeed(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                cRPPerformanceInsightsInfo.setLactateHeartRate(com.crrepa.g1.c.a(bArr[10]));
                cRPPerformanceInsightsInfo.setAge(com.crrepa.g1.c.a(bArr[11]));
                cRPPerformanceInsightsInfo.setAgeEvaluationCoefficient(com.crrepa.g1.c.a(bArr[12]));
            } else if (b8 == 1) {
                CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo2 = f16693a;
                cRPPerformanceInsightsInfo2.setCurrentLoad(com.crrepa.g1.c.b(bArr[3], bArr[2]));
                cRPPerformanceInsightsInfo2.setShortTermLoad(com.crrepa.g1.c.b(bArr[5], bArr[4]));
                cRPPerformanceInsightsInfo2.setLongTermLoad(com.crrepa.g1.c.b(bArr[7], bArr[6]));
                cRPPerformanceInsightsInfo2.setTrainingLoadLevel(bArr[8]);
                if (13 <= bArr.length) {
                    System.arraycopy(bArr, 9, bArr2, 0, 4);
                    cRPPerformanceInsightsInfo2.setTrainingLoadFactor(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                }
            } else if (b8 == 2) {
                System.arraycopy(bArr, 2, bArr2, 0, 4);
                CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo3 = f16693a;
                cRPPerformanceInsightsInfo3.setRecoveryTime(com.crrepa.g1.c.e(bArr2));
                System.arraycopy(bArr, 6, bArr2, 0, 4);
                cRPPerformanceInsightsInfo3.setTrainingEndTime(com.crrepa.g1.c.e(bArr2));
            } else if (b8 == 3) {
                CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo4 = f16693a;
                cRPPerformanceInsightsInfo4.setCarbohydrateConsumptionPercentage(com.crrepa.g1.c.a(bArr[2]));
                cRPPerformanceInsightsInfo4.setFatConsumptionPercentage(com.crrepa.g1.c.a(bArr[3]));
                cRPPerformanceInsightsInfo4.setMetabolicCoefficient(com.crrepa.g1.c.a(bArr[4]));
                return cRPPerformanceInsightsInfo4;
            }
        }
        return null;
    }
}
