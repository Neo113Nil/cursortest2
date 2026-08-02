package dagger.internal;

/* loaded from: classes3.dex */
public final class InstanceFactory<T> implements Factory<T> {
    private final T instance;

    public static <T> Factory<T> create(T t) {
        t.getClass();
        return new InstanceFactory(t);
    }

    private InstanceFactory(T t) {
        this.instance = t;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.instance;
    }
}
