package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8893a;

    public FinalConfigProvider(T t3) {
        this.f8893a = t3;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f8893a;
    }
}
