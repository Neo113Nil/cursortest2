package M1;

import H2.AbstractC0080b;
import a2.InterfaceC0184a;
import e2.C0380d;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class C implements ListIterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2786d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2788f;

    public C(D d3, int i3) {
        this.f2788f = d3;
        List list = d3.f2789d;
        if (i3 >= 0 && i3 <= d3.size()) {
            this.f2787e = list.listIterator(d3.size() - i3);
            return;
        }
        StringBuilder l3 = AbstractC0080b.l("Position index ", i3, " must be in range [");
        l3.append(new C0380d(0, d3.size(), 1));
        l3.append("].");
        throw new IndexOutOfBoundsException(l3.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2786d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2786d) {
            case 0:
                return ((ListIterator) this.f2787e).hasPrevious();
            default:
                return ((Z1.r) this.f2787e).f3478d < ((S.A) this.f2788f).f3176g - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2786d) {
            case 0:
                return ((ListIterator) this.f2787e).hasNext();
            default:
                return ((Z1.r) this.f2787e).f3478d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2786d) {
            case 0:
                return ((ListIterator) this.f2787e).previous();
            default:
                Z1.r rVar = (Z1.r) this.f2787e;
                int i3 = rVar.f3478d + 1;
                S.A a3 = (S.A) this.f2788f;
                S.u.a(i3, a3.f3176g);
                rVar.f3478d = i3;
                return a3.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2786d) {
            case 0:
                return m.b0((D) this.f2788f) - ((ListIterator) this.f2787e).previousIndex();
            default:
                return ((Z1.r) this.f2787e).f3478d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2786d) {
            case 0:
                return ((ListIterator) this.f2787e).next();
            default:
                Z1.r rVar = (Z1.r) this.f2787e;
                int i3 = rVar.f3478d;
                S.A a3 = (S.A) this.f2788f;
                S.u.a(i3, a3.f3176g);
                rVar.f3478d = i3 - 1;
                return a3.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f2786d) {
            case 0:
                return m.b0((D) this.f2788f) - ((ListIterator) this.f2787e).nextIndex();
            default:
                return ((Z1.r) this.f2787e).f3478d;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2786d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2786d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C(Z1.r rVar, S.A a3) {
        this.f2787e = rVar;
        this.f2788f = a3;
    }
}
