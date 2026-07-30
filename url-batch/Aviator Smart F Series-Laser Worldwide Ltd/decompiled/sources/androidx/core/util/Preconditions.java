package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f8, @NonNull String str) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f8)) {
            return f8;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i8, int i9, int i10, @NonNull String str) {
        if (i8 < i9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        if (i8 <= i10) {
            return i8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i8, @Nullable String str) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i8, int i9) {
        if ((i8 & i9) == i8) {
            return i8;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(i9) + " are allowed");
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t7) {
        t7.getClass();
        return t7;
    }

    public static void checkState(boolean z7, @Nullable String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t7) {
        if (TextUtils.isEmpty(t7)) {
            throw new IllegalArgumentException();
        }
        return t7;
    }

    public static void checkArgument(boolean z7, @NonNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t7, @NonNull Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z7) {
        checkState(z7, null);
    }

    public static void checkArgument(boolean z7, @NonNull String str, @NonNull Object... objArr) {
        if (!z7) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t7, @NonNull Object obj) {
        if (TextUtils.isEmpty(t7)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t7;
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t7, @NonNull String str, @NonNull Object... objArr) {
        if (TextUtils.isEmpty(t7)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t7;
    }

    public static long checkArgumentInRange(long j8, long j9, long j10, @NonNull String str) {
        if (j8 < j9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j9), Long.valueOf(j10)));
        }
        if (j8 <= j10) {
            return j8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j9), Long.valueOf(j10)));
    }

    public static float checkArgumentInRange(float f8, float f9, float f10, @NonNull String str) {
        if (f8 < f9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f9), Float.valueOf(f10)));
        }
        if (f8 <= f10) {
            return f8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f9), Float.valueOf(f10)));
    }

    public static double checkArgumentInRange(double d8, double d9, double d10, @NonNull String str) {
        if (d8 < d9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d9), Double.valueOf(d10)));
        }
        if (d8 <= d10) {
            return d8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d9), Double.valueOf(d10)));
    }
}
