package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractSet;
import kotlin.sequences.GeneratorSequence$iterator$1;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.internal.EndOfChain;

/* loaded from: classes3.dex */
public final class PersistentOrderedSet extends AbstractSet {
    public static final PersistentOrderedSet EMPTY;
    public final Object firstElement;
    public final PersistentHashMap hashMap;
    public final Object lastElement;

    static {
        PersistentHashMap persistentHashMap = PersistentHashMap.EMPTY;
        persistentHashMap.getClass();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, persistentHashMap);
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        persistentHashMap.getClass();
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (getSize() != set.size()) {
            return false;
        }
        boolean z = set instanceof PersistentOrderedSet;
        PersistentHashMap persistentHashMap = this.hashMap;
        return z ? persistentHashMap.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedSet) obj).hashMap.node, new SaversKt$$ExternalSyntheticLambda5(9)) : set instanceof PersistentOrderedSetBuilder ? persistentHashMap.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedSetBuilder) obj).hashMapBuilder.node, new SaversKt$$ExternalSyntheticLambda5(10)) : super.equals(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.hashMap.getSize();
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new GeneratorSequence$iterator$1(this.hashMap, this.firstElement);
    }
}
