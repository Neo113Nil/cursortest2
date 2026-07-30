package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pt extends kt {
    public final xt0 q;

    public pt(xt0 xt0Var, xm0 xm0Var, CoroutineContext coroutineContext, int i, hq hqVar) {
        super(xm0Var, coroutineContext, i, hqVar);
        this.q = xt0Var;
    }

    @Override // defpackage.jt
    public final jt e(CoroutineContext coroutineContext, int i, hq hqVar) {
        return new pt(this.q, this.p, coroutineContext, i, hqVar);
    }

    @Override // defpackage.kt
    public final Object h(ym0 ym0Var, o30 o30Var) {
        Object t = j8.t(new mt(this, ym0Var, null), o30Var);
        return t == b50.m ? t : Unit.a;
    }
}
