package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class g50 extends jw {
    public final /* synthetic */ zo o;
    public final /* synthetic */ i50 p;

    public g50(i50 i50Var, zo zoVar) {
        this.p = i50Var;
        this.o = zoVar;
    }

    @Override // defpackage.jw
    public final void M(int i) {
        this.p.n = true;
        this.o.B(i);
    }

    @Override // defpackage.jw
    public final void N(Typeface typeface) {
        i50 i50Var = this.p;
        Typeface create = Typeface.create(typeface, i50Var.d);
        i50Var.p = create;
        i50Var.n = true;
        this.o.C(create, false);
    }
}
