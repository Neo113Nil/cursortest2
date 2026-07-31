package x;

import I.C0159l;
import I.C0167p;
import I.W0;
import a.AbstractC0235a;
import e2.InterfaceC0427f;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public final class G extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0.K f9950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(int i3, int i4, C0.K k3) {
        super(3);
        this.f9948e = i3;
        this.f9949f = i4;
        this.f9950g = k3;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(408240218);
        int i3 = this.f9948e;
        int i4 = this.f9949f;
        N.s(i3, i4);
        U.n nVar = U.n.f4488a;
        if (i3 == 1 && i4 == Integer.MAX_VALUE) {
            c0167p.p(false);
            return nVar;
        }
        O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
        H0.d dVar = (H0.d) c0167p.k(AbstractC1101g0.f9357i);
        O0.k kVar = (O0.k) c0167p.k(AbstractC1101g0.f9360l);
        C0.K k3 = this.f9950g;
        boolean f3 = c0167p.f(k3) | c0167p.f(kVar);
        Object G3 = c0167p.G();
        I.W w2 = C0159l.f2829a;
        if (f3 || G3 == w2) {
            G3 = AbstractC0235a.G(k3, kVar);
            c0167p.a0(G3);
        }
        C0.K k4 = (C0.K) G3;
        boolean f4 = c0167p.f(dVar) | c0167p.f(k4);
        Object G4 = c0167p.G();
        if (f4 || G4 == w2) {
            C0.D d3 = k4.f571a;
            H0.q qVar = d3.f530f;
            H0.k kVar2 = d3.f527c;
            if (kVar2 == null) {
                kVar2 = H0.k.f2597f;
            }
            H0.i iVar = d3.f528d;
            int i5 = iVar != null ? iVar.f2594a : 0;
            H0.j jVar = d3.f529e;
            G4 = ((H0.e) dVar).b(qVar, kVar2, i5, jVar != null ? jVar.f2595a : 1);
            c0167p.a0(G4);
        }
        W0 w02 = (W0) G4;
        boolean f5 = c0167p.f(w02.getValue()) | c0167p.f(bVar) | c0167p.f(dVar) | c0167p.f(k3) | c0167p.f(kVar);
        Object G5 = c0167p.G();
        if (f5 || G5 == w2) {
            G5 = Integer.valueOf((int) (c0.a(k4, bVar, dVar, c0.f10059a, 1) & 4294967295L));
            c0167p.a0(G5);
        }
        int intValue = ((Number) G5).intValue();
        boolean f6 = c0167p.f(w02.getValue()) | c0167p.f(bVar) | c0167p.f(dVar) | c0167p.f(k3) | c0167p.f(kVar);
        Object G6 = c0167p.G();
        if (f6 || G6 == w2) {
            StringBuilder sb = new StringBuilder();
            String str = c0.f10059a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            G6 = Integer.valueOf((int) (c0.a(k4, bVar, dVar, sb.toString(), 2) & 4294967295L));
            c0167p.a0(G6);
        }
        int intValue2 = ((Number) G6).intValue() - intValue;
        Integer valueOf = i3 == 1 ? null : Integer.valueOf(((i3 - 1) * intValue2) + intValue);
        Integer valueOf2 = i4 != Integer.MAX_VALUE ? Integer.valueOf(((i4 - 1) * intValue2) + intValue) : null;
        U.q e3 = androidx.compose.foundation.layout.c.e(nVar, valueOf != null ? bVar.Y(valueOf.intValue()) : Float.NaN, valueOf2 != null ? bVar.Y(valueOf2.intValue()) : Float.NaN);
        c0167p.p(false);
        return e3;
    }
}
