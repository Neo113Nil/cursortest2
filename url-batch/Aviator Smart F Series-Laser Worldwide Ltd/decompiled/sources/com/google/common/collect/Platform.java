package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Platform {
    private Platform() {
    }

    static void checkGwtRpcEnabled() {
    }

    static <T> T[] copy(Object[] objArr, int i8, int i9, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i8, i9, tArr.getClass());
    }

    static <T> T[] newArray(T[] tArr, int i8) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i8));
    }

    static <K, V> Map<K, V> newHashMapWithExpectedSize(int i8) {
        return CompactHashMap.createWithExpectedSize(i8);
    }

    static <E> Set<E> newHashSetWithExpectedSize(int i8) {
        return CompactHashSet.createWithExpectedSize(i8);
    }

    static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i8) {
        return CompactLinkedHashMap.createWithExpectedSize(i8);
    }

    static <E> Set<E> newLinkedHashSetWithExpectedSize(int i8) {
        return CompactLinkedHashSet.createWithExpectedSize(i8);
    }

    static <E> Set<E> preservesInsertionOrderOnAddsSet() {
        return CompactHashSet.create();
    }

    static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
        return CompactHashMap.create();
    }

    static int reduceExponentIfGwt(int i8) {
        return i8;
    }

    static int reduceIterationsIfGwt(int i8) {
        return i8;
    }

    static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}
