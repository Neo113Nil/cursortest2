package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderKeysIterator;

/* loaded from: classes9.dex */
public final class PersistentHashMapBuilderEntries extends AbstractMutableSet {
    public final /* synthetic */ int $r8$classId;
    public final AbstractMutableMap builder;

    public /* synthetic */ PersistentHashMapBuilderEntries(AbstractMutableMap abstractMutableMap, int i) {
        this.$r8$classId = i;
        this.builder = abstractMutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                ((PersistentHashMapBuilder) this.builder).clear();
                break;
            default:
                ((PersistentOrderedMapBuilder) this.builder).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.$r8$classId;
        AbstractMutableMap abstractMutableMap = this.builder;
        entry.getClass();
        switch (i) {
            case 0:
                PersistentHashMapBuilder persistentHashMapBuilder = (PersistentHashMapBuilder) abstractMutableMap;
                persistentHashMapBuilder.getClass();
                entry.getClass();
                V v = persistentHashMapBuilder.get(entry.getKey());
                if (v != 0) {
                    return v.equals(entry.getValue());
                }
                if (entry.getValue() != null || !persistentHashMapBuilder.containsKey(entry.getKey())) {
                    return false;
                }
                break;
            default:
                PersistentOrderedMapBuilder persistentOrderedMapBuilder = (PersistentOrderedMapBuilder) abstractMutableMap;
                persistentOrderedMapBuilder.getClass();
                entry.getClass();
                V v2 = persistentOrderedMapBuilder.get(entry.getKey());
                if (v2 != 0) {
                    return v2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !persistentOrderedMapBuilder.containsKey(entry.getKey())) {
                    return false;
                }
                break;
        }
        return true;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        switch (this.$r8$classId) {
            case 0:
                return ((PersistentHashMapBuilder) this.builder).getSize();
            default:
                return ((PersistentOrderedMapBuilder) this.builder).hashMapBuilder.getSize();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return new SmartSet.ArrayIterator((PersistentHashMapBuilder) this.builder);
            default:
                return new PersistentOrderedMapBuilderKeysIterator((PersistentOrderedMapBuilder) this.builder, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.$r8$classId;
        AbstractMutableMap abstractMutableMap = this.builder;
        entry.getClass();
        switch (i) {
            case 0:
                return ((PersistentHashMapBuilder) abstractMutableMap).remove(entry.getKey(), entry.getValue());
            default:
                return ((PersistentOrderedMapBuilder) abstractMutableMap).remove(entry.getKey(), entry.getValue());
        }
    }
}
