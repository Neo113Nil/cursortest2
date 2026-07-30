package h2;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderBloodOxygen(int i8, int i9, int i10);

    void renderLast7DaysAverageBo(List<Float> list, Date[] dateArr);

    void renderStatisticsDate(Date date);

    void renderTodayBoList(List<Float> list);
}
