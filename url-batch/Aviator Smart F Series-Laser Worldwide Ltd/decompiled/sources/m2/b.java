package m2;

import androidx.fragment.app.Fragment;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    void renderLast7DaysAverageTemp(Date date, List<Float> list);

    void renderStatisticsFragment(List<Fragment> list);
}
