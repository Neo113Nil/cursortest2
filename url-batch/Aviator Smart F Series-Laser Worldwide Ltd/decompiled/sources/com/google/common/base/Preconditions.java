package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i8, int i9, String str) {
        if (i8 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String badPositionIndex(int i8, int i9, String str) {
        if (i8 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String badPositionIndexes(int i8, int i9, int i10) {
        return (i8 < 0 || i8 > i10) ? badPositionIndex(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? badPositionIndex(i9, i10, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8));
    }

    public static void checkArgument(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i8, int i9) {
        return checkElementIndex(i8, i9, "index");
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7) {
        t7.getClass();
        return t7;
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i8, int i9) {
        return checkPositionIndex(i8, i9, "index");
    }

    public static void checkPositionIndexes(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i8, i9, i10));
        }
    }

    public static void checkState(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z7, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i8, int i9, String str) {
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException(badElementIndex(i8, i9, str));
        }
        return i8;
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, @CheckForNull Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(badPositionIndex(i8, i9, str));
        }
        return i8;
    }

    public static void checkState(boolean z7, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object... objArr) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, objArr));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object... objArr) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z7, @CheckForNull String str, @CheckForNull Object... objArr) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z7, String str, char c8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, char c8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c8)));
    }

    public static void checkState(boolean z7, String str, char c8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c8)));
        }
    }

    public static void checkArgument(boolean z7, String str, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, int i8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i8)));
    }

    public static void checkState(boolean z7, String str, int i8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z7, String str, long j8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, long j8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j8)));
    }

    public static void checkState(boolean z7, String str, long j8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z7, String str, char c8, char c9) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c8), Character.valueOf(c9)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, char c8, char c9) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c8), Character.valueOf(c9)));
    }

    public static void checkState(boolean z7, String str, char c8, char c9) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c8), Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z7, String str, char c8, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c8), Integer.valueOf(i8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, char c8, int i8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c8), Integer.valueOf(i8)));
    }

    public static void checkState(boolean z7, String str, char c8, int i8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c8), Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z7, String str, char c8, long j8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c8), Long.valueOf(j8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, char c8, long j8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c8), Long.valueOf(j8)));
    }

    public static void checkState(boolean z7, String str, char c8, long j8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c8), Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z7, String str, char c8, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c8), obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, char c8, @CheckForNull Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c8), obj));
    }

    public static void checkState(boolean z7, String str, char c8, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c8), obj));
        }
    }

    public static void checkArgument(boolean z7, String str, int i8, char c8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, int i8, char c8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c8)));
    }

    public static void checkState(boolean z7, String str, int i8, char c8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c8)));
        }
    }

    public static void checkArgument(boolean z7, String str, int i8, int i9) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, int i8, int i9) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    public static void checkState(boolean z7, String str, int i8, int i9) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static void checkArgument(boolean z7, String str, int i8, long j8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, int i8, long j8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
    }

    public static void checkState(boolean z7, String str, int i8, long j8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z7, String str, int i8, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i8), obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, int i8, @CheckForNull Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i8), obj));
    }

    public static void checkState(boolean z7, String str, int i8, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i8), obj));
        }
    }

    public static void checkArgument(boolean z7, String str, long j8, char c8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, long j8, char c8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c8)));
    }

    public static void checkState(boolean z7, String str, long j8, char c8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c8)));
        }
    }

    public static void checkArgument(boolean z7, String str, long j8, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, long j8, int i8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
    }

    public static void checkState(boolean z7, String str, long j8, int i8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z7, String str, long j8, long j9) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, long j8, long j9) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
    }

    public static void checkState(boolean z7, String str, long j8, long j9) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static void checkArgument(boolean z7, String str, long j8, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j8), obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, long j8, @CheckForNull Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j8), obj));
    }

    public static void checkState(boolean z7, String str, long j8, @CheckForNull Object obj) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j8), obj));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj, char c8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Character.valueOf(c8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj, char c8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Character.valueOf(c8)));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj, char c8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Character.valueOf(c8)));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Integer.valueOf(i8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj, int i8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Integer.valueOf(i8)));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj, int i8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj, long j8) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj, long j8) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj, long j8) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z7) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z7, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z7) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
