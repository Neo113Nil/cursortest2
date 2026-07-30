package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    @RequiresApi(34)
    private static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static float deriveDimension(int i8, float f8, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i8, f8, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i8, float f8, @NonNull DisplayMetrics displayMetrics) {
        float f9;
        float f10;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i8, f8, displayMetrics);
        }
        if (i8 == 0) {
            return f8;
        }
        if (i8 == 1) {
            float f11 = displayMetrics.density;
            if (f11 == 0.0f) {
                return 0.0f;
            }
            return f8 / f11;
        }
        if (i8 == 2) {
            float f12 = displayMetrics.scaledDensity;
            if (f12 == 0.0f) {
                return 0.0f;
            }
            return f8 / f12;
        }
        if (i8 == 3) {
            float f13 = displayMetrics.xdpi;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            f9 = f8 / f13;
            f10 = INCHES_PER_PT;
        } else {
            if (i8 == 4) {
                float f14 = displayMetrics.xdpi;
                if (f14 == 0.0f) {
                    return 0.0f;
                }
                return f8 / f14;
            }
            if (i8 != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i8);
            }
            float f15 = displayMetrics.xdpi;
            if (f15 == 0.0f) {
                return 0.0f;
            }
            f9 = f8 / f15;
            f10 = INCHES_PER_MM;
        }
        return f9 / f10;
    }

    public static float dpToPx(float f8, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f8, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i8) {
        return i8 & 15;
    }

    public static float pxToDp(float f8, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(1, f8, displayMetrics);
    }

    public static float pxToSp(float f8, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(2, f8, displayMetrics);
    }

    public static float spToPx(float f8, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f8, displayMetrics);
    }
}
