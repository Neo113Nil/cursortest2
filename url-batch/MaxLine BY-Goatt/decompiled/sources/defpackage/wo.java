package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wo extends o81 implements Function1 {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ cq n;
    public final /* synthetic */ long o;
    public final /* synthetic */ float p;
    public final /* synthetic */ float q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ xp2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(boolean z, nn2 nn2Var, long j, float f, float f2, long j2, long j3, xp2 xp2Var) {
        super(1);
        this.m = z;
        this.n = nn2Var;
        this.o = j;
        this.p = f;
        this.q = f2;
        this.r = j2;
        this.s = j3;
        this.t = xp2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k91 k91Var = (k91) obj;
        k91Var.a();
        ns nsVar = k91Var.m;
        if (this.m) {
            yd0.I(k91Var, this.n, 0L, 0L, this.o, null, 246);
        } else {
            long j = this.o;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.p;
            if (intBitsToFloat < f) {
                float f2 = this.q;
                float d = ql2.d(nsVar.f());
                float f3 = this.q;
                float f4 = d - f3;
                float b = ql2.b(nsVar.f()) - f3;
                cq cqVar = this.n;
                long j2 = this.o;
                mh mhVar = nsVar.n;
                long v = mhVar.v();
                mhVar.o().m();
                try {
                    ((mh) ((ar0) mhVar.n).n).o().g(f2, f2, f4, b, 0);
                    yd0.I(k91Var, cqVar, 0L, 0L, j2, null, 246);
                } finally {
                    mhVar.o().j();
                    mhVar.J(v);
                }
            } else {
                yd0.I(k91Var, this.n, this.r, this.s, l41.a0(j, f), this.t, 208);
            }
        }
        return Unit.a;
    }
}
