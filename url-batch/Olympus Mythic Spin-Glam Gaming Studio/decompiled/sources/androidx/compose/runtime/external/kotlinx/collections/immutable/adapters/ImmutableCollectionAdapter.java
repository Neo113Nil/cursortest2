package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ReadOnlyCollectionAdapters.kt */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0007\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0010\u0010\bJ\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "contains", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "impl", "Ljava/util/Collection;", "getSize", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, KMappedMarker {
    private final Collection impl;

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return this.impl.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        return this.impl.containsAll(elements);
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.impl.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return this.impl.equals(other);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.impl.hashCode();
    }

    public String toString() {
        return this.impl.toString();
    }
}
