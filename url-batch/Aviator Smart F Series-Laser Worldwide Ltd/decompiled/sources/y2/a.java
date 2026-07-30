package y2;

import androidx.fragment.app.Fragment;
import com.crrepa.band.my.model.db.Stress;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderLast7TimesStress(List<Float> list, Date[] dateArr);

    void renderMeasureComplete();

    void renderStatisticsFragment(List<Fragment> list);

    void renderStress(Stress stress);

    void renderStressPercent(int[] iArr, int[] iArr2);
}
