package io.opentelemetry.common;

/* loaded from: classes3.dex */
public interface ComponentLoader {
    <T> Iterable<T> load(Class<T> cls);

    static ComponentLoader forClassLoader(ClassLoader classLoader) {
        return new ServiceLoaderComponentLoader(classLoader);
    }
}
