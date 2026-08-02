package n0;

import W.J;
import W.t;
import W.u;
import a.AbstractC0124a;
import java.math.RoundingMode;
import m0.C1298k;
import y0.F;
import y0.p;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14501a;

    /* renamed from: b, reason: collision with root package name */
    public final t f14502b = new t();

    /* renamed from: c, reason: collision with root package name */
    public final int f14503c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14504d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14505e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14506f;

    /* renamed from: g, reason: collision with root package name */
    public long f14507g;

    /* renamed from: h, reason: collision with root package name */
    public F f14508h;

    /* renamed from: i, reason: collision with root package name */
    public long f14509i;

    public C1315a(C1298k c1298k) {
        this.f14501a = c1298k;
        this.f14503c = c1298k.f14396b;
        String str = (String) c1298k.f14398d.get("mode");
        str.getClass();
        if (U.i.h(str, "AAC-hbr")) {
            this.f14504d = 13;
            this.f14505e = 3;
        } else {
            if (!U.i.h(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f14504d = 6;
            this.f14505e = 2;
        }
        this.f14506f = this.f14505e + this.f14504d;
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        this.f14507g = j4;
        this.f14509i = j5;
    }

    @Override // n0.i
    public final void b(long j4) {
        this.f14507g = j4;
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        F z = pVar.z(i4, 1);
        this.f14508h = z;
        z.d(this.f14501a.f14397c);
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        this.f14508h.getClass();
        short w4 = uVar.w();
        int i5 = w4 / this.f14506f;
        long R3 = AbstractC0124a.R(this.f14509i, j4, this.f14507g, this.f14503c);
        t tVar = this.f14502b;
        tVar.p(uVar);
        int i6 = this.f14505e;
        int i7 = this.f14504d;
        if (i5 == 1) {
            int i8 = tVar.i(i7);
            tVar.t(i6);
            this.f14508h.a(uVar.a(), uVar);
            if (z) {
                this.f14508h.e(R3, 1, i8, 0, null);
                return;
            }
            return;
        }
        uVar.N((w4 + 7) / 8);
        long j5 = R3;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = tVar.i(i7);
            tVar.t(i6);
            this.f14508h.a(i10, uVar);
            this.f14508h.e(j5, 1, i10, 0, null);
            j5 += J.U(i5, 1000000L, this.f14503c, RoundingMode.DOWN);
        }
    }
}
