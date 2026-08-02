package g1;

import S0.h;
import T.C0096n;
import T.C0097o;
import T.G;
import W.J;
import java.math.RoundingMode;
import y0.F;
import y0.o;
import y0.p;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439c implements InterfaceC0438b {

    /* renamed from: a, reason: collision with root package name */
    public final p f9011a;

    /* renamed from: b, reason: collision with root package name */
    public final F f9012b;

    /* renamed from: c, reason: collision with root package name */
    public final h f9013c;

    /* renamed from: d, reason: collision with root package name */
    public final C0097o f9014d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9015e;

    /* renamed from: f, reason: collision with root package name */
    public long f9016f;

    /* renamed from: g, reason: collision with root package name */
    public int f9017g;

    /* renamed from: h, reason: collision with root package name */
    public long f9018h;

    public C0439c(p pVar, F f4, h hVar, String str, int i4) {
        this.f9011a = pVar;
        this.f9012b = f4;
        this.f9013c = hVar;
        int i5 = hVar.f2418a;
        int i6 = hVar.f2419b;
        int i7 = (hVar.f2421d * i5) / 8;
        int i8 = hVar.f2420c;
        if (i8 != i7) {
            throw G.a(null, "Expected block size: " + i7 + "; got: " + i8);
        }
        int i9 = i6 * i7;
        int i10 = i9 * 8;
        int max = Math.max(i7, i9 / 10);
        this.f9015e = max;
        C0096n c0096n = new C0096n();
        c0096n.f2830l = T.F.n("audio/wav");
        c0096n.f2831m = T.F.n(str);
        c0096n.f2826h = i10;
        c0096n.f2827i = i10;
        c0096n.n = max;
        c0096n.f2810E = i5;
        c0096n.f2811F = i6;
        c0096n.f2812G = i4;
        this.f9014d = new C0097o(c0096n);
    }

    @Override // g1.InterfaceC0438b
    public final void a(long j4) {
        this.f9016f = j4;
        this.f9017g = 0;
        this.f9018h = 0L;
    }

    @Override // g1.InterfaceC0438b
    public final boolean b(o oVar, long j4) {
        int i4;
        int i5;
        long j5 = j4;
        while (j5 > 0 && (i4 = this.f9017g) < (i5 = this.f9015e)) {
            int g4 = this.f9012b.g(oVar, (int) Math.min(i5 - i4, j5), true);
            if (g4 == -1) {
                j5 = 0;
            } else {
                this.f9017g += g4;
                j5 -= g4;
            }
        }
        h hVar = this.f9013c;
        int i6 = hVar.f2420c;
        int i7 = this.f9017g / i6;
        if (i7 > 0) {
            long j6 = this.f9016f;
            long j7 = this.f9018h;
            long j8 = hVar.f2419b;
            String str = J.f3263a;
            long U4 = j6 + J.U(j7, 1000000L, j8, RoundingMode.DOWN);
            int i8 = i7 * i6;
            int i9 = this.f9017g - i8;
            this.f9012b.e(U4, 1, i8, i9, null);
            this.f9018h += i7;
            this.f9017g = i9;
        }
        return j5 <= 0;
    }

    @Override // g1.InterfaceC0438b
    public final void c(int i4, long j4) {
        g gVar = new g(this.f9013c, 1, i4, j4);
        this.f9011a.x(gVar);
        C0097o c0097o = this.f9014d;
        F f4 = this.f9012b;
        f4.d(c0097o);
        f4.c(gVar.f9034e);
    }
}
