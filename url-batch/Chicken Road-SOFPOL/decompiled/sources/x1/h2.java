package x1;

import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h2 extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2 f8451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p6.e f8452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(i2 i2Var, p6.e eVar, int i) {
        super(2);
        this.f8450e = i;
        this.f8451f = i2Var;
        this.f8452g = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f8450e) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    k0.a(this.f8451f.f8458d, this.f8452g, sVar, 0);
                } else {
                    sVar.Q();
                }
                break;
            default:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    i2 i2Var = this.f8451f;
                    t tVar = i2Var.f8458d;
                    Object tag = tVar.getTag(R.id.inspection_slot_table_set);
                    g6.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof r6.a) && !(tag instanceof r6.d))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = tVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof r6.a) && !(tag2 instanceof r6.d))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        m0.x xVar = sVar2.U;
                        if (xVar == null) {
                            xVar = new m0.x(sVar2.f5080h);
                            sVar2.U = xVar;
                        }
                        set.add(xVar);
                        sVar2.f5088q = true;
                        sVar2.C = true;
                        sVar2.f5075c.b();
                        sVar2.H.b();
                        m0.i2 i2Var2 = sVar2.I;
                        m0.f2 f2Var = i2Var2.f4952a;
                        i2Var2.f4956e = f2Var.f4936m;
                        i2Var2.f4957f = f2Var.f4937n;
                    }
                    boolean h8 = sVar2.h(i2Var);
                    Object K = sVar2.K();
                    m0.v0 v0Var = m0.n.f5019a;
                    if (h8 || K == v0Var) {
                        K = new g2(i2Var, cVar, 0);
                        sVar2.f0(K);
                    }
                    m0.b.f(tVar, sVar2, (p6.e) K);
                    boolean h9 = sVar2.h(i2Var);
                    Object K2 = sVar2.K();
                    if (h9 || K2 == v0Var) {
                        K2 = new g2(i2Var, cVar, 1);
                        sVar2.f0(K2);
                    }
                    m0.b.f(tVar, sVar2, (p6.e) K2);
                    m0.b.a(x0.e.f8320a.a(set), u0.h.d(-280240369, new h2(i2Var, this.f8452g, 0), sVar2), sVar2, 56);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
