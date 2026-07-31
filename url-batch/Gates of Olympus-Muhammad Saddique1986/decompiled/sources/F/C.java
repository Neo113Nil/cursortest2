package F;

import android.os.Build;
import android.view.View;
import q.C0808d;
import q.C0809e;
import t2.InterfaceC1054g;
import u0.C1128u0;
import u2.C1149a;
import z.C1244h;
import z.C1256t;

/* loaded from: classes.dex */
public final class C implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1126e;

    public /* synthetic */ C(int i3, Object obj) {
        this.f1125d = i3;
        this.f1126e = obj;
    }

    @Override // t2.InterfaceC1054g
    public final Object e(Object obj, V1.d dVar) {
        Object d3;
        switch (this.f1125d) {
            case 0:
                q.i iVar = (q.i) obj;
                boolean z3 = iVar instanceof q.g;
                S.t tVar = (S.t) this.f1126e;
                if (z3) {
                    tVar.add(iVar);
                } else if (iVar instanceof q.h) {
                    tVar.remove(((q.h) iVar).f7842a);
                } else if (iVar instanceof C0808d) {
                    tVar.add(iVar);
                } else if (iVar instanceof C0809e) {
                    tVar.remove(((C0809e) iVar).f7838a);
                } else if (iVar instanceof q.m) {
                    tVar.add(iVar);
                } else if (iVar instanceof q.n) {
                    tVar.remove(((q.n) iVar).f7846a);
                } else if (iVar instanceof q.l) {
                    tVar.remove(((q.l) iVar).f7844a);
                }
                return R1.y.f4171a;
            case 1:
                Object f3 = ((s2.s) ((s2.t) this.f1126e)).f8416g.f(dVar, obj);
                return f3 == W1.a.f4608d ? f3 : R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                h1.M m3 = (h1.M) this.f1126e;
                boolean z4 = m3.f6098j.f() instanceof h1.N;
                R1.y yVar = R1.y.f4171a;
                return (z4 || (d3 = h1.M.d(m3, true, dVar)) != W1.a.f4608d) ? yVar : d3;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((f2.u) this.f1126e).f5832d = obj;
                throw new C1149a(this);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((C1128u0) this.f1126e).f9532d.h(((Number) obj).floatValue());
                return R1.y.f4171a;
            default:
                C1256t c1256t = (C1256t) this.f1126e;
                if (Build.VERSION.SDK_INT >= 34) {
                    C1244h.f10452a.a(c1256t.m(), (View) c1256t.f10466e);
                }
                return R1.y.f4171a;
        }
    }
}
