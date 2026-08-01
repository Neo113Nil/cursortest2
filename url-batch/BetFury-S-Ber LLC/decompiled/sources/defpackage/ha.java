package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ha extends mc0 {
    public final Typeface a;
    public final o0 b;
    public boolean c;

    public ha(o0 o0Var, Typeface typeface) {
        this.a = typeface;
        this.b = o0Var;
    }

    @Override // defpackage.mc0
    public final void i(int i) {
        if (this.c) {
            return;
        }
        tc tcVar = (tc) this.b.g;
        if (tcVar.l(this.a)) {
            tcVar.j(false);
        }
    }

    @Override // defpackage.mc0
    public final void j(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        tc tcVar = (tc) this.b.g;
        if (tcVar.l(typeface)) {
            tcVar.j(false);
        }
    }
}
