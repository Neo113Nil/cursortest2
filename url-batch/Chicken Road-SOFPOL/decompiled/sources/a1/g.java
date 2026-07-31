package a1;

import c6.m;
import d2.n;
import f1.g0;
import f1.q;
import m0.e2;
import m0.s;
import u1.s0;
import u1.t;
import w1.c1;
import w1.d1;
import w1.f0;
import w1.i0;
import w1.m1;
import x1.k0;
import x1.p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Object obj, Object obj2) {
        super(2);
        this.f198e = i;
        this.f199f = obj;
        this.f200g = obj2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        int i = this.f198e;
        m mVar = m.f1757a;
        Object obj3 = this.f200g;
        Object obj4 = this.f199f;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                n nVar = (n) obj2;
                h hVar = (h) obj3;
                if (!((p1) obj4).f8528b.b(nVar.f2162g)) {
                    hVar.l(intValue, nVar);
                    hVar.f207k.t(mVar);
                    break;
                }
                break;
            case 1:
                s sVar = (s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!sVar.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar.Q();
                    break;
                } else {
                    Boolean bool = (Boolean) ((t) obj4).f7273g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    p6.e eVar = (p6.e) obj3;
                    sVar.X(bool);
                    boolean g3 = sVar.g(booleanValue);
                    if (booleanValue) {
                        eVar.g(sVar, 0);
                    } else {
                        if (sVar.f5083l != 0) {
                            m0.t.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!sVar.S) {
                            if (g3) {
                                e2 e2Var = sVar.G;
                                int i8 = e2Var.f4913g;
                                int i9 = e2Var.f4914h;
                                n0.b bVar = sVar.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.f5248b.f5245b.b0(n0.i.f5272c);
                                m0.t.a(sVar.f5090s, i8, i9);
                                sVar.G.t();
                            } else {
                                sVar.P();
                            }
                        }
                    }
                    if (sVar.f5096y && sVar.G.i == sVar.f5097z) {
                        sVar.f5097z = -1;
                        sVar.f5096y = false;
                    }
                    sVar.p(false);
                    break;
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                s0.b((y0.m) obj4, (p6.e) obj3, (s) obj, m0.b.w(1));
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                q qVar = (q) obj;
                i1.b bVar2 = (i1.b) obj2;
                d1 d1Var = (d1) obj4;
                f0 f0Var = d1Var.f7614r;
                if (!f0Var.H()) {
                    d1Var.K = true;
                    break;
                } else {
                    d1Var.H = qVar;
                    d1Var.G = bVar2;
                    m1 snapshotObserver = ((x1.t) i0.a(f0Var)).getSnapshotObserver();
                    g0 g0Var = d1.M;
                    snapshotObserver.a(d1Var, w1.e.f7625h, (c1) obj3);
                    d1Var.K = false;
                    break;
                }
            default:
                ((Number) obj2).intValue();
                k0.a((x1.t) obj4, (p6.e) obj3, (s) obj, m0.b.w(1));
                break;
        }
        return mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, p6.e eVar, int i, int i8) {
        super(2);
        this.f198e = i8;
        this.f199f = obj;
        this.f200g = eVar;
    }
}
