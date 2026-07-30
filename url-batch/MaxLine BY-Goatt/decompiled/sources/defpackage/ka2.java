package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ka2 implements ListIterator, k71 {
    public final /* synthetic */ int m = 1;
    public final Object n;
    public final /* synthetic */ Object o;

    public ka2(ni1 ni1Var, int i) {
        this.o = ni1Var;
        List list = (List) ni1Var.o;
        if (i >= 0 && i <= ni1Var.a()) {
            this.n = list.listIterator(ni1Var.a() - i);
            return;
        }
        StringBuilder n = in1.n(i, "Position index ", " must be in range [");
        n.append(new IntRange(0, ni1Var.a(), 1));
        n.append("].");
        throw new IndexOutOfBoundsException(n.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((a82) obj).m < ((bq2) this.o).p - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((a82) obj).m >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                a82 a82Var = (a82) obj;
                int i2 = a82Var.m + 1;
                bq2 bq2Var = (bq2) this.o;
                tk3.v(i2, bq2Var.p);
                a82Var.m = i2;
                return bq2Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                ni1 ni1Var = (ni1) this.o;
                return (ni1Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((a82) obj).m + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                a82 a82Var = (a82) obj;
                int i2 = a82Var.m;
                bq2 bq2Var = (bq2) this.o;
                tk3.v(i2, bq2Var.p);
                a82Var.m = i2 - 1;
                return bq2Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                ni1 ni1Var = (ni1) this.o;
                return (ni1Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((a82) obj).m;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public ka2(a82 a82Var, bq2 bq2Var) {
        this.n = a82Var;
        this.o = bq2Var;
    }
}
