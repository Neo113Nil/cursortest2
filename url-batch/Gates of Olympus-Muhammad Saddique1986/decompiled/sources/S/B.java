package S;

import g2.InterfaceC0439a;
import java.util.List;
import java.util.ListIterator;
import k2.C0572d;

/* loaded from: classes.dex */
public final class B implements ListIterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4176d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4178f;

    public B(S1.C c2, int i3) {
        this.f4178f = c2;
        List list = c2.f4306d;
        if (i3 >= 0 && i3 <= c2.size()) {
            this.f4177e = list.listIterator(c2.size() - i3);
            return;
        }
        StringBuilder k3 = A.k.k(i3, "Position index ", " must be in range [");
        k3.append(new C0572d(0, c2.size(), 1));
        k3.append("].");
        throw new IndexOutOfBoundsException(k3.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f4176d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4176d) {
            case 0:
                return ((f2.s) this.f4177e).f5830d < ((C) this.f4178f).f4182g - 1;
            default:
                return ((ListIterator) this.f4177e).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4176d) {
            case 0:
                return ((f2.s) this.f4177e).f5830d >= 0;
            default:
                return ((ListIterator) this.f4177e).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4176d) {
            case 0:
                f2.s sVar = (f2.s) this.f4177e;
                int i3 = sVar.f5830d + 1;
                C c2 = (C) this.f4178f;
                u.a(i3, c2.f4182g);
                sVar.f5830d = i3;
                return c2.get(i3);
            default:
                return ((ListIterator) this.f4177e).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4176d) {
            case 0:
                return ((f2.s) this.f4177e).f5830d + 1;
            default:
                return S1.m.z0((S1.C) this.f4178f) - ((ListIterator) this.f4177e).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4176d) {
            case 0:
                f2.s sVar = (f2.s) this.f4177e;
                int i3 = sVar.f5830d;
                C c2 = (C) this.f4178f;
                u.a(i3, c2.f4182g);
                sVar.f5830d = i3 - 1;
                return c2.get(i3);
            default:
                return ((ListIterator) this.f4177e).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f4176d) {
            case 0:
                return ((f2.s) this.f4177e).f5830d;
            default:
                return S1.m.z0((S1.C) this.f4178f) - ((ListIterator) this.f4177e).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f4176d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f4176d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public B(f2.s sVar, C c2) {
        this.f4177e = sVar;
        this.f4178f = c2;
    }
}
