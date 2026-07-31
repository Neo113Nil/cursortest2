package A;

import C0.C0031g;
import C0.G;
import C0.H;
import C0.K;
import C0.o;
import C0.q;
import R1.y;
import S1.u;
import a.AbstractC0235a;
import b0.C0352v;
import b0.w;
import e2.InterfaceC0424c;
import java.util.List;
import t0.AbstractC0993f;

/* loaded from: classes.dex */
public final class m extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f75f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i3) {
        super(1);
        this.f74e = i3;
        this.f75f = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151  */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        O0.b bVar;
        H h3;
        H h4;
        switch (this.f74e) {
            case 0:
                List list = (List) obj;
                n nVar = this.f75f;
                e y02 = nVar.y0();
                K k3 = nVar.f79r;
                w wVar = nVar.f85x;
                K e3 = K.e(k3, wVar != null ? wVar.a() : C0352v.f5439g, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                O0.k kVar = y02.f42o;
                if (kVar != null && (bVar = y02.f36i) != null) {
                    C0031g c0031g = new C0031g(y02.f28a, null, 6);
                    if (y02.f37j != null && y02.f41n != null) {
                        long a3 = O0.a.a(y02.f43p, 0, 0, 0, 0, 10);
                        u uVar = u.f4320d;
                        int i3 = y02.f33f;
                        boolean z3 = y02.f32e;
                        int i4 = y02.f31d;
                        H0.d dVar = y02.f30c;
                        h3 = new H(new G(c0031g, e3, uVar, i3, z3, i4, bVar, kVar, dVar, a3), new o(new q(c0031g, e3, uVar, bVar, dVar), a3, y02.f33f, AbstractC0235a.v(y02.f31d, 2)), y02.f39l);
                        if (h3 == null) {
                            list.add(h3);
                            h4 = h3;
                        } else {
                            h4 = null;
                        }
                        break;
                    }
                }
                h3 = null;
                if (h3 == null) {
                }
                break;
            case 1:
                String str = ((C0031g) obj).f596a;
                n nVar2 = this.f75f;
                l lVar = nVar2.f77B;
                if (lVar == null) {
                    l lVar2 = new l(nVar2.f78q, str);
                    e eVar = new e(str, nVar2.f79r, nVar2.f80s, nVar2.f81t, nVar2.f82u, nVar2.f83v, nVar2.f84w);
                    eVar.c(nVar2.y0().f36i);
                    lVar2.f73d = eVar;
                    nVar2.f77B = lVar2;
                } else if (!f2.j.a(str, lVar.f71b)) {
                    lVar.f71b = str;
                    e eVar2 = lVar.f73d;
                    if (eVar2 != null) {
                        K k4 = nVar2.f79r;
                        H0.d dVar2 = nVar2.f80s;
                        int i5 = nVar2.f81t;
                        boolean z4 = nVar2.f82u;
                        int i6 = nVar2.f83v;
                        int i7 = nVar2.f84w;
                        eVar2.f28a = str;
                        eVar2.f29b = k4;
                        eVar2.f30c = dVar2;
                        eVar2.f31d = i5;
                        eVar2.f32e = z4;
                        eVar2.f33f = i6;
                        eVar2.f34g = i7;
                        eVar2.f37j = null;
                        eVar2.f41n = null;
                        eVar2.f42o = null;
                        eVar2.f44q = -1;
                        eVar2.f45r = -1;
                        eVar2.f43p = O2.d.H(0, 0, 0, 0);
                        eVar2.f39l = O2.d.d(0, 0);
                        eVar2.f38k = false;
                        y yVar = y.f4171a;
                    }
                }
                AbstractC0993f.o(nVar2);
                AbstractC0993f.n(nVar2);
                AbstractC0993f.m(nVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n nVar3 = this.f75f;
                l lVar3 = nVar3.f77B;
                if (lVar3 != null) {
                    lVar3.f72c = booleanValue;
                    AbstractC0993f.o(nVar3);
                    AbstractC0993f.n(nVar3);
                    AbstractC0993f.m(nVar3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
