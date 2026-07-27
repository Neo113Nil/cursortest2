package z1;

import A1.P0;
import D.AbstractC0171t0;
import D.T1;
import G.C0216p;
import G.C0222s0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1370N {

    /* renamed from: a, reason: collision with root package name */
    public static final D.K f11834a;

    /* renamed from: b, reason: collision with root package name */
    public static final D.K f11835b;

    /* renamed from: c, reason: collision with root package name */
    public static final T1 f11836c;

    static {
        long j4 = AbstractC1365I.f11805f;
        long j5 = AbstractC1365I.f11801b;
        long j6 = AbstractC1365I.f11803d;
        long j7 = AbstractC1365I.f11807h;
        long j8 = AbstractC1365I.f11810k;
        long j9 = AbstractC1365I.f11802c;
        long j10 = AbstractC1365I.f11809j;
        long j11 = AbstractC1365I.f11800a;
        long j12 = AbstractC1365I.f11814o;
        long j13 = AbstractC1365I.f11806g;
        long j14 = AbstractC1365I.f11804e;
        f11834a = D.M.e(j4, j5, j6, j7, j8, j5, j9, j7, j10, j5, j11, j12, j5, j12, j9, j13, j13, j14, -201844720);
        long j15 = AbstractC1365I.f11812m;
        long j16 = AbstractC1365I.f11808i;
        long d4 = Z.K.d(4279899146L);
        long d5 = Z.K.d(4280688655L);
        long d6 = Z.K.d(4281543447L);
        f11835b = new D.K(j6, j7, j13, j11, F.a.f2324d, j8, j15, F.a.f2333m, F.a.f2328h, j16, F.a.f2329i, F.a.f2341u, F.a.f2330j, d4, j11, d5, j11, d6, j9, j6, F.a.f2325e, F.a.f2323c, F.a.f2321a, F.a.f2326f, F.a.f2322b, F.a.f2327g, j14, F.a.f2331k, F.a.f2332l, F.a.f2334n, F.a.f2340t, F.a.f2335o, F.a.f2336p, F.a.f2337q, F.a.f2338r, F.a.f2339s);
        A0.L l4 = new A0.L(0L, 0L, F0.k.f2617l, F0.r.f2625c, 0L, 0, 0L, 16777179);
        A0.L l5 = new A0.L(0L, 0L, null, F0.r.f2624b, 0L, 0, 0L, 16777183);
        A0.L a4 = A0.L.a(l4, 0L, u3.l.k0(40), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a5 = A0.L.a(l4, 0L, u3.l.k0(32), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a6 = A0.L.a(l4, 0L, u3.l.k0(26), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a7 = A0.L.a(l4, 0L, u3.l.k0(28), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a8 = A0.L.a(l4, 0L, u3.l.k0(22), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a9 = A0.L.a(l4, 0L, u3.l.k0(18), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a10 = A0.L.a(l4, 0L, u3.l.k0(20), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a11 = A0.L.a(l4, 0L, u3.l.k0(16), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a12 = A0.L.a(l4, 0L, u3.l.k0(14), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a13 = A0.L.a(l5, 0L, u3.l.k0(16), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a14 = A0.L.a(l5, 0L, u3.l.k0(14), null, null, 0L, 0, 0L, null, null, 16777213);
        A0.L a15 = A0.L.a(l5, 0L, u3.l.k0(12), null, null, 0L, 0, 0L, null, null, 16777213);
        long k02 = u3.l.k0(14);
        F0.k kVar = F0.k.f2616k;
        f11836c = new T1(a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, A0.L.a(l5, 0L, k02, kVar, null, 0L, 0, 0L, null, null, 16777209), A0.L.a(l5, 0L, u3.l.k0(12), kVar, null, 0L, 0, 0L, null, null, 16777209), A0.L.a(l5, 0L, u3.l.k0(11), kVar, null, 0L, 0, 0L, null, null, 16777209));
    }

    public static final void a(O.a content, C0216p c0216p, int i2) {
        int i4;
        Intrinsics.checkNotNullParameter(content, "content");
        c0216p.U(2084405628);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(content) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            AbstractC0171t0.a((((Configuration) c0216p.k(AndroidCompositionLocals_androidKt.f5212a)).uiMode & 48) == 32 ? f11835b : f11834a, null, f11836c, content, c0216p, ((i4 << 9) & 7168) | 384);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new P0(i2, 1, content);
        }
    }
}
