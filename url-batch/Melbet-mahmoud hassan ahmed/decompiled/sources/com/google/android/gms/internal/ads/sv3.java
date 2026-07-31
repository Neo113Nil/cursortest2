package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class sv3 {
    public static <T> T a(T t6, String str) {
        Objects.requireNonNull(t6, str);
        return t6;
    }

    public static <T> T b(T t6) {
        Objects.requireNonNull(t6, "Cannot return null from a non-@Nullable @Provides method");
        return t6;
    }

    public static <T> void c(T t6, Class<T> cls) {
        if (t6 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
