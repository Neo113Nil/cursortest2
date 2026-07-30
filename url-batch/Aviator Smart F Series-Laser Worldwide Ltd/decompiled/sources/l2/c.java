package l2;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    private static final float MAX_HIGH_FEVERL_TEMP = 40.9f;
    private static final float MAX_LOW_FEVERL_TEMP = 37.9f;
    private static final float MAX_MODERATE_FEVER_TEMP = 38.9f;
    private static final float MAX_NORMAL_TEMP = 37.2f;
    private static final float MIN_HIGH_FEVER_TEMP = 39.0f;
    private static final float MIN_LOW_FEVERL_TEMP = 37.3f;
    private static final float MIN_MODERATE_FEVER_TEMP = 38.0f;
    private static final float MIN_NORMAL_TEMP = 36.3f;
    private static final float MIN_SUPER_HIGH_FEVERL_TEMP = 41.0f;
    private static final float WEATHER_TEMP_COEFFICIENT = 1.8f;
    private static final int WEATHER_TEMP_OFFSET = 32;

    public static float celsius2Fahrenheit(float f8) {
        int i8 = (int) ((((f8 * 10.0f) * 9.0f) / 5.0f) + 320.0f);
        return (i8 / 10) + ((i8 % 10) / 10.0f);
    }

    public static float fahrenheit2Celsius(float f8) {
        return (f8 - 32.0f) / 1.8f;
    }

    public static List<Float> fotmatTempList(List<Float> list, boolean z7) {
        if (!z7) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            float floatValue = list.get(i8).floatValue();
            if (0.0f < floatValue) {
                floatValue = celsius2Fahrenheit(floatValue);
            }
            arrayList.add(i8, Float.valueOf(floatValue));
        }
        return arrayList;
    }

    public static String getFeverGradeText(Context context, boolean z7) {
        return context.getString(R.string.fever_grade, getTempValue(context, 37.3f, z7), getTempValue(context, MAX_LOW_FEVERL_TEMP, z7), getTempValue(context, 38.0f, z7), getTempValue(context, MAX_MODERATE_FEVER_TEMP, z7), getTempValue(context, 39.0f, z7), getTempValue(context, MAX_HIGH_FEVERL_TEMP, z7), getTempValue(context, 41.0f, z7));
    }

    public static float getMaxTemp(boolean z7) {
        if (z7) {
            return celsius2Fahrenheit(50.0f);
        }
        return 50.0f;
    }

    public static String getNormalTemperatureText(Context context, boolean z7) {
        return context.getString(R.string.normal_temperature, getTempValue(context, 36.3f, z7), getTempValue(context, MAX_NORMAL_TEMP, z7));
    }

    private static String getTempValue(Context context, float f8, boolean z7) {
        String string = context.getString(R.string.celsius_unit);
        if (z7) {
            f8 = celsius2Fahrenheit(f8);
            string = context.getString(R.string.fahrenheit_unit);
        }
        return n.formatTemp(f8) + string;
    }
}
