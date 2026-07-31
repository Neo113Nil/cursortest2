package com.google.common.base;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public abstract class Preconditions {
    private static String badElementIndex(int i4, int i5, String str) {
        if (i4 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String badPositionIndex(int i4, int i5, String str) {
        if (i4 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String badPositionIndexes(int i4, int i5, int i6) {
        return (i4 < 0 || i4 > i6) ? badPositionIndex(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? badPositionIndex(i5, i6, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
    }

    public static void checkArgument(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i4, int i5) {
        return checkElementIndex(i4, i5, FirebaseAnalytics.Param.INDEX);
    }

    public static <T> T checkNotNull(T t4) {
        t4.getClass();
        return t4;
    }

    public static int checkPositionIndex(int i4, int i5) {
        return checkPositionIndex(i4, i5, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkPositionIndexes(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i4, i5, i6));
        }
    }

    public static void checkState(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i4, int i5, String str) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(badElementIndex(i4, i5, str));
        }
        return i4;
    }

    public static <T> T checkNotNull(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(badPositionIndex(i4, i5, str));
        }
        return i4;
    }

    public static void checkState(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj));
        }
    }
}
