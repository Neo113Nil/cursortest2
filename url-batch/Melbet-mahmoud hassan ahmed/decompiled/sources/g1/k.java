package g1;

import g1.i0;
import r0.s1;

/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: b, reason: collision with root package name */
    private final String f16381b;

    /* renamed from: c, reason: collision with root package name */
    private String f16382c;

    /* renamed from: d, reason: collision with root package name */
    private w0.e0 f16383d;

    /* renamed from: f, reason: collision with root package name */
    private int f16385f;

    /* renamed from: g, reason: collision with root package name */
    private int f16386g;

    /* renamed from: h, reason: collision with root package name */
    private long f16387h;

    /* renamed from: i, reason: collision with root package name */
    private s1 f16388i;

    /* renamed from: j, reason: collision with root package name */
    private int f16389j;

    /* renamed from: a, reason: collision with root package name */
    private final o2.a0 f16380a = new o2.a0(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f16384e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f16390k = -9223372036854775807L;

    public k(String str) {
        this.f16381b = str;
    }

    private boolean b(o2.a0 a0Var, byte[] bArr, int i7) {
        int min = Math.min(a0Var.a(), i7 - this.f16385f);
        a0Var.j(bArr, this.f16385f, min);
        int i8 = this.f16385f + min;
        this.f16385f = i8;
        return i8 == i7;
    }

    private void g() {
        byte[] d7 = this.f16380a.d();
        if (this.f16388i == null) {
            s1 g7 = t0.b0.g(d7, this.f16382c, this.f16381b, null);
            this.f16388i = g7;
            this.f16383d.e(g7);
        }
        this.f16389j = t0.b0.a(d7);
        this.f16387h = (int) ((t0.b0.f(d7) * 1000000) / this.f16388i.E);
    }

    private boolean h(o2.a0 a0Var) {
        while (a0Var.a() > 0) {
            int i7 = this.f16386g << 8;
            this.f16386g = i7;
            int C = i7 | a0Var.C();
            this.f16386g = C;
            if (t0.b0.d(C)) {
                byte[] d7 = this.f16380a.d();
                int i8 = this.f16386g;
                d7[0] = (byte) ((i8 >> 24) & 255);
                d7[1] = (byte) ((i8 >> 16) & 255);
                d7[2] = (byte) ((i8 >> 8) & 255);
                d7[3] = (byte) (i8 & 255);
                this.f16385f = 4;
                this.f16386g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // g1.m
    public void a() {
        this.f16384e = 0;
        this.f16385f = 0;
        this.f16386g = 0;
        this.f16390k = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16383d);
        while (a0Var.a() > 0) {
            int i7 = this.f16384e;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(a0Var.a(), this.f16389j - this.f16385f);
                    this.f16383d.d(a0Var, min);
                    int i8 = this.f16385f + min;
                    this.f16385f = i8;
                    int i9 = this.f16389j;
                    if (i8 == i9) {
                        long j7 = this.f16390k;
                        if (j7 != -9223372036854775807L) {
                            this.f16383d.b(j7, 1, i9, 0, null);
                            this.f16390k += this.f16387h;
                        }
                        this.f16384e = 0;
                    }
                } else if (b(a0Var, this.f16380a.d(), 18)) {
                    g();
                    this.f16380a.O(0);
                    this.f16383d.d(this.f16380a, 18);
                    this.f16384e = 2;
                }
            } else if (h(a0Var)) {
                this.f16384e = 1;
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16382c = dVar.b();
        this.f16383d = nVar.d(dVar.c(), 1);
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16390k = j7;
        }
    }
}
