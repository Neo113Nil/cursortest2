package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mh0 extends bi {
    public final /* synthetic */ mc0 o;
    public final /* synthetic */ oh0 p;

    public mh0(oh0 oh0Var, mc0 mc0Var) {
        this.p = oh0Var;
        this.o = mc0Var;
    }

    @Override // defpackage.bi
    public final void N(int i) {
        this.p.n = true;
        this.o.i(i);
    }

    @Override // defpackage.bi
    public final void O(Typeface typeface) {
        oh0 oh0Var = this.p;
        Typeface create = Typeface.create(typeface, oh0Var.d);
        oh0Var.p = create;
        oh0Var.n = true;
        this.o.j(create, false);
    }
}
