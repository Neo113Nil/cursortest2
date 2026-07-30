package z2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    public static final int MAX_BAR_VALUE = 32;
    private static final int MAX_PERCENT = 100;
    private static final int MIN_SLEEP_TIME = 5;
    private static final int[] SLEEP_TIME_AREA_PERCENT = {9, 14, 26, 23, 14, 8, 5};

    public static List<Float> getBarList() {
        ArrayList arrayList = new ArrayList();
        int length = SLEEP_TIME_AREA_PERCENT.length;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(Float.valueOf(r1[i8]));
        }
        return arrayList;
    }

    public static int getHighLightValue(int i8) {
        int i9 = (i8 / 60) - 4;
        if (i9 < 0) {
            i9 = 0;
        }
        int length = SLEEP_TIME_AREA_PERCENT.length;
        return i9 >= length ? length - 1 : i9;
    }

    public static int getSameAgeGroupPercent(int i8) {
        int length = SLEEP_TIME_AREA_PERCENT.length - 1;
        int i9 = 0;
        for (int i10 = 0; i10 <= i8 && i10 < length; i10++) {
            i9 += SLEEP_TIME_AREA_PERCENT[i10];
        }
        return 100 - i9;
    }
}
