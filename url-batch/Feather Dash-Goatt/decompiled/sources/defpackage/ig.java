package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ig extends hg {
    @Override // defpackage.hg
    public final hg a(CoroutineContext coroutineContext, int i, ue ueVar) {
        return new ig(this.h, coroutineContext, i, ueVar);
    }

    @Override // defpackage.hg
    public final c00 b() {
        return this.h;
    }

    @Override // defpackage.hg
    public final Object c(d00 d00Var, dn dnVar) {
        Object f = this.h.f(d00Var, dnVar);
        return f == tn.d ? f : Unit.a;
    }
}
