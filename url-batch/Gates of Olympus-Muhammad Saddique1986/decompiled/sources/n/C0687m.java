package n;

import I.C0143d;
import I.C0156j0;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0241f;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import h2.AbstractC0508a;
import p.C0789t0;
import p.C0793v0;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687m implements l0 {

    /* renamed from: d, reason: collision with root package name */
    public C0238c f7164d;

    /* renamed from: e, reason: collision with root package name */
    public final C0664G f7165e;

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f7166f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7167g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7168h;

    /* renamed from: i, reason: collision with root package name */
    public long f7169i;

    /* renamed from: j, reason: collision with root package name */
    public n0.r f7170j;

    /* renamed from: k, reason: collision with root package name */
    public final U.q f7171k;

    public C0687m(Context context, j0 j0Var) {
        C0664G c0664g = new C0664G(context, b0.M.D(j0Var.f7155a));
        this.f7165e = c0664g;
        R1.y yVar = R1.y.f4171a;
        this.f7166f = C0143d.K(yVar, I.W.f2780f);
        this.f7167g = true;
        this.f7169i = 0L;
        this.f7171k = n0.w.a(U.n.f4488a, yVar, new C0686l(this, null)).i(Build.VERSION.SDK_INT >= 31 ? new C0663F(this, c0664g) : new C0663F(this, c0664g, j0Var));
    }

    @Override // n.l0
    public final U.q a() {
        return this.f7171k;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // n.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3, C0789t0 c0789t0, V1.d dVar) {
        C0684j c0684j;
        int i3;
        float f3;
        float f4;
        long d3;
        C0687m c0687m;
        long d4;
        float b3;
        if (dVar instanceof C0684j) {
            c0684j = (C0684j) dVar;
            int i4 = c0684j.f7154k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0684j.f7154k = i4 - Integer.MIN_VALUE;
                Object obj = c0684j.f7152i;
                W1.a aVar = W1.a.f4608d;
                i3 = c0684j.f7154k;
                R1.y yVar = R1.y.f4171a;
                if (i3 == 0) {
                    if (i3 == 1) {
                        R1.a.e(obj);
                    }
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d3 = c0684j.f7151h;
                    c0687m = c0684j.f7150g;
                    R1.a.e(obj);
                    d4 = O0.o.d(d3, ((O0.o) obj).f3749a);
                    c0687m.f7168h = false;
                    b3 = O0.o.b(d4);
                    C0664G c0664g = c0687m.f7165e;
                    if (b3 <= 0.0f) {
                        EdgeEffect c2 = c0664g.c();
                        int Q3 = AbstractC0508a.Q(O0.o.b(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            c2.onAbsorb(Q3);
                        } else if (c2.isFinished()) {
                            c2.onAbsorb(Q3);
                        }
                    } else if (O0.o.b(d4) < 0.0f) {
                        EdgeEffect d5 = c0664g.d();
                        int i5 = -AbstractC0508a.Q(O0.o.b(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            d5.onAbsorb(i5);
                        } else if (d5.isFinished()) {
                            d5.onAbsorb(i5);
                        }
                    }
                    if (O0.o.c(d4) <= 0.0f) {
                        EdgeEffect e3 = c0664g.e();
                        int Q4 = AbstractC0508a.Q(O0.o.c(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            e3.onAbsorb(Q4);
                        } else if (e3.isFinished()) {
                            e3.onAbsorb(Q4);
                        }
                    } else if (O0.o.c(d4) < 0.0f) {
                        EdgeEffect b4 = c0664g.b();
                        int i6 = -AbstractC0508a.Q(O0.o.c(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            b4.onAbsorb(i6);
                        } else if (b4.isFinished()) {
                            b4.onAbsorb(i6);
                        }
                    }
                    if (d4 != 0) {
                        c0687m.g();
                    }
                    c0687m.d();
                    return yVar;
                }
                R1.a.e(obj);
                if (C0241f.e(this.f7169i)) {
                    c0684j.f7154k = 1;
                    c0789t0.getClass();
                    C0789t0 c0789t02 = new C0789t0(c0789t0.f7772k, c0684j);
                    c0789t02.f7771j = j3;
                    return c0789t02.q(yVar) == aVar ? aVar : yVar;
                }
                float b5 = O0.o.b(j3);
                C0664G c0664g2 = this.f7165e;
                if (b5 > 0.0f && C0664G.g(c0664g2.f7040f)) {
                    EdgeEffect c3 = c0664g2.c();
                    int Q5 = AbstractC0508a.Q(O0.o.b(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c3.onAbsorb(Q5);
                    } else if (c3.isFinished()) {
                        c3.onAbsorb(Q5);
                    }
                    f3 = O0.o.b(j3);
                } else if (O0.o.b(j3) >= 0.0f || !C0664G.g(c0664g2.f7041g)) {
                    f3 = 0.0f;
                } else {
                    EdgeEffect d6 = c0664g2.d();
                    int i7 = -AbstractC0508a.Q(O0.o.b(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d6.onAbsorb(i7);
                    } else if (d6.isFinished()) {
                        d6.onAbsorb(i7);
                    }
                    f3 = O0.o.b(j3);
                }
                if (O0.o.c(j3) > 0.0f && C0664G.g(c0664g2.f7038d)) {
                    EdgeEffect e4 = c0664g2.e();
                    int Q6 = AbstractC0508a.Q(O0.o.c(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e4.onAbsorb(Q6);
                    } else if (e4.isFinished()) {
                        e4.onAbsorb(Q6);
                    }
                    f4 = O0.o.c(j3);
                } else if (O0.o.c(j3) >= 0.0f || !C0664G.g(c0664g2.f7039e)) {
                    f4 = 0.0f;
                } else {
                    EdgeEffect b6 = c0664g2.b();
                    int i8 = -AbstractC0508a.Q(O0.o.c(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b6.onAbsorb(i8);
                    } else if (b6.isFinished()) {
                        b6.onAbsorb(i8);
                    }
                    f4 = O0.o.c(j3);
                }
                long g3 = AbstractC0235a.g(f3, f4);
                if (g3 != 0) {
                    g();
                }
                d3 = O0.o.d(j3, g3);
                c0684j.f7150g = this;
                c0684j.f7151h = d3;
                c0684j.f7154k = 2;
                c0789t0.getClass();
                C0789t0 c0789t03 = new C0789t0(c0789t0.f7772k, c0684j);
                c0789t03.f7771j = d3;
                obj = c0789t03.q(yVar);
                if (obj == aVar) {
                    return aVar;
                }
                c0687m = this;
                d4 = O0.o.d(d3, ((O0.o) obj).f3749a);
                c0687m.f7168h = false;
                b3 = O0.o.b(d4);
                C0664G c0664g3 = c0687m.f7165e;
                if (b3 <= 0.0f) {
                }
                if (O0.o.c(d4) <= 0.0f) {
                }
                if (d4 != 0) {
                }
                c0687m.d();
                return yVar;
            }
        }
        c0684j = new C0684j(this, (X1.c) dVar);
        Object obj2 = c0684j.f7152i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0684j.f7154k;
        R1.y yVar2 = R1.y.f4171a;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253 A[ADDED_TO_REGION] */
    @Override // n.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j3, int i3, A0.l lVar) {
        float h3;
        float j4;
        long e3;
        boolean z3;
        boolean z4;
        EdgeEffect b3;
        EdgeEffect e4;
        EdgeEffect d3;
        boolean z5;
        boolean z6;
        if (C0241f.e(this.f7169i)) {
            lVar.getClass();
            C0793v0 c0793v0 = (C0793v0) lVar.f134f;
            return new C0238c(C0793v0.a(c0793v0, c0793v0.f7785h, j3, c0793v0.f7784g)).f4722a;
        }
        boolean z7 = this.f7168h;
        boolean z8 = true;
        C0664G c0664g = this.f7165e;
        if (!z7) {
            if (C0664G.g(c0664g.f7040f)) {
                i(0L);
            }
            if (C0664G.g(c0664g.f7041g)) {
                j(0L);
            }
            if (C0664G.g(c0664g.f7038d)) {
                k(0L);
            }
            if (C0664G.g(c0664g.f7039e)) {
                h(0L);
            }
            this.f7168h = true;
        }
        if (C0238c.e(j3) != 0.0f) {
            if (C0664G.g(c0664g.f7038d)) {
                h3 = k(j3);
                if (!C0664G.g(c0664g.f7038d)) {
                    c0664g.e().onRelease();
                }
            } else if (C0664G.g(c0664g.f7039e)) {
                h3 = h(j3);
                if (!C0664G.g(c0664g.f7039e)) {
                    c0664g.b().onRelease();
                }
            }
            if (C0238c.d(j3) != 0.0f) {
                if (C0664G.g(c0664g.f7040f)) {
                    j4 = i(j3);
                    if (!C0664G.g(c0664g.f7040f)) {
                        c0664g.c().onRelease();
                    }
                } else if (C0664G.g(c0664g.f7041g)) {
                    j4 = j(j3);
                    if (!C0664G.g(c0664g.f7041g)) {
                        c0664g.d().onRelease();
                    }
                }
                e3 = l0.c.e(j4, h3);
                if (!C0238c.b(e3, 0L)) {
                    g();
                }
                long g3 = C0238c.g(j3, e3);
                lVar.getClass();
                C0793v0 c0793v02 = (C0793v0) lVar.f134f;
                long j5 = new C0238c(C0793v0.a(c0793v02, c0793v02.f7785h, g3, c0793v02.f7784g)).f4722a;
                long g4 = C0238c.g(g3, j5);
                if (i3 == 1) {
                    if (C0238c.d(g4) > 0.5f) {
                        i(g4);
                    } else {
                        if (C0238c.d(g4) >= -0.5f) {
                            z5 = false;
                            if (C0238c.e(g4) <= 0.5f) {
                                k(g4);
                            } else if (C0238c.e(g4) < -0.5f) {
                                h(g4);
                            } else {
                                z6 = false;
                                if (!z5 || z6) {
                                    z3 = true;
                                    if (C0664G.f(c0664g.f7040f) || C0238c.d(j3) >= 0.0f) {
                                        z4 = false;
                                    } else {
                                        EdgeEffect c2 = c0664g.c();
                                        float d4 = C0238c.d(j3);
                                        if (c2 instanceof C0673P) {
                                            C0673P c0673p = (C0673P) c2;
                                            float f3 = c0673p.f7066b + d4;
                                            c0673p.f7066b = f3;
                                            if (Math.abs(f3) > c0673p.f7065a) {
                                                c0673p.onRelease();
                                            }
                                        } else {
                                            c2.onRelease();
                                        }
                                        z4 = !C0664G.f(c0664g.f7040f);
                                    }
                                    if (C0664G.f(c0664g.f7041g) && C0238c.d(j3) > 0.0f) {
                                        d3 = c0664g.d();
                                        float d5 = C0238c.d(j3);
                                        if (d3 instanceof C0673P) {
                                            d3.onRelease();
                                        } else {
                                            C0673P c0673p2 = (C0673P) d3;
                                            float f4 = c0673p2.f7066b + d5;
                                            c0673p2.f7066b = f4;
                                            if (Math.abs(f4) > c0673p2.f7065a) {
                                                c0673p2.onRelease();
                                            }
                                        }
                                        z4 = (z4 && C0664G.f(c0664g.f7041g)) ? false : true;
                                    }
                                    if (C0664G.f(c0664g.f7038d) && C0238c.e(j3) < 0.0f) {
                                        e4 = c0664g.e();
                                        float e5 = C0238c.e(j3);
                                        if (e4 instanceof C0673P) {
                                            e4.onRelease();
                                        } else {
                                            C0673P c0673p3 = (C0673P) e4;
                                            float f5 = c0673p3.f7066b + e5;
                                            c0673p3.f7066b = f5;
                                            if (Math.abs(f5) > c0673p3.f7065a) {
                                                c0673p3.onRelease();
                                            }
                                        }
                                        z4 = (z4 && C0664G.f(c0664g.f7038d)) ? false : true;
                                    }
                                    if (C0664G.f(c0664g.f7039e) && C0238c.e(j3) > 0.0f) {
                                        b3 = c0664g.b();
                                        float e6 = C0238c.e(j3);
                                        if (b3 instanceof C0673P) {
                                            b3.onRelease();
                                        } else {
                                            C0673P c0673p4 = (C0673P) b3;
                                            float f6 = c0673p4.f7066b + e6;
                                            c0673p4.f7066b = f6;
                                            if (Math.abs(f6) > c0673p4.f7065a) {
                                                c0673p4.onRelease();
                                            }
                                        }
                                        z4 = (z4 && C0664G.f(c0664g.f7039e)) ? false : true;
                                    }
                                    if (!z4 && !z3) {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        g();
                                    }
                                    return C0238c.h(e3, j5);
                                }
                            }
                            z6 = true;
                            if (!z5) {
                            }
                            z3 = true;
                            if (C0664G.f(c0664g.f7040f)) {
                            }
                            z4 = false;
                            if (C0664G.f(c0664g.f7041g)) {
                                d3 = c0664g.d();
                                float d52 = C0238c.d(j3);
                                if (d3 instanceof C0673P) {
                                }
                                if (z4) {
                                }
                            }
                            if (C0664G.f(c0664g.f7038d)) {
                                e4 = c0664g.e();
                                float e52 = C0238c.e(j3);
                                if (e4 instanceof C0673P) {
                                }
                                if (z4) {
                                }
                            }
                            if (C0664G.f(c0664g.f7039e)) {
                                b3 = c0664g.b();
                                float e62 = C0238c.e(j3);
                                if (b3 instanceof C0673P) {
                                }
                                if (z4) {
                                }
                            }
                            if (!z4) {
                                z8 = false;
                            }
                            if (z8) {
                            }
                            return C0238c.h(e3, j5);
                        }
                        j(g4);
                    }
                    z5 = true;
                    if (C0238c.e(g4) <= 0.5f) {
                    }
                    z6 = true;
                    if (!z5) {
                    }
                    z3 = true;
                    if (C0664G.f(c0664g.f7040f)) {
                    }
                    z4 = false;
                    if (C0664G.f(c0664g.f7041g)) {
                    }
                    if (C0664G.f(c0664g.f7038d)) {
                    }
                    if (C0664G.f(c0664g.f7039e)) {
                    }
                    if (!z4) {
                    }
                    if (z8) {
                    }
                    return C0238c.h(e3, j5);
                }
                z3 = false;
                if (C0664G.f(c0664g.f7040f)) {
                }
                z4 = false;
                if (C0664G.f(c0664g.f7041g)) {
                }
                if (C0664G.f(c0664g.f7038d)) {
                }
                if (C0664G.f(c0664g.f7039e)) {
                }
                if (!z4) {
                }
                if (z8) {
                }
                return C0238c.h(e3, j5);
            }
            j4 = 0.0f;
            e3 = l0.c.e(j4, h3);
            if (!C0238c.b(e3, 0L)) {
            }
            long g32 = C0238c.g(j3, e3);
            lVar.getClass();
            C0793v0 c0793v022 = (C0793v0) lVar.f134f;
            long j52 = new C0238c(C0793v0.a(c0793v022, c0793v022.f7785h, g32, c0793v022.f7784g)).f4722a;
            long g42 = C0238c.g(g32, j52);
            if (i3 == 1) {
            }
            z3 = false;
            if (C0664G.f(c0664g.f7040f)) {
            }
            z4 = false;
            if (C0664G.f(c0664g.f7041g)) {
            }
            if (C0664G.f(c0664g.f7038d)) {
            }
            if (C0664G.f(c0664g.f7039e)) {
            }
            if (!z4) {
            }
            if (z8) {
            }
            return C0238c.h(e3, j52);
        }
        h3 = 0.0f;
        if (C0238c.d(j3) != 0.0f) {
        }
        j4 = 0.0f;
        e3 = l0.c.e(j4, h3);
        if (!C0238c.b(e3, 0L)) {
        }
        long g322 = C0238c.g(j3, e3);
        lVar.getClass();
        C0793v0 c0793v0222 = (C0793v0) lVar.f134f;
        long j522 = new C0238c(C0793v0.a(c0793v0222, c0793v0222.f7785h, g322, c0793v0222.f7784g)).f4722a;
        long g422 = C0238c.g(g322, j522);
        if (i3 == 1) {
        }
        z3 = false;
        if (C0664G.f(c0664g.f7040f)) {
        }
        z4 = false;
        if (C0664G.f(c0664g.f7041g)) {
        }
        if (C0664G.f(c0664g.f7038d)) {
        }
        if (C0664G.f(c0664g.f7039e)) {
        }
        if (!z4) {
        }
        if (z8) {
        }
        return C0238c.h(e3, j522);
    }

    public final void d() {
        boolean z3;
        C0664G c0664g = this.f7165e;
        EdgeEffect edgeEffect = c0664g.f7038d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = c0664g.f7039e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 = edgeEffect2.isFinished() || z3;
        }
        EdgeEffect edgeEffect3 = c0664g.f7040f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = edgeEffect3.isFinished() || z3;
        }
        EdgeEffect edgeEffect4 = c0664g.f7041g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 = edgeEffect4.isFinished() || z3;
        }
        if (z3) {
            g();
        }
    }

    public final long e() {
        C0238c c0238c = this.f7164d;
        long w2 = c0238c != null ? c0238c.f4722a : AbstractC0235a.w(this.f7169i);
        return l0.c.e(C0238c.d(w2) / C0241f.d(this.f7169i), C0238c.e(w2) / C0241f.b(this.f7169i));
    }

    @Override // n.l0
    public final boolean f() {
        C0664G c0664g = this.f7165e;
        EdgeEffect edgeEffect = c0664g.f7038d;
        C0688n c0688n = C0688n.f7172a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0688n.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c0664g.f7039e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0688n.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c0664g.f7040f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0688n.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c0664g.f7041g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c0688n.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void g() {
        if (this.f7167g) {
            this.f7166f.setValue(R1.y.f4171a);
        }
    }

    public final float h(long j3) {
        float d3 = C0238c.d(e());
        float e3 = C0238c.e(j3) / C0241f.b(this.f7169i);
        EdgeEffect b3 = this.f7165e.b();
        float f3 = -e3;
        float f4 = 1 - d3;
        int i3 = Build.VERSION.SDK_INT;
        C0688n c0688n = C0688n.f7172a;
        if (i3 >= 31) {
            f3 = c0688n.c(b3, f3, f4);
        } else {
            b3.onPull(f3, f4);
        }
        return (i3 >= 31 ? c0688n.b(b3) : 0.0f) == 0.0f ? C0241f.b(this.f7169i) * (-f3) : C0238c.e(j3);
    }

    public final float i(long j3) {
        float e3 = C0238c.e(e());
        float d3 = C0238c.d(j3) / C0241f.d(this.f7169i);
        EdgeEffect c2 = this.f7165e.c();
        float f3 = 1 - e3;
        int i3 = Build.VERSION.SDK_INT;
        C0688n c0688n = C0688n.f7172a;
        if (i3 >= 31) {
            d3 = c0688n.c(c2, d3, f3);
        } else {
            c2.onPull(d3, f3);
        }
        return (i3 >= 31 ? c0688n.b(c2) : 0.0f) == 0.0f ? C0241f.d(this.f7169i) * d3 : C0238c.d(j3);
    }

    public final float j(long j3) {
        float e3 = C0238c.e(e());
        float d3 = C0238c.d(j3) / C0241f.d(this.f7169i);
        EdgeEffect d4 = this.f7165e.d();
        float f3 = -d3;
        int i3 = Build.VERSION.SDK_INT;
        C0688n c0688n = C0688n.f7172a;
        if (i3 >= 31) {
            f3 = c0688n.c(d4, f3, e3);
        } else {
            d4.onPull(f3, e3);
        }
        return (i3 >= 31 ? c0688n.b(d4) : 0.0f) == 0.0f ? C0241f.d(this.f7169i) * (-f3) : C0238c.d(j3);
    }

    public final float k(long j3) {
        float d3 = C0238c.d(e());
        float e3 = C0238c.e(j3) / C0241f.b(this.f7169i);
        EdgeEffect e4 = this.f7165e.e();
        int i3 = Build.VERSION.SDK_INT;
        C0688n c0688n = C0688n.f7172a;
        if (i3 >= 31) {
            e3 = c0688n.c(e4, e3, d3);
        } else {
            e4.onPull(e3, d3);
        }
        return (i3 >= 31 ? c0688n.b(e4) : 0.0f) == 0.0f ? C0241f.b(this.f7169i) * e3 : C0238c.e(j3);
    }

    public final void l(long j3) {
        boolean a3 = C0241f.a(this.f7169i, 0L);
        boolean a4 = C0241f.a(j3, this.f7169i);
        this.f7169i = j3;
        if (!a4) {
            long d3 = O2.d.d(AbstractC0508a.Q(C0241f.d(j3)), AbstractC0508a.Q(C0241f.b(j3)));
            C0664G c0664g = this.f7165e;
            c0664g.f7037c = d3;
            EdgeEffect edgeEffect = c0664g.f7038d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (d3 >> 32), (int) (d3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c0664g.f7039e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (d3 >> 32), (int) (d3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c0664g.f7040f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (d3 & 4294967295L), (int) (d3 >> 32));
            }
            EdgeEffect edgeEffect4 = c0664g.f7041g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (d3 & 4294967295L), (int) (d3 >> 32));
            }
            EdgeEffect edgeEffect5 = c0664g.f7042h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (d3 >> 32), (int) (d3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c0664g.f7043i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (d3 >> 32), (int) (d3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c0664g.f7044j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (d3 & 4294967295L), (int) (d3 >> 32));
            }
            EdgeEffect edgeEffect8 = c0664g.f7045k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (d3 & 4294967295L), (int) (d3 >> 32));
            }
        }
        if (a3 || a4) {
            return;
        }
        g();
        d();
    }
}
