package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g11 implements zd1, c00, d40 {
    public final /* synthetic */ be1 d;

    public g11(be1 be1Var) {
        this.d = be1Var;
    }

    @Override // defpackage.c00
    public final Object f(d00 d00Var, dn dnVar) {
        this.d.f(d00Var, dnVar);
        return tn.d;
    }

    @Override // defpackage.zd1
    public final Object getValue() {
        return this.d.getValue();
    }

    @Override // defpackage.d40
    public final c00 i(CoroutineContext coroutineContext, int i, ue ueVar) {
        return ((((i < 0 || i >= 2) && i != -2) || ueVar != ue.e) && !((i == 0 || i == -3) && ueVar == ue.d)) ? new ig(this, coroutineContext, i, ueVar) : this;
    }
}
