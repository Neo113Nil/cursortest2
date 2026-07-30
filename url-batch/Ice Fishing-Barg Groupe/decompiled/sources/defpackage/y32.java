package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y32 implements Iterator, bt, fu0 {
    public Object OPXfSBeufaJ8;
    public int rtx2ld2ELZv4;
    public bt wdg6QnbFHrFF;

    public final RuntimeException PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.rtx2ld2ELZv4);
    }

    @Override // defpackage.bt
    public final void RAsUl2FVSrh6(Object obj) {
        ng0.tmVwIGCQF4zR(obj);
        this.rtx2ld2ELZv4 = 4;
    }

    @Override // defpackage.bt
    public final hu e9gEMXR7LXtO() {
        return n50.rtx2ld2ELZv4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.rtx2ld2ELZv4;
            if (i != 0) {
                break;
            }
            this.rtx2ld2ELZv4 = 5;
            bt btVar = this.wdg6QnbFHrFF;
            btVar.getClass();
            this.wdg6QnbFHrFF = null;
            btVar.RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw PxuCJdSBwIXG();
    }

    public final void lS5Rgt96tfkO(Object obj, sv1 sv1Var) {
        this.OPXfSBeufaJ8 = obj;
        this.rtx2ld2ELZv4 = 3;
        this.wdg6QnbFHrFF = sv1Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.rtx2ld2ELZv4;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            u9.RfyTYNmI9Srp();
            return null;
        }
        if (i == 2) {
            this.rtx2ld2ELZv4 = 1;
            throw null;
        }
        if (i != 3) {
            throw PxuCJdSBwIXG();
        }
        this.rtx2ld2ELZv4 = 0;
        Object obj = this.OPXfSBeufaJ8;
        this.OPXfSBeufaJ8 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
