package m2;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void renderLast7DaysAverageTemp(List<Float> list, Date[] dateArr);

    void renderStatisticsDate(Date date);

    void renderTemp(float f8, float f9, float f10);

    void renderTodayTempList(List<Float> list);
}
