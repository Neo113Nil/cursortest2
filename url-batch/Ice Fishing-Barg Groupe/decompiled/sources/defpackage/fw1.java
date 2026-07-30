package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fw1 implements ListIterator, fu0 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 1;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public fw1(y41 y41Var, int i) {
        this.wdg6QnbFHrFF = y41Var;
        List list = (List) y41Var.OPXfSBeufaJ8;
        if (i >= 0 && i <= y41Var.PxuCJdSBwIXG()) {
            this.OPXfSBeufaJ8 = list.listIterator(y41Var.PxuCJdSBwIXG() - i);
            return;
        }
        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "Position index ", " must be in range [");
        BRwzKIf41E4i.append(new br0(0, y41Var.PxuCJdSBwIXG(), 1));
        BRwzKIf41E4i.append("].");
        throw new IndexOutOfBoundsException(BRwzKIf41E4i.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((xt1) obj).rtx2ld2ELZv4 < ((cb2) this.wdg6QnbFHrFF).dgRBjINgWbAK - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((xt1) obj).rtx2ld2ELZv4 >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                xt1 xt1Var = (xt1) obj;
                int i2 = xt1Var.rtx2ld2ELZv4 + 1;
                cb2 cb2Var = (cb2) this.wdg6QnbFHrFF;
                ov2.r3s1LDPKFs1S(i2, cb2Var.dgRBjINgWbAK);
                xt1Var.rtx2ld2ELZv4 = i2;
                return cb2Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                y41 y41Var = (y41) this.wdg6QnbFHrFF;
                return (y41Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((xt1) obj).rtx2ld2ELZv4 + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                xt1 xt1Var = (xt1) obj;
                int i2 = xt1Var.rtx2ld2ELZv4;
                cb2 cb2Var = (cb2) this.wdg6QnbFHrFF;
                ov2.r3s1LDPKFs1S(i2, cb2Var.dgRBjINgWbAK);
                xt1Var.rtx2ld2ELZv4 = i2 - 1;
                return cb2Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                y41 y41Var = (y41) this.wdg6QnbFHrFF;
                return (y41Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((xt1) obj).rtx2ld2ELZv4;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public fw1(xt1 xt1Var, cb2 cb2Var) {
        this.OPXfSBeufaJ8 = xt1Var;
        this.wdg6QnbFHrFF = cb2Var;
    }
}
