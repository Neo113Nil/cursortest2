package androidx.collection;

import com.safedk.android.analytics.brandsafety.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* compiled from: OrderedScatterSet.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u001d\u0010\u0013\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/collection/MutableOrderedSetWrapper;", "E", "Landroidx/collection/OrderedSetWrapper;", "", "element", "", m.l, "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "Landroidx/collection/MutableOrderedScatterSet;", "parent", "Landroidx/collection/MutableOrderedScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, KMutableSet {
    private final MutableOrderedScatterSet parent;

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean add(Object element) {
        return this.parent.add(element);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.parent.addAll(elements);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new MutableOrderedSetWrapper$iterator$1(this);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return this.parent.remove(element);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.parent.retainAll(elements);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.parent.removeAll(elements);
    }
}
