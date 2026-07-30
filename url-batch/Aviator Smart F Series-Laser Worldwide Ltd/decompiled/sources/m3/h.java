package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class h {
    private static final int LOW = 30;
    private static final int MAX = 100;
    private static final int MIN = 0;
    private static final int NORMAL = 70;

    private int[] getSegmentColors(Context context) {
        int color = ContextCompat.getColor(context, R.color.rose_pink);
        return new int[]{ContextCompat.getColor(context, R.color.light_teal), ContextCompat.getColor(context, R.color.wheat), color};
    }

    private float[] getSegmentValues() {
        return new float[]{0.0f, 30.0f, 70.0f, 100.0f};
    }

    public void createBarView(Context context, SegmentedBarView segmentedBarView) {
        int[] segmentColors = getSegmentColors(context);
        float[] segmentValues = getSegmentValues();
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < segmentColors.length) {
            int i9 = i8 + 1;
            arrayList.add(new com.crrepa.band.my.health.widgets.segmentedbar.a(segmentValues[i8], segmentValues[i9], segmentColors[i8]));
            i8 = i9;
        }
        segmentedBarView.setSegments(arrayList);
    }

    public void setSlider(SegmentedBarView segmentedBarView, float f8) {
        segmentedBarView.setValue(Float.valueOf(f8));
    }
}
