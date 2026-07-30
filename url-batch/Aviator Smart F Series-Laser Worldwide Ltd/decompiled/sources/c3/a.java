package c3;

import androidx.fragment.app.Fragment;
import com.crrepa.band.my.health.steps.model.LastWeekActivityStandardModel;
import com.crrepa.band.my.model.db.Step;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderLast7DayActivityStandard(List<LastWeekActivityStandardModel> list, Date date);

    void renderSameAgeGroupChart(int i8, int i9);

    void renderStatisticsFragment(List<Fragment> list);

    void renderThisWeekEffetiveActivity(int i8);

    void renderThisWeekEffetiveActivityChart(List<Float> list);

    void renderTodayEffetiveActivity(int i8);

    void renderTodayGomoreData(Integer num, Integer num2, Integer num3);

    void renderTodaySteps(Step step);
}
