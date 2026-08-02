package kotlinx.collections.immutable.implementations.immutableMap;

import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.builders.MapBuilderKeys;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.EndOfChain;

/* loaded from: classes3.dex */
public final class PersistentHashMapBuilder extends AbstractMutableMap implements PersistentMap.Builder {
    public PersistentHashMap builtMap;
    public int modCount;
    public TrieNode node;
    public Object operationResult;
    public EndOfChain ownership;
    public int size;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        persistentHashMap.getClass();
        this.builtMap = persistentHashMap;
        this.ownership = new EndOfChain();
        this.node = persistentHashMap.node;
        this.size = persistentHashMap.getSize();
    }

    public final PersistentHashMap build() {
        PersistentHashMap persistentHashMap = this.builtMap;
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        PersistentHashMap persistentHashMap2 = new PersistentHashMap(this.node, getSize());
        this.builtMap = persistentHashMap2;
        this.ownership = new EndOfChain();
        return persistentHashMap2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        TrieNode trieNode = TrieNode.EMPTY;
        trieNode.getClass();
        setNode$kotlinx_collections_immutable(trieNode);
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.node.containsKey(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.size != map.size()) {
            return false;
        }
        return map instanceof PersistentHashMap ? this.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMap) obj).node, PersistentHashMap$equals$1.INSTANCE$4) : map instanceof PersistentHashMapBuilder ? this.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder) obj).node, PersistentHashMap$equals$1.INSTANCE$5) : map instanceof PersistentOrderedMap ? this.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap) obj).getHashMap$kotlinx_collections_immutable().node, PersistentHashMap$equals$1.INSTANCE$6) : map instanceof PersistentOrderedMapBuilder ? this.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder) obj).getHashMapBuilder$kotlinx_collections_immutable().node, PersistentHashMap$equals$1.INSTANCE$7) : AnnotatedStringKtxKt.equals$kotlinx_collections_immutable(this, map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.node.get(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getEntries() {
        return new PersistentHashMapBuilderEntries(this, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getKeys() {
        return new MapBuilderKeys(this, 1);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Collection getValues() {
        return new PersistentHashMapBuilderValues(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        hashCode = getEntries().hashCode();
        return hashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.operationResult = null;
        setNode$kotlinx_collections_immutable(this.node.mutablePut(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        PersistentHashMap persistentHashMap = null;
        PersistentHashMap persistentHashMap2 = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap2 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build();
            }
        } else {
            persistentHashMap = persistentHashMap2;
        }
        if (persistentHashMap == null) {
            super.putAll(map);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i = this.size;
        TrieNode trieNode = this.node;
        TrieNode trieNode2 = persistentHashMap.node;
        trieNode2.getClass();
        setNode$kotlinx_collections_immutable(trieNode.mutablePutAll(trieNode2, 0, deltaCounter, this));
        int count = (persistentHashMap.size + i) - deltaCounter.getCount();
        if (i != count) {
            setSize(count);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = getSize();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.EMPTY;
            mutableRemove.getClass();
        }
        setNode$kotlinx_collections_immutable(mutableRemove);
        return size != getSize();
    }

    public final void setNode$kotlinx_collections_immutable(TrieNode trieNode) {
        trieNode.getClass();
        if (trieNode != this.node) {
            this.node = trieNode;
            this.builtMap = null;
        }
    }

    public final void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.EMPTY;
            mutableRemove.getClass();
        }
        setNode$kotlinx_collections_immutable(mutableRemove);
        return this.operationResult;
    }
}
