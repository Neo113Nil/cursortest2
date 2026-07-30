package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n0 implements Iterator, k71 {
    public final /* synthetic */ int m;
    public final Iterator n;

    public n0(u02 u02Var) {
        this.m = 3;
        vz2[] vz2VarArr = new vz2[8];
        for (int i = 0; i < 8; i++) {
            vz2VarArr[i] = new xz2(this);
        }
        this.n = new y02(u02Var, vz2VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                return this.n.hasNext();
            case 1:
                return this.n.hasNext();
            case 2:
                return this.n.hasNext();
            default:
                return ((y02) this.n).o;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                return ((Map.Entry) this.n.next()).getKey();
            case 1:
                return ((Map.Entry) this.n.next()).getValue();
            case 2:
                return (z33) this.n.next();
            default:
                return (Map.Entry) ((y02) this.n).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((y02) this.n).remove();
                return;
        }
    }

    public /* synthetic */ n0(Iterator it, int i) {
        this.m = i;
        this.n = it;
    }

    public n0(x33 x33Var) {
        this.m = 2;
        this.n = x33Var.v.iterator();
    }
}
