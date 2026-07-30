package g5;

import java.util.List;

/* loaded from: classes4.dex */
public class c {
    public static final int DEFAULT_MAX_SLEEP_TIME_VALUE = 720;
    private static final int MAX_SLEEP_TIME_OFFSET_VALUE = 120;
    public static final int WEEK_CHART_BAR_COUNT = 7;

    private c() {
    }

    public static int getSleepTimeMaxValue(List<Float> list, List<Float> list2, List<Float> list3) {
        if (list.size() != list2.size() || list.size() != list3.size()) {
            return 720;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 = (int) Math.max(i8, list.get(i9).floatValue() + list2.get(i9).floatValue() + list3.get(i9).floatValue());
        }
        return (720 <= i8 || 720 - i8 < 120) ? i8 + 120 : i8;
    }
}
