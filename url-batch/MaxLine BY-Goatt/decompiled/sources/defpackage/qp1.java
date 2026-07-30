package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qp1 implements Iterator, k71 {
    public int m = -1;
    public boolean n;
    public final /* synthetic */ rp1 o;

    public qp1(rp1 rp1Var) {
        this.o = rp1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m + 1 < this.o.v.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        this.n = true;
        yn2 yn2Var = this.o.v;
        int i = this.m + 1;
        this.m = i;
        return (op1) yn2Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.n) {
            lh.g("You must call next() before you can remove an element");
            return;
        }
        yn2 yn2Var = this.o.v;
        ((op1) yn2Var.g(this.m)).n = null;
        int i = this.m;
        Object[] objArr = yn2Var.o;
        Object obj = objArr[i];
        Object obj2 = ll3.g;
        if (obj != obj2) {
            objArr[i] = obj2;
            yn2Var.m = true;
        }
        this.m = i - 1;
        this.n = false;
    }
}
