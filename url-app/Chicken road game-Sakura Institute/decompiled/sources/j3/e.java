package j3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

@Metadata
/* loaded from: classes.dex */
public final class e extends m implements List<m>, N2.a {
    public static final d Companion = new d();
    private final List<m> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends m> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i2, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(m element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.content.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return Intrinsics.a(this.content, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public m get(int i2) {
        return this.content.get(i2);
    }

    public int getSize() {
        return this.content.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.content.hashCode();
    }

    public int indexOf(m element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<m> iterator() {
        return this.content.iterator();
    }

    public int lastIndexOf(m element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<m> listIterator() {
        return this.content.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public m remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<m> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public m set2(int i2, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super m> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<m> subList(int i2, int i4) {
        return this.content.subList(i2, i4);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return M2.o.a(this);
    }

    public String toString() {
        return C1403G.w(this.content, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return contains((m) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof m) {
            return indexOf((m) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof m) {
            return lastIndexOf((m) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<m> listIterator(int i2) {
        return this.content.listIterator(i2);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ m remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ m set(int i2, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) M2.o.b(this, array);
    }

    public boolean add(m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
