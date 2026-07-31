package A;

import C0.C0031g;
import C0.G;
import C0.H;
import C0.K;
import R1.y;
import b0.C0352v;
import b0.w;
import e2.InterfaceC0424c;
import java.util.List;
import t0.AbstractC0993f;

/* loaded from: classes.dex */
public final class g extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f51f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i3) {
        super(1);
        this.f50e = i3;
        this.f51f = jVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        H h3;
        switch (this.f50e) {
            case 0:
                List list = (List) obj;
                j jVar = this.f51f;
                H h4 = jVar.y0().f25n;
                if (h4 != null) {
                    G g3 = h4.f557a;
                    C0031g c0031g = g3.f547a;
                    K k3 = jVar.f61r;
                    w wVar = jVar.f56A;
                    h3 = new H(new G(c0031g, K.e(k3, wVar != null ? wVar.a() : C0352v.f5439g, 0L, null, null, null, 0L, null, 0, 0L, 16777214), g3.f549c, g3.f550d, g3.f551e, g3.f552f, g3.f553g, g3.f554h, g3.f555i, g3.f556j), h4.f558b, h4.f559c);
                    list.add(h3);
                } else {
                    h3 = null;
                }
                break;
            case 1:
                C0031g c0031g2 = (C0031g) obj;
                j jVar2 = this.f51f;
                f fVar = jVar2.f59F;
                if (fVar == null) {
                    f fVar2 = new f(jVar2.f60q, c0031g2);
                    d dVar = new d(c0031g2, jVar2.f61r, jVar2.f62s, jVar2.f64u, jVar2.f65v, jVar2.f66w, jVar2.f67x, jVar2.f68y);
                    dVar.c(jVar2.y0().f22k);
                    fVar2.f49d = dVar;
                    jVar2.f59F = fVar2;
                } else if (!f2.j.a(c0031g2, fVar.f47b)) {
                    fVar.f47b = c0031g2;
                    d dVar2 = fVar.f49d;
                    if (dVar2 != null) {
                        K k4 = jVar2.f61r;
                        H0.d dVar3 = jVar2.f62s;
                        int i3 = jVar2.f64u;
                        boolean z3 = jVar2.f65v;
                        int i4 = jVar2.f66w;
                        int i5 = jVar2.f67x;
                        List list2 = jVar2.f68y;
                        dVar2.f12a = c0031g2;
                        dVar2.f13b = k4;
                        dVar2.f14c = dVar3;
                        dVar2.f15d = i3;
                        dVar2.f16e = z3;
                        dVar2.f17f = i4;
                        dVar2.f18g = i5;
                        dVar2.f19h = list2;
                        dVar2.f23l = null;
                        dVar2.f25n = null;
                        dVar2.f27p = -1;
                        dVar2.f26o = -1;
                        y yVar = y.f4171a;
                    }
                }
                AbstractC0993f.o(jVar2);
                AbstractC0993f.n(jVar2);
                AbstractC0993f.m(jVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                j jVar3 = this.f51f;
                f fVar3 = jVar3.f59F;
                if (fVar3 != null) {
                    InterfaceC0424c interfaceC0424c = jVar3.f57B;
                    if (interfaceC0424c != null) {
                        interfaceC0424c.n(fVar3);
                    }
                    f fVar4 = jVar3.f59F;
                    if (fVar4 != null) {
                        fVar4.f48c = booleanValue;
                    }
                    AbstractC0993f.o(jVar3);
                    AbstractC0993f.n(jVar3);
                    AbstractC0993f.m(jVar3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
