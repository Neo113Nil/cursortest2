package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/MutableMapWrapper;", "K", "V", "Landroidx/collection/MapWrapper;", "", "", "clear", "()V", "key", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/collection/MutableScatterMap;", "parent", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableEntries;", "_entries", "Landroidx/collection/MutableEntries;", "Landroidx/collection/MutableKeys;", "_keys", "Landroidx/collection/MutableKeys;", "Landroidx/collection/MutableValues;", "_values", "Landroidx/collection/MutableValues;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MutableMapWrapper<K, V> extends MapWrapper<K, V> implements Map<K, V>, KMutableMap {
    private MutableEntries _entries;
    private MutableKeys _keys;
    private MutableValues _values;
    private final MutableScatterMap parent;

    @Override // androidx.collection.MapWrapper
    public Set getEntries() {
        MutableEntries mutableEntries = this._entries;
        if (mutableEntries != null) {
            return mutableEntries;
        }
        MutableEntries mutableEntries2 = new MutableEntries(this.parent);
        this._entries = mutableEntries2;
        return mutableEntries2;
    }

    @Override // androidx.collection.MapWrapper
    public Set getKeys() {
        MutableKeys mutableKeys = this._keys;
        if (mutableKeys != null) {
            return mutableKeys;
        }
        MutableKeys mutableKeys2 = new MutableKeys(this.parent);
        this._keys = mutableKeys2;
        return mutableKeys2;
    }

    @Override // androidx.collection.MapWrapper
    public Collection getValues() {
        MutableValues mutableValues = this._values;
        if (mutableValues != null) {
            return mutableValues;
        }
        MutableValues mutableValues2 = new MutableValues(this.parent);
        this._values = mutableValues2;
        return mutableValues2;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public Object remove(Object key) {
        return this.parent.remove(key);
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public Object put(Object key, Object value) {
        return this.parent.put(key, value);
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, V> entry : from.entrySet()) {
            this.parent.set(entry.getKey(), entry.getValue());
        }
    }
}
