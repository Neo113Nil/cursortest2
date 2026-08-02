package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class AbstractMap implements Map, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    public volatile AbstractMap$keys$1 _keys;
    public volatile AbstractMap$values$1 _values;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entries = getEntries();
        if (entries.isEmpty()) {
            return false;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getSize() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (Intrinsics.areEqual(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry implFindEntry = implFindEntry(obj);
        if (implFindEntry != null) {
            return implFindEntry.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    public Set getKeys() {
        if (this._keys == null) {
            this._keys = new AbstractMap$keys$1(this, 0);
        }
        AbstractMap$keys$1 abstractMap$keys$1 = this._keys;
        abstractMap$keys$1.getClass();
        return abstractMap$keys$1;
    }

    public int getSize() {
        return getEntries().size();
    }

    public Collection getValues() {
        if (this._values == null) {
            this._values = new AbstractMap$values$1(this, 0);
        }
        AbstractMap$values$1 abstractMap$values$1 = this._values;
        abstractMap$values$1.getClass();
        return abstractMap$values$1;
    }

    @Override // java.util.Map
    public int hashCode() {
        return getEntries().hashCode();
    }

    public final Map.Entry implFindEntry(Object obj) {
        Object obj2;
        Iterator it = getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj2).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) obj2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getSize() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(getEntries(), ", ", "{", "}", 0, null, new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 17), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }
}
