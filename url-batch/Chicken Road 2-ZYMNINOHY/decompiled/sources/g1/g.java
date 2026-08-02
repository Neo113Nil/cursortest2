package g1;

import S0.h;
import W.J;
import java.math.RoundingMode;
import y0.x;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public final class g implements y {

    /* renamed from: a, reason: collision with root package name */
    public final h f9030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9031b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9032c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9033d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9034e;

    public g(h hVar, int i4, long j4, long j5) {
        this.f9030a = hVar;
        this.f9031b = i4;
        this.f9032c = j4;
        long j6 = (j5 - j4) / hVar.f2420c;
        this.f9033d = j6;
        this.f9034e = h(j6);
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final x e(long j4) {
        h hVar = this.f9030a;
        long j5 = this.f9033d;
        long k4 = J.k((hVar.f2419b * j4) / (this.f9031b * 1000000), 0L, j5 - 1);
        long j6 = this.f9032c;
        long h2 = h(k4);
        z zVar = new z(h2, (hVar.f2420c * k4) + j6);
        if (h2 >= j4 || k4 == j5 - 1) {
            return new x(zVar, zVar);
        }
        long j7 = k4 + 1;
        return new x(zVar, new z(h(j7), (hVar.f2420c * j7) + j6));
    }

    @Override // y0.y
    public final long g() {
        return this.f9034e;
    }

    public final long h(long j4) {
        long j5 = j4 * this.f9031b;
        long j6 = this.f9030a.f2419b;
        String str = J.f3263a;
        return J.U(j5, 1000000L, j6, RoundingMode.DOWN);
    }
}
