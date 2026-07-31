package H1;

import F.C0060q;
import F.I;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0088c0;
import I.X;
import I.X0;
import L1.z;
import M1.B;
import e2.AbstractC0381e;
import java.util.List;
import java.util.ListIterator;
import l.C0564i;
import q1.C0784h;
import s.C0860c;

/* loaded from: classes.dex */
public final class s extends Z1.j implements Y1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1902h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(R.i iVar, InterfaceC0088c0 interfaceC0088c0, X0 x02) {
        super(4);
        this.f1899e = 2;
        this.f1900f = iVar;
        this.f1902h = interfaceC0088c0;
        this.f1901g = x02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [I.p] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    @Override // Y1.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        int i4;
        C0784h c0784h;
        switch (this.f1899e) {
            case 0:
                C0860c c0860c = (C0860c) obj;
                int intValue = ((Number) obj2).intValue();
                ?? r15 = (C0113p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i3 = (r15.f(c0860c) ? 4 : 2) | intValue2;
                } else {
                    i3 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i3 |= r15.d(intValue) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && r15.x()) {
                    r15.L();
                } else {
                    com.gates.olympus.miruv.data.d dVar = (com.gates.olympus.miruv.data.d) ((List) this.f1900f).get(intValue);
                    r15.Q(1831835658);
                    boolean z3 = ((v) ((InterfaceC0088c0) this.f1902h).getValue()).f1911b == dVar;
                    r15.Q(336189224);
                    y yVar = (y) this.f1901g;
                    boolean h3 = r15.h(yVar) | r15.f(dVar);
                    Object G3 = r15.G();
                    if (h3 || G3 == C0105l.f2272a) {
                        G3 = new q(yVar, dVar, 0);
                        r15.a0(G3);
                    }
                    r15.p(false);
                    I.a(z3, (Y1.a) G3, Q.f.b(981079799, new G1.k(3, dVar), r15), null, false, null, null, null, null, null, null, null, r15, 384, 0);
                    r15.p(false);
                }
                break;
            case 1:
                C0860c c0860c2 = (C0860c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0113p c0113p = (C0113p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i4 = (c0113p.f(c0860c2) ? 4 : 2) | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i4 |= c0113p.d(intValue3) ? 32 : 16;
                }
                if ((i4 & 147) == 146 && c0113p.x()) {
                    c0113p.L();
                } else {
                    com.gates.olympus.miruv.data.b bVar = (com.gates.olympus.miruv.data.b) ((List) this.f1900f).get(intValue3);
                    c0113p.Q(726462894);
                    c0113p.Q(-1916226141);
                    Y1.c cVar = (Y1.c) this.f1901g;
                    boolean f3 = c0113p.f(cVar) | c0113p.f(bVar);
                    Object G4 = c0113p.G();
                    X x3 = C0105l.f2272a;
                    if (f3 || G4 == x3) {
                        G4 = new t(cVar, bVar, 1);
                        c0113p.a0(G4);
                    }
                    Y1.a aVar = (Y1.a) G4;
                    c0113p.p(false);
                    c0113p.Q(-1916224258);
                    J1.k kVar = (J1.k) this.f1902h;
                    boolean h4 = c0113p.h(kVar) | c0113p.f(bVar);
                    Object G5 = c0113p.G();
                    if (h4 || G5 == x3) {
                        G5 = new q(kVar, bVar, 4);
                        c0113p.a0(G5);
                    }
                    c0113p.p(false);
                    B.g(bVar, aVar, (Y1.a) G5, c0113p, 0);
                    c0113p.p(false);
                }
                break;
            default:
                C0564i c0564i = (C0564i) obj;
                C0784h c0784h2 = (C0784h) obj2;
                C0113p c0113p2 = (C0113p) obj3;
                ((Number) obj4).intValue();
                if (!((Boolean) ((InterfaceC0088c0) this.f1902h).getValue()).booleanValue()) {
                    List list = (List) ((X0) this.f1901g).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c0784h = listIterator.previous();
                            if (Z1.i.a(c0784h2, (C0784h) c0784h)) {
                            }
                        } else {
                            c0784h = 0;
                        }
                    }
                    c0784h2 = c0784h;
                }
                if (c0784h2 != null) {
                    AbstractC0381e.f(c0784h2, (R.i) this.f1900f, Q.f.b(-1263531443, new C0060q(c0784h2, 8, c0564i), c0113p2), c0113p2, 384);
                }
                break;
        }
        return z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(List list, Object obj, Object obj2, int i3) {
        super(4);
        this.f1899e = i3;
        this.f1900f = list;
        this.f1901g = obj;
        this.f1902h = obj2;
    }
}
