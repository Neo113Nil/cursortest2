package q;

import G.C0208l;
import G.C0216p;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1039r {

    /* renamed from: a, reason: collision with root package name */
    public static final C1041t f9328a = new C1041t(AbstractC1031j.f9267c, S.b.f3963r);

    public static final C1041t a(InterfaceC1029h interfaceC1029h, S.e eVar, C0216p c0216p, int i2) {
        if (Intrinsics.a(interfaceC1029h, AbstractC1031j.f9267c) && eVar.equals(S.b.f3963r)) {
            c0216p.S(345962472);
            c0216p.q(false);
            return f9328a;
        }
        c0216p.S(346016319);
        boolean z4 = true;
        boolean z5 = (((i2 & 14) ^ 6) > 4 && c0216p.f(interfaceC1029h)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !c0216p.f(eVar)) && (i2 & 48) != 32) {
            z4 = false;
        }
        boolean z6 = z5 | z4;
        Object I3 = c0216p.I();
        if (z6 || I3 == C0208l.f2826a) {
            I3 = new C1041t(interfaceC1029h, eVar);
            c0216p.c0(I3);
        }
        C1041t c1041t = (C1041t) I3;
        c0216p.q(false);
        return c1041t;
    }

    public static final long b(int i2, int i4, int i5, boolean z4) {
        if (!z4) {
            return u3.d.a(0, i5, i2, i4);
        }
        int min = Math.min(i2, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int l4 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        return u3.d.a(Math.min(l4, 0), i5 != Integer.MAX_VALUE ? Math.min(l4, i5) : Integer.MAX_VALUE, min, min2);
    }
}
