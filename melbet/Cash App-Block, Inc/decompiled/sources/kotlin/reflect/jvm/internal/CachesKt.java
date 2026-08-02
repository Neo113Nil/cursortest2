package kotlin.reflect.jvm.internal;

/* loaded from: classes3.dex */
public abstract class CachesKt {
    public static final ConcurrentHashMapCache CACHE_FOR_BASE_CLASSIFIERS;
    public static final ConcurrentHashMapCache CACHE_FOR_GENERIC_CLASSIFIERS;
    public static final ConcurrentHashMapCache CACHE_FOR_NULLABLE_BASE_CLASSIFIERS;
    public static final ConcurrentHashMapCache K_CLASS_CACHE;
    public static final ConcurrentHashMapCache K_PACKAGE_CACHE;

    static {
        CachesKt$$Lambda$0 cachesKt$$Lambda$0 = CachesKt$$Lambda$0.INSTANCE;
        int i = CacheByClassKt.$r8$clinit;
        K_CLASS_CACHE = new ConcurrentHashMapCache(cachesKt$$Lambda$0);
        K_PACKAGE_CACHE = new ConcurrentHashMapCache(CachesKt$$Lambda$0.INSTANCE$1);
        CACHE_FOR_BASE_CLASSIFIERS = new ConcurrentHashMapCache(CachesKt$$Lambda$0.INSTANCE$2);
        CACHE_FOR_NULLABLE_BASE_CLASSIFIERS = new ConcurrentHashMapCache(CachesKt$$Lambda$0.INSTANCE$3);
        CACHE_FOR_GENERIC_CLASSIFIERS = new ConcurrentHashMapCache(CachesKt$$Lambda$0.INSTANCE$4);
    }

    public static final KClassImpl getOrCreateKotlinClass(Class cls) {
        cls.getClass();
        Object obj = K_CLASS_CACHE.get(cls);
        obj.getClass();
        return (KClassImpl) obj;
    }
}
