package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class f9 extends zo {
    public final Typeface r;
    public final k0 s;
    public boolean t;

    public f9(k0 k0Var, Typeface typeface) {
        this.r = typeface;
        this.s = k0Var;
    }

    @Override // defpackage.zo
    public final void B(int i) {
        if (this.t) {
            return;
        }
        ab abVar = (ab) this.s.g;
        if (abVar.l(this.r)) {
            abVar.j(false);
        }
    }

    @Override // defpackage.zo
    public final void C(Typeface typeface, boolean z) {
        if (this.t) {
            return;
        }
        ab abVar = (ab) this.s.g;
        if (abVar.l(typeface)) {
            abVar.j(false);
        }
    }
}
