package b3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private static final float AREA_STEP = 3000.0f;
    public static final int MAX_BAR_VALUE = 28;
    private static final int MAX_PERCENTAGE = 99;
    private static final int[] STEP_AREA_PERCENT = {23, 18, 17, 14, 11, 9, 7};

    private b() {
    }

    public static List<Float> getBarDatas() {
        ArrayList arrayList = new ArrayList();
        int length = STEP_AREA_PERCENT.length;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(Float.valueOf(r1[i8]));
        }
        return arrayList;
    }

    public static int getHighLightValue(int i8) {
        return (int) (i8 / AREA_STEP);
    }

    public static int getSameAgeGroupPercent(int i8) {
        if (i8 <= 0) {
            return 0;
        }
        float f8 = i8;
        int i9 = (int) (f8 / AREA_STEP);
        int i10 = (int) (f8 % AREA_STEP);
        if (i9 >= STEP_AREA_PERCENT.length) {
            return 99;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            i11 += STEP_AREA_PERCENT[i12];
        }
        return (int) (i11 + ((STEP_AREA_PERCENT[i9] / AREA_STEP) * i10));
    }
}
