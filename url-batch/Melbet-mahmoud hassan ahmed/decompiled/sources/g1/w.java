package g1;

import g1.i0;

/* loaded from: classes.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private final m f16570a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.z f16571b = new o2.z(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f16572c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f16573d;

    /* renamed from: e, reason: collision with root package name */
    private o2.i0 f16574e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16575f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16576g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16577h;

    /* renamed from: i, reason: collision with root package name */
    private int f16578i;

    /* renamed from: j, reason: collision with root package name */
    private int f16579j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16580k;

    /* renamed from: l, reason: collision with root package name */
    private long f16581l;

    public w(m mVar) {
        this.f16570a = mVar;
    }

    private boolean d(o2.a0 a0Var, byte[] bArr, int i7) {
        int min = Math.min(a0Var.a(), i7 - this.f16573d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.P(min);
        } else {
            a0Var.j(bArr, this.f16573d, min);
        }
        int i8 = this.f16573d + min;
        this.f16573d = i8;
        return i8 == i7;
    }

    private boolean e() {
        this.f16571b.p(0);
        int h7 = this.f16571b.h(24);
        if (h7 != 1) {
            o2.r.i("PesReader", "Unexpected start code prefix: " + h7);
            this.f16579j = -1;
            return false;
        }
        this.f16571b.r(8);
        int h8 = this.f16571b.h(16);
        this.f16571b.r(5);
        this.f16580k = this.f16571b.g();
        this.f16571b.r(2);
        this.f16575f = this.f16571b.g();
        this.f16576g = this.f16571b.g();
        this.f16571b.r(6);
        int h9 = this.f16571b.h(8);
        this.f16578i = h9;
        if (h8 != 0) {
            int i7 = ((h8 + 6) - 9) - h9;
            this.f16579j = i7;
            if (i7 < 0) {
                o2.r.i("PesReader", "Found negative packet payload size: " + this.f16579j);
            }
            return true;
        }
        this.f16579j = -1;
        return true;
    }

    private void f() {
        this.f16571b.p(0);
        this.f16581l = -9223372036854775807L;
        if (this.f16575f) {
            this.f16571b.r(4);
            this.f16571b.r(1);
            this.f16571b.r(1);
            long h7 = (this.f16571b.h(3) << 30) | (this.f16571b.h(15) << 15) | this.f16571b.h(15);
            this.f16571b.r(1);
            if (!this.f16577h && this.f16576g) {
                this.f16571b.r(4);
                this.f16571b.r(1);
                this.f16571b.r(1);
                this.f16571b.r(1);
                this.f16574e.b((this.f16571b.h(3) << 30) | (this.f16571b.h(15) << 15) | this.f16571b.h(15));
                this.f16577h = true;
            }
            this.f16581l = this.f16574e.b(h7);
        }
    }

    private void g(int i7) {
        this.f16572c = i7;
        this.f16573d = 0;
    }

    @Override // g1.i0
    public final void a() {
        this.f16572c = 0;
        this.f16573d = 0;
        this.f16577h = false;
        this.f16570a.a();
    }

    @Override // g1.i0
    public void b(o2.i0 i0Var, w0.n nVar, i0.d dVar) {
        this.f16574e = i0Var;
        this.f16570a.d(nVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:12:0x007c). Please report as a decompilation issue!!! */
    @Override // g1.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(o2.a0 a0Var, int i7) {
        o2.a.h(this.f16574e);
        if ((i7 & 1) != 0) {
            int i8 = this.f16572c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    o2.r.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f16579j != -1) {
                        o2.r.i("PesReader", "Unexpected start indicator: expected " + this.f16579j + " more bytes");
                    }
                    this.f16570a.e();
                }
            }
            g(1);
        }
        while (a0Var.a() > 0) {
            int i9 = this.f16572c;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (d(a0Var, this.f16571b.f19836a, Math.min(10, this.f16578i)) && d(a0Var, null, this.f16578i)) {
                            f();
                            i7 |= this.f16580k ? 4 : 0;
                            this.f16570a.f(this.f16581l, i7);
                            g(3);
                        }
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException();
                        }
                        int a7 = a0Var.a();
                        int i10 = this.f16579j;
                        int i11 = i10 != -1 ? a7 - i10 : 0;
                        if (i11 > 0) {
                            a7 -= i11;
                            a0Var.N(a0Var.e() + a7);
                        }
                        this.f16570a.c(a0Var);
                        int i12 = this.f16579j;
                        if (i12 != -1) {
                            int i13 = i12 - a7;
                            this.f16579j = i13;
                            if (i13 == 0) {
                                this.f16570a.e();
                                g(1);
                                while (a0Var.a() > 0) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (d(a0Var, this.f16571b.f19836a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                a0Var.P(a0Var.a());
            }
        }
    }
}
