package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public final class Preconditions {
    public static void checkArgument(boolean z7, String str) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }

    public static void checkState(boolean z7, String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }
}
