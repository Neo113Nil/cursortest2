package e0;

import a2.d0;
import a2.e0;
import a2.k0;
import a2.u;
import a2.v;
import a2.w;
import a2.x;
import d6.z;
import g0.m2;
import l.n1;
import z0.l0;
import z0.o0;
import z0.q;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f2692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k0 f2693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m2 f2695j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q6.e f2696k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m2 f2698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k0 k0Var, k0 k0Var2, float f9, n1 n1Var, q6.e eVar, boolean z8, n1 n1Var2) {
        super(2);
        this.f2692g = k0Var;
        this.f2693h = k0Var2;
        this.f2694i = f9;
        this.f2695j = n1Var;
        this.f2696k = eVar;
        this.f2697l = z8;
        this.f2698m = n1Var2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        x xVar;
        w wVar;
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            k0 k0Var = this.f2692g;
            d0 d0Var = k0Var.f412a;
            k0 k0Var2 = this.f2693h;
            d0 d0Var2 = k0Var2.f412a;
            l2.m mVar = e0.f370d;
            l2.m mVar2 = d0Var.f347a;
            l2.m mVar3 = d0Var2.f347a;
            boolean z8 = mVar2 instanceof l2.b;
            l2.m mVar4 = l2.l.f5882a;
            float f9 = this.f2694i;
            if (!z8 && !(mVar3 instanceof l2.b)) {
                long o2 = l0.o(f9, mVar2.b(), mVar3.b());
                if (o2 != 16) {
                    mVar4 = new l2.c(o2);
                }
            } else if (z8 && (mVar3 instanceof l2.b)) {
                l2.b bVar = (l2.b) mVar2;
                l2.b bVar2 = (l2.b) mVar3;
                z0.p pVar2 = (z0.p) e0.b(bVar.f5861a, bVar2.f5861a, f9);
                float D = a8.m.D(bVar.f5862b, bVar2.f5862b, f9);
                if (pVar2 != null) {
                    if (pVar2 instanceof r0) {
                        long A = a.a.A(((r0) pVar2).f10045a, D);
                        if (A != 16) {
                            mVar4 = new l2.c(A);
                        }
                    } else {
                        if (!(pVar2 instanceof q)) {
                            throw new b4.c();
                        }
                        mVar4 = new l2.b((q) pVar2, D);
                    }
                }
            } else {
                mVar4 = (l2.m) e0.b(mVar2, mVar3, f9);
            }
            l2.m mVar5 = mVar4;
            f2.q qVar = (f2.q) e0.b(d0Var.f352f, d0Var2.f352f, f9);
            long c4 = e0.c(f9, d0Var.f348b, d0Var2.f348b);
            f2.k kVar = d0Var.f349c;
            if (kVar == null) {
                kVar = f2.k.f3278h;
            }
            f2.k kVar2 = d0Var2.f349c;
            if (kVar2 == null) {
                kVar2 = f2.k.f3278h;
            }
            f2.k kVar3 = new f2.k(v1.g.e(a8.m.E(f9, kVar.f3280f, kVar2.f3280f), 1, 1000));
            f2.i iVar = (f2.i) e0.b(d0Var.f350d, d0Var2.f350d, f9);
            f2.j jVar = (f2.j) e0.b(d0Var.f351e, d0Var2.f351e, f9);
            String str = (String) e0.b(d0Var.f353g, d0Var2.f353g, f9);
            long c6 = e0.c(f9, d0Var.f354h, d0Var2.f354h);
            l2.a aVar = d0Var.f355i;
            float f10 = aVar != null ? aVar.f5860a : 0.0f;
            l2.a aVar2 = d0Var2.f355i;
            float D2 = a8.m.D(f10, aVar2 != null ? aVar2.f5860a : 0.0f, f9);
            l2.n nVar = d0Var.f356j;
            l2.n nVar2 = l2.n.f5883c;
            if (nVar == null) {
                nVar = nVar2;
            }
            l2.n nVar3 = d0Var2.f356j;
            if (nVar3 != null) {
                nVar2 = nVar3;
            }
            l2.n nVar4 = new l2.n(a8.m.D(nVar.f5884a, nVar2.f5884a, f9), a8.m.D(nVar.f5885b, nVar2.f5885b, f9));
            h2.b bVar3 = (h2.b) e0.b(d0Var.f357k, d0Var2.f357k, f9);
            long o6 = l0.o(f9, d0Var.f358l, d0Var2.f358l);
            l2.j jVar2 = (l2.j) e0.b(d0Var.f359m, d0Var2.f359m, f9);
            o0 o0Var = d0Var.f360n;
            if (o0Var == null) {
                o0Var = new o0();
            }
            o0 o0Var2 = d0Var2.f360n;
            if (o0Var2 == null) {
                o0Var2 = new o0();
            }
            long o8 = l0.o(f9, o0Var.f10031a, o0Var2.f10031a);
            long j8 = o0Var.f10032b;
            long j9 = o0Var2.f10032b;
            o0 o0Var3 = new o0(a8.m.D(o0Var.f10033c, o0Var2.f10033c, f9), o8, (Float.floatToRawIntBits(a8.m.D(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j9 >> 32)), f9)) << 32) | (Float.floatToRawIntBits(a8.m.D(Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j9 & 4294967295L)), f9)) & 4294967295L));
            x xVar2 = d0Var.f361o;
            x xVar3 = d0Var2.f361o;
            if (xVar2 == null && xVar3 == null) {
                xVar = null;
            } else {
                if (xVar2 == null) {
                    xVar2 = x.f463a;
                }
                xVar = xVar2;
            }
            d0 d0Var3 = new d0(mVar5, c4, kVar3, iVar, jVar, qVar, str, c6, new l2.a(D2), nVar4, bVar3, o6, jVar2, o0Var3, xVar, (b1.f) e0.b(d0Var.f362p, d0Var2.f362p, f9));
            u uVar = k0Var.f413b;
            u uVar2 = k0Var2.f413b;
            int i7 = v.f460b;
            int i8 = ((l2.i) e0.b(new l2.i(uVar.f450a), new l2.i(uVar2.f450a), f9)).f5876a;
            int i9 = ((l2.k) e0.b(new l2.k(uVar.f451b), new l2.k(uVar2.f451b), f9)).f5881a;
            long c9 = e0.c(f9, uVar.f452c, uVar2.f452c);
            l2.o oVar = uVar.f453d;
            if (oVar == null) {
                oVar = l2.o.f5886c;
            }
            l2.o oVar2 = uVar2.f453d;
            if (oVar2 == null) {
                oVar2 = l2.o.f5886c;
            }
            l2.o oVar3 = new l2.o(e0.c(f9, oVar.f5887a, oVar2.f5887a), e0.c(f9, oVar.f5888b, oVar2.f5888b));
            w wVar2 = uVar.f454e;
            w wVar3 = uVar2.f454e;
            if (wVar2 == null && wVar3 == null) {
                wVar = null;
            } else {
                w wVar4 = w.f461b;
                w wVar5 = wVar2 == null ? wVar4 : wVar2;
                boolean z9 = wVar5.f462a;
                if (wVar3 == null) {
                    wVar3 = wVar4;
                }
                boolean z10 = wVar3.f462a;
                if (z9 != z10) {
                    ((a2.j) e0.b(new a2.j(), new a2.j(), f9)).getClass();
                    wVar5 = new w(((Boolean) e0.b(Boolean.valueOf(z9), Boolean.valueOf(z10), f9)).booleanValue());
                }
                wVar = wVar5;
            }
            k0 k0Var3 = new k0(d0Var3, new u(i8, i9, c9, oVar3, wVar, (l2.g) e0.b(uVar.f455f, uVar2.f455f, f9), ((l2.e) e0.b(new l2.e(uVar.f456g), new l2.e(uVar2.f456g), f9)).f5866a, ((l2.d) e0.b(new l2.d(uVar.f457h), new l2.d(uVar2.f457h), f9)).f5864a, (l2.p) e0.b(uVar.f458i, uVar2.f458i, f9)));
            if (this.f2697l) {
                k0Var3 = k0.a(k0Var3, ((z0.u) this.f2698m.getValue()).f10059a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            o.b(((z0.u) this.f2695j.getValue()).f10059a, k0Var3, this.f2696k, pVar, 0);
        }
        return z.f2639a;
    }
}
