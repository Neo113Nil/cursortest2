package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13310a;

    public FinalConfigProvider(T t4) {
        this.f13310a = t4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f13310a;
    }
}
