package o;

import F.v1;
import I.C0167p;
import I.C0173s0;
import S.t;
import e2.InterfaceC0422a;
import e2.InterfaceC0427f;
import x.C1196i;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final t f7402a = new t();

    public static void b(i iVar, C1196i c1196i, boolean z3, InterfaceC0422a interfaceC0422a) {
        U.n nVar = U.n.f4488a;
        iVar.getClass();
        iVar.f7402a.add(new Q.a(262103052, new h(c1196i, z3, nVar, (InterfaceC0427f) null, interfaceC0422a), true));
    }

    public final void a(C0740b c0740b, C0167p c0167p, int i3) {
        c0167p.S(1320309496);
        int i4 = (i3 & 6) == 0 ? (c0167p.f(c0740b) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(this) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            t tVar = this.f7402a;
            int size = tVar.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((InterfaceC0427f) tVar.get(i5)).g(c0740b, c0167p, Integer.valueOf(i4 & 14));
            }
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 5, this, c0740b);
        }
    }
}
