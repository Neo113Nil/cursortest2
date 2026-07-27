package Q;

import A.AbstractC0017m;
import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;
import z2.C1413Q;
import z2.C1441y;

/* loaded from: classes.dex */
public final class G implements ListIterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3811d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3812e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3813i;

    public G(C1413Q c1413q, int i2) {
        this.f3813i = c1413q;
        List list = c1413q.f11935e;
        if (i2 >= 0 && i2 <= c1413q.size()) {
            this.f3812e = list.listIterator(c1413q.size() - i2);
            return;
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "Position index ", " must be in range [");
        o4.append(new IntRange(0, c1413q.size(), 1));
        o4.append("].");
        throw new IndexOutOfBoundsException(o4.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f3811d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3811d) {
            case 0:
                return ((M2.C) this.f3812e).f3578d < ((H) this.f3813i).f3817j - 1;
            default:
                return ((ListIterator) this.f3812e).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3811d) {
            case 0:
                return ((M2.C) this.f3812e).f3578d >= 0;
            default:
                return ((ListIterator) this.f3812e).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3811d) {
            case 0:
                M2.C c4 = (M2.C) this.f3812e;
                int i2 = c4.f3578d + 1;
                H h4 = (H) this.f3813i;
                w.a(i2, h4.f3817j);
                c4.f3578d = i2;
                return h4.get(i2);
            default:
                return ((ListIterator) this.f3812e).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3811d) {
            case 0:
                return ((M2.C) this.f3812e).f3578d + 1;
            default:
                return C1441y.d((C1413Q) this.f3813i) - ((ListIterator) this.f3812e).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3811d) {
            case 0:
                M2.C c4 = (M2.C) this.f3812e;
                int i2 = c4.f3578d;
                H h4 = (H) this.f3813i;
                w.a(i2, h4.f3817j);
                c4.f3578d = i2 - 1;
                return h4.get(i2);
            default:
                return ((ListIterator) this.f3812e).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f3811d) {
            case 0:
                return ((M2.C) this.f3812e).f3578d;
            default:
                return C1441y.d((C1413Q) this.f3813i) - ((ListIterator) this.f3812e).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f3811d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3811d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public G(M2.C c4, H h4) {
        this.f3812e = c4;
        this.f3813i = h4;
    }
}
