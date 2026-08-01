package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x00 extends y00 implements Iterator {
    public w00 f;
    public boolean g = true;
    public final /* synthetic */ z00 h;

    public x00(z00 z00Var) {
        this.h = z00Var;
    }

    @Override // defpackage.y00
    public final void a(w00 w00Var) {
        w00 w00Var2 = this.f;
        if (w00Var == w00Var2) {
            w00 w00Var3 = w00Var2.i;
            this.f = w00Var3;
            this.g = w00Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        w00 w00Var = this.f;
        return (w00Var == null || w00Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            w00 w00Var = this.f;
            this.f = w00Var != null ? w00Var.h : null;
        }
        return this.f;
    }
}
