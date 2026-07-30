package defpackage;

import defpackage.aa2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fa2 extends j61 {
    public final k61 t;

    public fa2(k61 k61Var) {
        this.t = k61Var;
    }

    @Override // defpackage.j61
    public final boolean r() {
        return false;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        Object O = q().O();
        boolean z = O instanceof gx;
        k61 k61Var = this.t;
        if (z) {
            aa2.a aVar = aa2.m;
            k61Var.resumeWith(ca2.a(((gx) O).a));
        } else {
            aa2.a aVar2 = aa2.m;
            k61Var.resumeWith(j8.Y(O));
        }
    }
}
