package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m62 implements to2, xm0, hu0 {
    public final /* synthetic */ vo2 m;

    public m62(vo2 vo2Var) {
        this.m = vo2Var;
    }

    @Override // defpackage.xm0
    public final Object a(ym0 ym0Var, o30 o30Var) {
        this.m.a(ym0Var, o30Var);
        return b50.m;
    }

    @Override // defpackage.hu0
    public final xm0 b(CoroutineContext coroutineContext, int i, hq hqVar) {
        return (((i < 0 || i >= 2) && i != -2) || hqVar != hq.n) ? s93.E(this, coroutineContext, i, hqVar) : this;
    }

    @Override // defpackage.to2
    public final Object getValue() {
        return this.m.getValue();
    }
}
