package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ol1 implements Iterator, fu0 {
    public final Iterator OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;

    public ol1(gl1 gl1Var) {
        ul2[] ul2VarArr = new ul2[8];
        for (int i = 0; i < 8; i++) {
            ul2VarArr[i] = new wl2(this);
        }
        this.OPXfSBeufaJ8 = new ml1(gl1Var, ul2VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((ml1) this.OPXfSBeufaJ8).wdg6QnbFHrFF;
            default:
                return this.OPXfSBeufaJ8.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return (Map.Entry) ((ml1) this.OPXfSBeufaJ8).next();
            default:
                return (pp2) this.OPXfSBeufaJ8.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((ml1) this.OPXfSBeufaJ8).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ol1(np2 np2Var) {
        this.OPXfSBeufaJ8 = np2Var.BRwzKIf41E4i.iterator();
    }
}
