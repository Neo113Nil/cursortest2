package l2;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;

/* loaded from: classes2.dex */
public class b {
    public static final float HIGH_FEVER_TEMP = 41.0f;
    public static final float LOW_FEVER_TEMP = 38.0f;
    public static final float LOW_TEMP = 36.3f;
    public static final float MIN_TEMP = 35.0f;
    public static final float MODERATE_FEVER_TEMP = 39.0f;
    public static final float NORMAL_TEMP = 37.3f;
    public static final float SUPER_HIGH_FEVER_TEMP = 42.0f;

    private b() {
    }

    public static int[] getTempSegmentColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.color_temp_low), ContextCompat.getColor(context, R.color.color_temp_normal), ContextCompat.getColor(context, R.color.color_temp_low_fever), ContextCompat.getColor(context, R.color.color_temp_moderate_fever), ContextCompat.getColor(context, R.color.color_temp_high_fever), ContextCompat.getColor(context, R.color.color_temp_super_high_fever)};
    }

    public static String[] getTempSegmentDescriptionTexts(Context context) {
        return new String[]{context.getString(R.string.temp_low), context.getString(R.string.temp_normal), context.getString(R.string.temp_low_fever), context.getString(R.string.temp_moderate_fever), context.getString(R.string.temp_high_fever), context.getString(R.string.temp_super_high_fever)};
    }

    public static float[] getTempSegmentValues() {
        float[] fArr = {35.0f, 36.3f, 37.3f, 38.0f, 39.0f, 41.0f, 42.0f};
        if (BandTempSystemProvider.isFahrenheit()) {
            for (int i8 = 0; i8 < 7; i8++) {
                fArr[i8] = c.celsius2Fahrenheit(fArr[i8]);
            }
        }
        return fArr;
    }

    public static String getTempStr(Context context, int i8) {
        if (BandTempSystemProvider.isFahrenheit()) {
            return i8 + context.getString(R.string.fahrenheit_unit);
        }
        return i8 + context.getString(R.string.celsius_unit);
    }

    public static String getTempStr(Context context, int i8, int i9) {
        if (i9 == 1) {
            return i8 + context.getString(R.string.fahrenheit_unit);
        }
        return i8 + context.getString(R.string.celsius_unit);
    }
}
