package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMap;
import kotlin.collections.AbstractMap$keys$1;
import kotlin.collections.AbstractMap$values$1;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;

/* loaded from: classes3.dex */
public final class PersistentHashMap extends AbstractMap implements PersistentMap {
    public static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.EMPTY, 0);
    public final TrieNode node;
    public final int size;

    public PersistentHashMap(TrieNode trieNode, int i) {
        trieNode.getClass();
        this.node = trieNode;
        this.size = i;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.node.containsKey(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
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
        boolean z = map instanceof PersistentOrderedMap;
        TrieNode trieNode = this.node;
        return z ? trieNode.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap) obj).getHashMap$kotlinx_collections_immutable().node, PersistentHashMap$equals$1.INSTANCE) : map instanceof PersistentOrderedMapBuilder ? trieNode.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder) obj).getHashMapBuilder$kotlinx_collections_immutable().node, PersistentHashMap$equals$1.INSTANCE$1) : map instanceof PersistentHashMap ? trieNode.equalsWith$kotlinx_collections_immutable(((PersistentHashMap) obj).node, PersistentHashMap$equals$1.INSTANCE$2) : map instanceof PersistentHashMapBuilder ? trieNode.equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder) obj).node, PersistentHashMap$equals$1.INSTANCE$3) : super.equals(obj);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.node.get(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getEntries() {
        return new AbstractMap$keys$1(this, 1);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getKeys() {
        return new AbstractMap$keys$1(this, 2);
    }

    @Override // kotlin.collections.AbstractMap
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMap
    public final Collection getValues() {
        return new AbstractMap$values$1(this, 1);
    }
}
