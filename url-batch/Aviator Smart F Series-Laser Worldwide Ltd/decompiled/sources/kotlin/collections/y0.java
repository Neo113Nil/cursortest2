package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class y0 extends x0 {
    public static final <T> Set<T> minus(Set<? extends T> set, T t7) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        mapCapacity = l0.mapCapacity(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(mapCapacity);
        boolean z7 = false;
        for (T t8 : set) {
            boolean z8 = true;
            if (!z7 && kotlin.jvm.internal.s.areEqual(t8, t7)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                linkedHashSet.add(t8);
            }
        }
        return linkedHashSet;
    }

    private static final <T> Set<T> minusElement(Set<? extends T> set, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        return minus(set, t7);
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T t7) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        mapCapacity = l0.mapCapacity(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(mapCapacity);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t7);
        return linkedHashSet;
    }

    private static final <T> Set<T> plusElement(Set<? extends T> set, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        return plus(set, t7);
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T[] elements) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        mapCapacity = l0.mapCapacity(set.size() + elements.length);
        LinkedHashSet linkedHashSet = new LinkedHashSet(mapCapacity);
        linkedHashSet.addAll(set);
        v.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        v.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, Iterable<? extends T> elements) {
        Set<T> set2;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Collection<?> convertToListIfNotCollection = v.convertToListIfNotCollection(elements);
        if (convertToListIfNotCollection.isEmpty()) {
            set2 = CollectionsKt___CollectionsKt.toSet(set);
            return set2;
        }
        if (convertToListIfNotCollection instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t7 : set) {
                if (!convertToListIfNotCollection.contains(t7)) {
                    linkedHashSet.add(t7);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(convertToListIfNotCollection);
        return linkedHashSet2;
    }

    public static <T> Set<T> plus(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Integer collectionSizeOrNull = r.collectionSizeOrNull(elements);
        if (collectionSizeOrNull != null) {
            size = set.size() + collectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        mapCapacity = l0.mapCapacity(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(mapCapacity);
        linkedHashSet.addAll(set);
        v.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, kotlin.sequences.m elements) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        mapCapacity = l0.mapCapacity(set.size() * 2);
        LinkedHashSet linkedHashSet = new LinkedHashSet(mapCapacity);
        linkedHashSet.addAll(set);
        v.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, kotlin.sequences.m elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        v.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }
}
