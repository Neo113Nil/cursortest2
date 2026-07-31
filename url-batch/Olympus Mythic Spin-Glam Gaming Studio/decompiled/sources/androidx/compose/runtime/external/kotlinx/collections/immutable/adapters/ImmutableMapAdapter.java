package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ReadOnlyCollectionAdapters.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u001a\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R,\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0014\u0010(\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010\f¨\u0006)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableMapAdapter;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "key", "containsKey", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "impl", "Ljava/util/Map;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "entries", "getEntries", "getSize", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImmutableMapAdapter<K, V> implements ImmutableMap<K, V>, Map<K, V>, KMappedMarker {
    private final ImmutableSet entries;
    private final Map impl;
    private final ImmutableSet keys;
    private final ImmutableCollection values;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.impl.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.impl.containsValue(value);
    }

    @Override // java.util.Map
    public Object get(Object key) {
        return this.impl.get(key);
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableSet entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableSet keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableCollection values() {
        return getValues();
    }

    public ImmutableSet getKeys() {
        return this.keys;
    }

    public ImmutableCollection getValues() {
        return this.values;
    }

    public ImmutableSet getEntries() {
        return this.entries;
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return this.impl.equals(other);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.impl.hashCode();
    }

    public String toString() {
        return this.impl.toString();
    }
}
