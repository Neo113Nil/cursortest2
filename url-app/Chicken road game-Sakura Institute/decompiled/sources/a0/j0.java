package a0;

import android.graphics.Typeface;
import android.text.Spannable;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f92g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f93h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f94i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, int i7, Object obj2) {
        super(3);
        this.f92g = i7;
        this.f93h = obj;
        this.f94i = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [q6.c, r6.l] */
    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f92g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj2;
                ((Number) obj3).intValue();
                pVar.Q(759876635);
                q6.a aVar = (q6.a) this.f93h;
                Object G = pVar.G();
                g0.t0 t0Var = g0.l.f3784a;
                if (G == t0Var) {
                    G = g0.d.C(aVar);
                    pVar.a0(G);
                }
                m2 m2Var = (m2) G;
                Object G2 = pVar.G();
                if (G2 == t0Var) {
                    G2 = new l.d(new y0.c(((y0.c) m2Var.getValue()).f9778a), m0.f107b, new y0.c(m0.f108c), 8);
                    pVar.a0(G2);
                }
                l.d dVar = (l.d) G2;
                boolean h3 = pVar.h(dVar);
                Object G3 = pVar.G();
                if (h3 || G3 == t0Var) {
                    G3 = new a0(m2Var, dVar, (h6.d) null, 1);
                    pVar.a0(G3);
                }
                g0.d.e(pVar, d6.z.f2639a, (q6.e) G3);
                l.l lVar = dVar.f5427c;
                q6.c cVar = (q6.c) this.f94i;
                boolean f9 = pVar.f(lVar);
                Object G4 = pVar.G();
                if (f9 || G4 == t0Var) {
                    G4 = new i0(lVar, 0);
                    pVar.a0(G4);
                }
                s0.o oVar = (s0.o) cVar.f((q6.a) G4);
                pVar.p(false);
                return oVar;
            case 1:
                a2.d0 d0Var = (a2.d0) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.f93h;
                i2.c cVar2 = (i2.c) this.f94i;
                f2.q qVar = d0Var.f352f;
                f2.k kVar = d0Var.f349c;
                if (kVar == null) {
                    kVar = f2.k.f3278h;
                }
                f2.i iVar = d0Var.f350d;
                int i7 = iVar != null ? iVar.f3275a : 0;
                f2.j jVar = d0Var.f351e;
                int i8 = jVar != null ? jVar.f3276a : 1;
                i2.d dVar2 = (i2.d) cVar2.f4858h;
                f2.s b9 = ((f2.e) dVar2.f4863e).b(qVar, kVar, i7, i8);
                if (b9 instanceof f2.s) {
                    Object obj4 = b9.f3290f;
                    r6.k.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    b1.b bVar = new b1.b(b9, dVar2.f4868j);
                    dVar2.f4868j = bVar;
                    Object obj5 = bVar.f1232i;
                    r6.k.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new d2.b(1, typeface), intValue, intValue2, 33);
                return d6.z.f2639a;
            case 2:
                g0.p pVar2 = (g0.p) obj2;
                ((Number) obj3).intValue();
                pVar2.Q(-353972293);
                m.h0 b10 = ((m.g0) this.f93h).b((p.i) this.f94i, pVar2);
                boolean f10 = pVar2.f(b10);
                Object G5 = pVar2.G();
                if (f10 || G5 == g0.l.f3784a) {
                    G5 = new m.j0(b10);
                    pVar2.a0(G5);
                }
                m.j0 j0Var = (m.j0) G5;
                pVar2.p(false);
                return j0Var;
            case 3:
                g0.p pVar3 = (g0.p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && pVar3.x()) {
                    pVar3.L();
                } else {
                    Object G6 = pVar3.G();
                    if (G6 == g0.l.f3784a) {
                        G6 = new n.e();
                        pVar3.a0(G6);
                    }
                    n.e eVar = (n.e) G6;
                    y yVar = (y) this.f93h;
                    n.a aVar2 = (n.a) this.f94i;
                    eVar.f6477a.clear();
                    yVar.f(eVar);
                    eVar.a(aVar2, pVar3, 0);
                }
                return d6.z.f2639a;
            case 4:
                l1.v vVar = (l1.v) obj;
                l1.v vVar2 = (l1.v) obj2;
                long j8 = ((y0.c) obj3).f9778a;
                o.x0 x0Var = (o.x0) this.f93h;
                if (((Boolean) x0Var.f6793v.f(vVar)).booleanValue()) {
                    if (!x0Var.A) {
                        if (x0Var.f6796y == null) {
                            x0Var.f6796y = j1.c.C(Integer.MAX_VALUE, 6, null);
                        }
                        x0Var.A = true;
                        c7.a0.p(x0Var.o0(), null, null, new o.e0(x0Var, null), 3);
                    }
                    a8.m.i((m1.c) this.f94i, vVar);
                    long g9 = y0.c.g(vVar2.f5832c, j8);
                    e7.e eVar2 = x0Var.f6796y;
                    if (eVar2 != null) {
                        eVar2.e(new o.p(g9));
                    }
                }
                return d6.z.f2639a;
            default:
                g0.p pVar4 = (g0.p) obj2;
                ((Number) obj3).intValue();
                p.j jVar2 = (p.j) this.f93h;
                pVar4.Q(-102778667);
                Object G7 = pVar4.G();
                g0.t0 t0Var2 = g0.l.f3784a;
                if (G7 == t0Var2) {
                    g0.y yVar2 = new g0.y(g0.d.y(pVar4));
                    pVar4.a0(yVar2);
                    G7 = yVar2;
                }
                h7.c cVar3 = ((g0.y) G7).f3972f;
                Object G8 = pVar4.G();
                if (G8 == t0Var2) {
                    G8 = g0.d.J(null, g0.t0.f3903k);
                    pVar4.a0(G8);
                }
                g0.z0 z0Var = (g0.z0) G8;
                g0.z0 M = g0.d.M((q6.c) this.f94i, pVar4);
                boolean f11 = pVar4.f(jVar2);
                Object G9 = pVar4.G();
                if (f11 || G9 == t0Var2) {
                    G9 = new q.t0(z0Var, 14, jVar2);
                    pVar4.a0(G9);
                }
                g0.d.d(jVar2, (q6.c) G9, pVar4);
                boolean h8 = pVar4.h(cVar3) | pVar4.f(jVar2) | pVar4.f(M);
                p.j jVar3 = (p.j) this.f93h;
                Object G10 = pVar4.G();
                if (h8 || G10 == t0Var2) {
                    G10 = new androidx.room.d(cVar3, z0Var, jVar3, M, null, 11);
                    pVar4.a0(G10);
                }
                s0.o a3 = l1.a0.a(s0.l.f8103a, jVar2, (q6.e) G10);
                pVar4.p(false);
                return a3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(q6.c cVar, p.j jVar) {
        super(3);
        this.f92g = 5;
        this.f94i = cVar;
        this.f93h = jVar;
    }
}
