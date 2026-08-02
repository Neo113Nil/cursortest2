package f1;

import E1.C0036l;
import T.C0096n;
import T.C0097o;
import T.G;
import a.AbstractC0124a;
import java.util.Collections;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class s implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f8720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8721b;

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8722c;

    /* renamed from: d, reason: collision with root package name */
    public final W.t f8723d;

    /* renamed from: e, reason: collision with root package name */
    public y0.F f8724e;

    /* renamed from: f, reason: collision with root package name */
    public String f8725f;

    /* renamed from: g, reason: collision with root package name */
    public C0097o f8726g;

    /* renamed from: h, reason: collision with root package name */
    public int f8727h;

    /* renamed from: i, reason: collision with root package name */
    public int f8728i;

    /* renamed from: j, reason: collision with root package name */
    public int f8729j;

    /* renamed from: k, reason: collision with root package name */
    public int f8730k;

    /* renamed from: l, reason: collision with root package name */
    public long f8731l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8732m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f8733p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8734q;

    /* renamed from: r, reason: collision with root package name */
    public long f8735r;

    /* renamed from: s, reason: collision with root package name */
    public int f8736s;

    /* renamed from: t, reason: collision with root package name */
    public long f8737t;

    /* renamed from: u, reason: collision with root package name */
    public int f8738u;
    public String v;

    public s(String str, int i4) {
        this.f8720a = str;
        this.f8721b = i4;
        W.u uVar = new W.u(1024);
        this.f8722c = uVar;
        byte[] bArr = uVar.f3351a;
        this.f8723d = new W.t(bArr.length, bArr);
        this.f8731l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019e, code lost:
    
        if (r23.f8732m == false) goto L89;
     */
    @Override // f1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(W.u uVar) {
        int i4;
        boolean h2;
        this.f8724e.getClass();
        while (uVar.a() > 0) {
            int i5 = this.f8727h;
            if (i5 != 0) {
                if (i5 != 1) {
                    W.u uVar2 = this.f8722c;
                    W.t tVar = this.f8723d;
                    if (i5 == 2) {
                        int z = ((this.f8730k & (-225)) << 8) | uVar.z();
                        this.f8729j = z;
                        if (z > uVar2.f3351a.length) {
                            uVar2.J(z);
                            byte[] bArr = uVar2.f3351a;
                            tVar.getClass();
                            tVar.o(bArr.length, bArr);
                        }
                        this.f8728i = 0;
                        this.f8727h = 3;
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(uVar.a(), this.f8729j - this.f8728i);
                        uVar.k(tVar.f3345d, this.f8728i, min);
                        int i6 = this.f8728i + min;
                        this.f8728i = i6;
                        if (i6 == this.f8729j) {
                            tVar.q(0);
                            if (!tVar.h()) {
                                this.f8732m = true;
                                int i7 = tVar.i(1);
                                int i8 = i7 == 1 ? tVar.i(1) : 0;
                                this.n = i8;
                                if (i8 != 0) {
                                    throw G.a(null, null);
                                }
                                if (i7 == 1) {
                                    tVar.i((tVar.i(2) + 1) * 8);
                                }
                                if (!tVar.h()) {
                                    throw G.a(null, null);
                                }
                                this.o = tVar.i(6);
                                int i9 = tVar.i(4);
                                int i10 = tVar.i(3);
                                if (i9 != 0 || i10 != 0) {
                                    throw G.a(null, null);
                                }
                                if (i7 == 0) {
                                    int g4 = tVar.g();
                                    int b4 = tVar.b();
                                    C0036l s4 = AbstractC1569a.s(tVar, true);
                                    this.v = s4.f632c;
                                    this.f8736s = s4.f630a;
                                    this.f8738u = s4.f631b;
                                    int b5 = b4 - tVar.b();
                                    tVar.q(g4);
                                    byte[] bArr2 = new byte[(b5 + 7) / 8];
                                    tVar.j(b5, bArr2);
                                    C0096n c0096n = new C0096n();
                                    c0096n.f2819a = this.f8725f;
                                    c0096n.f2830l = T.F.n("video/mp2t");
                                    c0096n.f2831m = T.F.n("audio/mp4a-latm");
                                    c0096n.f2828j = this.v;
                                    c0096n.f2810E = this.f8738u;
                                    c0096n.f2811F = this.f8736s;
                                    c0096n.f2832p = Collections.singletonList(bArr2);
                                    c0096n.f2822d = this.f8720a;
                                    c0096n.f2824f = this.f8721b;
                                    C0097o c0097o = new C0097o(c0096n);
                                    if (!c0097o.equals(this.f8726g)) {
                                        this.f8726g = c0097o;
                                        this.f8737t = 1024000000 / c0097o.f2847G;
                                        this.f8724e.d(c0097o);
                                    }
                                } else {
                                    int b6 = tVar.b();
                                    C0036l s5 = AbstractC1569a.s(tVar, true);
                                    this.v = s5.f632c;
                                    this.f8736s = s5.f630a;
                                    this.f8738u = s5.f631b;
                                    tVar.t(tVar.i((tVar.i(2) + 1) * 8) - (b6 - tVar.b()));
                                }
                                int i11 = tVar.i(3);
                                this.f8733p = i11;
                                if (i11 == 0) {
                                    tVar.t(8);
                                } else if (i11 == 1) {
                                    tVar.t(9);
                                } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                                    tVar.t(6);
                                } else {
                                    if (i11 != 6 && i11 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    tVar.t(1);
                                }
                                boolean h4 = tVar.h();
                                this.f8734q = h4;
                                this.f8735r = 0L;
                                if (h4) {
                                    if (i7 == 1) {
                                        this.f8735r = tVar.i((tVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h2 = tVar.h();
                                            this.f8735r = (this.f8735r << 8) + tVar.i(8);
                                        } while (h2);
                                    }
                                }
                                if (tVar.h()) {
                                    tVar.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw G.a(null, null);
                            }
                            if (this.o != 0) {
                                throw G.a(null, null);
                            }
                            if (this.f8733p != 0) {
                                throw G.a(null, null);
                            }
                            int i12 = 0;
                            do {
                                i4 = tVar.i(8);
                                i12 += i4;
                            } while (i4 == 255);
                            int g5 = tVar.g();
                            if ((g5 & 7) == 0) {
                                uVar2.M(g5 >> 3);
                            } else {
                                tVar.j(i12 * 8, uVar2.f3351a);
                                uVar2.M(0);
                            }
                            this.f8724e.a(i12, uVar2);
                            AbstractC0124a.t(this.f8731l != -9223372036854775807L);
                            this.f8724e.e(this.f8731l, 1, i12, 0, null);
                            this.f8731l += this.f8737t;
                            if (this.f8734q) {
                                tVar.t((int) this.f8735r);
                            }
                            this.f8727h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int z4 = uVar.z();
                    if ((z4 & 224) == 224) {
                        this.f8730k = z4;
                        this.f8727h = 2;
                    } else if (z4 != 86) {
                        this.f8727h = 0;
                    }
                }
            } else if (uVar.z() == 86) {
                this.f8727h = 1;
            }
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8727h = 0;
        this.f8731l = -9223372036854775807L;
        this.f8732m = false;
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8731l = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8724e = pVar.z(e4.f8529c, 1);
        e4.c();
        this.f8725f = (String) e4.f8531e;
    }

    @Override // f1.h
    public final void c(boolean z) {
    }
}
