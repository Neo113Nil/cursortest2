package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class ConcurrentHashMapCache extends SafeTrace {
    public final ConcurrentHashMap cache = new ConcurrentHashMap();
    public final Function1 compute;

    public ConcurrentHashMapCache(Function1 function1) {
        this.compute = function1;
    }

    public final Object get(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.cache;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object invoke = this.compute.invoke(cls);
        Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }
}
