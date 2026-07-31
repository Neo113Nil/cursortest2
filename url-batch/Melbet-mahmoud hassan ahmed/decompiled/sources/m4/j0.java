package m4;

import java.util.Objects;

/* loaded from: classes.dex */
class j0<E> extends q<E> {

    /* renamed from: j, reason: collision with root package name */
    static final q<Object> f19154j = new j0(new Object[0], 0);

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f19155h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f19156i;

    j0(Object[] objArr, int i7) {
        this.f19155h = objArr;
        this.f19156i = i7;
    }

    @Override // java.util.List
    public E get(int i7) {
        l4.j.g(i7, this.f19156i);
        E e7 = (E) this.f19155h[i7];
        Objects.requireNonNull(e7);
        return e7;
    }

    @Override // m4.q, m4.o
    int j(Object[] objArr, int i7) {
        System.arraycopy(this.f19155h, 0, objArr, i7, this.f19156i);
        return i7 + this.f19156i;
    }

    @Override // m4.o
    Object[] k() {
        return this.f19155h;
    }

    @Override // m4.o
    int l() {
        return this.f19156i;
    }

    @Override // m4.o
    int m() {
        return 0;
    }

    @Override // m4.o
    boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19156i;
    }
}
