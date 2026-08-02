package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.builders.MapBuilderKeys;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntries;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderValues;
import kotlinx.collections.immutable.internal.EndOfChain;

/* loaded from: classes9.dex */
public final class PersistentOrderedMapBuilder extends AbstractMutableMap implements PersistentMap.Builder {
    public PersistentOrderedMap builtMap;
    public Object firstKey;
    public final PersistentHashMapBuilder hashMapBuilder;
    public Object lastKey;

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap) {
        this.builtMap = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.firstKey;
        this.lastKey = persistentOrderedMap.lastKey;
        PersistentHashMap persistentHashMap = persistentOrderedMap.hashMap;
        persistentHashMap.getClass();
        this.hashMapBuilder = new PersistentHashMapBuilder(persistentHashMap);
    }

    public final PersistentMap build() {
        PersistentOrderedMap persistentOrderedMap = this.builtMap;
        PersistentHashMapBuilder persistentHashMapBuilder = this.hashMapBuilder;
        if (persistentOrderedMap != null) {
            PersistentHashMap persistentHashMap = persistentHashMapBuilder.builtMap;
            return persistentOrderedMap;
        }
        PersistentHashMap persistentHashMap2 = persistentHashMapBuilder.builtMap;
        PersistentOrderedMap persistentOrderedMap2 = new PersistentOrderedMap(this.firstKey, this.lastKey, persistentHashMapBuilder.build());
        this.builtMap = persistentOrderedMap2;
        return persistentOrderedMap2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        PersistentHashMapBuilder persistentHashMapBuilder = this.hashMapBuilder;
        if (!persistentHashMapBuilder.isEmpty()) {
            this.builtMap = null;
        }
        persistentHashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            PersistentHashMapBuilder persistentHashMapBuilder = this.hashMapBuilder;
            Map map = (Map) obj;
            if (persistentHashMapBuilder.getSize() == map.size()) {
                if (map instanceof PersistentOrderedMap) {
                    return persistentHashMapBuilder.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap) obj).hashMap.node, PersistentOrderedMap$equals$1.INSTANCE$4);
                }
                if (map instanceof PersistentOrderedMapBuilder) {
                    return persistentHashMapBuilder.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder) obj).hashMapBuilder.node, PersistentOrderedMap$equals$1.INSTANCE$5);
                }
                if (map instanceof PersistentHashMap) {
                    return persistentHashMapBuilder.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMap) obj).node, PersistentOrderedMap$equals$1.INSTANCE$6);
                }
                if (map instanceof PersistentHashMapBuilder) {
                    return persistentHashMapBuilder.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder) obj).node, PersistentOrderedMap$equals$1.INSTANCE$7);
                }
                if (getSize() != map.size()) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return false;
                }
                if (map.isEmpty()) {
                    return true;
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!AnnotatedStringKtxKt.containsEntry$kotlinx_collections_immutable(this, (Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.value;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getEntries() {
        return new PersistentHashMapBuilderEntries(this, 1);
    }

    public final PersistentHashMapBuilder getHashMapBuilder$kotlinx_collections_immutable() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getKeys() {
        return new MapBuilderKeys(this, 2);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int getSize() {
        return this.hashMapBuilder.getSize();
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Collection getValues() {
        return new PersistentHashMapBuilderValues(this, 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.hashMapBuilder;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.get(obj);
        if (linkedValue != null) {
            Object obj3 = linkedValue.value;
            if (obj3 == obj2) {
                return obj2;
            }
            this.builtMap = null;
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, linkedValue.previous, linkedValue.next));
            return obj3;
        }
        this.builtMap = null;
        boolean isEmpty = isEmpty();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        if (isEmpty) {
            this.firstKey = obj;
            this.lastKey = obj;
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, endOfChain, endOfChain));
            return null;
        }
        Object obj4 = this.lastKey;
        Object obj5 = persistentHashMapBuilder.get(obj4);
        obj5.getClass();
        LinkedValue linkedValue2 = (LinkedValue) obj5;
        persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.value, linkedValue2.previous, obj));
        persistentHashMapBuilder.put(obj, new LinkedValue(obj2, obj4, endOfChain));
        this.lastKey = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.hashMapBuilder;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        Object obj2 = linkedValue.next;
        Object obj3 = linkedValue.previous;
        this.builtMap = null;
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        if (obj3 != endOfChain) {
            Object obj4 = persistentHashMapBuilder.get(obj3);
            obj4.getClass();
            LinkedValue linkedValue2 = (LinkedValue) obj4;
            persistentHashMapBuilder.put(obj3, new LinkedValue(linkedValue2.value, linkedValue2.previous, obj2));
        } else {
            this.firstKey = obj2;
        }
        if (obj2 != endOfChain) {
            Object obj5 = persistentHashMapBuilder.get(obj2);
            obj5.getClass();
            LinkedValue linkedValue3 = (LinkedValue) obj5;
            persistentHashMapBuilder.put(obj2, new LinkedValue(linkedValue3.value, obj3, linkedValue3.next));
        } else {
            this.lastKey = obj3;
        }
        return linkedValue.value;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.hashMapBuilder.get(obj);
        if (linkedValue == null || !Intrinsics.areEqual(linkedValue.value, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
