package kotlin.collections;

import java.util.Iterator;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapKeysIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKeysIterator;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapKeysIterator;

/* loaded from: classes9.dex */
public final class AbstractMap$values$1 extends AbstractCollection {
    public final /* synthetic */ int $r8$classId;
    public final AbstractMap this$0;

    public /* synthetic */ AbstractMap$values$1(AbstractMap abstractMap, int i) {
        this.$r8$classId = i;
        this.this$0 = abstractMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.this$0;
        switch (i) {
            case 0:
                return abstractMap.containsValue(obj);
            case 1:
                return ((PersistentHashMap) abstractMap).containsValue(obj);
            default:
                return ((PersistentOrderedMap) abstractMap).containsValue(obj);
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.this$0;
        switch (i) {
            case 0:
                return abstractMap.getSize();
            case 1:
                return ((PersistentHashMap) abstractMap).size;
            default:
                return ((PersistentOrderedMap) abstractMap).hashMap.size();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.this$0;
        switch (i) {
            case 0:
                return new AbstractMap$keys$1$iterator$1(abstractMap.getEntries().iterator(), 2);
            case 1:
                TrieNode trieNode = ((PersistentHashMap) abstractMap).node;
                trieNode.getClass();
                TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    trieNodeBaseIteratorArr[i2] = new TrieNodeKeysIterator(2);
                }
                return new PersistentHashMapKeysIterator(trieNode, trieNodeBaseIteratorArr);
            default:
                return new PersistentOrderedMapKeysIterator((PersistentOrderedMap) abstractMap, 2);
        }
    }
}
