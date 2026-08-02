package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.builders.MapBuilder;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderKeysIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKeysIterator;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderKeysIterator;

/* loaded from: classes9.dex */
public final class MapBuilderKeys extends AbstractMutableSet {
    public final /* synthetic */ int $r8$classId;
    public final Object backing;

    public /* synthetic */ MapBuilderKeys(Object obj, int i) {
        this.$r8$classId = i;
        this.backing = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                ((MapBuilder) this.backing).clear();
                break;
            case 1:
                ((PersistentHashMapBuilder) this.backing).clear();
                break;
            default:
                ((PersistentOrderedMapBuilder) this.backing).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((MapBuilder) this.backing).containsKey(obj);
            case 1:
                return ((PersistentHashMapBuilder) this.backing).containsKey(obj);
            default:
                return ((PersistentOrderedMapBuilder) this.backing).hashMapBuilder.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        switch (this.$r8$classId) {
            case 0:
                return ((MapBuilder) this.backing).size;
            case 1:
                return ((PersistentHashMapBuilder) this.backing).getSize();
            default:
                return ((PersistentOrderedMapBuilder) this.backing).hashMapBuilder.getSize();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.$r8$classId) {
            case 0:
                return ((MapBuilder) this.backing).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Object obj = this.backing;
        int i2 = 0;
        switch (i) {
            case 0:
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                return new MapBuilder.KeysItr(mapBuilder, i2);
            case 1:
                PersistentHashMapBuilder persistentHashMapBuilder = (PersistentHashMapBuilder) obj;
                persistentHashMapBuilder.getClass();
                TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    trieNodeBaseIteratorArr[i3] = new TrieNodeKeysIterator(0);
                }
                return new PersistentHashMapBuilderKeysIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
            default:
                return new PersistentOrderedMapBuilderKeysIterator((PersistentOrderedMapBuilder) obj, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.backing;
        switch (i) {
            case 0:
                MapBuilder mapBuilder = (MapBuilder) obj2;
                mapBuilder.checkIsMutable$kotlin_stdlib();
                int findKey = mapBuilder.findKey(obj);
                if (findKey >= 0) {
                    mapBuilder.removeEntryAt(findKey);
                    break;
                }
                break;
            case 1:
                PersistentHashMapBuilder persistentHashMapBuilder = (PersistentHashMapBuilder) obj2;
                if (persistentHashMapBuilder.containsKey(obj)) {
                    persistentHashMapBuilder.remove(obj);
                    break;
                }
                break;
            default:
                PersistentOrderedMapBuilder persistentOrderedMapBuilder = (PersistentOrderedMapBuilder) obj2;
                if (persistentOrderedMapBuilder.hashMapBuilder.containsKey(obj)) {
                    persistentOrderedMapBuilder.remove(obj);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                collection.getClass();
                ((MapBuilder) this.backing).checkIsMutable$kotlin_stdlib();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                collection.getClass();
                ((MapBuilder) this.backing).checkIsMutable$kotlin_stdlib();
                break;
        }
        return super.retainAll(collection);
    }
}
