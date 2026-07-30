package z2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    private static final int[] FALL_ASLEEP_TIME_AREA_PERCENT = {5, 9, 13, 26, 21, 15, 10};
    public static final int MAX_BAR_VALUE = 32;
    private static final int MAX_PERCENT = 100;
    private static final int START_SLEEP_TIME = 21;

    public static List<Float> getBarList() {
        ArrayList arrayList = new ArrayList();
        int length = FALL_ASLEEP_TIME_AREA_PERCENT.length;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(Float.valueOf(r1[i8]));
        }
        return arrayList;
    }

    public static int getHighLightValue(int i8) {
        if (i8 < 12) {
            i8 += 24;
        }
        int i9 = i8 - 20;
        if (i9 < 0) {
            i9 = 0;
        }
        int length = FALL_ASLEEP_TIME_AREA_PERCENT.length;
        return i9 >= length ? length - 1 : i9;
    }

    public static int getSameAgeGroupPercent(int i8) {
        int length = FALL_ASLEEP_TIME_AREA_PERCENT.length - 1;
        int i9 = 0;
        for (int i10 = 0; i10 <= i8 && i10 < length; i10++) {
            i9 += FALL_ASLEEP_TIME_AREA_PERCENT[i10];
        }
        return 100 - i9;
    }
}
