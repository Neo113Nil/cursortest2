package q2;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.utils.h;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static String[] getHeartRateDescriptionText(Context context) {
        return new String[]{context.getString(R.string.heart_rate_light), context.getString(R.string.heart_rate_weight), context.getString(R.string.heart_rate_aerobic), context.getString(R.string.heart_rate_anaerobic), context.getString(R.string.heart_rate_max)};
    }

    public static int[] getHeartRateSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_heart_rate_light), ContextCompat.getColor(context, R.color.color_heart_rate_weight), ContextCompat.getColor(context, R.color.color_heart_rate_aerobic), ContextCompat.getColor(context, R.color.color_heart_rate_anaerobic), ContextCompat.getColor(context, R.color.color_heart_rate_max)};
    }

    public static float[] getHeartRateSegmentValues(int i8) {
        float[] heartRateDegree = h.getHeartRateDegree(i8, UserWeightProvider.getUserWeightKg(), UserGenderProvider.isFemale());
        float[] fArr = new float[heartRateDegree.length + 1];
        fArr[0] = 0.0f;
        System.arraycopy(heartRateDegree, 0, fArr, 1, heartRateDegree.length);
        return fArr;
    }
}
