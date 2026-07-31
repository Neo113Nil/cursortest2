package androidx.core.util;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public class TypedValueCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ComplexDimensionUnit {
    }

    @RequiresApi
    private static class Api34Impl {
        @DoNotInline
        public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }
}
