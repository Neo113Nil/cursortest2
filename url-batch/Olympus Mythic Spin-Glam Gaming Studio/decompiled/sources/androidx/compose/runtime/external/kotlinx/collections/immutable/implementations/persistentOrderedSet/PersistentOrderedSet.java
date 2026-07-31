package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistentOrderedSet.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "firstElement", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", m.l, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Ljava/lang/Object;", "getFirstElement$runtime", "()Ljava/lang/Object;", "getLastElement$runtime", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "getSize", "()I", "size", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentOrderedSet<E> extends AbstractSet implements PersistentSet<E> {
    private static final PersistentOrderedSet EMPTY;
    private final Object firstElement;
    private final PersistentHashMap hashMap;
    private final Object lastElement;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: getFirstElement$runtime, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    /* renamed from: getLastElement$runtime, reason: from getter */
    public final Object getLastElement() {
        return this.lastElement;
    }

    /* renamed from: getHashMap$runtime, reason: from getter */
    public final PersistentHashMap getHashMap() {
        return this.hashMap;
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
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

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet add(Object element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(element, element, this.hashMap.put(element, (Object) new Links()));
        }
        Object obj = this.lastElement;
        Object obj2 = this.hashMap.get(obj);
        Intrinsics.checkNotNull(obj2);
        return new PersistentOrderedSet(this.firstElement, element, this.hashMap.put(obj, (Object) ((Links) obj2).withNext(element)).put(element, (Object) new Links(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet remove(Object element) {
        Links links = (Links) this.hashMap.get(element);
        if (links == null) {
            return this;
        }
        PersistentHashMap remove = this.hashMap.remove(element);
        if (links.getHasPrevious()) {
            V v = remove.get(links.getPrevious());
            Intrinsics.checkNotNull(v);
            remove = remove.put(links.getPrevious(), (Object) ((Links) v).withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            V v2 = remove.get(links.getNext());
            Intrinsics.checkNotNull(v2);
            remove = remove.put(links.getNext(), (Object) ((Links) v2).withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, remove);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet.Builder builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0001\u0010\tH\u0000¢\u0006\u0002\b\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$runtime", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PersistentSet emptyOf$runtime() {
            return PersistentOrderedSet.EMPTY;
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.INSTANCE.emptyOf$runtime());
    }
}
