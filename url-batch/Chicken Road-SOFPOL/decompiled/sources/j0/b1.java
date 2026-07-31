package j0;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b1 extends y0.l implements w1.j, w1.v {

    /* renamed from: r, reason: collision with root package name */
    public LinkedHashMap f3582r;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        float f6 = ((r2.f) w1.f.i(this, x0.f3944c)).f6520d;
        float f8 = 0;
        if (f6 < f8) {
            f6 = f8;
        }
        u1.l0 e8 = d0Var.e(j7);
        boolean z3 = this.f8718q && !Float.isNaN(f6) && Float.compare(f6, f8) > 0;
        int H = !Float.isNaN(f6) ? n0Var.H(f6) : 0;
        int max = z3 ? Math.max(e8.f7230d, H) : e8.f7230d;
        int max2 = z3 ? Math.max(e8.f7231e, H) : e8.f7231e;
        if (z3) {
            LinkedHashMap linkedHashMap = this.f3582r;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f3582r = linkedHashMap;
            }
            u1.z0 z0Var = x0.f3943b;
            int round = Math.round((H - e8.f7230d) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(z0Var, Integer.valueOf(round));
            u1.k kVar = x0.f3942a;
            int round2 = Math.round((H - e8.f7231e) / 2.0f);
            linkedHashMap.put(kVar, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.f3582r;
        if (map == null) {
            map = d6.v.f2327d;
        }
        return n0Var.J(max, max2, map, null, new a1(max, max2, e8));
    }
}
