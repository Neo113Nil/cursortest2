package r;

import I.C0143d;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0164n0;
import java.util.HashMap;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: r.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0868o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f8066a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f8067b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C0867n f8068c = C0867n.f8063b;

    public static final void a(U.q qVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-211209833);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            int i5 = c0167p.f2864P;
            U.q d3 = U.a.d(c0167p, qVar);
            InterfaceC0164n0 m3 = c0167p.m();
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, f8068c);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0143d.R(c0167p, C0996i.f8755c, d3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h);
            }
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new R0.t(i3, 2, qVar);
        }
    }

    public static final void b(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O, InterfaceC0884F interfaceC0884F, O0.k kVar, int i3, int i4, U.i iVar) {
        U.i iVar2;
        Object t3 = interfaceC0884F.t();
        C0865l c0865l = t3 instanceof C0865l ? (C0865l) t3 : null;
        AbstractC0892N.e(abstractC0892N, abstractC0893O, ((c0865l == null || (iVar2 = c0865l.f8057q) == null) ? iVar : iVar2).a(O2.d.d(abstractC0893O.f8126d, abstractC0893O.f8127e), O2.d.d(i3, i4), kVar));
    }

    public static final HashMap c(boolean z3) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z3, U.b.f4461d);
        d(hashMap, z3, U.b.f4462e);
        d(hashMap, z3, U.b.f4463f);
        d(hashMap, z3, U.b.f4464g);
        d(hashMap, z3, U.b.f4465h);
        d(hashMap, z3, U.b.f4466i);
        d(hashMap, z3, U.b.f4467j);
        d(hashMap, z3, U.b.f4468k);
        d(hashMap, z3, U.b.f4469l);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z3, U.i iVar) {
        hashMap.put(iVar, new r(iVar, z3));
    }

    public static final InterfaceC0885G e(U.i iVar, boolean z3) {
        InterfaceC0885G interfaceC0885G = (InterfaceC0885G) (z3 ? f8066a : f8067b).get(iVar);
        return interfaceC0885G == null ? new r(iVar, z3) : interfaceC0885G;
    }
}
