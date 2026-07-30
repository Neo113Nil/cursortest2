package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zc2 extends cd2 implements Iterator {
    public ad2 m;
    public ad2 n;
    public final /* synthetic */ int o;

    public zc2(ad2 ad2Var, ad2 ad2Var2, int i) {
        this.o = i;
        this.m = ad2Var2;
        this.n = ad2Var;
    }

    @Override // defpackage.cd2
    public final void a(ad2 ad2Var) {
        ad2 ad2Var2;
        ad2 ad2Var3 = null;
        if (this.m == ad2Var && ad2Var == this.n) {
            this.n = null;
            this.m = null;
        }
        ad2 ad2Var4 = this.m;
        if (ad2Var4 == ad2Var) {
            switch (this.o) {
                case 0:
                    ad2Var2 = ad2Var4.p;
                    break;
                default:
                    ad2Var2 = ad2Var4.o;
                    break;
            }
            this.m = ad2Var2;
        }
        ad2 ad2Var5 = this.n;
        if (ad2Var5 == ad2Var) {
            ad2 ad2Var6 = this.m;
            if (ad2Var5 != ad2Var6 && ad2Var6 != null) {
                ad2Var3 = b(ad2Var5);
            }
            this.n = ad2Var3;
        }
    }

    public final ad2 b(ad2 ad2Var) {
        switch (this.o) {
            case 0:
                return ad2Var.o;
            default:
                return ad2Var.p;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ad2 ad2Var = this.n;
        ad2 ad2Var2 = this.m;
        this.n = (ad2Var == ad2Var2 || ad2Var2 == null) ? null : b(ad2Var);
        return ad2Var;
    }
}
