package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bd2 extends cd2 implements Iterator {
    public ad2 m;
    public boolean n = true;
    public final /* synthetic */ dd2 o;

    public bd2(dd2 dd2Var) {
        this.o = dd2Var;
    }

    @Override // defpackage.cd2
    public final void a(ad2 ad2Var) {
        ad2 ad2Var2 = this.m;
        if (ad2Var == ad2Var2) {
            ad2 ad2Var3 = ad2Var2.p;
            this.m = ad2Var3;
            this.n = ad2Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n) {
            return this.o.m != null;
        }
        ad2 ad2Var = this.m;
        return (ad2Var == null || ad2Var.o == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.n) {
            this.n = false;
            this.m = this.o.m;
        } else {
            ad2 ad2Var = this.m;
            this.m = ad2Var != null ? ad2Var.o : null;
        }
        return this.m;
    }
}
