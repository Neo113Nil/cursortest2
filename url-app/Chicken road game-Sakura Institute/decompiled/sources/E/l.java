package E;

import A0.C0039j;
import A0.D;
import A0.F;
import A0.L;
import A0.x;
import G.C0216p;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.K;
import Z.N;
import Z.O;
import Z.S;
import b0.AbstractC0497e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.j0;
import y2.C1338m;

/* loaded from: classes.dex */
public final class l extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f2204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f2205e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f2207j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f2208k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2209l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j0 f2210m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(L l4, L l5, float f4, j0 j0Var, Function2 function2, boolean z4, j0 j0Var2) {
        super(2);
        this.f2204d = l4;
        this.f2205e = l5;
        this.f2206i = f4;
        this.f2207j = j0Var;
        this.f2208k = function2;
        this.f2209l = z4;
        this.f2210m = j0Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        x xVar;
        A0.w wVar;
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            L l4 = this.f2204d;
            L l5 = this.f2205e;
            L0.n nVar = F.f276d;
            D d4 = l4.f303a;
            L0.n nVar2 = d4.f256a;
            D d5 = l5.f303a;
            L0.n nVar3 = d5.f256a;
            boolean z4 = nVar2 instanceof L0.b;
            L0.n nVar4 = L0.l.f3515a;
            float f4 = this.f2206i;
            if (!z4 && !(nVar3 instanceof L0.b)) {
                long v4 = K.v(nVar2.b(), nVar3.b(), f4);
                if (v4 != 16) {
                    nVar4 = new L0.c(v4);
                }
            } else if (z4 && (nVar3 instanceof L0.b)) {
                AbstractC0319p abstractC0319p = (AbstractC0319p) F.b(((L0.b) nVar2).f3494a, ((L0.b) nVar3).f3494a, f4);
                float N3 = u3.d.N(((L0.b) nVar2).f3495b, ((L0.b) nVar3).f3495b, f4);
                if (abstractC0319p != null) {
                    if (abstractC0319p instanceof S) {
                        long P3 = u3.d.P(N3, ((S) abstractC0319p).f4508a);
                        if (P3 != 16) {
                            nVar4 = new L0.c(P3);
                        }
                    } else {
                        if (!(abstractC0319p instanceof N)) {
                            throw new C1338m();
                        }
                        nVar4 = new L0.b((N) abstractC0319p, N3);
                    }
                }
            } else {
                nVar4 = (L0.n) F.b(nVar2, nVar3, f4);
            }
            L0.n nVar5 = nVar4;
            F0.r rVar = (F0.r) F.b(d4.f261f, d5.f261f, f4);
            long c4 = F.c(d4.f257b, d5.f257b, f4);
            F0.k kVar = d4.f258c;
            if (kVar == null) {
                kVar = F0.k.f2614i;
            }
            F0.k kVar2 = d5.f258c;
            if (kVar2 == null) {
                kVar2 = F0.k.f2614i;
            }
            F0.k kVar3 = new F0.k(kotlin.ranges.b.e(u3.d.O(f4, kVar.f2618d, kVar2.f2618d), 1, 1000));
            F0.i iVar = (F0.i) F.b(d4.f259d, d5.f259d, f4);
            F0.j jVar = (F0.j) F.b(d4.f260e, d5.f260e, f4);
            String str = (String) F.b(d4.f262g, d5.f262g, f4);
            long c5 = F.c(d4.f263h, d5.f263h, f4);
            L0.a aVar = d4.f264i;
            float f5 = aVar != null ? aVar.f3493a : 0.0f;
            L0.a aVar2 = d5.f264i;
            float N4 = u3.d.N(f5, aVar2 != null ? aVar2.f3493a : 0.0f, f4);
            L0.o oVar = L0.o.f3518c;
            L0.o oVar2 = d4.f265j;
            if (oVar2 == null) {
                oVar2 = oVar;
            }
            L0.o oVar3 = d5.f265j;
            if (oVar3 != null) {
                oVar = oVar3;
            }
            L0.o oVar4 = new L0.o(u3.d.N(oVar2.f3519a, oVar.f3519a, f4), u3.d.N(oVar2.f3520b, oVar.f3520b, f4));
            H0.b bVar = (H0.b) F.b(d4.f266k, d5.f266k, f4);
            long v5 = K.v(d4.f267l, d5.f267l, f4);
            L0.j jVar2 = (L0.j) F.b(d4.f268m, d5.f268m, f4);
            O o4 = d4.f269n;
            if (o4 == null) {
                o4 = new O();
            }
            O o5 = d5.f269n;
            if (o5 == null) {
                o5 = new O();
            }
            long v6 = K.v(o4.f4489a, o5.f4489a, f4);
            float intBitsToFloat = Float.intBitsToFloat((int) (o4.f4490b >> 32));
            long j4 = o5.f4490b;
            O o6 = new O(v6, (Float.floatToRawIntBits(u3.d.N(intBitsToFloat, Float.intBitsToFloat((int) (j4 >> 32)), f4)) << 32) | (Float.floatToRawIntBits(u3.d.N(Float.intBitsToFloat((int) (r9 & 4294967295L)), Float.intBitsToFloat((int) (j4 & 4294967295L)), f4)) & 4294967295L), u3.d.N(o4.f4491c, o5.f4491c, f4));
            x xVar2 = d4.f270o;
            if (xVar2 == null && d5.f270o == null) {
                xVar = null;
            } else {
                if (xVar2 == null) {
                    xVar2 = x.f389a;
                }
                xVar = xVar2;
            }
            D d6 = new D(nVar5, c4, kVar3, iVar, jVar, rVar, str, c5, new L0.a(N4), oVar4, bVar, v5, jVar2, o6, xVar, (AbstractC0497e) F.b(d4.f271p, d5.f271p, f4));
            int i2 = A0.v.f386b;
            A0.u uVar = l4.f304b;
            L0.i iVar2 = new L0.i(uVar.f376a);
            A0.u uVar2 = l5.f304b;
            int i4 = ((L0.i) F.b(iVar2, new L0.i(uVar2.f376a), f4)).f3509a;
            int i5 = ((L0.k) F.b(new L0.k(uVar.f377b), new L0.k(uVar2.f377b), f4)).f3514a;
            long c6 = F.c(uVar.f378c, uVar2.f378c, f4);
            L0.p pVar = uVar.f379d;
            if (pVar == null) {
                pVar = L0.p.f3521c;
            }
            L0.p pVar2 = uVar2.f379d;
            if (pVar2 == null) {
                pVar2 = L0.p.f3521c;
            }
            L0.p pVar3 = new L0.p(F.c(pVar.f3522a, pVar2.f3522a, f4), F.c(pVar.f3523b, pVar2.f3523b, f4));
            A0.w wVar2 = uVar.f380e;
            A0.w wVar3 = uVar2.f380e;
            if (wVar2 == null && wVar3 == null) {
                wVar = null;
            } else {
                A0.w wVar4 = A0.w.f387b;
                if (wVar2 == null) {
                    wVar2 = wVar4;
                }
                if (wVar3 == null) {
                    wVar3 = wVar4;
                }
                boolean z5 = wVar2.f388a;
                boolean z6 = wVar3.f388a;
                if (z5 != z6) {
                    ((C0039j) F.b(new C0039j(), new C0039j(), f4)).getClass();
                    wVar2 = new A0.w(((Boolean) F.b(Boolean.valueOf(z5), Boolean.valueOf(z6), f4)).booleanValue());
                }
                wVar = wVar2;
            }
            L l6 = new L(d6, new A0.u(i4, i5, c6, pVar3, wVar, (L0.g) F.b(uVar.f381f, uVar2.f381f, f4), ((L0.e) F.b(new L0.e(uVar.f382g), new L0.e(uVar2.f382g), f4)).f3499a, ((L0.d) F.b(new L0.d(uVar.f383h), new L0.d(uVar2.f383h), f4)).f3497a, (L0.q) F.b(uVar.f384i, uVar2.f384i, f4)));
            if (this.f2209l) {
                l6 = L.a(l6, ((C0323u) this.f2210m.f7778p.getValue()).f4549a, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
            }
            v.b(((C0323u) this.f2207j.f7778p.getValue()).f4549a, l6, this.f2208k, c0216p, 0);
        }
        return Unit.f7487a;
    }
}
