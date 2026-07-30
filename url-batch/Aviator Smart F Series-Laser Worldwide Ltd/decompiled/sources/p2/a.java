package p2;

import android.text.TextUtils;
import com.crrepa.band.my.health.ecg.alg.c;
import com.crrepa.band.my.health.ecg.view.b;
import com.crrepa.band.my.model.db.Ecg;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private static final int ARRHYTHMIA = 8;
    private static final int ATRIAL_FIBRILLATION = 6;
    private static final int BRADYCARDIA = 3;
    public static final int ECG_ARRHYTHMIA = 4;
    public static final int ECG_ATRIAL_FIBRILLATION = 3;
    public static final int ECG_BRADYCARDIA = 1;
    public static final int ECG_NORMAL = 0;
    public static final int ECG_TACHYCARDIA = 2;
    public static final int ECG_UNKNOWN = 5;
    private static final int EXTREME_BRADYCARDIA = 1;
    private static final int EXTREME_TACHYCARDIA = 2;
    private static final int NORMAL = 0;
    private static final int TACHYCARDIA = 4;
    public static final String TI_ECG_TYPE_REGEX = "/";

    private a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getTiDiagnosisType(String str) {
        int i8;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            i8 = 0;
            for (String str2 : str.split("/")) {
                try {
                    i8 = Integer.parseInt(str2);
                    if (i8 < 8) {
                        break;
                    }
                } catch (NumberFormatException e8) {
                    e = e8;
                    e.printStackTrace();
                    if (i8 != 0) {
                    }
                }
            }
        } catch (NumberFormatException e9) {
            e = e9;
            i8 = 0;
        }
        if (i8 != 0) {
            return 0;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 6) {
                            return i8 != 8 ? 5 : 4;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static Ecg heartRateEntity2ECG(c cVar, String str, boolean z7) {
        Ecg ecg = new Ecg();
        ecg.setAverageHeartRate(Integer.valueOf(cVar.getAverageHeartRate()));
        ecg.setDate(new Date());
        ecg.setFatigue(Integer.valueOf(cVar.getFatigue()));
        if (z7) {
            ecg.setHeartRateVariability(Integer.valueOf(t2.a.calculationHeartRateVariability()));
        }
        ecg.setHeartLoad(Integer.valueOf(cVar.getHeartLoad()));
        ecg.setMentalStress(Integer.valueOf(cVar.getMentalStress()));
        ecg.setHeartRateStrength(Integer.valueOf(cVar.getHeartRateStrength()));
        ecg.setHeartRateSlow(Boolean.valueOf(cVar.isHeartRateSlow()));
        ecg.setHeartRateFast(Boolean.valueOf(cVar.isHeartRateFast()));
        ecg.setHeartRateMisaligned(Boolean.valueOf(cVar.isHeartRateMisaligned()));
        ecg.setPrematureBeat(Integer.valueOf(cVar.getPrematureBeat()));
        ecg.setHeartRateStop(Integer.valueOf(cVar.getHeartRateStop()));
        ecg.setLeakage(Integer.valueOf(cVar.getLeakage()));
        ecg.setDiagnosisType(Integer.valueOf(cVar.getDiagnosisType()));
        ecg.setTime(30);
        ecg.setPath(str);
        ecg.setPerGridNumber(5);
        ecg.setPerGridUvValue(Integer.valueOf(b.getDefaultPerGridUvValue()));
        return ecg;
    }
}
