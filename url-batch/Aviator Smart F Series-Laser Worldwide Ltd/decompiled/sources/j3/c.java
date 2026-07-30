package j3;

import androidx.fragment.app.Fragment;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void renderWeightChart(List<Float> list, float f8, float f9);

    void showBmiData(float f8);

    void showTabLayout(List<Fragment> list);

    void showWeightData(float f8, Date date);
}
