package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class SetsKt___SetsKt extends SetsKt__SetsKt {
    public static Set minus(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> convertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable);
        if (convertToListIfNotCollection.isEmpty()) {
            return CollectionsKt.toSet(set);
        }
        if (!(convertToListIfNotCollection instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(convertToListIfNotCollection);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) convertToListIfNotCollection).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet plus(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet plus(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet minus(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }
}
