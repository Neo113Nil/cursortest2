package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    Optional() {
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> of(T t4) {
        return new Present(Preconditions.checkNotNull(t4));
    }

    public abstract T get();

    public abstract boolean isPresent();
}
