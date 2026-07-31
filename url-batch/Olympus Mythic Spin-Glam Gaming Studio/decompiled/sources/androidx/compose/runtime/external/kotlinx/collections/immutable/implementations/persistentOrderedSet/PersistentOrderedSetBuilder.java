package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistentOrderedSetBuilder.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "set", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", m.l, "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "firstElement", "Ljava/lang/Object;", "getFirstElement$runtime", "()Ljava/lang/Object;", "setFirstElement$runtime", "(Ljava/lang/Object;)V", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet implements PersistentSet.Builder<E> {
    private Object firstElement;
    private final PersistentHashMapBuilder hashMapBuilder;
    private Object lastElement;
    private PersistentOrderedSet set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet persistentOrderedSet) {
        this.set = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement();
        this.lastElement = this.set.getLastElement();
        this.hashMapBuilder = this.set.getHashMap().builder();
    }

    /* renamed from: getFirstElement$runtime, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    /* renamed from: getHashMapBuilder$runtime, reason: from getter */
    public final PersistentHashMapBuilder getHashMapBuilder() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder
    public PersistentSet build() {
        PersistentOrderedSet persistentOrderedSet;
        PersistentHashMap build = this.hashMapBuilder.build();
        if (build == this.set.getHashMap()) {
            CommonFunctionsKt.m1202assert(this.firstElement == this.set.getFirstElement());
            CommonFunctionsKt.m1202assert(this.lastElement == this.set.getLastElement());
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet(this.firstElement, this.lastElement, build);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.hashMapBuilder.containsKey(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object element) {
        if (this.hashMapBuilder.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = element;
            this.lastElement = element;
            this.hashMapBuilder.put(element, new Links());
            return true;
        }
        V v = this.hashMapBuilder.get(this.lastElement);
        Intrinsics.checkNotNull(v);
        this.hashMapBuilder.put(this.lastElement, ((Links) v).withNext(element));
        this.hashMapBuilder.put(element, new Links(this.lastElement));
        this.lastElement = element;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        Links links = (Links) this.hashMapBuilder.remove(element);
        if (links == null) {
            return false;
        }
        if (links.getHasPrevious()) {
            V v = this.hashMapBuilder.get(links.getPrevious());
            Intrinsics.checkNotNull(v);
            this.hashMapBuilder.put(links.getPrevious(), ((Links) v).withNext(links.getNext()));
        } else {
            this.firstElement = links.getNext();
        }
        if (links.getHasNext()) {
            V v2 = this.hashMapBuilder.get(links.getNext());
            Intrinsics.checkNotNull(v2);
            this.hashMapBuilder.put(links.getNext(), ((Links) v2).withPrevious(links.getPrevious()));
            return true;
        }
        this.lastElement = links.getPrevious();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.lastElement = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }
}
