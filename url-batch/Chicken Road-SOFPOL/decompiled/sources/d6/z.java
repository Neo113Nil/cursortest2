package d6;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z implements ListIterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2329d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2331f;

    public z(a0 a0Var, int i) {
        this.f2331f = a0Var;
        List list = a0Var.f2309d;
        if (i >= 0 && i <= a0Var.a()) {
            this.f2330e = list.listIterator(a0Var.a() - i);
            return;
        }
        StringBuilder l3 = a0.q.l("Position index ", i, " must be in range [");
        l3.append(new v6.d(0, a0Var.a(), 1));
        l3.append("].");
        throw new IndexOutOfBoundsException(l3.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2329d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2329d) {
            case 0:
                return ((ListIterator) this.f2330e).hasPrevious();
            default:
                return ((q6.q) this.f2330e).f6203d < ((w0.x) this.f2331f).f7577g - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2329d) {
            case 0:
                return ((ListIterator) this.f2330e).hasNext();
            default:
                return ((q6.q) this.f2330e).f6203d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2329d) {
            case 0:
                return ((ListIterator) this.f2330e).previous();
            default:
                q6.q qVar = (q6.q) this.f2330e;
                int i = qVar.f6203d + 1;
                w0.x xVar = (w0.x) this.f2331f;
                w0.q.a(i, xVar.f7577g);
                qVar.f6203d = i;
                return xVar.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2329d) {
            case 0:
                a0 a0Var = (a0) this.f2331f;
                return s6.a.t(a0Var) - ((ListIterator) this.f2330e).previousIndex();
            default:
                return ((q6.q) this.f2330e).f6203d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2329d) {
            case 0:
                return ((ListIterator) this.f2330e).next();
            default:
                q6.q qVar = (q6.q) this.f2330e;
                int i = qVar.f6203d;
                w0.x xVar = (w0.x) this.f2331f;
                w0.q.a(i, xVar.f7577g);
                qVar.f6203d = i - 1;
                return xVar.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f2329d) {
            case 0:
                a0 a0Var = (a0) this.f2331f;
                return s6.a.t(a0Var) - ((ListIterator) this.f2330e).nextIndex();
            default:
                return ((q6.q) this.f2330e).f6203d;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2329d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2329d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public z(q6.q qVar, w0.x xVar) {
        this.f2330e = qVar;
        this.f2331f = xVar;
    }
}
