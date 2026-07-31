package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class InstanceFactory<T> implements Factory<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory<>(null);
    private final T instance;

    private InstanceFactory(T t4) {
        this.instance = t4;
    }

    public static <T> Factory<T> create(T t4) {
        return new InstanceFactory(Preconditions.checkNotNull(t4, "instance cannot be null"));
    }

    @Override // V1.a
    public T get() {
        return this.instance;
    }
}
