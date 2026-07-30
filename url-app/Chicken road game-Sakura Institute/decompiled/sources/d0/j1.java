package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j1 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2093g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2094h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i7, long j8, Object obj) {
        super(2);
        this.f2093g = i7;
        this.f2094h = j8;
        this.f2095i = obj;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2093g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    e0.a.a(this.f2094h, b4.a(f0.e.f2935a, pVar), o0.f.b(-1771489750, new g((o0.a) this.f2095i, 2, (byte) 0), pVar), pVar, 384);
                }
                break;
            default:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    long j8 = this.f2094h;
                    if (j8 != 9205357640488583168L) {
                        pVar2.Q(1828881000);
                        s0.o g9 = androidx.compose.foundation.layout.c.g((s0.o) this.f2095i, Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), 0.0f, 0.0f, 12);
                        p1.f0 e9 = q.n.e(s0.b.f8079g, false);
                        int i7 = pVar2.P;
                        g0.k1 m8 = pVar2.m();
                        s0.o c4 = s0.a.c(pVar2, g9);
                        r1.j.f7810d.getClass();
                        r1.n nVar = r1.i.f7781b;
                        pVar2.U();
                        if (pVar2.O) {
                            pVar2.l(nVar);
                        } else {
                            pVar2.d0();
                        }
                        g0.d.Q(pVar2, e9, r1.i.f7784e);
                        g0.d.Q(pVar2, m8, r1.i.f7783d);
                        r1.h hVar = r1.i.f7785f;
                        if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i7))) {
                            a0.m.q(i7, pVar2, i7, hVar);
                        }
                        g0.d.Q(pVar2, c4, r1.i.f7782c);
                        w.d.b(null, pVar2, 0, 1);
                        pVar2.p(true);
                        pVar2.p(false);
                    } else {
                        pVar2.Q(1829217412);
                        w.d.b((s0.o) this.f2095i, pVar2, 0, 0);
                        pVar2.p(false);
                    }
                }
                break;
        }
        return d6.z.f2639a;
    }
}
