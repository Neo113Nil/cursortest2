package D;

import G.C0192d;
import G.C0216p;
import G.C0219q0;
import G.C0235z;
import Z.C0323u;
import androidx.compose.foundation.BorderModifierNodeElement;
import kotlin.jvm.functions.Function0;
import m.C0847u;
import p.C0935k;

/* renamed from: D.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0161p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0235z f1966a = new C0235z(G.W.f2779l, L.f1471q);

    public static final void a(S.o oVar, Z.P p4, long j4, long j5, float f4, float f5, C0847u c0847u, O.a aVar, C0216p c0216p, int i2, int i4) {
        Z.P p5 = (i4 & 2) != 0 ? Z.K.f4461a : p4;
        long b4 = (i4 & 8) != 0 ? M.b(j4, c0216p) : j5;
        float f6 = (i4 & 16) != 0 ? 0 : f4;
        float f7 = (i4 & 32) != 0 ? 0 : f5;
        C0847u c0847u2 = (i4 & 64) != 0 ? null : c0847u;
        C0235z c0235z = f1966a;
        float f8 = ((M0.e) c0216p.k(c0235z)).f3545d + f6;
        C0192d.b(new C0219q0[]{S.f1616a.a(new C0323u(b4)), c0235z.a(new M0.e(f8))}, O.f.b(-70914509, new C0152m1(oVar, p5, j4, f8, c0847u2, f7, aVar), c0216p), c0216p, 56);
    }

    public static final void b(Function0 function0, S.o oVar, boolean z4, Z.P p4, long j4, long j5, float f4, float f5, C0847u c0847u, C0935k c0935k, O.a aVar, C0216p c0216p, int i2, int i4) {
        boolean z5 = (i4 & 4) != 0 ? true : z4;
        float f6 = (i4 & 64) != 0 ? 0 : f4;
        C0847u c0847u2 = (i4 & 256) != 0 ? null : c0847u;
        C0235z c0235z = f1966a;
        float f7 = ((M0.e) c0216p.k(c0235z)).f3545d + f6;
        C0192d.b(new C0219q0[]{S.f1616a.a(new C0323u(j5)), c0235z.a(new M0.e(f7))}, O.f.b(1279702876, new C0155n1(oVar, p4, j4, f7, c0847u2, c0935k, z5, function0, f5, aVar), c0216p), c0216p, 56);
    }

    public static final S.o c(S.o oVar, Z.P p4, long j4, C0847u c0847u, float f4) {
        S.o oVar2 = S.l.f3977a;
        S.o h4 = oVar.h(f4 > 0.0f ? androidx.compose.ui.graphics.a.b(oVar2, 0.0f, f4, p4, false, 124895) : oVar2);
        if (c0847u != null) {
            oVar2 = new BorderModifierNodeElement(c0847u.f8191a, c0847u.f8192b, p4);
        }
        return u3.l.U(androidx.compose.foundation.a.b(h4.h(oVar2), j4, p4), p4);
    }

    public static final long d(long j4, float f4, C0216p c0216p) {
        K k4 = (K) c0216p.k(M.f1481a);
        boolean booleanValue = ((Boolean) c0216p.k(M.f1482b)).booleanValue();
        if (!C0323u.c(j4, k4.f1389p) || !booleanValue) {
            return j4;
        }
        boolean a4 = M0.e.a(f4, 0);
        long j5 = k4.f1389p;
        return a4 ? j5 : Z.K.l(C0323u.b(((((float) Math.log(f4 + 1)) * 4.5f) + 2.0f) / 100.0f, k4.f1393t), j5);
    }
}
