package x5;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public abstract class a {
    private a() {
    }

    @ColorInt
    public static int applyAlpha(@ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        return (i8 & ViewCompat.MEASURED_SIZE_MASK) | (i9 << 24);
    }

    @ColorInt
    public static int blend(@ColorInt int i8, @ColorInt int i9, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        float f9 = 1.0f - f8;
        return Color.rgb((int) ((Color.red(i8) * f9) + (Color.red(i9) * f8)), (int) ((Color.green(i8) * f9) + (Color.green(i9) * f8)), (int) ((f9 * Color.blue(i8)) + (f8 * Color.blue(i9))));
    }
}
