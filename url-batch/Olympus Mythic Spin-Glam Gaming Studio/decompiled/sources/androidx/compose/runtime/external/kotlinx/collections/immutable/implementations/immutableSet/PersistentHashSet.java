package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;

/* compiled from: PersistentHashSet.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001$B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)V", "element", "", "contains", "(Ljava/lang/Object;)Z", m.l, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "I", "getSize", "()I", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersistentHashSet<E> extends AbstractSet implements PersistentSet<E> {
    private final TrieNode node;
    private final int size;
    public static final int $stable = 8;
    private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.INSTANCE.getEMPTY$runtime(), 0);

    /* renamed from: getNode$runtime, reason: from getter */
    public final TrieNode getNode() {
        return this.node;
    }

    public PersistentHashSet(TrieNode trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.node.contains(element != null ? element.hashCode() : 0, element, 0);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet add(Object element) {
        TrieNode add = this.node.add(element != null ? element.hashCode() : 0, element, 0);
        return this.node == add ? this : new PersistentHashSet(add, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet remove(Object element) {
        TrieNode remove = this.node.remove(element != null ? element.hashCode() : 0, element, 0);
        return this.node == remove ? this : new PersistentHashSet(remove, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet addAll(Collection elements) {
        PersistentSet.Builder builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet removeAll(Collection elements) {
        PersistentSet.Builder builder = builder();
        builder.removeAll(elements);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(Collection elements) {
        if (elements instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) elements).node, 0);
        }
        if (elements instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) elements).getNode(), 0);
        }
        return super.containsAll(elements);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet.Builder builder() {
        return new PersistentHashSetBuilder(this);
    }
}
