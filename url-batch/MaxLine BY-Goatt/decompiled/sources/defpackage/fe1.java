package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fe1 implements Iterator {
    public he1 m;
    public he1 n = null;
    public int o;
    public final /* synthetic */ ie1 p;
    public final /* synthetic */ int q;

    public fe1(ie1 ie1Var, int i) {
        this.q = i;
        this.p = ie1Var;
        this.m = ie1Var.q.p;
        this.o = ie1Var.p;
    }

    public final Object a() {
        return b();
    }

    public final he1 b() {
        he1 he1Var = this.m;
        ie1 ie1Var = this.p;
        if (he1Var == ie1Var.q) {
            b71.f();
            return null;
        }
        if (ie1Var.p != this.o) {
            throw new ConcurrentModificationException();
        }
        this.m = he1Var.p;
        this.n = he1Var;
        return he1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m != this.p.q;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.q) {
            case 1:
                return b().r;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        he1 he1Var = this.n;
        if (he1Var == null) {
            throw new IllegalStateException();
        }
        ie1 ie1Var = this.p;
        ie1Var.c(he1Var, true);
        this.n = null;
        this.o = ie1Var.p;
    }
}
