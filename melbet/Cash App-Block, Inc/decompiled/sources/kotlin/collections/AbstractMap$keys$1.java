package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapKeysIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKeysIterator;

/* loaded from: classes9.dex */
public final class AbstractMap$keys$1 extends AbstractSet {
    public final /* synthetic */ int $r8$classId;
    public final AbstractMap this$0;

    public /* synthetic */ AbstractMap$keys$1(AbstractMap abstractMap, int i) {
        this.$r8$classId = i;
        this.this$0 = abstractMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.this$0;
        switch (i) {
            case 0:
                return abstractMap.containsKey(obj);
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    PersistentHashMap persistentHashMap = (PersistentHashMap) abstractMap;
                    Object obj2 = persistentHashMap.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && persistentHashMap.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return ((PersistentHashMap) abstractMap).containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.this$0;
        switch (i) {
        }
        return ((PersistentHashMap) abstractMap).size;
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.this$0;
        switch (i) {
            case 0:
                return new AbstractMap$keys$1$iterator$1(abstractMap.getEntries().iterator(), 0);
            case 1:
                TrieNode trieNode = ((PersistentHashMap) abstractMap).node;
                trieNode.getClass();
                TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    trieNodeBaseIteratorArr[i2] = new TrieNodeKeysIterator(1);
                }
                return new PersistentHashMapKeysIterator(trieNode, trieNodeBaseIteratorArr);
            default:
                TrieNode trieNode2 = ((PersistentHashMap) abstractMap).node;
                trieNode2.getClass();
                TrieNodeBaseIterator[] trieNodeBaseIteratorArr2 = new TrieNodeBaseIterator[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    trieNodeBaseIteratorArr2[i3] = new TrieNodeKeysIterator(0);
                }
                return new PersistentHashMapKeysIterator(trieNode2, trieNodeBaseIteratorArr2);
        }
    }
}
