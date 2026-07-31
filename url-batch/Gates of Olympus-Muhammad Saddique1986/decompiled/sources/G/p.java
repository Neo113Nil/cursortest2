package G;

import C0.C0034j;
import C0.D;
import C0.E;
import C0.K;
import I.C0167p;
import b0.AbstractC0347p;
import b0.C0348q;
import b0.C0352v;
import b0.M;
import b0.P;
import b0.T;
import d0.AbstractC0404e;
import e2.InterfaceC0426e;
import m.i0;

/* loaded from: classes.dex */
public final class p extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f2016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K f2017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f2018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f2019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2021j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0 f2022k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(K k3, K k4, float f3, i0 i0Var, InterfaceC0426e interfaceC0426e, boolean z3, i0 i0Var2) {
        super(2);
        this.f2016e = k3;
        this.f2017f = k4;
        this.f2018g = f3;
        this.f2019h = i0Var;
        this.f2020i = interfaceC0426e;
        this.f2021j = z3;
        this.f2022k = i0Var2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0.x xVar;
        C0.w wVar;
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            K k3 = this.f2016e;
            K k4 = this.f2017f;
            N0.m mVar = E.f544d;
            D d3 = k3.f571a;
            N0.m mVar2 = d3.f525a;
            D d4 = k4.f571a;
            N0.m mVar3 = d4.f525a;
            boolean z3 = mVar2 instanceof N0.b;
            N0.m mVar4 = N0.l.f3553a;
            float f3 = this.f2018g;
            if (!z3 && !(mVar3 instanceof N0.b)) {
                long v3 = M.v(mVar2.b(), mVar3.b(), f3);
                if (v3 != 16) {
                    mVar4 = new N0.c(v3);
                }
            } else if (z3 && (mVar3 instanceof N0.b)) {
                AbstractC0347p abstractC0347p = (AbstractC0347p) E.b(((N0.b) mVar2).f3532a, ((N0.b) mVar3).f3532a, f3);
                float G3 = l0.c.G(((N0.b) mVar2).f3533b, ((N0.b) mVar3).f3533b, f3);
                if (abstractC0347p != null) {
                    if (abstractC0347p instanceof T) {
                        long m02 = O2.l.m0(((T) abstractC0347p).f5399a, G3);
                        if (m02 != 16) {
                            mVar4 = new N0.c(m02);
                        }
                    } else {
                        if (!(abstractC0347p instanceof C0348q)) {
                            throw new C1.c();
                        }
                        mVar4 = new N0.b((C0348q) abstractC0347p, G3);
                    }
                }
            } else {
                mVar4 = (N0.m) E.b(mVar2, mVar3, f3);
            }
            N0.m mVar5 = mVar4;
            H0.q qVar = (H0.q) E.b(d3.f530f, d4.f530f, f3);
            long c2 = E.c(d3.f526b, d4.f526b, f3);
            H0.k kVar = d3.f527c;
            if (kVar == null) {
                kVar = H0.k.f2597f;
            }
            H0.k kVar2 = d4.f527c;
            if (kVar2 == null) {
                kVar2 = H0.k.f2597f;
            }
            H0.k kVar3 = new H0.k(O2.d.y(l0.c.H(f3, kVar.f2601d, kVar2.f2601d), 1, 1000));
            H0.i iVar = (H0.i) E.b(d3.f528d, d4.f528d, f3);
            H0.j jVar = (H0.j) E.b(d3.f529e, d4.f529e, f3);
            String str = (String) E.b(d3.f531g, d4.f531g, f3);
            long c3 = E.c(d3.f532h, d4.f532h, f3);
            N0.a aVar = d3.f533i;
            float f4 = aVar != null ? aVar.f3531a : 0.0f;
            N0.a aVar2 = d4.f533i;
            float G4 = l0.c.G(f4, aVar2 != null ? aVar2.f3531a : 0.0f, f3);
            N0.n nVar = N0.n.f3554c;
            N0.n nVar2 = d3.f534j;
            if (nVar2 == null) {
                nVar2 = nVar;
            }
            N0.n nVar3 = d4.f534j;
            if (nVar3 != null) {
                nVar = nVar3;
            }
            N0.n nVar4 = new N0.n(l0.c.G(nVar2.f3555a, nVar.f3555a, f3), l0.c.G(nVar2.f3556b, nVar.f3556b, f3));
            J0.b bVar = (J0.b) E.b(d3.f535k, d4.f535k, f3);
            long v4 = M.v(d3.f536l, d4.f536l, f3);
            N0.j jVar2 = (N0.j) E.b(d3.f537m, d4.f537m, f3);
            P p3 = d3.f538n;
            if (p3 == null) {
                p3 = new P();
            }
            P p4 = d4.f538n;
            if (p4 == null) {
                p4 = new P();
            }
            long v5 = M.v(p3.f5381a, p4.f5381a, f3);
            float intBitsToFloat = Float.intBitsToFloat((int) (p3.f5382b >> 32));
            long j3 = p4.f5382b;
            P p5 = new P(v5, (Float.floatToRawIntBits(l0.c.G(intBitsToFloat, Float.intBitsToFloat((int) (j3 >> 32)), f3)) << 32) | (Float.floatToRawIntBits(l0.c.G(Float.intBitsToFloat((int) (r9 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f3)) & 4294967295L), l0.c.G(p3.f5383c, p4.f5383c, f3));
            C0.x xVar2 = d3.f539o;
            if (xVar2 == null && d4.f539o == null) {
                xVar = null;
            } else {
                if (xVar2 == null) {
                    xVar2 = C0.x.f657a;
                }
                xVar = xVar2;
            }
            D d5 = new D(mVar5, c2, kVar3, iVar, jVar, qVar, str, c3, new N0.a(G4), nVar4, bVar, v4, jVar2, p5, xVar, (AbstractC0404e) E.b(d3.f540p, d4.f540p, f3));
            int i3 = C0.v.f654b;
            C0.u uVar = k3.f572b;
            N0.i iVar2 = new N0.i(uVar.f644a);
            C0.u uVar2 = k4.f572b;
            int i4 = ((N0.i) E.b(iVar2, new N0.i(uVar2.f644a), f3)).f3547a;
            int i5 = ((N0.k) E.b(new N0.k(uVar.f645b), new N0.k(uVar2.f645b), f3)).f3552a;
            long c4 = E.c(uVar.f646c, uVar2.f646c, f3);
            N0.o oVar = uVar.f647d;
            if (oVar == null) {
                oVar = N0.o.f3557c;
            }
            N0.o oVar2 = uVar2.f647d;
            if (oVar2 == null) {
                oVar2 = N0.o.f3557c;
            }
            N0.o oVar3 = new N0.o(E.c(oVar.f3558a, oVar2.f3558a, f3), E.c(oVar.f3559b, oVar2.f3559b, f3));
            C0.w wVar2 = uVar.f648e;
            C0.w wVar3 = uVar2.f648e;
            if (wVar2 == null && wVar3 == null) {
                wVar = null;
            } else {
                C0.w wVar4 = C0.w.f655b;
                if (wVar2 == null) {
                    wVar2 = wVar4;
                }
                if (wVar3 == null) {
                    wVar3 = wVar4;
                }
                boolean z4 = wVar2.f656a;
                boolean z5 = wVar3.f656a;
                if (z4 != z5) {
                    ((C0034j) E.b(new C0034j(), new C0034j(), f3)).getClass();
                    wVar2 = new C0.w(((Boolean) E.b(Boolean.valueOf(z4), Boolean.valueOf(z5), f3)).booleanValue());
                }
                wVar = wVar2;
            }
            K k5 = new K(d5, new C0.u(i4, i5, c4, oVar3, wVar, (N0.g) E.b(uVar.f649f, uVar2.f649f, f3), ((N0.e) E.b(new N0.e(uVar.f650g), new N0.e(uVar2.f650g), f3)).f3537a, ((N0.d) E.b(new N0.d(uVar.f651h), new N0.d(uVar2.f651h), f3)).f3535a, (N0.p) E.b(uVar.f652i, uVar2.f652i, f3)));
            if (this.f2021j) {
                k5 = K.a(k5, ((C0352v) this.f2022k.f6815m.getValue()).f5441a, 0L, null, null, 0L, 0L, null, null, 16777214);
            }
            z.b(((C0352v) this.f2019h.f6815m.getValue()).f5441a, k5, this.f2020i, c0167p, 0);
        }
        return R1.y.f4171a;
    }
}
