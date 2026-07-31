package com.yandex.div.core.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SynchronizedWeakHashMap<K, N> extends WeakHashMap<K, N> {

    @NotNull
    private final Object lock = new Object();

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.lock) {
            super.clear();
            Unit unit = Unit.f41027a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, N> createMap() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, N>> entrySet = entrySet();
            linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        }
        return linkedHashMap;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, N>> entrySet() {
        return getEntries();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N get(@Nullable Object obj) {
        N n4;
        synchronized (this.lock) {
            n4 = (N) super.get(obj);
        }
        return n4;
    }

    @NotNull
    public Set<Map.Entry<K, N>> getEntries() {
        Set<Map.Entry<K, N>> entrySet;
        synchronized (this.lock) {
            entrySet = super.entrySet();
        }
        Intrinsics.checkNotNullExpressionValue(entrySet, "synchronized(lock) { super.entries }");
        return entrySet;
    }

    @NotNull
    public Set<K> getKeys() {
        Set<K> keySet;
        synchronized (this.lock) {
            keySet = super.keySet();
        }
        Intrinsics.checkNotNullExpressionValue(keySet, "synchronized(lock) { super.keys }");
        return keySet;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @NotNull
    public Collection<N> getValues() {
        Collection<N> values;
        synchronized (this.lock) {
            values = super.values();
        }
        Intrinsics.checkNotNullExpressionValue(values, "synchronized(lock) { super.values }");
        return values;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N put(@NotNull K key, @NotNull N value) {
        N n4;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            n4 = (N) super.put(key, value);
        }
        return n4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends N> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        synchronized (this.lock) {
            super.putAll(from);
            Unit unit = Unit.f41027a;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N remove(@Nullable Object obj) {
        N n4;
        synchronized (this.lock) {
            n4 = (N) super.remove(obj);
        }
        return n4;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<N> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean remove;
        if (obj == null || obj2 == null) {
            return false;
        }
        synchronized (this.lock) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }
}
