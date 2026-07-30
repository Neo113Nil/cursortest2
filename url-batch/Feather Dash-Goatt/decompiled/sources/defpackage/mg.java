package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mg extends hg {
    public final s30 i;

    public mg(s30 s30Var, c00 c00Var, CoroutineContext coroutineContext, int i, ue ueVar) {
        super(c00Var, coroutineContext, i, ueVar);
        this.i = s30Var;
    }

    @Override // defpackage.hg
    public final hg a(CoroutineContext coroutineContext, int i, ue ueVar) {
        return new mg(this.i, this.h, coroutineContext, i, ueVar);
    }

    @Override // defpackage.hg
    public final Object c(d00 d00Var, dn dnVar) {
        Object A = la0.A(new jg(this, d00Var, null), dnVar);
        return A == tn.d ? A : Unit.a;
    }
}
