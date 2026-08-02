package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.full.KClassifiers;

/* loaded from: classes3.dex */
public final class CachesKt$$Lambda$0 implements Function1 {
    public static final CachesKt$$Lambda$0 INSTANCE = new CachesKt$$Lambda$0(0);
    public static final CachesKt$$Lambda$0 INSTANCE$1 = new CachesKt$$Lambda$0(1);
    public static final CachesKt$$Lambda$0 INSTANCE$2 = new CachesKt$$Lambda$0(2);
    public static final CachesKt$$Lambda$0 INSTANCE$3 = new CachesKt$$Lambda$0(3);
    public static final CachesKt$$Lambda$0 INSTANCE$4 = new CachesKt$$Lambda$0(4);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CachesKt$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        switch (this.$r8$classId) {
            case 0:
                ConcurrentHashMapCache concurrentHashMapCache = CachesKt.K_CLASS_CACHE;
                cls.getClass();
                return new KClassImpl(cls);
            case 1:
                ConcurrentHashMapCache concurrentHashMapCache2 = CachesKt.K_CLASS_CACHE;
                cls.getClass();
                return new KPackageImpl(cls);
            case 2:
                ConcurrentHashMapCache concurrentHashMapCache3 = CachesKt.K_CLASS_CACHE;
                cls.getClass();
                KClassImpl orCreateKotlinClass = CachesKt.getOrCreateKotlinClass(cls);
                EmptyList emptyList = EmptyList.INSTANCE;
                return KClassifiers.createType(orCreateKotlinClass, emptyList, false, emptyList);
            case 3:
                ConcurrentHashMapCache concurrentHashMapCache4 = CachesKt.K_CLASS_CACHE;
                cls.getClass();
                KClassImpl orCreateKotlinClass2 = CachesKt.getOrCreateKotlinClass(cls);
                EmptyList emptyList2 = EmptyList.INSTANCE;
                return KClassifiers.createType(orCreateKotlinClass2, emptyList2, true, emptyList2);
            default:
                ConcurrentHashMapCache concurrentHashMapCache5 = CachesKt.K_CLASS_CACHE;
                cls.getClass();
                return new ConcurrentHashMap();
        }
    }
}
