package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    public static LinkedHashSet linkedSetOf(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(objArr.length));
        ArraysKt___ArraysKt.toCollection(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set mutableSetOf(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(objArr.length));
        ArraysKt___ArraysKt.toCollection(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set setOfNotNull(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
