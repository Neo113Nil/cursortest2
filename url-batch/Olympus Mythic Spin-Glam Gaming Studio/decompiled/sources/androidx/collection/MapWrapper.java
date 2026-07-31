package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0013¨\u00060"}, d2 = {"Landroidx/collection/MapWrapper;", "K", "V", "", "", "isEmpty", "()Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "containsValue", "(Ljava/lang/Object;)Z", "containsKey", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/collection/ScatterMap;", "parent", "Landroidx/collection/ScatterMap;", "Landroidx/collection/Entries;", "_entries", "Landroidx/collection/Entries;", "Landroidx/collection/Keys;", "_keys", "Landroidx/collection/Keys;", "Landroidx/collection/Values;", "_values", "Landroidx/collection/Values;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "getSize", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
class MapWrapper<K, V> implements Map<K, V>, KMappedMarker {
    private Entries _entries;
    private Keys _keys;
    private Values _values;
    private final ScatterMap parent;

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
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    public Set getEntries() {
        Entries entries = this._entries;
        if (entries != null) {
            return entries;
        }
        Entries entries2 = new Entries(this.parent);
        this._entries = entries2;
        return entries2;
    }

    public Set getKeys() {
        Keys keys = this._keys;
        if (keys != null) {
            return keys;
        }
        Keys keys2 = new Keys(this.parent);
        this._keys = keys2;
        return keys2;
    }

    public Collection getValues() {
        Values values = this._values;
        if (values != null) {
            return values;
        }
        Values values2 = new Values(this.parent);
        this._values = values2;
        return values2;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Map
    public Object get(Object key) {
        return this.parent.get(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.parent.containsValue(value);
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.parent.containsKey(key);
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.parent, ((MapWrapper) other).parent);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.parent.hashCode();
    }

    public String toString() {
        return this.parent.toString();
    }
}
