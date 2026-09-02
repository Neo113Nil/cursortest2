package w0;

import T.C0096n;
import T.C0097o;
import T.e0;
import W.J;
import android.os.SystemClock;
import android.os.Trace;
import d2.C0389g;
import java.util.NoSuchElementException;

/* renamed from: w0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1487B {

    /* renamed from: a, reason: collision with root package name */
    public final C0389g f15754a;

    /* renamed from: b, reason: collision with root package name */
    public final u f15755b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.b f15756c = new S0.b();

    /* renamed from: d, reason: collision with root package name */
    public final S0.g f15757d = new S0.g();

    /* renamed from: e, reason: collision with root package name */
    public final S0.g f15758e = new S0.g();

    /* renamed from: f, reason: collision with root package name */
    public final S0.h f15759f;

    /* renamed from: g, reason: collision with root package name */
    public final v f15760g;

    /* renamed from: h, reason: collision with root package name */
    public long f15761h;

    /* renamed from: i, reason: collision with root package name */
    public long f15762i;

    /* renamed from: j, reason: collision with root package name */
    public long f15763j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f15764k;

    /* renamed from: l, reason: collision with root package name */
    public long f15765l;

    public C1487B(C0389g c0389g, u uVar, v vVar) {
        this.f15754a = c0389g;
        this.f15755b = uVar;
        this.f15760g = vVar;
        S0.h hVar = new S0.h();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        hVar.f2418a = 0;
        hVar.f2419b = -1;
        hVar.f2420c = 0;
        hVar.f2422e = new long[highestOneBit];
        hVar.f2421d = highestOneBit - 1;
        this.f15759f = hVar;
        this.f15761h = -9223372036854775807L;
        this.f15764k = e0.f2775d;
        this.f15762i = -9223372036854775807L;
        this.f15763j = -9223372036854775807L;
    }

    public final void a(long j4, long j5) {
        final C0389g c0389g = this.f15754a;
        C1496c c1496c = (C1496c) c0389g.f8265c;
        while (true) {
            S0.h hVar = this.f15759f;
            int i4 = hVar.f2420c;
            if (i4 == 0) {
                return;
            }
            if (i4 == 0) {
                throw new NoSuchElementException();
            }
            long j6 = ((long[]) hVar.f2422e)[hVar.f2418a];
            Long l4 = (Long) this.f15758e.d(j6);
            u uVar = this.f15755b;
            if (l4 != null && l4.longValue() != this.f15765l) {
                this.f15765l = l4.longValue();
                uVar.e(2);
            }
            long j7 = this.f15765l;
            u uVar2 = this.f15755b;
            S0.b bVar = this.f15756c;
            int a3 = uVar2.a(j6, j4, j5, j7, false, false, bVar);
            if (a3 != 5 && a3 != 4) {
                this.f15760g.a(j6, bVar.f2396a);
            }
            if (a3 == 0 || a3 == 1) {
                this.f15762i = j6;
                boolean z = a3 == 0;
                long d4 = hVar.d();
                e0 e0Var = (e0) this.f15757d.d(d4);
                if (e0Var != null && !e0Var.equals(e0.f2775d) && !e0Var.equals(this.f15764k)) {
                    this.f15764k = e0Var;
                    C0096n c0096n = new C0096n();
                    c0096n.f2836t = e0Var.f2776a;
                    c0096n.f2837u = e0Var.f2777b;
                    c0096n.f2831m = T.F.n("video/raw");
                    c0389g.f8264b = new C0097o(c0096n);
                    c1496c.f15783i.execute(new g0.p(c0389g, 14, e0Var));
                }
                long nanoTime = z ? System.nanoTime() : bVar.f2397b;
                boolean z4 = uVar.f15900e != 3;
                uVar.f15900e = 3;
                uVar.f15907l.getClass();
                uVar.f15902g = J.M(SystemClock.elapsedRealtime());
                if (z4 && c1496c.f15779e != null) {
                    final int i5 = 0;
                    c1496c.f15783i.execute(new Runnable() { // from class: w0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    ((C1496c) c0389g.f8265c).f15782h.a();
                                    break;
                                default:
                                    ((C1496c) c0389g.f8265c).f15782h.b();
                                    break;
                            }
                        }
                    });
                }
                C0097o c0097o = (C0097o) c0389g.f8264b;
                c1496c.f15784j.a(d4, nanoTime, c0097o == null ? new C0097o(new C0096n()) : c0097o, null);
                C1501h c1501h = (C1501h) c1496c.f15778d.remove();
                c1501h.f15801c.M0(c1501h.f15799a, c1501h.f15800b, nanoTime);
            } else if (a3 == 2 || a3 == 3) {
                this.f15762i = j6;
                hVar.d();
                final int i6 = 1;
                c1496c.f15783i.execute(new Runnable() { // from class: w0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                ((C1496c) c0389g.f8265c).f15782h.a();
                                break;
                            default:
                                ((C1496c) c0389g.f8265c).f15782h.b();
                                break;
                        }
                    }
                });
                C1501h c1501h2 = (C1501h) c1496c.f15778d.remove();
                k kVar = c1501h2.f15801c;
                j0.l lVar = c1501h2.f15799a;
                int i7 = c1501h2.f15800b;
                Trace.beginSection("dropVideoBuffer");
                lVar.f(i7);
                Trace.endSection();
                kVar.R0(0, 1);
            } else {
                if (a3 != 4) {
                    if (a3 != 5) {
                        throw new IllegalStateException(String.valueOf(a3));
                    }
                    return;
                }
                this.f15762i = j6;
            }
        }
    }
}
