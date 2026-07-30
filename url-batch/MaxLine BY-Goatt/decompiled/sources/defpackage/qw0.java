package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qw0 implements Iterator, k71 {
    public final /* synthetic */ int m = 0;
    public final wl2 n;
    public final int o;
    public int p;
    public int q;

    public qw0(wl2 wl2Var, int i, int i2) {
        this.n = wl2Var;
        this.o = i2;
        this.p = i;
        this.q = wl2Var.t;
        if (wl2Var.s) {
            yl2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                return this.p < this.o;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                wl2 wl2Var = this.n;
                int i = wl2Var.t;
                int i2 = this.q;
                if (i != i2) {
                    yl2.e();
                }
                int i3 = this.p;
                this.p = wl2Var.m[(i3 * 5) + 3] + i3;
                return new xl2(wl2Var, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public qw0(wl2 wl2Var, int i, rw0 rw0Var, ak2 ak2Var) {
        this.n = wl2Var;
        this.o = i;
        this.p = wl2Var.t;
    }
}
