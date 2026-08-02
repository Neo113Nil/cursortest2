package f1;

import E.AbstractC0005f;
import W.AbstractC0108a;
import W.G;

/* loaded from: classes.dex */
public final class v implements F {

    /* renamed from: a, reason: collision with root package name */
    public final h f8771a;

    /* renamed from: b, reason: collision with root package name */
    public final W.t f8772b = new W.t(10, new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f8773c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8774d;

    /* renamed from: e, reason: collision with root package name */
    public G f8775e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8776f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8777g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8778h;

    /* renamed from: i, reason: collision with root package name */
    public int f8779i;

    /* renamed from: j, reason: collision with root package name */
    public int f8780j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8781k;

    /* renamed from: l, reason: collision with root package name */
    public long f8782l;

    public v(h hVar) {
        this.f8771a = hVar;
    }

    @Override // f1.F
    public final void a(int i4, W.u uVar) {
        this.f8775e.getClass();
        int i5 = i4 & 1;
        int i6 = -1;
        int i7 = 2;
        h hVar = this.f8771a;
        if (i5 != 0) {
            int i8 = this.f8773c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    AbstractC0108a.s("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f8780j != -1) {
                        AbstractC0108a.s("PesReader", "Unexpected start indicator: expected " + this.f8780j + " more bytes");
                    }
                    hVar.c(uVar.f3353c == 0);
                }
            }
            this.f8773c = 1;
            this.f8774d = 0;
        }
        int i9 = i4;
        while (uVar.a() > 0) {
            int i10 = this.f8773c;
            if (i10 != 0) {
                W.t tVar = this.f8772b;
                if (i10 != 1) {
                    if (i10 == i7) {
                        if (c(uVar, tVar.f3345d, Math.min(10, this.f8779i)) && c(uVar, null, this.f8779i)) {
                            tVar.q(0);
                            this.f8782l = -9223372036854775807L;
                            if (this.f8776f) {
                                tVar.t(4);
                                tVar.t(1);
                                tVar.t(1);
                                long i11 = (tVar.i(15) << 15) | (tVar.i(3) << 30) | tVar.i(15);
                                tVar.t(1);
                                if (!this.f8778h && this.f8777g) {
                                    tVar.t(4);
                                    tVar.t(1);
                                    tVar.t(1);
                                    tVar.t(1);
                                    this.f8775e.b((tVar.i(3) << 30) | (tVar.i(15) << 15) | tVar.i(15));
                                    this.f8778h = true;
                                }
                                this.f8782l = this.f8775e.b(i11);
                            }
                            i9 |= this.f8781k ? 4 : 0;
                            hVar.d(i9, this.f8782l);
                            this.f8773c = 3;
                            this.f8774d = 0;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int a3 = uVar.a();
                        int i12 = this.f8780j;
                        int i13 = i12 == i6 ? 0 : a3 - i12;
                        if (i13 > 0) {
                            a3 -= i13;
                            uVar.L(uVar.f3352b + a3);
                        }
                        hVar.a(uVar);
                        int i14 = this.f8780j;
                        if (i14 != i6) {
                            int i15 = i14 - a3;
                            this.f8780j = i15;
                            if (i15 == 0) {
                                hVar.c(false);
                                this.f8773c = 1;
                                this.f8774d = 0;
                            }
                        }
                    }
                } else if (c(uVar, tVar.f3345d, 9)) {
                    this.f8773c = e() ? 2 : 0;
                    this.f8774d = 0;
                }
            } else {
                uVar.N(uVar.a());
            }
            i6 = -1;
            i7 = 2;
        }
    }

    @Override // f1.F
    public final void b() {
        this.f8773c = 0;
        this.f8774d = 0;
        this.f8778h = false;
        this.f8771a.b();
    }

    public final boolean c(W.u uVar, byte[] bArr, int i4) {
        int min = Math.min(uVar.a(), i4 - this.f8774d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.N(min);
        } else {
            uVar.k(bArr, this.f8774d, min);
        }
        int i5 = this.f8774d + min;
        this.f8774d = i5;
        return i5 == i4;
    }

    @Override // f1.F
    public final void d(G g4, y0.p pVar, E e4) {
        this.f8775e = g4;
        this.f8771a.e(pVar, e4);
    }

    public final boolean e() {
        W.t tVar = this.f8772b;
        tVar.q(0);
        int i4 = tVar.i(24);
        if (i4 != 1) {
            AbstractC0005f.u(i4, "Unexpected start code prefix: ", "PesReader");
            this.f8780j = -1;
            return false;
        }
        tVar.t(8);
        int i5 = tVar.i(16);
        tVar.t(5);
        this.f8781k = tVar.h();
        tVar.t(2);
        this.f8776f = tVar.h();
        this.f8777g = tVar.h();
        tVar.t(6);
        int i6 = tVar.i(8);
        this.f8779i = i6;
        if (i5 == 0) {
            this.f8780j = -1;
        } else {
            int i7 = (i5 - 3) - i6;
            this.f8780j = i7;
            if (i7 < 0) {
                AbstractC0108a.s("PesReader", "Found negative packet payload size: " + this.f8780j);
                this.f8780j = -1;
            }
        }
        return true;
    }
}
