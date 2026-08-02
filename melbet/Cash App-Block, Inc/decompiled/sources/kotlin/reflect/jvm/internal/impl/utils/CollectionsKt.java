package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class CollectionsKt {
    public static final <T> void addIfNotNull(Collection<T> collection, T t) {
        collection.getClass();
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <T> List<T> compact(ArrayList<T> arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(kotlin.collections.CollectionsKt.first((List) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> mapToIndex(Iterable<? extends K> iterable) {
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(i >= 3 ? (i / 3) + i + 1 : 3);
    }

    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(i >= 3 ? (i / 3) + i + 1 : 3);
    }

    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet<>(i >= 3 ? (i / 3) + i + 1 : 3);
    }
}
