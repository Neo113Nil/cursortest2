package cn.hutool.core.lang;

import cn.hutool.core.lang.func.Func0;
import cn.hutool.core.map.SafeConcurrentHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public final class v0 {
    private static final SafeConcurrentHashMap<String, Object> POOL = new SafeConcurrentHashMap<>();

    private v0() {
    }

    private static String buildKey(String str, Object... objArr) {
        return cn.hutool.core.util.h.isEmpty(objArr) ? str : cn.hutool.core.text.l.format("{}#{}", str, cn.hutool.core.util.h.join(objArr, (CharSequence) "_"));
    }

    public static void destroy() {
        POOL.clear();
    }

    public static boolean exists(Class<?> cls, Object... objArr) {
        if (cls == null) {
            return false;
        }
        return POOL.containsKey(buildKey(cls.getName(), objArr));
    }

    public static <T> T get(Class<T> cls, Object... objArr) {
        q.notNull(cls, "Class must be not null !", new Object[0]);
        return (T) get(buildKey(cls.getName(), objArr), new t0(cls, objArr));
    }

    public static Set<Class<?>> getExistClass() {
        Stream stream;
        Stream map;
        Collector set;
        Object collect;
        stream = POOL.values().stream();
        map = stream.map(new Function() { // from class: cn.hutool.core.lang.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return obj.getClass();
            }
        });
        set = Collectors.toSet();
        collect = map.collect(set);
        return (Set) collect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$get$0(Func0 func0, String str) {
        return func0.callWithRuntimeException();
    }

    public static void put(Object obj) {
        q.notNull(obj, "Bean object must be not null !", new Object[0]);
        put(obj.getClass().getName(), obj);
    }

    public static void remove(Class<?> cls) {
        if (cls != null) {
            remove(cls.getName());
        }
    }

    public static void remove(String str) {
        POOL.remove(str);
    }

    public static void put(String str, Object obj) {
        POOL.put(str, obj);
    }

    public static <T> T get(String str, final Func0<T> func0) {
        return (T) POOL.computeIfAbsent(str, new Function() { // from class: cn.hutool.core.lang.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$get$0;
                lambda$get$0 = v0.lambda$get$0(Func0.this, (String) obj);
                return lambda$get$0;
            }
        });
    }

    public static <T> T get(String str, Object... objArr) {
        q.notBlank(str, "Class name must be not blank !", new Object[0]);
        return (T) get(cn.hutool.core.util.p.loadClass(str), objArr);
    }
}
