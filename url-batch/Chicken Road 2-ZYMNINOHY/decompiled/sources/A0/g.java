package A0;

import W.J;
import a.AbstractC0124a;
import java.math.RoundingMode;
import y0.F;
import y0.x;
import y0.z;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f35a;

    /* renamed from: b, reason: collision with root package name */
    public final F f36b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39e;

    /* renamed from: f, reason: collision with root package name */
    public int f40f;

    /* renamed from: g, reason: collision with root package name */
    public int f41g;

    /* renamed from: h, reason: collision with root package name */
    public int f42h;

    /* renamed from: i, reason: collision with root package name */
    public int f43i;

    /* renamed from: j, reason: collision with root package name */
    public int f44j;

    /* renamed from: k, reason: collision with root package name */
    public int f45k;

    /* renamed from: l, reason: collision with root package name */
    public long f46l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f47m;
    public int[] n;

    public g(int i4, f fVar, F f4) {
        int i5 = fVar.f32d;
        this.f35a = fVar;
        int a3 = fVar.a();
        boolean z = true;
        if (a3 != 1 && a3 != 2) {
            z = false;
        }
        AbstractC0124a.h(z);
        int i6 = (((i4 % 10) + 48) << 8) | ((i4 / 10) + 48);
        this.f37c = (a3 == 2 ? 1667497984 : 1651965952) | i6;
        long j4 = fVar.f30b * 1000000;
        long j5 = fVar.f31c;
        String str = J.f3263a;
        this.f39e = J.U(i5, j4, j5, RoundingMode.DOWN);
        this.f36b = f4;
        this.f38d = a3 == 2 ? i6 | 1650720768 : -1;
        this.f46l = -1L;
        this.f47m = new long[512];
        this.n = new int[512];
        this.f40f = i5;
    }

    public final z a(int i4) {
        return new z(((this.f39e * 1) / this.f40f) * this.n[i4], this.f47m[i4]);
    }

    public final x b(long j4) {
        if (this.f45k == 0) {
            z zVar = new z(0L, this.f46l);
            return new x(zVar, zVar);
        }
        int i4 = (int) (j4 / ((this.f39e * 1) / this.f40f));
        int e4 = J.e(this.n, i4, true, true);
        if (this.n[e4] == i4) {
            z a3 = a(e4);
            return new x(a3, a3);
        }
        z a4 = a(e4);
        int i5 = e4 + 1;
        return i5 < this.f47m.length ? new x(a4, a(i5)) : new x(a4, a4);
    }
}
