package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;
import kotlin.collections.AbstractMutableMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderKeysIterator;

/* loaded from: classes9.dex */
public final class PersistentHashMapBuilderValues extends AbstractMutableCollection {
    public final /* synthetic */ int $r8$classId;
    public final AbstractMutableMap builder;

    public /* synthetic */ PersistentHashMapBuilderValues(AbstractMutableMap abstractMutableMap, int i) {
        this.$r8$classId = i;
        this.builder = abstractMutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                ((PersistentHashMapBuilder) this.builder).clear();
                break;
            case 1:
                ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) this.builder).clear();
                break;
            default:
                ((PersistentOrderedMapBuilder) this.builder).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((PersistentHashMapBuilder) this.builder).containsValue(obj);
            case 1:
                return ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) this.builder).containsValue(obj);
            default:
                return ((PersistentOrderedMapBuilder) this.builder).containsValue(obj);
        }
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public final int getSize() {
        switch (this.$r8$classId) {
            case 0:
                return ((PersistentHashMapBuilder) this.builder).getSize();
            case 1:
                return ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) this.builder).getSize();
            default:
                return ((PersistentOrderedMapBuilder) this.builder).hashMapBuilder.getSize();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.$r8$classId;
        int i2 = 0;
        AbstractMutableMap abstractMutableMap = this.builder;
        switch (i) {
            case 0:
                PersistentHashMapBuilder persistentHashMapBuilder = (PersistentHashMapBuilder) abstractMutableMap;
                persistentHashMapBuilder.getClass();
                TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
                while (i2 < 8) {
                    trieNodeBaseIteratorArr[i2] = new TrieNodeKeysIterator(2);
                    i2++;
                }
                return new PersistentHashMapBuilderKeysIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
            case 1:
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder persistentHashMapBuilder2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) abstractMutableMap;
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator[] trieNodeBaseIteratorArr2 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator[8];
                while (i2 < 8) {
                    trieNodeBaseIteratorArr2[i2] = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKeysIterator(1);
                    i2++;
                }
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderKeysIterator(persistentHashMapBuilder2, trieNodeBaseIteratorArr2);
            default:
                return new PersistentOrderedMapBuilderKeysIterator((PersistentOrderedMapBuilder) abstractMutableMap, 2);
        }
    }
}
