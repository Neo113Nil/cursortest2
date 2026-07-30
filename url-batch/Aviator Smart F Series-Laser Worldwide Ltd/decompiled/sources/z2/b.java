package z2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    public static final int MAX_BAR_VALUE = 35;
    private static final int MAX_PERCENT = 100;
    private static final int MIN_TOTAL_SLEEP_TIME = 240;
    private static final int START_WAKE_UP_TIME = 5;
    private static final int[] WAKE_UP_TIME_AREA_PERCENT = {5, 8, 24, 28, 15, 11, 8};

    public static List<Float> getBarList() {
        ArrayList arrayList = new ArrayList();
        int length = WAKE_UP_TIME_AREA_PERCENT.length;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(Float.valueOf(r1[i8]));
        }
        return arrayList;
    }

    public static int getHighLightValue(int i8, int i9) {
        int i10 = i8 - 4;
        if (i9 < 240) {
            i10 = 0;
        }
        int i11 = i10 > 0 ? i10 : 0;
        int length = WAKE_UP_TIME_AREA_PERCENT.length;
        return i11 >= length ? length - 1 : i11;
    }

    public static int getSameAgeGroupPercent(int i8) {
        int length = WAKE_UP_TIME_AREA_PERCENT.length - 1;
        int i9 = 0;
        for (int i10 = 0; i10 <= i8 && i10 < length; i10++) {
            i9 += WAKE_UP_TIME_AREA_PERCENT[i10];
        }
        return 100 - i9;
    }
}
