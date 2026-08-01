package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a9 extends l70 {
    public final Typeface o;
    public final j1 p;
    public boolean q;

    public a9(j1 j1Var, Typeface typeface) {
        this.o = typeface;
        this.p = j1Var;
    }

    @Override // defpackage.l70
    public final void C(int i) {
        if (this.q) {
            return;
        }
        cb cbVar = (cb) this.p.g;
        if (cbVar.l(this.o)) {
            cbVar.j(false);
        }
    }

    @Override // defpackage.l70
    public final void E(Typeface typeface, boolean z) {
        if (this.q) {
            return;
        }
        cb cbVar = (cb) this.p.g;
        if (cbVar.l(typeface)) {
            cbVar.j(false);
        }
    }
}
