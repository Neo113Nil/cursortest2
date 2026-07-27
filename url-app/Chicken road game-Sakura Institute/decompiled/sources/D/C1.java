package D;

import G.C0216p;
import G.C0222s0;
import q.AbstractC1035n;

/* loaded from: classes.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1 f1211a = new C1();

    public static q.a0 b() {
        float f4 = E.v.f2252b;
        return new q.a0(f4, E.v.f2254d, f4, 0);
    }

    public void a(S.o oVar, float f4, long j4, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1498258020);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i4 | 48;
        if ((i2 & 384) == 0) {
            i5 = i4 | 176;
        }
        if ((i5 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                f4 = F.r.f2498a;
                j4 = M.d(26, c0216p);
            } else {
                c0216p.N();
            }
            c0216p.r();
            AbstractC1035n.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.b(oVar.h(androidx.compose.foundation.layout.c.f5081a), f4), j4, Z.K.f4461a), c0216p, 0);
        }
        float f5 = f4;
        long j5 = j4;
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new B1(this, oVar, f5, j5, i2);
        }
    }
}
