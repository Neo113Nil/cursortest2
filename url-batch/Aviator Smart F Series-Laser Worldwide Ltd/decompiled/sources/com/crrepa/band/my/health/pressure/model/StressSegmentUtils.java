package com.crrepa.band.my.health.pressure.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class StressSegmentUtils {
    private static final float[] STRESS_SEGMENT_VALUES = {0.0f, 30.0f, 60.0f, 80.0f, 100.0f};

    private StressSegmentUtils() {
    }

    public static String[] getHeartRateDescriptionText(Context context) {
        return new String[]{context.getString(R.string.heart_rate_light), context.getString(R.string.heart_rate_weight), context.getString(R.string.heart_rate_aerobic), context.getString(R.string.heart_rate_anaerobic), context.getString(R.string.heart_rate_max)};
    }

    public static int[] getStressSegmentColorArray(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_stress_relaxed), ContextCompat.getColor(context, R.color.color_stress_normal), ContextCompat.getColor(context, R.color.color_stress_medium), ContextCompat.getColor(context, R.color.color_stress_stressed)};
    }

    public static float[] getStressSegmentValueArray() {
        return STRESS_SEGMENT_VALUES;
    }
}
