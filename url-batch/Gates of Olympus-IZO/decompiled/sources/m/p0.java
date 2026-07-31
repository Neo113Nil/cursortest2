package m;

import I.C0098h0;
import I.C0102j0;
import I.L0;

/* loaded from: classes.dex */
public final class p0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f5830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f5831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, float f3) {
        super(1);
        this.f5830e = s0Var;
        this.f5831f = f3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        long longValue = ((Number) obj).longValue();
        s0 s0Var = this.f5830e;
        if (!s0Var.g()) {
            C0098h0 c0098h0 = s0Var.f5847g;
            if (((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c == Long.MIN_VALUE) {
                c0098h0.g(longValue);
                ((C0102j0) s0Var.f5841a.f5876a).setValue(Boolean.TRUE);
            }
            long j3 = longValue - ((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c;
            float f3 = this.f5831f;
            if (f3 != 0.0f) {
                j3 = M1.B.N(j3 / f3);
            }
            s0Var.o(j3);
            s0Var.h(j3, f3 == 0.0f);
        }
        return L1.z.f2729a;
    }
}
