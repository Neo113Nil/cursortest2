package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public abstract class Preconditions {
    public static <T> void checkBuilderRequirement(T t4, Class<T> cls) {
        if (t4 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T t4) {
        t4.getClass();
        return t4;
    }

    public static <T> T checkNotNull(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }
}
