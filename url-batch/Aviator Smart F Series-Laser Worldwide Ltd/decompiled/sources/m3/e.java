package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class e {
    private static final int LOW_HEART_RATE_VARIABILITY = 30;
    private static final int MAX_HEART_RATE_VARIABILITY = 100;
    private static final int MIN_HEART_RATE_VARIABILITY = 0;
    private static final int NORMAL_HEART_RATE_VARIABILITY = 70;
    private SegmentedBarView segmentedBarView;

    private int[] getSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.rose_pink), ContextCompat.getColor(context, R.color.wheat), ContextCompat.getColor(context, R.color.light_teal)};
    }

    private float[] getSegmentValues() {
        return new float[]{0.0f, 30.0f, 70.0f, 100.0f};
    }

    public void createBarView(Context context, SegmentedBarView segmentedBarView) {
        this.segmentedBarView = segmentedBarView;
        int[] segmentColors = getSegmentColors(context);
        float[] segmentValues = getSegmentValues();
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < segmentColors.length) {
            int i9 = i8 + 1;
            arrayList.add(new com.crrepa.band.my.health.widgets.segmentedbar.a(segmentValues[i8], segmentValues[i9], segmentColors[i8]));
            i8 = i9;
        }
        this.segmentedBarView.setSegments(arrayList);
    }

    public void setSlider(float f8) {
        this.segmentedBarView.setValue(Float.valueOf(f8));
    }
}
