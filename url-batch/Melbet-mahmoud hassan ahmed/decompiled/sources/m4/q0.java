package m4;

/* loaded from: classes.dex */
final class q0<E> extends s<E> {

    /* renamed from: h, reason: collision with root package name */
    final transient E f19199h;

    q0(E e7) {
        this.f19199h = (E) l4.j.i(e7);
    }

    @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f19199h.equals(obj);
    }

    @Override // m4.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19199h.hashCode();
    }

    @Override // m4.s, m4.o
    public q<E> i() {
        return q.y(this.f19199h);
    }

    @Override // m4.o
    int j(Object[] objArr, int i7) {
        objArr[i7] = this.f19199h;
        return i7 + 1;
    }

    @Override // m4.o
    boolean n() {
        return false;
    }

    @Override // m4.s, m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public s0<E> iterator() {
        return u.p(this.f19199h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f19199h.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
