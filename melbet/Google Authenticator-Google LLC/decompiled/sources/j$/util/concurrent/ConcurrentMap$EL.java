package j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class ConcurrentMap$EL {
    public static /* synthetic */ Object compute(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        return concurrentMap instanceof ConcurrentHashMap ? ((ConcurrentHashMap) concurrentMap).compute(obj, biFunction) : j$.nio.file.attribute.a.i(concurrentMap, obj, biFunction);
    }

    public static Object computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        Object apply;
        if (concurrentMap instanceof ConcurrentHashMap) {
            return ((ConcurrentHashMap) concurrentMap).computeIfAbsent(obj, function);
        }
        function.getClass();
        Object obj2 = concurrentMap.get(obj);
        if (obj2 != null || (apply = function.apply(obj)) == null) {
            return obj2;
        }
        Object putIfAbsent = concurrentMap.putIfAbsent(obj, apply);
        return putIfAbsent == null ? apply : putIfAbsent;
    }
}
