package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gs1 implements zc {
    public final b8 d;
    public final h8 e;
    public t60 g = null;
    public Set h = null;
    public boolean i = false;
    public final /* synthetic */ g50 j;

    public gs1(g50 g50Var, b8 b8Var, h8 h8Var) {
        this.j = g50Var;
        this.d = b8Var;
        this.e = h8Var;
    }

    public final void a(fm fmVar) {
        es1 es1Var = (es1) this.j.j.get(this.e);
        if (es1Var != null) {
            es1Var.p(fmVar);
        }
    }

    @Override // defpackage.zc
    public final void g(fm fmVar) {
        this.j.m.post(new lf(6, this, fmVar, false));
    }
}
