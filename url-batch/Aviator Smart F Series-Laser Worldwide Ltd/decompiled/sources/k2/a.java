package k2;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void measureComplete();

    void renderBloodPressure(int i8, int i9);

    void renderLast7TimesBloodPressure(List<Float> list, List<Float> list2, Date[] dateArr);

    void renderStatisticsDate(Date date);
}
