package n0;

import E.AbstractC0005f;
import T.G;
import W.J;
import W.t;
import W.u;
import a.AbstractC0124a;
import m0.C1295h;
import m0.C1298k;
import v2.f0;
import y0.F;
import y0.p;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14551b;

    /* renamed from: c, reason: collision with root package name */
    public F f14552c;

    /* renamed from: d, reason: collision with root package name */
    public long f14553d;

    /* renamed from: e, reason: collision with root package name */
    public int f14554e;

    /* renamed from: f, reason: collision with root package name */
    public int f14555f;

    /* renamed from: g, reason: collision with root package name */
    public long f14556g;

    /* renamed from: h, reason: collision with root package name */
    public long f14557h;

    public f(C1298k c1298k) {
        this.f14550a = c1298k;
        try {
            this.f14551b = e(c1298k.f14398d);
            this.f14553d = -9223372036854775807L;
            this.f14554e = -1;
            this.f14555f = 0;
            this.f14556g = 0L;
            this.f14557h = -9223372036854775807L;
        } catch (G e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int e(f0 f0Var) {
        String str = (String) f0Var.get("config");
        int i4 = 0;
        i4 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] t4 = J.t(str);
            t tVar = new t(t4.length, t4);
            int i5 = tVar.i(1);
            if (i5 != 0) {
                throw new G(AbstractC0005f.j(i5, "unsupported audio mux version: "), null, true, 0);
            }
            AbstractC0124a.g("Only supports allStreamsSameTimeFraming.", tVar.i(1) == 1);
            int i6 = tVar.i(6);
            AbstractC0124a.g("Only suppors one program.", tVar.i(4) == 0);
            AbstractC0124a.g("Only suppors one layer.", tVar.i(3) == 0);
            i4 = i6;
        }
        return i4 + 1;
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        this.f14553d = j4;
        this.f14555f = 0;
        this.f14556g = j5;
    }

    @Override // n0.i
    public final void b(long j4) {
        AbstractC0124a.t(this.f14553d == -9223372036854775807L);
        this.f14553d = j4;
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        F z = pVar.z(i4, 2);
        this.f14552c = z;
        String str = J.f3263a;
        z.d(this.f14550a.f14397c);
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        this.f14552c.getClass();
        int a3 = C1295h.a(this.f14554e);
        if (this.f14555f > 0 && a3 < i4) {
            F f4 = this.f14552c;
            f4.getClass();
            f4.e(this.f14557h, 1, this.f14555f, 0, null);
            this.f14555f = 0;
            this.f14557h = -9223372036854775807L;
        }
        for (int i5 = 0; i5 < this.f14551b; i5++) {
            int i6 = 0;
            while (uVar.f3352b < uVar.f3353c) {
                int z4 = uVar.z();
                i6 += z4;
                if (z4 != 255) {
                    break;
                }
            }
            this.f14552c.a(i6, uVar);
            this.f14555f += i6;
        }
        this.f14557h = AbstractC0124a.R(this.f14556g, j4, this.f14553d, this.f14550a.f14396b);
        if (z) {
            F f5 = this.f14552c;
            f5.getClass();
            f5.e(this.f14557h, 1, this.f14555f, 0, null);
            this.f14555f = 0;
            this.f14557h = -9223372036854775807L;
        }
        this.f14554e = i4;
    }
}
