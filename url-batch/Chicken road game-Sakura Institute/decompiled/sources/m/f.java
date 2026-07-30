package m;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements w0 {

    /* renamed from: f, reason: collision with root package name */
    public y0.c f6141f;

    /* renamed from: g, reason: collision with root package name */
    public final w f6142g;

    /* renamed from: h, reason: collision with root package name */
    public final g0.g1 f6143h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6144i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6145j;

    /* renamed from: k, reason: collision with root package name */
    public long f6146k;

    /* renamed from: l, reason: collision with root package name */
    public l1.u f6147l;

    /* renamed from: m, reason: collision with root package name */
    public final s0.o f6148m;

    public f(Context context, u0 u0Var) {
        w wVar = new w(context, z0.l0.w(u0Var.f6264a));
        this.f6142g = wVar;
        g0.t0 t0Var = g0.t0.f3900h;
        d6.z zVar = d6.z.f2639a;
        this.f6143h = g0.d.J(zVar, t0Var);
        this.f6144i = true;
        this.f6146k = 0L;
        this.f6148m = l1.a0.a(s0.l.f8103a, zVar, new a0.e0(this, (h6.d) null, 18)).j(Build.VERSION.SDK_INT >= 31 ? new v(this, wVar) : new v(this, wVar, u0Var));
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
    @Override // m.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j8, int i7, c1.a aVar) {
        float h3;
        float j9;
        long a3;
        boolean z8;
        boolean z9;
        EdgeEffect b9;
        EdgeEffect e9;
        EdgeEffect d8;
        boolean z10;
        boolean z11;
        if (y0.f.e(this.f6146k)) {
            aVar.getClass();
            o.f1 f1Var = (o.f1) aVar.f1524h;
            return new y0.c(o.f1.a(f1Var, f1Var.f6616h, j8, f1Var.f6615g)).f9778a;
        }
        boolean z12 = this.f6145j;
        boolean z13 = true;
        w wVar = this.f6142g;
        if (!z12) {
            if (w.g(wVar.f6276f)) {
                i(0L);
            }
            if (w.g(wVar.f6277g)) {
                j(0L);
            }
            if (w.g(wVar.f6274d)) {
                k(0L);
            }
            if (w.g(wVar.f6275e)) {
                h(0L);
            }
            this.f6145j = true;
        }
        if (y0.c.e(j8) != 0.0f) {
            if (w.g(wVar.f6274d)) {
                h3 = k(j8);
                if (!w.g(wVar.f6274d)) {
                    wVar.e().onRelease();
                }
            } else if (w.g(wVar.f6275e)) {
                h3 = h(j8);
                if (!w.g(wVar.f6275e)) {
                    wVar.b().onRelease();
                }
            }
            if (y0.c.d(j8) != 0.0f) {
                if (w.g(wVar.f6276f)) {
                    j9 = i(j8);
                    if (!w.g(wVar.f6276f)) {
                        wVar.c().onRelease();
                    }
                } else if (w.g(wVar.f6277g)) {
                    j9 = j(j8);
                    if (!w.g(wVar.f6277g)) {
                        wVar.d().onRelease();
                    }
                }
                a3 = u3.r.a(j9, h3);
                if (!y0.c.b(a3, 0L)) {
                    g();
                }
                long g9 = y0.c.g(j8, a3);
                aVar.getClass();
                o.f1 f1Var2 = (o.f1) aVar.f1524h;
                long j10 = new y0.c(o.f1.a(f1Var2, f1Var2.f6616h, g9, f1Var2.f6615g)).f9778a;
                long g10 = y0.c.g(g9, j10);
                if (i7 == 1) {
                    if (y0.c.d(g10) > 0.5f) {
                        i(g10);
                    } else {
                        if (y0.c.d(g10) >= -0.5f) {
                            z10 = false;
                            if (y0.c.e(g10) <= 0.5f) {
                                k(g10);
                            } else if (y0.c.e(g10) < -0.5f) {
                                h(g10);
                            } else {
                                z11 = false;
                                if (!z10 || z11) {
                                    z8 = true;
                                    if (w.f(wVar.f6276f) || y0.c.d(j8) >= 0.0f) {
                                        z9 = false;
                                    } else {
                                        EdgeEffect c4 = wVar.c();
                                        float d9 = y0.c.d(j8);
                                        if (c4 instanceof d0) {
                                            d0 d0Var = (d0) c4;
                                            float f9 = d0Var.f6131b + d9;
                                            d0Var.f6131b = f9;
                                            if (Math.abs(f9) > d0Var.f6130a) {
                                                d0Var.onRelease();
                                            }
                                        } else {
                                            c4.onRelease();
                                        }
                                        z9 = !w.f(wVar.f6276f);
                                    }
                                    if (w.f(wVar.f6277g) && y0.c.d(j8) > 0.0f) {
                                        d8 = wVar.d();
                                        float d10 = y0.c.d(j8);
                                        if (d8 instanceof d0) {
                                            d8.onRelease();
                                        } else {
                                            d0 d0Var2 = (d0) d8;
                                            float f10 = d0Var2.f6131b + d10;
                                            d0Var2.f6131b = f10;
                                            if (Math.abs(f10) > d0Var2.f6130a) {
                                                d0Var2.onRelease();
                                            }
                                        }
                                        z9 = (z9 && w.f(wVar.f6277g)) ? false : true;
                                    }
                                    if (w.f(wVar.f6274d) && y0.c.e(j8) < 0.0f) {
                                        e9 = wVar.e();
                                        float e10 = y0.c.e(j8);
                                        if (e9 instanceof d0) {
                                            e9.onRelease();
                                        } else {
                                            d0 d0Var3 = (d0) e9;
                                            float f11 = d0Var3.f6131b + e10;
                                            d0Var3.f6131b = f11;
                                            if (Math.abs(f11) > d0Var3.f6130a) {
                                                d0Var3.onRelease();
                                            }
                                        }
                                        z9 = (z9 && w.f(wVar.f6274d)) ? false : true;
                                    }
                                    if (w.f(wVar.f6275e) && y0.c.e(j8) > 0.0f) {
                                        b9 = wVar.b();
                                        float e11 = y0.c.e(j8);
                                        if (b9 instanceof d0) {
                                            b9.onRelease();
                                        } else {
                                            d0 d0Var4 = (d0) b9;
                                            float f12 = d0Var4.f6131b + e11;
                                            d0Var4.f6131b = f12;
                                            if (Math.abs(f12) > d0Var4.f6130a) {
                                                d0Var4.onRelease();
                                            }
                                        }
                                        z9 = (z9 && w.f(wVar.f6275e)) ? false : true;
                                    }
                                    if (!z9 && !z8) {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        g();
                                    }
                                    return y0.c.h(a3, j10);
                                }
                            }
                            z11 = true;
                            if (!z10) {
                            }
                            z8 = true;
                            if (w.f(wVar.f6276f)) {
                            }
                            z9 = false;
                            if (w.f(wVar.f6277g)) {
                                d8 = wVar.d();
                                float d102 = y0.c.d(j8);
                                if (d8 instanceof d0) {
                                }
                                if (z9) {
                                }
                            }
                            if (w.f(wVar.f6274d)) {
                                e9 = wVar.e();
                                float e102 = y0.c.e(j8);
                                if (e9 instanceof d0) {
                                }
                                if (z9) {
                                }
                            }
                            if (w.f(wVar.f6275e)) {
                                b9 = wVar.b();
                                float e112 = y0.c.e(j8);
                                if (b9 instanceof d0) {
                                }
                                if (z9) {
                                }
                            }
                            if (!z9) {
                                z13 = false;
                            }
                            if (z13) {
                            }
                            return y0.c.h(a3, j10);
                        }
                        j(g10);
                    }
                    z10 = true;
                    if (y0.c.e(g10) <= 0.5f) {
                    }
                    z11 = true;
                    if (!z10) {
                    }
                    z8 = true;
                    if (w.f(wVar.f6276f)) {
                    }
                    z9 = false;
                    if (w.f(wVar.f6277g)) {
                    }
                    if (w.f(wVar.f6274d)) {
                    }
                    if (w.f(wVar.f6275e)) {
                    }
                    if (!z9) {
                    }
                    if (z13) {
                    }
                    return y0.c.h(a3, j10);
                }
                z8 = false;
                if (w.f(wVar.f6276f)) {
                }
                z9 = false;
                if (w.f(wVar.f6277g)) {
                }
                if (w.f(wVar.f6274d)) {
                }
                if (w.f(wVar.f6275e)) {
                }
                if (!z9) {
                }
                if (z13) {
                }
                return y0.c.h(a3, j10);
            }
            j9 = 0.0f;
            a3 = u3.r.a(j9, h3);
            if (!y0.c.b(a3, 0L)) {
            }
            long g92 = y0.c.g(j8, a3);
            aVar.getClass();
            o.f1 f1Var22 = (o.f1) aVar.f1524h;
            long j102 = new y0.c(o.f1.a(f1Var22, f1Var22.f6616h, g92, f1Var22.f6615g)).f9778a;
            long g102 = y0.c.g(g92, j102);
            if (i7 == 1) {
            }
            z8 = false;
            if (w.f(wVar.f6276f)) {
            }
            z9 = false;
            if (w.f(wVar.f6277g)) {
            }
            if (w.f(wVar.f6274d)) {
            }
            if (w.f(wVar.f6275e)) {
            }
            if (!z9) {
            }
            if (z13) {
            }
            return y0.c.h(a3, j102);
        }
        h3 = 0.0f;
        if (y0.c.d(j8) != 0.0f) {
        }
        j9 = 0.0f;
        a3 = u3.r.a(j9, h3);
        if (!y0.c.b(a3, 0L)) {
        }
        long g922 = y0.c.g(j8, a3);
        aVar.getClass();
        o.f1 f1Var222 = (o.f1) aVar.f1524h;
        long j1022 = new y0.c(o.f1.a(f1Var222, f1Var222.f6616h, g922, f1Var222.f6615g)).f9778a;
        long g1022 = y0.c.g(g922, j1022);
        if (i7 == 1) {
        }
        z8 = false;
        if (w.f(wVar.f6276f)) {
        }
        z9 = false;
        if (w.f(wVar.f6277g)) {
        }
        if (w.f(wVar.f6274d)) {
        }
        if (w.f(wVar.f6275e)) {
        }
        if (!z9) {
        }
        if (z13) {
        }
        return y0.c.h(a3, j1022);
    }

    @Override // m.w0
    public final boolean b() {
        w wVar = this.f6142g;
        EdgeEffect edgeEffect = wVar.f6274d;
        g gVar = g.f6157a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? gVar.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = wVar.f6275e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? gVar.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = wVar.f6276f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? gVar.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = wVar.f6277g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? gVar.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // m.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j8, o.e1 e1Var, h6.d dVar) {
        e eVar;
        int i7;
        float f9;
        float f10;
        long d8;
        f fVar;
        long d9;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f6138j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f6138j = i8 - Integer.MIN_VALUE;
                Object obj = eVar.f6136h;
                i7 = eVar.f6138j;
                d6.z zVar = d6.z.f2639a;
                if (i7 != 0) {
                    d6.a.e(obj);
                    boolean e9 = y0.f.e(this.f6146k);
                    i6.a aVar = i6.a.f4956f;
                    if (e9) {
                        eVar.f6138j = 1;
                        e1Var.getClass();
                        o.e1 e1Var2 = new o.e1(e1Var.f6606j, eVar);
                        e1Var2.f6605i = j8;
                        if (e1Var2.invokeSuspend(zVar) != aVar) {
                            return zVar;
                        }
                    } else {
                        float b9 = m2.o.b(j8);
                        w wVar = this.f6142g;
                        if (b9 > 0.0f && w.g(wVar.f6276f)) {
                            EdgeEffect c4 = wVar.c();
                            int O = t6.a.O(m2.o.b(j8));
                            if (Build.VERSION.SDK_INT >= 31) {
                                c4.onAbsorb(O);
                            } else if (c4.isFinished()) {
                                c4.onAbsorb(O);
                            }
                            f9 = m2.o.b(j8);
                        } else if (m2.o.b(j8) >= 0.0f || !w.g(wVar.f6277g)) {
                            f9 = 0.0f;
                        } else {
                            EdgeEffect d10 = wVar.d();
                            int i9 = -t6.a.O(m2.o.b(j8));
                            if (Build.VERSION.SDK_INT >= 31) {
                                d10.onAbsorb(i9);
                            } else if (d10.isFinished()) {
                                d10.onAbsorb(i9);
                            }
                            f9 = m2.o.b(j8);
                        }
                        if (m2.o.c(j8) > 0.0f && w.g(wVar.f6274d)) {
                            EdgeEffect e10 = wVar.e();
                            int O2 = t6.a.O(m2.o.c(j8));
                            if (Build.VERSION.SDK_INT >= 31) {
                                e10.onAbsorb(O2);
                            } else if (e10.isFinished()) {
                                e10.onAbsorb(O2);
                            }
                            f10 = m2.o.c(j8);
                        } else if (m2.o.c(j8) >= 0.0f || !w.g(wVar.f6275e)) {
                            f10 = 0.0f;
                        } else {
                            EdgeEffect b10 = wVar.b();
                            int i10 = -t6.a.O(m2.o.c(j8));
                            if (Build.VERSION.SDK_INT >= 31) {
                                b10.onAbsorb(i10);
                            } else if (b10.isFinished()) {
                                b10.onAbsorb(i10);
                            }
                            f10 = m2.o.c(j8);
                        }
                        long j9 = t6.a.j(f9, f10);
                        if (j9 != 0) {
                            g();
                        }
                        d8 = m2.o.d(j8, j9);
                        eVar.f6134f = this;
                        eVar.f6135g = d8;
                        eVar.f6138j = 2;
                        e1Var.getClass();
                        o.e1 e1Var3 = new o.e1(e1Var.f6606j, eVar);
                        e1Var3.f6605i = d8;
                        obj = e1Var3.invokeSuspend(zVar);
                        if (obj != aVar) {
                            fVar = this;
                        }
                    }
                    return aVar;
                }
                if (i7 == 1) {
                    d6.a.e(obj);
                    return zVar;
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d8 = eVar.f6135g;
                fVar = eVar.f6134f;
                d6.a.e(obj);
                d9 = m2.o.d(d8, ((m2.o) obj).f6330a);
                fVar.f6145j = false;
                w wVar2 = fVar.f6142g;
                if (m2.o.b(d9) <= 0.0f) {
                    EdgeEffect c6 = wVar2.c();
                    int O3 = t6.a.O(m2.o.b(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c6.onAbsorb(O3);
                    } else if (c6.isFinished()) {
                        c6.onAbsorb(O3);
                    }
                } else if (m2.o.b(d9) < 0.0f) {
                    EdgeEffect d11 = wVar2.d();
                    int i11 = -t6.a.O(m2.o.b(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d11.onAbsorb(i11);
                    } else if (d11.isFinished()) {
                        d11.onAbsorb(i11);
                    }
                }
                if (m2.o.c(d9) <= 0.0f) {
                    EdgeEffect e11 = wVar2.e();
                    int O4 = t6.a.O(m2.o.c(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e11.onAbsorb(O4);
                    } else if (e11.isFinished()) {
                        e11.onAbsorb(O4);
                    }
                } else if (m2.o.c(d9) < 0.0f) {
                    EdgeEffect b11 = wVar2.b();
                    int i12 = -t6.a.O(m2.o.c(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b11.onAbsorb(i12);
                    } else if (b11.isFinished()) {
                        b11.onAbsorb(i12);
                    }
                }
                if (d9 != 0) {
                    fVar.g();
                }
                fVar.e();
                return zVar;
            }
        }
        eVar = new e(this, (j6.c) dVar);
        Object obj2 = eVar.f6136h;
        i7 = eVar.f6138j;
        d6.z zVar2 = d6.z.f2639a;
        if (i7 != 0) {
        }
        d9 = m2.o.d(d8, ((m2.o) obj2).f6330a);
        fVar.f6145j = false;
        w wVar22 = fVar.f6142g;
        if (m2.o.b(d9) <= 0.0f) {
        }
        if (m2.o.c(d9) <= 0.0f) {
        }
        if (d9 != 0) {
        }
        fVar.e();
        return zVar2;
    }

    @Override // m.w0
    public final s0.o d() {
        return this.f6148m;
    }

    public final void e() {
        boolean z8;
        w wVar = this.f6142g;
        EdgeEffect edgeEffect = wVar.f6274d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = edgeEffect.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = wVar.f6275e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 = edgeEffect2.isFinished() || z8;
        }
        EdgeEffect edgeEffect3 = wVar.f6276f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 = edgeEffect3.isFinished() || z8;
        }
        EdgeEffect edgeEffect4 = wVar.f6277g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z8 = edgeEffect4.isFinished() || z8;
        }
        if (z8) {
            g();
        }
    }

    public final long f() {
        y0.c cVar = this.f6141f;
        long f9 = cVar != null ? cVar.f9778a : v0.d.f(this.f6146k);
        return u3.r.a(y0.c.d(f9) / y0.f.d(this.f6146k), y0.c.e(f9) / y0.f.b(this.f6146k));
    }

    public final void g() {
        if (this.f6144i) {
            this.f6143h.setValue(d6.z.f2639a);
        }
    }

    public final float h(long j8) {
        float d8 = y0.c.d(f());
        float e9 = y0.c.e(j8) / y0.f.b(this.f6146k);
        EdgeEffect b9 = this.f6142g.b();
        float f9 = -e9;
        float f10 = 1 - d8;
        int i7 = Build.VERSION.SDK_INT;
        g gVar = g.f6157a;
        if (i7 >= 31) {
            f9 = gVar.c(b9, f9, f10);
        } else {
            b9.onPull(f9, f10);
        }
        return (i7 >= 31 ? gVar.b(b9) : 0.0f) == 0.0f ? y0.f.b(this.f6146k) * (-f9) : y0.c.e(j8);
    }

    public final float i(long j8) {
        float e9 = y0.c.e(f());
        float d8 = y0.c.d(j8) / y0.f.d(this.f6146k);
        EdgeEffect c4 = this.f6142g.c();
        float f9 = 1 - e9;
        int i7 = Build.VERSION.SDK_INT;
        g gVar = g.f6157a;
        if (i7 >= 31) {
            d8 = gVar.c(c4, d8, f9);
        } else {
            c4.onPull(d8, f9);
        }
        return (i7 >= 31 ? gVar.b(c4) : 0.0f) == 0.0f ? y0.f.d(this.f6146k) * d8 : y0.c.d(j8);
    }

    public final float j(long j8) {
        float e9 = y0.c.e(f());
        float d8 = y0.c.d(j8) / y0.f.d(this.f6146k);
        EdgeEffect d9 = this.f6142g.d();
        float f9 = -d8;
        int i7 = Build.VERSION.SDK_INT;
        g gVar = g.f6157a;
        if (i7 >= 31) {
            f9 = gVar.c(d9, f9, e9);
        } else {
            d9.onPull(f9, e9);
        }
        return (i7 >= 31 ? gVar.b(d9) : 0.0f) == 0.0f ? y0.f.d(this.f6146k) * (-f9) : y0.c.d(j8);
    }

    public final float k(long j8) {
        float d8 = y0.c.d(f());
        float e9 = y0.c.e(j8) / y0.f.b(this.f6146k);
        EdgeEffect e10 = this.f6142g.e();
        int i7 = Build.VERSION.SDK_INT;
        g gVar = g.f6157a;
        if (i7 >= 31) {
            e9 = gVar.c(e10, e9, d8);
        } else {
            e10.onPull(e9, d8);
        }
        return (i7 >= 31 ? gVar.b(e10) : 0.0f) == 0.0f ? y0.f.b(this.f6146k) * e9 : y0.c.e(j8);
    }

    public final void l(long j8) {
        boolean a3 = y0.f.a(this.f6146k, 0L);
        boolean a9 = y0.f.a(j8, this.f6146k);
        this.f6146k = j8;
        if (!a9) {
            long G = j1.c.G(t6.a.O(y0.f.d(j8)), t6.a.O(y0.f.b(j8)));
            w wVar = this.f6142g;
            wVar.f6273c = G;
            EdgeEffect edgeEffect = wVar.f6274d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (G >> 32), (int) (G & 4294967295L));
            }
            EdgeEffect edgeEffect2 = wVar.f6275e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (G >> 32), (int) (G & 4294967295L));
            }
            EdgeEffect edgeEffect3 = wVar.f6276f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (G & 4294967295L), (int) (G >> 32));
            }
            EdgeEffect edgeEffect4 = wVar.f6277g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (G & 4294967295L), (int) (G >> 32));
            }
            EdgeEffect edgeEffect5 = wVar.f6278h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (G >> 32), (int) (G & 4294967295L));
            }
            EdgeEffect edgeEffect6 = wVar.f6279i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (G >> 32), (int) (G & 4294967295L));
            }
            EdgeEffect edgeEffect7 = wVar.f6280j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (G & 4294967295L), (int) (G >> 32));
            }
            EdgeEffect edgeEffect8 = wVar.f6281k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (G & 4294967295L), (int) (G >> 32));
            }
        }
        if (a3 || a9) {
            return;
        }
        g();
        e();
    }
}
