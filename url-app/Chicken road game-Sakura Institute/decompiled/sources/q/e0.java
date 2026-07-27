package q;

import G.C0208l;
import G.C0216p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f9253a = new f0(AbstractC1031j.f9265a, S.b.f3961p);

    public static final long a(int i2, int i4, int i5, boolean z4) {
        if (!z4) {
            return u3.d.a(i2, i4, 0, i5);
        }
        int min = Math.min(i2, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int l4 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        return u3.d.a(min, min2, Math.min(l4, 0), i5 != Integer.MAX_VALUE ? Math.min(l4, i5) : Integer.MAX_VALUE);
    }

    public static final f0 b(InterfaceC1027f interfaceC1027f, S.f fVar, C0216p c0216p, int i2) {
        if (Intrinsics.a(interfaceC1027f, AbstractC1031j.f9265a) && Intrinsics.a(fVar, S.b.f3961p)) {
            c0216p.S(-849081669);
            c0216p.q(false);
            return f9253a;
        }
        c0216p.S(-849030798);
        boolean z4 = true;
        boolean z5 = (((i2 & 14) ^ 6) > 4 && c0216p.f(interfaceC1027f)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !c0216p.f(fVar)) && (i2 & 48) != 32) {
            z4 = false;
        }
        boolean z6 = z5 | z4;
        Object I3 = c0216p.I();
        if (z6 || I3 == C0208l.f2826a) {
            I3 = new f0(interfaceC1027f, fVar);
            c0216p.c0(I3);
        }
        f0 f0Var = (f0) I3;
        c0216p.q(false);
        return f0Var;
    }
}
