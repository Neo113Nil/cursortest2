package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k51 extends l51 implements Iterator {
    public j51 d;
    public boolean e = true;
    public final /* synthetic */ vw g;

    public k51(vw vwVar) {
        this.g = vwVar;
    }

    @Override // defpackage.l51
    public final void a(j51 j51Var) {
        j51 j51Var2 = this.d;
        if (j51Var == j51Var2) {
            j51 j51Var3 = j51Var2.h;
            this.d = j51Var3;
            this.e = j51Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.g.d != null;
        }
        j51 j51Var = this.d;
        return (j51Var == null || j51Var.g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            this.d = this.g.d;
        } else {
            j51 j51Var = this.d;
            this.d = j51Var != null ? j51Var.g : null;
        }
        return this.d;
    }
}
