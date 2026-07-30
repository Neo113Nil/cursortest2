package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zq implements Iterator {
    public final /* synthetic */ int m = 0;
    public int n = 0;
    public final int o;
    public final /* synthetic */ Object p;

    public zq(im3 im3Var) {
        this.p = im3Var;
        this.o = im3Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                if (this.n < this.o) {
                }
                break;
            default:
                if (this.n < this.o) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.m;
        Object obj = this.p;
        int i2 = this.o;
        switch (i) {
            case 0:
                int i3 = this.n;
                if (i3 >= i2) {
                    b71.f();
                    break;
                } else {
                    this.n = i3 + 1;
                    break;
                }
            default:
                int i4 = this.n;
                if (i4 >= i2) {
                    b71.f();
                    break;
                } else {
                    this.n = i4 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public zq(br brVar) {
        this.p = brVar;
        this.o = brVar.size();
    }
}
