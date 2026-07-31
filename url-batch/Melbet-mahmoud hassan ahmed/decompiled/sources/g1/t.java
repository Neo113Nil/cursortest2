package g1;

import g1.i0;
import r0.s1;
import t0.e0;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: a, reason: collision with root package name */
    private final o2.a0 f16550a;

    /* renamed from: b, reason: collision with root package name */
    private final e0.a f16551b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16552c;

    /* renamed from: d, reason: collision with root package name */
    private w0.e0 f16553d;

    /* renamed from: e, reason: collision with root package name */
    private String f16554e;

    /* renamed from: f, reason: collision with root package name */
    private int f16555f;

    /* renamed from: g, reason: collision with root package name */
    private int f16556g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16557h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16558i;

    /* renamed from: j, reason: collision with root package name */
    private long f16559j;

    /* renamed from: k, reason: collision with root package name */
    private int f16560k;

    /* renamed from: l, reason: collision with root package name */
    private long f16561l;

    public t() {
        this(null);
    }

    public t(String str) {
        this.f16555f = 0;
        o2.a0 a0Var = new o2.a0(4);
        this.f16550a = a0Var;
        a0Var.d()[0] = -1;
        this.f16551b = new e0.a();
        this.f16561l = -9223372036854775807L;
        this.f16552c = str;
    }

    private void b(o2.a0 a0Var) {
        byte[] d7 = a0Var.d();
        int f7 = a0Var.f();
        for (int e7 = a0Var.e(); e7 < f7; e7++) {
            boolean z6 = (d7[e7] & 255) == 255;
            boolean z7 = this.f16558i && (d7[e7] & 224) == 224;
            this.f16558i = z6;
            if (z7) {
                a0Var.O(e7 + 1);
                this.f16558i = false;
                this.f16550a.d()[1] = d7[e7];
                this.f16556g = 2;
                this.f16555f = 1;
                return;
            }
        }
        a0Var.O(f7);
    }

    private void g(o2.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f16560k - this.f16556g);
        this.f16553d.d(a0Var, min);
        int i7 = this.f16556g + min;
        this.f16556g = i7;
        int i8 = this.f16560k;
        if (i7 < i8) {
            return;
        }
        long j7 = this.f16561l;
        if (j7 != -9223372036854775807L) {
            this.f16553d.b(j7, 1, i8, 0, null);
            this.f16561l += this.f16559j;
        }
        this.f16556g = 0;
        this.f16555f = 0;
    }

    private void h(o2.a0 a0Var) {
        int min = Math.min(a0Var.a(), 4 - this.f16556g);
        a0Var.j(this.f16550a.d(), this.f16556g, min);
        int i7 = this.f16556g + min;
        this.f16556g = i7;
        if (i7 < 4) {
            return;
        }
        this.f16550a.O(0);
        if (!this.f16551b.a(this.f16550a.m())) {
            this.f16556g = 0;
            this.f16555f = 1;
            return;
        }
        this.f16560k = this.f16551b.f21729c;
        if (!this.f16557h) {
            this.f16559j = (r8.f21733g * 1000000) / r8.f21730d;
            this.f16553d.e(new s1.b().S(this.f16554e).e0(this.f16551b.f21728b).W(4096).H(this.f16551b.f21731e).f0(this.f16551b.f21730d).V(this.f16552c).E());
            this.f16557h = true;
        }
        this.f16550a.O(0);
        this.f16553d.d(this.f16550a, 4);
        this.f16555f = 2;
    }

    @Override // g1.m
    public void a() {
        this.f16555f = 0;
        this.f16556g = 0;
        this.f16558i = false;
        this.f16561l = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16553d);
        while (a0Var.a() > 0) {
            int i7 = this.f16555f;
            if (i7 == 0) {
                b(a0Var);
            } else if (i7 == 1) {
                h(a0Var);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                g(a0Var);
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16554e = dVar.b();
        this.f16553d = nVar.d(dVar.c(), 1);
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16561l = j7;
        }
    }
}
