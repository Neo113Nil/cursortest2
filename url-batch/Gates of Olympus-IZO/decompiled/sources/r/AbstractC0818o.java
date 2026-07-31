package r;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0110n0;
import java.util.HashMap;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* renamed from: r.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0818o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f7076a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f7077b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C0817n f7078c = C0817n.f7073b;

    public static final void a(U.l lVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-211209833);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            int i5 = c0113p.f2306P;
            U.l c3 = U.m.c(c0113p, lVar);
            InterfaceC0110n0 m3 = c0113p.m();
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, f7078c);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i5))) {
                AbstractC0080b.p(i5, c0113p, i5, c0900h);
            }
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.m(lVar, i3, 2);
        }
    }

    public static final void b(r0.G g3, r0.H h3, r0.z zVar, M0.j jVar, int i3, int i4, U.d dVar) {
        U.d dVar2;
        Object r3 = zVar.r();
        C0815l c0815l = r3 instanceof C0815l ? (C0815l) r3 : null;
        r0.G.e(g3, h3, ((c0815l == null || (dVar2 = c0815l.f7068q) == null) ? dVar : dVar2).a(I2.l.e(h3.f7114d, h3.f7115e), I2.l.e(i3, i4), jVar));
    }

    public static final HashMap c(boolean z3) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z3, U.a.f3280d);
        d(hashMap, z3, U.a.f3281e);
        d(hashMap, z3, U.a.f3282f);
        d(hashMap, z3, U.a.f3283g);
        d(hashMap, z3, U.a.f3284h);
        d(hashMap, z3, U.a.f3285i);
        d(hashMap, z3, U.a.f3286j);
        d(hashMap, z3, U.a.f3287k);
        d(hashMap, z3, U.a.f3288l);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z3, U.d dVar) {
        hashMap.put(dVar, new r(dVar, z3));
    }

    public static final InterfaceC0827A e(U.d dVar, boolean z3) {
        InterfaceC0827A interfaceC0827A = (InterfaceC0827A) (z3 ? f7076a : f7077b).get(dVar);
        return interfaceC0827A == null ? new r(dVar, z3) : interfaceC0827A;
    }
}
