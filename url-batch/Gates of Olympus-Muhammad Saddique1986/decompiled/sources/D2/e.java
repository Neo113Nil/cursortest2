package D2;

import g2.InterfaceC0439a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class e extends k implements List<k>, InterfaceC0439a {
    public static final d Companion = new d();
    private final List<k> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends k> list) {
        super(null);
        f2.j.f(list, "content");
        this.content = list;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i3, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(k kVar) {
        f2.j.f(kVar, "element");
        return this.content.contains(kVar);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        f2.j.f(collection, "elements");
        return this.content.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return f2.j.a(this.content, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public k get(int i3) {
        return this.content.get(i3);
    }

    public int getSize() {
        return this.content.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.content.hashCode();
    }

    public int indexOf(k kVar) {
        f2.j.f(kVar, "element");
        return this.content.indexOf(kVar);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<k> iterator() {
        return this.content.iterator();
    }

    public int lastIndexOf(k kVar) {
        f2.j.f(kVar, "element");
        return this.content.lastIndexOf(kVar);
    }

    @Override // java.util.List
    public ListIterator<k> listIterator() {
        return this.content.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public k remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<k> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public k set2(int i3, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super k> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<k> subList(int i3, int i4) {
        return this.content.subList(i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f2.i.a(this);
    }

    public String toString() {
        return S1.l.P0(this.content, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i3, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return contains((k) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return indexOf((k) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return lastIndexOf((k) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<k> listIterator(int i3) {
        return this.content.listIterator(i3);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k set(int i3, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        f2.j.f(tArr, "array");
        return (T[]) f2.i.b(this, tArr);
    }

    public boolean add(k kVar) {
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
