package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final class MutableMapWithDefaultImpl implements Map, KMutableMap, KMappedMarker {

    /* renamed from: default, reason: not valid java name */
    public final Perfs$$ExternalSyntheticLambda2 f832default;
    public final LinkedHashMap map;

    public MutableMapWithDefaultImpl(LinkedHashMap linkedHashMap, Perfs$$ExternalSyntheticLambda2 perfs$$ExternalSyntheticLambda2) {
        this.map = linkedHashMap;
        this.f832default = perfs$$ExternalSyntheticLambda2;
    }

    @Override // java.util.Map
    public final void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.map.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.map.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.map.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        this.map.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.map.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.map.size();
    }

    public final String toString() {
        return this.map.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.map.values();
    }
}
