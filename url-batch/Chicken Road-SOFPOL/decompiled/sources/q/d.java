package q;

import m0.z0;
import x1.a1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj) {
        super(2);
        this.f5810e = i;
        this.f5811f = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f5810e) {
            case 0:
                c0 c0Var = (c0) obj;
                c0 c0Var2 = (c0) obj2;
                c0 c0Var3 = c0.f5808f;
                return Boolean.valueOf(c0Var == c0Var3 && c0Var2 == c0Var3 && !((n0) this.f5811f).f5880a.f5922c);
            case 1:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    Object K = sVar.K();
                    if (K == m0.n.f5019a) {
                        K = u2.d.f7313e;
                        sVar.f0(K);
                    }
                    r2.o.e(d2.l.a(y0.j.f8705a, (p6.c) K), (p6.e) ((z0) this.f5811f).getValue(), sVar, 0);
                } else {
                    sVar.Q();
                }
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                ((u2.n) this.f5811f).a((m0.s) obj, m0.b.w(1));
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((x1.a) this.f5811f).a(sVar2, 0);
                } else {
                    sVar2.Q();
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                ((a1) this.f5811f).a((m0.s) obj, m0.b.w(1));
                return c6.m.f1757a;
            default:
                y0.m mVar = (y0.m) obj;
                y0.m mVar2 = (y0.k) obj2;
                m0.s sVar3 = (m0.s) this.f5811f;
                if (mVar2 instanceof y0.h) {
                    p6.f fVar = ((y0.h) mVar2).f8703a;
                    q6.v.c(3, fVar);
                    mVar2 = r2.o.Z(sVar3, (y0.m) fVar.d(y0.j.f8705a, sVar3, 0));
                }
                return mVar.d(mVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(x1.a aVar, int i, int i8) {
        super(2);
        this.f5810e = i8;
        this.f5811f = aVar;
    }
}
