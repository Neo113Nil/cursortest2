package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class y61 extends p implements un {
    public final dn j;

    public y61(dn dnVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.j = dnVar;
    }

    @Override // defpackage.qb0
    public void A(Object obj) {
        m90.L(qa0.b(this.j), op.F(obj));
    }

    @Override // defpackage.qb0
    public void C(Object obj) {
        this.j.l(op.F(obj));
    }

    @Override // defpackage.qb0
    public final boolean X() {
        return true;
    }

    @Override // defpackage.un
    public final un c() {
        dn dnVar = this.j;
        if (dnVar instanceof un) {
            return (un) dnVar;
        }
        return null;
    }
}
