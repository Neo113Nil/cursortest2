package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class i {
    public void createBarView(SegmentedBarView segmentedBarView, float[] fArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < iArr.length) {
            int i9 = i8 + 1;
            arrayList.add(new com.crrepa.band.my.health.widgets.segmentedbar.a(fArr[i8], fArr[i9], iArr[i8]));
            i8 = i9;
        }
        segmentedBarView.setSegments(arrayList);
    }

    public int[] getHeartRateSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_heart_rate_light), ContextCompat.getColor(context, R.color.color_heart_rate_weight), ContextCompat.getColor(context, R.color.color_heart_rate_aerobic), ContextCompat.getColor(context, R.color.color_heart_rate_anaerobic), ContextCompat.getColor(context, R.color.color_heart_rate_max)};
    }

    public int[] getTempSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_temp_low), ContextCompat.getColor(context, R.color.color_temp_normal), ContextCompat.getColor(context, R.color.color_temp_low_fever), ContextCompat.getColor(context, R.color.color_temp_moderate_fever), ContextCompat.getColor(context, R.color.color_temp_high_fever), ContextCompat.getColor(context, R.color.color_temp_super_high_fever)};
    }

    public int[] getWeightSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_weight_bmi_thin), ContextCompat.getColor(context, R.color.color_weight_bmi_normal), ContextCompat.getColor(context, R.color.color_weight_bmi_fat), ContextCompat.getColor(context, R.color.color_weight_bmi_obesity)};
    }

    public void setSlider(SegmentedBarView segmentedBarView, float f8) {
        segmentedBarView.setValue(Float.valueOf(f8));
    }
}
