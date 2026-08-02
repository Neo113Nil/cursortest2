package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractSet;

/* loaded from: classes9.dex */
public final class PersistentOrderedMapKeys extends AbstractSet {
    public final /* synthetic */ int $r8$classId;
    public final PersistentOrderedMap map;

    public /* synthetic */ PersistentOrderedMapKeys(PersistentOrderedMap persistentOrderedMap, int i) {
        this.$r8$classId = i;
        this.map = persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        PersistentOrderedMap persistentOrderedMap = this.map;
        switch (i) {
            case 0:
                return persistentOrderedMap.hashMap.containsKey(obj);
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = persistentOrderedMap.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null) {
                        if (persistentOrderedMap.hashMap.containsKey(entry.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.$r8$classId;
        PersistentOrderedMap persistentOrderedMap = this.map;
        switch (i) {
        }
        return persistentOrderedMap.hashMap.size();
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        PersistentOrderedMap persistentOrderedMap = this.map;
        switch (i) {
            case 0:
                return new PersistentOrderedMapKeysIterator(persistentOrderedMap, 0);
            default:
                return new PersistentOrderedMapKeysIterator(persistentOrderedMap, 1);
        }
    }
}
