package io.flutter.util;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t4) {
        t4.getClass();
        return t4;
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
