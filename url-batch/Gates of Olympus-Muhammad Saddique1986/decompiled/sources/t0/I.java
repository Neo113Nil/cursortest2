package t0;

import e2.InterfaceC0422a;
import r0.AbstractC0892N;
import u0.C1123s;

/* loaded from: classes.dex */
public final class I extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f8576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f8577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8578g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M m3, h0 h0Var, long j3) {
        super(0);
        this.f8576e = m3;
        this.f8577f = h0Var;
        this.f8578g = j3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        Q I02;
        M m3 = this.f8576e;
        AbstractC0892N abstractC0892N = null;
        if (AbstractC0993f.p(m3.f8625a)) {
            b0 b0Var = m3.a().f8713q;
            if (b0Var != null) {
                abstractC0892N = b0Var.f8655l;
            }
        } else {
            b0 b0Var2 = m3.a().f8713q;
            if (b0Var2 != null && (I02 = b0Var2.I0()) != null) {
                abstractC0892N = I02.f8655l;
            }
        }
        if (abstractC0892N == null) {
            abstractC0892N = ((C1123s) this.f8577f).getPlacementScope();
        }
        Q I03 = m3.a().I0();
        f2.j.c(I03);
        AbstractC0892N.e(abstractC0892N, I03, this.f8578g);
        return R1.y.f4171a;
    }
}
