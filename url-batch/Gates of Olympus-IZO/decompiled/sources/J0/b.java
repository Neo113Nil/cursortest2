package J0;

import B0.w;
import D1.C0014b;
import F0.k;
import F0.l;
import F0.r;
import F0.t;
import I.C0105l;
import I.C0113p;
import I0.c;
import I0.d;
import L1.z;
import Y1.f;
import Z1.i;
import Z1.j;
import android.graphics.Typeface;
import android.text.Spannable;
import e2.AbstractC0381e;
import k2.AbstractC0552y;
import m2.e;
import n.Q;
import n.S;
import n.U;
import n0.m;
import o.C0742s;
import o.E;
import o.g0;

/* loaded from: classes.dex */
public final class b extends j implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2582g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        super(3);
        this.f2580e = i3;
        this.f2581f = obj;
        this.f2582g = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Y1.c, Z1.j] */
    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f2580e) {
            case 0:
                w wVar = (w) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                r rVar = wVar.f370f;
                l lVar = wVar.f367c;
                if (lVar == null) {
                    lVar = l.f1454f;
                }
                F0.j jVar = wVar.f368d;
                int i3 = jVar != null ? jVar.f1451a : 0;
                k kVar = wVar.f369e;
                int i4 = kVar != null ? kVar.f1452a : 1;
                d dVar = (d) ((c) this.f2582g).f2427f;
                t b2 = ((F0.f) dVar.f2432e).b(rVar, lVar, i3, i4);
                if (b2 instanceof t) {
                    Object obj4 = b2.f1468d;
                    i.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    C0014b c0014b = new C0014b(b2, dVar.f2437j);
                    dVar.f2437j = c0014b;
                    Object obj5 = c0014b.f538d;
                    i.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                ((Spannable) this.f2581f).setSpan(new D0.b(1, typeface), intValue, intValue2, 33);
                return z.f2729a;
            case 1:
                C0113p c0113p = (C0113p) obj2;
                ((Number) obj3).intValue();
                c0113p.Q(-353972293);
                S a3 = ((Q) this.f2581f).a((q.i) this.f2582g, c0113p);
                boolean f3 = c0113p.f(a3);
                Object G3 = c0113p.G();
                if (f3 || G3 == C0105l.f2272a) {
                    G3 = new U(a3);
                    c0113p.a0(G3);
                }
                U u3 = (U) G3;
                c0113p.p(false);
                return u3;
            default:
                m mVar = (m) obj;
                m mVar2 = (m) obj2;
                long j3 = ((a0.c) obj3).f3489a;
                g0 g0Var = (g0) this.f2581f;
                if (((Boolean) g0Var.f6523t.j(mVar)).booleanValue()) {
                    if (!g0Var.f6528y) {
                        if (g0Var.f6526w == null) {
                            g0Var.f6526w = m2.l.a(Integer.MAX_VALUE, 6, null);
                        }
                        g0Var.f6528y = true;
                        AbstractC0552y.q(g0Var.j0(), null, null, new E(g0Var, null), 3);
                    }
                    AbstractC0381e.k((o0.c) this.f2582g, mVar);
                    long g3 = a0.c.g(mVar2.f6225c, j3);
                    e eVar = g0Var.f6526w;
                    if (eVar != null) {
                        eVar.g(new C0742s(g3));
                    }
                }
                return z.f2729a;
        }
    }
}
