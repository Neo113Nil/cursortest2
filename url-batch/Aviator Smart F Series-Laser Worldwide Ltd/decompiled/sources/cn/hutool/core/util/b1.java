package cn.hutool.core.util;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public class b1 {
    public static <T> ServiceLoader<T> load(Class<T> cls) {
        return load(cls, null);
    }

    public static <T> T loadFirst(Class<T> cls) {
        Iterator it = load(cls).iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }

    public static <T> T loadFirstAvailable(Class<T> cls) {
        Iterator it = load(cls).iterator();
        while (it.hasNext()) {
            try {
                return (T) it.next();
            } catch (ServiceConfigurationError unused) {
            }
        }
        return null;
    }

    public static <T> List<T> loadList(Class<T> cls) {
        return loadList(cls, null);
    }

    public static <T> ServiceLoader<T> load(Class<T> cls, ClassLoader classLoader) {
        return ServiceLoader.load(cls, (ClassLoader) e0.defaultIfNull(classLoader, new cn.hutool.core.io.resource.e()));
    }

    public static <T> List<T> loadList(Class<T> cls, ClassLoader classLoader) {
        return cn.hutool.core.collection.n0.list(false, (Iterable) load(cls, classLoader));
    }
}
