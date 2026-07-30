package l2;

import com.crrepa.band.my.model.db.TimingTemp;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private static final float MAX_TEMP = 42.0f;
    private static final float MIN_TEMP = 30.0f;

    private a() {
    }

    public static TimingTemp convertTimingTemp(List<Float> list) {
        int i8 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i9 = 0; i9 < list.size(); i9++) {
            float floatValue = list.get(i9).floatValue();
            if (!isValidTemp(floatValue)) {
                list.set(i9, Float.valueOf(0.0f));
            } else if (0.0f < floatValue) {
                f8 += floatValue;
                i8++;
                if (f9 == 0.0f || f9 < floatValue) {
                    f9 = floatValue;
                }
                if (f10 == 0.0f || floatValue < f10) {
                    f10 = floatValue;
                }
            }
        }
        float f11 = i8 != 0 ? f8 / i8 : 0.0f;
        TimingTemp timingTemp = new TimingTemp();
        timingTemp.setDate(new Date());
        timingTemp.setTempStr(s.bean2Json(list));
        timingTemp.setAverage(Float.valueOf(f11));
        timingTemp.setMax(Float.valueOf(f9));
        timingTemp.setMin(Float.valueOf(f10));
        return timingTemp;
    }

    public static boolean isValidTemp(float f8) {
        return 30.0f <= f8 && f8 <= 42.0f;
    }
}
