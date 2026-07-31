package n;

import F.C0047j0;
import I.C0089d;
import I.C0102j0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b0.AbstractC0259J;
import o.m0;
import o.o0;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658m implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public a0.c f6120d;

    /* renamed from: e, reason: collision with root package name */
    public final C0634E f6121e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f6122f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6123g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6124h;

    /* renamed from: i, reason: collision with root package name */
    public long f6125i;

    /* renamed from: j, reason: collision with root package name */
    public n0.l f6126j;

    /* renamed from: k, reason: collision with root package name */
    public final U.l f6127k;

    public C0658m(Context context, c0 c0Var) {
        C0634E c0634e = new C0634E(context, AbstractC0259J.E(c0Var.f6067a));
        this.f6121e = c0634e;
        L1.z zVar = L1.z.f2729a;
        this.f6122f = C0089d.J(zVar, I.X.f2225f);
        this.f6123g = true;
        this.f6125i = 0L;
        C0657l c0657l = new C0657l(this, null);
        n0.g gVar = n0.r.f6252a;
        this.f6127k = new SuspendPointerInputElement(zVar, null, c0657l, 6).e(Build.VERSION.SDK_INT >= 31 ? new C0633D(this, c0634e) : new C0633D(this, c0634e, c0Var));
    }

    public final void a() {
        boolean z3;
        C0634E c0634e = this.f6121e;
        EdgeEffect edgeEffect = c0634e.f5993d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = c0634e.f5994e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 = edgeEffect2.isFinished() || z3;
        }
        EdgeEffect edgeEffect3 = c0634e.f5995f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = edgeEffect3.isFinished() || z3;
        }
        EdgeEffect edgeEffect4 = c0634e.f5996g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 = edgeEffect4.isFinished() || z3;
        }
        if (z3) {
            g();
        }
    }

    @Override // n.e0
    public final U.l b() {
        return this.f6127k;
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
    @Override // n.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j3, int i3, C0047j0 c0047j0) {
        float h3;
        float j4;
        long f3;
        boolean z3;
        boolean z4;
        EdgeEffect b2;
        EdgeEffect e3;
        EdgeEffect d3;
        boolean z5;
        boolean z6;
        if (a0.f.e(this.f6125i)) {
            c0047j0.getClass();
            o0 o0Var = (o0) c0047j0.f1274f;
            return new a0.c(o0.a(o0Var, o0Var.f6599h, j3, o0Var.f6598g)).f3489a;
        }
        boolean z7 = this.f6124h;
        boolean z8 = true;
        C0634E c0634e = this.f6121e;
        if (!z7) {
            if (C0634E.g(c0634e.f5995f)) {
                i(0L);
            }
            if (C0634E.g(c0634e.f5996g)) {
                j(0L);
            }
            if (C0634E.g(c0634e.f5993d)) {
                k(0L);
            }
            if (C0634E.g(c0634e.f5994e)) {
                h(0L);
            }
            this.f6124h = true;
        }
        if (a0.c.e(j3) != 0.0f) {
            if (C0634E.g(c0634e.f5993d)) {
                h3 = k(j3);
                if (!C0634E.g(c0634e.f5993d)) {
                    c0634e.e().onRelease();
                }
            } else if (C0634E.g(c0634e.f5994e)) {
                h3 = h(j3);
                if (!C0634E.g(c0634e.f5994e)) {
                    c0634e.b().onRelease();
                }
            }
            if (a0.c.d(j3) != 0.0f) {
                if (C0634E.g(c0634e.f5995f)) {
                    j4 = i(j3);
                    if (!C0634E.g(c0634e.f5995f)) {
                        c0634e.c().onRelease();
                    }
                } else if (C0634E.g(c0634e.f5996g)) {
                    j4 = j(j3);
                    if (!C0634E.g(c0634e.f5996g)) {
                        c0634e.d().onRelease();
                    }
                }
                f3 = I2.l.f(j4, h3);
                if (!a0.c.b(f3, 0L)) {
                    g();
                }
                long g3 = a0.c.g(j3, f3);
                c0047j0.getClass();
                o0 o0Var2 = (o0) c0047j0.f1274f;
                long j5 = new a0.c(o0.a(o0Var2, o0Var2.f6599h, g3, o0Var2.f6598g)).f3489a;
                long g4 = a0.c.g(g3, j5);
                if (i3 == 1) {
                    if (a0.c.d(g4) > 0.5f) {
                        i(g4);
                    } else {
                        if (a0.c.d(g4) >= -0.5f) {
                            z5 = false;
                            if (a0.c.e(g4) <= 0.5f) {
                                k(g4);
                            } else if (a0.c.e(g4) < -0.5f) {
                                h(g4);
                            } else {
                                z6 = false;
                                if (!z5 || z6) {
                                    z3 = true;
                                    if (C0634E.f(c0634e.f5995f) || a0.c.d(j3) >= 0.0f) {
                                        z4 = false;
                                    } else {
                                        EdgeEffect c3 = c0634e.c();
                                        float d4 = a0.c.d(j3);
                                        if (c3 instanceof C0643N) {
                                            C0643N c0643n = (C0643N) c3;
                                            float f4 = c0643n.f6021b + d4;
                                            c0643n.f6021b = f4;
                                            if (Math.abs(f4) > c0643n.f6020a) {
                                                c0643n.onRelease();
                                            }
                                        } else {
                                            c3.onRelease();
                                        }
                                        z4 = !C0634E.f(c0634e.f5995f);
                                    }
                                    if (C0634E.f(c0634e.f5996g) && a0.c.d(j3) > 0.0f) {
                                        d3 = c0634e.d();
                                        float d5 = a0.c.d(j3);
                                        if (d3 instanceof C0643N) {
                                            d3.onRelease();
                                        } else {
                                            C0643N c0643n2 = (C0643N) d3;
                                            float f5 = c0643n2.f6021b + d5;
                                            c0643n2.f6021b = f5;
                                            if (Math.abs(f5) > c0643n2.f6020a) {
                                                c0643n2.onRelease();
                                            }
                                        }
                                        z4 = (z4 && C0634E.f(c0634e.f5996g)) ? false : true;
                                    }
                                    if (C0634E.f(c0634e.f5993d) && a0.c.e(j3) < 0.0f) {
                                        e3 = c0634e.e();
                                        float e4 = a0.c.e(j3);
                                        if (e3 instanceof C0643N) {
                                            e3.onRelease();
                                        } else {
                                            C0643N c0643n3 = (C0643N) e3;
                                            float f6 = c0643n3.f6021b + e4;
                                            c0643n3.f6021b = f6;
                                            if (Math.abs(f6) > c0643n3.f6020a) {
                                                c0643n3.onRelease();
                                            }
                                        }
                                        z4 = (z4 && C0634E.f(c0634e.f5993d)) ? false : true;
                                    }
                                    if (C0634E.f(c0634e.f5994e) && a0.c.e(j3) > 0.0f) {
                                        b2 = c0634e.b();
                                        float e5 = a0.c.e(j3);
                                        if (b2 instanceof C0643N) {
                                            b2.onRelease();
                                        } else {
                                            C0643N c0643n4 = (C0643N) b2;
                                            float f7 = c0643n4.f6021b + e5;
                                            c0643n4.f6021b = f7;
                                            if (Math.abs(f7) > c0643n4.f6020a) {
                                                c0643n4.onRelease();
                                            }
                                        }
                                        z4 = (z4 && C0634E.f(c0634e.f5994e)) ? false : true;
                                    }
                                    if (!z4 && !z3) {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        g();
                                    }
                                    return a0.c.h(f3, j5);
                                }
                            }
                            z6 = true;
                            if (!z5) {
                            }
                            z3 = true;
                            if (C0634E.f(c0634e.f5995f)) {
                            }
                            z4 = false;
                            if (C0634E.f(c0634e.f5996g)) {
                                d3 = c0634e.d();
                                float d52 = a0.c.d(j3);
                                if (d3 instanceof C0643N) {
                                }
                                if (z4) {
                                }
                            }
                            if (C0634E.f(c0634e.f5993d)) {
                                e3 = c0634e.e();
                                float e42 = a0.c.e(j3);
                                if (e3 instanceof C0643N) {
                                }
                                if (z4) {
                                }
                            }
                            if (C0634E.f(c0634e.f5994e)) {
                                b2 = c0634e.b();
                                float e52 = a0.c.e(j3);
                                if (b2 instanceof C0643N) {
                                }
                                if (z4) {
                                }
                            }
                            if (!z4) {
                                z8 = false;
                            }
                            if (z8) {
                            }
                            return a0.c.h(f3, j5);
                        }
                        j(g4);
                    }
                    z5 = true;
                    if (a0.c.e(g4) <= 0.5f) {
                    }
                    z6 = true;
                    if (!z5) {
                    }
                    z3 = true;
                    if (C0634E.f(c0634e.f5995f)) {
                    }
                    z4 = false;
                    if (C0634E.f(c0634e.f5996g)) {
                    }
                    if (C0634E.f(c0634e.f5993d)) {
                    }
                    if (C0634E.f(c0634e.f5994e)) {
                    }
                    if (!z4) {
                    }
                    if (z8) {
                    }
                    return a0.c.h(f3, j5);
                }
                z3 = false;
                if (C0634E.f(c0634e.f5995f)) {
                }
                z4 = false;
                if (C0634E.f(c0634e.f5996g)) {
                }
                if (C0634E.f(c0634e.f5993d)) {
                }
                if (C0634E.f(c0634e.f5994e)) {
                }
                if (!z4) {
                }
                if (z8) {
                }
                return a0.c.h(f3, j5);
            }
            j4 = 0.0f;
            f3 = I2.l.f(j4, h3);
            if (!a0.c.b(f3, 0L)) {
            }
            long g32 = a0.c.g(j3, f3);
            c0047j0.getClass();
            o0 o0Var22 = (o0) c0047j0.f1274f;
            long j52 = new a0.c(o0.a(o0Var22, o0Var22.f6599h, g32, o0Var22.f6598g)).f3489a;
            long g42 = a0.c.g(g32, j52);
            if (i3 == 1) {
            }
            z3 = false;
            if (C0634E.f(c0634e.f5995f)) {
            }
            z4 = false;
            if (C0634E.f(c0634e.f5996g)) {
            }
            if (C0634E.f(c0634e.f5993d)) {
            }
            if (C0634E.f(c0634e.f5994e)) {
            }
            if (!z4) {
            }
            if (z8) {
            }
            return a0.c.h(f3, j52);
        }
        h3 = 0.0f;
        if (a0.c.d(j3) != 0.0f) {
        }
        j4 = 0.0f;
        f3 = I2.l.f(j4, h3);
        if (!a0.c.b(f3, 0L)) {
        }
        long g322 = a0.c.g(j3, f3);
        c0047j0.getClass();
        o0 o0Var222 = (o0) c0047j0.f1274f;
        long j522 = new a0.c(o0.a(o0Var222, o0Var222.f6599h, g322, o0Var222.f6598g)).f3489a;
        long g422 = a0.c.g(g322, j522);
        if (i3 == 1) {
        }
        z3 = false;
        if (C0634E.f(c0634e.f5995f)) {
        }
        z4 = false;
        if (C0634E.f(c0634e.f5996g)) {
        }
        if (C0634E.f(c0634e.f5993d)) {
        }
        if (C0634E.f(c0634e.f5994e)) {
        }
        if (!z4) {
        }
        if (z8) {
        }
        return a0.c.h(f3, j522);
    }

    public final long d() {
        a0.c cVar = this.f6120d;
        long z3 = cVar != null ? cVar.f3489a : I2.d.z(this.f6125i);
        return I2.l.f(a0.c.d(z3) / a0.f.d(this.f6125i), a0.c.e(z3) / a0.f.b(this.f6125i));
    }

    @Override // n.e0
    public final boolean e() {
        C0634E c0634e = this.f6121e;
        EdgeEffect edgeEffect = c0634e.f5993d;
        C0659n c0659n = C0659n.f6128a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0659n.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c0634e.f5994e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0659n.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c0634e.f5995f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0659n.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c0634e.f5996g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c0659n.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // n.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j3, m0 m0Var, P1.d dVar) {
        C0655j c0655j;
        int i3;
        float f3;
        float f4;
        long d3;
        C0658m c0658m;
        long d4;
        float b2;
        if (dVar instanceof C0655j) {
            c0655j = (C0655j) dVar;
            int i4 = c0655j.f6099h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0655j.f6099h = i4 - Integer.MIN_VALUE;
                Object obj = c0655j.f6097f;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0655j.f6099h;
                L1.z zVar = L1.z.f2729a;
                if (i3 == 0) {
                    if (i3 == 1) {
                        I2.l.Q(obj);
                    }
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d3 = c0655j.f6096e;
                    c0658m = c0655j.f6095d;
                    I2.l.Q(obj);
                    d4 = M0.n.d(d3, ((M0.n) obj).f2783a);
                    c0658m.f6124h = false;
                    b2 = M0.n.b(d4);
                    C0634E c0634e = c0658m.f6121e;
                    if (b2 <= 0.0f) {
                        EdgeEffect c3 = c0634e.c();
                        int M3 = M1.B.M(M0.n.b(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            c3.onAbsorb(M3);
                        } else if (c3.isFinished()) {
                            c3.onAbsorb(M3);
                        }
                    } else if (M0.n.b(d4) < 0.0f) {
                        EdgeEffect d5 = c0634e.d();
                        int i5 = -M1.B.M(M0.n.b(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            d5.onAbsorb(i5);
                        } else if (d5.isFinished()) {
                            d5.onAbsorb(i5);
                        }
                    }
                    if (M0.n.c(d4) <= 0.0f) {
                        EdgeEffect e3 = c0634e.e();
                        int M4 = M1.B.M(M0.n.c(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            e3.onAbsorb(M4);
                        } else if (e3.isFinished()) {
                            e3.onAbsorb(M4);
                        }
                    } else if (M0.n.c(d4) < 0.0f) {
                        EdgeEffect b3 = c0634e.b();
                        int i6 = -M1.B.M(M0.n.c(d4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            b3.onAbsorb(i6);
                        } else if (b3.isFinished()) {
                            b3.onAbsorb(i6);
                        }
                    }
                    if (d4 != 0) {
                        c0658m.g();
                    }
                    c0658m.a();
                    return zVar;
                }
                I2.l.Q(obj);
                if (a0.f.e(this.f6125i)) {
                    c0655j.f6099h = 1;
                    m0Var.getClass();
                    m0 m0Var2 = new m0(m0Var.f6579h, c0655j);
                    m0Var2.f6578g = j3;
                    return m0Var2.invokeSuspend(zVar) == aVar ? aVar : zVar;
                }
                float b4 = M0.n.b(j3);
                C0634E c0634e2 = this.f6121e;
                if (b4 > 0.0f && C0634E.g(c0634e2.f5995f)) {
                    EdgeEffect c4 = c0634e2.c();
                    int M5 = M1.B.M(M0.n.b(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c4.onAbsorb(M5);
                    } else if (c4.isFinished()) {
                        c4.onAbsorb(M5);
                    }
                    f3 = M0.n.b(j3);
                } else if (M0.n.b(j3) >= 0.0f || !C0634E.g(c0634e2.f5996g)) {
                    f3 = 0.0f;
                } else {
                    EdgeEffect d6 = c0634e2.d();
                    int i7 = -M1.B.M(M0.n.b(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d6.onAbsorb(i7);
                    } else if (d6.isFinished()) {
                        d6.onAbsorb(i7);
                    }
                    f3 = M0.n.b(j3);
                }
                if (M0.n.c(j3) > 0.0f && C0634E.g(c0634e2.f5993d)) {
                    EdgeEffect e4 = c0634e2.e();
                    int M6 = M1.B.M(M0.n.c(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e4.onAbsorb(M6);
                    } else if (e4.isFinished()) {
                        e4.onAbsorb(M6);
                    }
                    f4 = M0.n.c(j3);
                } else if (M0.n.c(j3) >= 0.0f || !C0634E.g(c0634e2.f5994e)) {
                    f4 = 0.0f;
                } else {
                    EdgeEffect b5 = c0634e2.b();
                    int i8 = -M1.B.M(M0.n.c(j3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b5.onAbsorb(i8);
                    } else if (b5.isFinished()) {
                        b5.onAbsorb(i8);
                    }
                    f4 = M0.n.c(j3);
                }
                long j4 = M1.B.j(f3, f4);
                if (j4 != 0) {
                    g();
                }
                d3 = M0.n.d(j3, j4);
                c0655j.f6095d = this;
                c0655j.f6096e = d3;
                c0655j.f6099h = 2;
                m0Var.getClass();
                m0 m0Var3 = new m0(m0Var.f6579h, c0655j);
                m0Var3.f6578g = d3;
                obj = m0Var3.invokeSuspend(zVar);
                if (obj == aVar) {
                    return aVar;
                }
                c0658m = this;
                d4 = M0.n.d(d3, ((M0.n) obj).f2783a);
                c0658m.f6124h = false;
                b2 = M0.n.b(d4);
                C0634E c0634e3 = c0658m.f6121e;
                if (b2 <= 0.0f) {
                }
                if (M0.n.c(d4) <= 0.0f) {
                }
                if (d4 != 0) {
                }
                c0658m.a();
                return zVar;
            }
        }
        c0655j = new C0655j(this, (R1.c) dVar);
        Object obj2 = c0655j.f6097f;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0655j.f6099h;
        L1.z zVar2 = L1.z.f2729a;
        if (i3 == 0) {
        }
    }

    public final void g() {
        if (this.f6123g) {
            this.f6122f.setValue(L1.z.f2729a);
        }
    }

    public final float h(long j3) {
        float d3 = a0.c.d(d());
        float e3 = a0.c.e(j3) / a0.f.b(this.f6125i);
        EdgeEffect b2 = this.f6121e.b();
        float f3 = -e3;
        float f4 = 1 - d3;
        int i3 = Build.VERSION.SDK_INT;
        C0659n c0659n = C0659n.f6128a;
        if (i3 >= 31) {
            f3 = c0659n.c(b2, f3, f4);
        } else {
            b2.onPull(f3, f4);
        }
        return (i3 >= 31 ? c0659n.b(b2) : 0.0f) == 0.0f ? a0.f.b(this.f6125i) * (-f3) : a0.c.e(j3);
    }

    public final float i(long j3) {
        float e3 = a0.c.e(d());
        float d3 = a0.c.d(j3) / a0.f.d(this.f6125i);
        EdgeEffect c3 = this.f6121e.c();
        float f3 = 1 - e3;
        int i3 = Build.VERSION.SDK_INT;
        C0659n c0659n = C0659n.f6128a;
        if (i3 >= 31) {
            d3 = c0659n.c(c3, d3, f3);
        } else {
            c3.onPull(d3, f3);
        }
        return (i3 >= 31 ? c0659n.b(c3) : 0.0f) == 0.0f ? a0.f.d(this.f6125i) * d3 : a0.c.d(j3);
    }

    public final float j(long j3) {
        float e3 = a0.c.e(d());
        float d3 = a0.c.d(j3) / a0.f.d(this.f6125i);
        EdgeEffect d4 = this.f6121e.d();
        float f3 = -d3;
        int i3 = Build.VERSION.SDK_INT;
        C0659n c0659n = C0659n.f6128a;
        if (i3 >= 31) {
            f3 = c0659n.c(d4, f3, e3);
        } else {
            d4.onPull(f3, e3);
        }
        return (i3 >= 31 ? c0659n.b(d4) : 0.0f) == 0.0f ? a0.f.d(this.f6125i) * (-f3) : a0.c.d(j3);
    }

    public final float k(long j3) {
        float d3 = a0.c.d(d());
        float e3 = a0.c.e(j3) / a0.f.b(this.f6125i);
        EdgeEffect e4 = this.f6121e.e();
        int i3 = Build.VERSION.SDK_INT;
        C0659n c0659n = C0659n.f6128a;
        if (i3 >= 31) {
            e3 = c0659n.c(e4, e3, d3);
        } else {
            e4.onPull(e3, d3);
        }
        return (i3 >= 31 ? c0659n.b(e4) : 0.0f) == 0.0f ? a0.f.b(this.f6125i) * e3 : a0.c.e(j3);
    }

    public final void l(long j3) {
        boolean a3 = a0.f.a(this.f6125i, 0L);
        boolean a4 = a0.f.a(j3, this.f6125i);
        this.f6125i = j3;
        if (!a4) {
            long e3 = I2.l.e(M1.B.M(a0.f.d(j3)), M1.B.M(a0.f.b(j3)));
            C0634E c0634e = this.f6121e;
            c0634e.f5992c = e3;
            EdgeEffect edgeEffect = c0634e.f5993d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c0634e.f5994e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c0634e.f5995f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
            EdgeEffect edgeEffect4 = c0634e.f5996g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
            EdgeEffect edgeEffect5 = c0634e.f5997h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c0634e.f5998i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c0634e.f5999j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
            EdgeEffect edgeEffect8 = c0634e.f6000k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
        }
        if (a3 || a4) {
            return;
        }
        g();
        a();
    }
}
