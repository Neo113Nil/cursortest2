package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wg1 extends o81 implements Function0 {
    public final /* synthetic */ xg1 m;
    public final /* synthetic */ rx1 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(xg1 xg1Var, rx1 rx1Var, long j) {
        super(0);
        this.m = xg1Var;
        this.n = rx1Var;
        this.o = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        sg1 O0;
        m91 m91Var = this.m.r;
        m12 m12Var = null;
        if (j8.N(m91Var.a) || m91Var.c) {
            ks1 ks1Var = m91Var.a().C;
            if (ks1Var != null) {
                m12Var = ks1Var.x;
            }
        } else {
            ks1 ks1Var2 = m91Var.a().C;
            if (ks1Var2 != null && (O0 = ks1Var2.O0()) != null) {
                m12Var = O0.x;
            }
        }
        if (m12Var == null) {
            m12Var = ((t7) this.n).getPlacementScope();
        }
        sg1 O02 = m91Var.a().O0();
        O02.getClass();
        m12.h(m12Var, O02, this.o);
        return Unit.a;
    }
}
