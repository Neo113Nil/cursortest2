package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q30 implements Iterator, fu0 {
    public final Iterator OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 1;
    public int wdg6QnbFHrFF;

    public q30(r30 r30Var) {
        this.OPXfSBeufaJ8 = r30Var.PxuCJdSBwIXG.iterator();
        this.wdg6QnbFHrFF = r30Var.lS5Rgt96tfkO;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.rtx2ld2ELZv4;
        Iterator it = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.wdg6QnbFHrFF > 0 && it.hasNext()) {
            it.next();
            this.wdg6QnbFHrFF--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.rtx2ld2ELZv4;
        Iterator it = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.wdg6QnbFHrFF;
                this.wdg6QnbFHrFF = i2 + 1;
                if (i2 >= 0) {
                    return new tn0(i2, it.next());
                }
                fx1.mFd1aGiJX24N();
                throw null;
        }
        while (this.wdg6QnbFHrFF > 0 && it.hasNext()) {
            it.next();
            this.wdg6QnbFHrFF--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q30(Iterator it) {
        it.getClass();
        this.OPXfSBeufaJ8 = it;
    }
}
