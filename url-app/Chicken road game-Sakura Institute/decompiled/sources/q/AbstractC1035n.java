package q;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1035n {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9285a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9286b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C1034m f9287c = C1034m.f9282b;

    public static final void a(S.o oVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-211209833);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            int i5 = c0216p.f2861P;
            S.o d4 = S.a.d(c0216p, oVar);
            InterfaceC0213n0 m4 = c0216p.m();
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, f9287c, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C0192d.R(c0216p, d4, C1069j.f9818d);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new P0.u(i2, 2, oVar);
        }
    }

    public static final void b(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O, InterfaceC0944E interfaceC0944E, M0.k kVar, int i2, int i4, S.g gVar) {
        S.g gVar2;
        Object r2 = interfaceC0944E.r();
        C1032k c1032k = r2 instanceof C1032k ? (C1032k) r2 : null;
        AbstractC0953N.e(abstractC0953N, abstractC0954O, ((c1032k == null || (gVar2 = c1032k.f9271t) == null) ? gVar : gVar2).a(u3.d.c(abstractC0954O.f9005d, abstractC0954O.f9006e), u3.d.c(i2, i4), kVar));
    }

    public static final HashMap c(boolean z4) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z4, S.b.f3952d);
        d(hashMap, z4, S.b.f3953e);
        d(hashMap, z4, S.b.f3954i);
        d(hashMap, z4, S.b.f3955j);
        d(hashMap, z4, S.b.f3956k);
        d(hashMap, z4, S.b.f3957l);
        d(hashMap, z4, S.b.f3958m);
        d(hashMap, z4, S.b.f3959n);
        d(hashMap, z4, S.b.f3960o);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z4, S.g gVar) {
        hashMap.put(gVar, new C1038q(gVar, z4));
    }

    public static final InterfaceC0945F e(S.g gVar, boolean z4) {
        InterfaceC0945F interfaceC0945F = (InterfaceC0945F) (z4 ? f9285a : f9286b).get(gVar);
        return interfaceC0945F == null ? new C1038q(gVar, z4) : interfaceC0945F;
    }
}
