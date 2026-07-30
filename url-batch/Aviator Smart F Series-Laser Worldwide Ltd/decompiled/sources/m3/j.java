package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class j {
    private static final int SEGMENT_COUNT = 4;
    private static final int[] SLEEP_QUALITY = {0, 60, 75, 90, 100};

    private int[] getSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_sleep_quality_poor), ContextCompat.getColor(context, R.color.color_sleep_quality_medium), ContextCompat.getColor(context, R.color.color_sleep_quality_good), ContextCompat.getColor(context, R.color.color_sleep_quality_excellent)};
    }

    public void createBarView(Context context, SegmentedBarView segmentedBarView) {
        int[] segmentColors = getSegmentColors(context);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 4; i8++) {
            int[] iArr = SLEEP_QUALITY;
            arrayList.add(new com.crrepa.band.my.health.widgets.segmentedbar.a(iArr[i8], iArr[r4], segmentColors[i8]));
        }
        segmentedBarView.setSegments(arrayList);
    }
}
