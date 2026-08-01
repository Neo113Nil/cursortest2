package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n50 extends l70 {
    public final /* synthetic */ l70 o;
    public final /* synthetic */ p50 p;

    public n50(p50 p50Var, l70 l70Var) {
        this.p = p50Var;
        this.o = l70Var;
    }

    @Override // defpackage.l70
    public final void C(int i) {
        this.p.n = true;
        this.o.C(i);
    }

    @Override // defpackage.l70
    public final void D(Typeface typeface) {
        p50 p50Var = this.p;
        Typeface create = Typeface.create(typeface, p50Var.d);
        p50Var.p = create;
        p50Var.n = true;
        this.o.E(create, false);
    }
}
