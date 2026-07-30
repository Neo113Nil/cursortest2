package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q9 implements px1 {
    public au1 m;
    public final ef0 n;
    public final lz1 o;
    public final boolean p;
    public boolean q;
    public long r;
    public s22 s;
    public final vl1 t;

    public q9(Context context, nx1 nx1Var) {
        vl1 k;
        ef0 ef0Var = new ef0(context, ap.H(nx1Var.a));
        this.n = ef0Var;
        Unit unit = Unit.a;
        this.o = new lz1(unit, qb2.Z);
        this.p = true;
        this.r = 0L;
        k = sl1.a.k(new SuspendPointerInputElement(unit, null, new qr2(new v(3, null, this)), 6));
        this.t = k.k(Build.VERSION.SDK_INT >= 31 ? new zd0(this, ef0Var) : new vd0(this, ef0Var, nx1Var));
    }

    public final void a() {
        boolean z;
        ef0 ef0Var = this.n;
        EdgeEffect edgeEffect = ef0Var.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ef0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ef0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ef0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z = edgeEffect4.isFinished() || z;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r0.invokeSuspend(kotlin.Unit.a) == r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016a, code lost:
    
        if (r4 == r6) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // defpackage.px1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, bg2 bg2Var, o30 o30Var) {
        o9 o9Var;
        int i;
        float f;
        float f2;
        long d;
        q9 q9Var = this;
        if (o30Var instanceof o9) {
            o9Var = (o9) o30Var;
            int i2 = o9Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o9Var.q = i2 - Integer.MIN_VALUE;
                Object obj = o9Var.o;
                b50 b50Var = b50.m;
                i = o9Var.q;
                if (i == 0) {
                    if (i == 1) {
                        ca2.b(obj);
                        return Unit.a;
                    }
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = o9Var.n;
                    q9 q9Var2 = o9Var.m;
                    ca2.b(obj);
                    q9Var = q9Var2;
                    d = j2;
                    long d2 = f43.d(d, ((f43) obj).a);
                    q9Var.q = false;
                    ef0 ef0Var = q9Var.n;
                    if (f43.b(d2) > 0.0f) {
                        EdgeEffect c = ef0Var.c();
                        int b = si1.b(f43.b(d2));
                        if (Build.VERSION.SDK_INT >= 31) {
                            c.onAbsorb(b);
                        } else if (c.isFinished()) {
                            c.onAbsorb(b);
                        }
                    } else if (f43.b(d2) < 0.0f) {
                        EdgeEffect d3 = ef0Var.d();
                        int i3 = -si1.b(f43.b(d2));
                        if (Build.VERSION.SDK_INT >= 31) {
                            d3.onAbsorb(i3);
                        } else if (d3.isFinished()) {
                            d3.onAbsorb(i3);
                        }
                    }
                    if (f43.c(d2) > 0.0f) {
                        EdgeEffect e = ef0Var.e();
                        int b2 = si1.b(f43.c(d2));
                        if (Build.VERSION.SDK_INT >= 31) {
                            e.onAbsorb(b2);
                        } else if (e.isFinished()) {
                            e.onAbsorb(b2);
                        }
                    } else if (f43.c(d2) < 0.0f) {
                        EdgeEffect b3 = ef0Var.b();
                        int i4 = -si1.b(f43.c(d2));
                        if (Build.VERSION.SDK_INT >= 31) {
                            b3.onAbsorb(i4);
                        } else if (b3.isFinished()) {
                            b3.onAbsorb(i4);
                        }
                    }
                    if (d2 != 0) {
                        q9Var.d();
                    }
                    q9Var.a();
                    return Unit.a;
                }
                ca2.b(obj);
                if (ql2.e(q9Var.r)) {
                    o9Var.q = 1;
                    bg2Var.getClass();
                    bg2 bg2Var2 = new bg2(bg2Var.p, o9Var);
                    bg2Var2.o = j;
                } else {
                    float b4 = f43.b(j);
                    ef0 ef0Var2 = q9Var.n;
                    if (b4 > 0.0f && ef0.g(ef0Var2.f)) {
                        EdgeEffect c2 = ef0Var2.c();
                        int b5 = si1.b(f43.b(j));
                        if (Build.VERSION.SDK_INT >= 31) {
                            c2.onAbsorb(b5);
                        } else if (c2.isFinished()) {
                            c2.onAbsorb(b5);
                        }
                        f = f43.b(j);
                    } else if (f43.b(j) >= 0.0f || !ef0.g(ef0Var2.g)) {
                        f = 0.0f;
                    } else {
                        EdgeEffect d4 = ef0Var2.d();
                        int i5 = -si1.b(f43.b(j));
                        if (Build.VERSION.SDK_INT >= 31) {
                            d4.onAbsorb(i5);
                        } else if (d4.isFinished()) {
                            d4.onAbsorb(i5);
                        }
                        f = f43.b(j);
                    }
                    if (f43.c(j) > 0.0f && ef0.g(ef0Var2.d)) {
                        EdgeEffect e2 = ef0Var2.e();
                        int b6 = si1.b(f43.c(j));
                        if (Build.VERSION.SDK_INT >= 31) {
                            e2.onAbsorb(b6);
                        } else if (e2.isFinished()) {
                            e2.onAbsorb(b6);
                        }
                        f2 = f43.c(j);
                    } else if (f43.c(j) >= 0.0f || !ef0.g(ef0Var2.e)) {
                        f2 = 0.0f;
                    } else {
                        EdgeEffect b7 = ef0Var2.b();
                        int i6 = -si1.b(f43.c(j));
                        if (Build.VERSION.SDK_INT >= 31) {
                            b7.onAbsorb(i6);
                        } else if (b7.isFinished()) {
                            b7.onAbsorb(i6);
                        }
                        f2 = f43.c(j);
                    }
                    long b8 = mh2.b(f, f2);
                    if (b8 != 0) {
                        q9Var.d();
                    }
                    d = f43.d(j, b8);
                    o9Var.m = q9Var;
                    o9Var.n = d;
                    o9Var.q = 2;
                    bg2Var.getClass();
                    bg2 bg2Var3 = new bg2(bg2Var.p, o9Var);
                    bg2Var3.o = d;
                    obj = bg2Var3.invokeSuspend(Unit.a);
                }
                return b50Var;
            }
        }
        o9Var = new o9(q9Var, (r30) o30Var);
        Object obj2 = o9Var.o;
        b50 b50Var2 = b50.m;
        i = o9Var.q;
        if (i == 0) {
        }
    }

    public final long c() {
        au1 au1Var = this.m;
        long e = au1Var != null ? au1Var.a : ph2.e(this.r);
        return ap.i(au1.d(e) / ql2.d(this.r), au1.e(e) / ql2.b(this.r));
    }

    public final void d() {
        if (this.p) {
            this.o.setValue(Unit.a);
        }
    }

    public final float e(long j) {
        float d = au1.d(c());
        float e = au1.e(j) / ql2.b(this.r);
        EdgeEffect b = this.n.b();
        float f = -e;
        float f2 = 1.0f - d;
        int i = Build.VERSION.SDK_INT;
        ge geVar = ge.a;
        if (i >= 31) {
            f = geVar.c(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i >= 31 ? geVar.b(b) : 0.0f) == 0.0f ? ql2.b(this.r) * (-f) : au1.e(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a8  */
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
    /* JADX WARN: Removed duplicated region for block: B:97:0x0253 A[ADDED_TO_REGION] */
    @Override // defpackage.px1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j, int i, s72 s72Var) {
        float e;
        float j2;
        long i2;
        boolean z;
        boolean z2;
        EdgeEffect e2;
        EdgeEffect d;
        boolean z3;
        boolean z4;
        if (ql2.e(this.r)) {
            s72Var.getClass();
            cg2 cg2Var = (cg2) s72Var.n;
            return new au1(cg2.a(cg2Var, cg2Var.h, j, cg2Var.g)).a;
        }
        boolean z5 = this.q;
        boolean z6 = true;
        ef0 ef0Var = this.n;
        if (!z5) {
            if (ef0.g(ef0Var.f)) {
                i(0L);
            }
            if (ef0.g(ef0Var.g)) {
                j(0L);
            }
            if (ef0.g(ef0Var.d)) {
                k(0L);
            }
            if (ef0.g(ef0Var.e)) {
                e(0L);
            }
            this.q = true;
        }
        if (au1.e(j) != 0.0f) {
            if (ef0.g(ef0Var.d)) {
                e = k(j);
                if (!ef0.g(ef0Var.d)) {
                    ef0Var.e().onRelease();
                }
            } else if (ef0.g(ef0Var.e)) {
                e = e(j);
                if (!ef0.g(ef0Var.e)) {
                    ef0Var.b().onRelease();
                }
            }
            if (au1.d(j) != 0.0f) {
                if (ef0.g(ef0Var.f)) {
                    j2 = i(j);
                    if (!ef0.g(ef0Var.f)) {
                        ef0Var.c().onRelease();
                    }
                } else if (ef0.g(ef0Var.g)) {
                    j2 = j(j);
                    if (!ef0.g(ef0Var.g)) {
                        ef0Var.d().onRelease();
                    }
                }
                i2 = ap.i(j2, e);
                if (!au1.b(i2, 0L)) {
                    d();
                }
                long f = au1.f(j, i2);
                s72Var.getClass();
                cg2 cg2Var2 = (cg2) s72Var.n;
                long j3 = new au1(cg2.a(cg2Var2, cg2Var2.h, f, cg2Var2.g)).a;
                long f2 = au1.f(f, j3);
                if (i == 1) {
                    if (au1.d(f2) > 0.5f) {
                        i(f2);
                    } else {
                        if (au1.d(f2) >= -0.5f) {
                            z3 = false;
                            if (au1.e(f2) <= 0.5f) {
                                k(f2);
                            } else if (au1.e(f2) < -0.5f) {
                                e(f2);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (ef0.f(ef0Var.f) || au1.d(j) >= 0.0f) {
                                        z2 = false;
                                    } else {
                                        EdgeEffect c = ef0Var.c();
                                        float d2 = au1.d(j);
                                        if (c instanceof ov0) {
                                            ov0 ov0Var = (ov0) c;
                                            float f3 = ov0Var.b + d2;
                                            ov0Var.b = f3;
                                            if (Math.abs(f3) > ov0Var.a) {
                                                ov0Var.onRelease();
                                            }
                                        } else {
                                            c.onRelease();
                                        }
                                        z2 = !ef0.f(ef0Var.f);
                                    }
                                    if (ef0.f(ef0Var.g) && au1.d(j) > 0.0f) {
                                        d = ef0Var.d();
                                        float d3 = au1.d(j);
                                        if (d instanceof ov0) {
                                            d.onRelease();
                                        } else {
                                            ov0 ov0Var2 = (ov0) d;
                                            float f4 = ov0Var2.b + d3;
                                            ov0Var2.b = f4;
                                            if (Math.abs(f4) > ov0Var2.a) {
                                                ov0Var2.onRelease();
                                            }
                                        }
                                        z2 = (z2 && ef0.f(ef0Var.g)) ? false : true;
                                    }
                                    if (ef0.f(ef0Var.d) && au1.e(j) < 0.0f) {
                                        e2 = ef0Var.e();
                                        float e3 = au1.e(j);
                                        if (e2 instanceof ov0) {
                                            e2.onRelease();
                                        } else {
                                            ov0 ov0Var3 = (ov0) e2;
                                            float f5 = ov0Var3.b + e3;
                                            ov0Var3.b = f5;
                                            if (Math.abs(f5) > ov0Var3.a) {
                                                ov0Var3.onRelease();
                                            }
                                        }
                                        z2 = (z2 && ef0.f(ef0Var.d)) ? false : true;
                                    }
                                    if (ef0.f(ef0Var.e) || au1.e(j) <= 0.0f) {
                                        z6 = z2;
                                    } else {
                                        EdgeEffect b = ef0Var.b();
                                        float e4 = au1.e(j);
                                        if (b instanceof ov0) {
                                            ov0 ov0Var4 = (ov0) b;
                                            float f6 = ov0Var4.b + e4;
                                            ov0Var4.b = f6;
                                            if (Math.abs(f6) > ov0Var4.a) {
                                                ov0Var4.onRelease();
                                            }
                                        } else {
                                            b.onRelease();
                                        }
                                        if (!z2 && ef0.f(ef0Var.e)) {
                                            z6 = false;
                                        }
                                    }
                                    if (!z6 || z) {
                                        d();
                                    }
                                    return au1.g(i2, j3);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (ef0.f(ef0Var.f)) {
                            }
                            z2 = false;
                            if (ef0.f(ef0Var.g)) {
                                d = ef0Var.d();
                                float d32 = au1.d(j);
                                if (d instanceof ov0) {
                                }
                                if (z2) {
                                }
                            }
                            if (ef0.f(ef0Var.d)) {
                                e2 = ef0Var.e();
                                float e32 = au1.e(j);
                                if (e2 instanceof ov0) {
                                }
                                if (z2) {
                                }
                            }
                            if (ef0.f(ef0Var.e)) {
                            }
                            z6 = z2;
                            if (!z6) {
                            }
                            d();
                            return au1.g(i2, j3);
                        }
                        j(f2);
                    }
                    z3 = true;
                    if (au1.e(f2) <= 0.5f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (ef0.f(ef0Var.f)) {
                    }
                    z2 = false;
                    if (ef0.f(ef0Var.g)) {
                    }
                    if (ef0.f(ef0Var.d)) {
                    }
                    if (ef0.f(ef0Var.e)) {
                    }
                    z6 = z2;
                    if (!z6) {
                    }
                    d();
                    return au1.g(i2, j3);
                }
                z = false;
                if (ef0.f(ef0Var.f)) {
                }
                z2 = false;
                if (ef0.f(ef0Var.g)) {
                }
                if (ef0.f(ef0Var.d)) {
                }
                if (ef0.f(ef0Var.e)) {
                }
                z6 = z2;
                if (!z6) {
                }
                d();
                return au1.g(i2, j3);
            }
            j2 = 0.0f;
            i2 = ap.i(j2, e);
            if (!au1.b(i2, 0L)) {
            }
            long f7 = au1.f(j, i2);
            s72Var.getClass();
            cg2 cg2Var22 = (cg2) s72Var.n;
            long j32 = new au1(cg2.a(cg2Var22, cg2Var22.h, f7, cg2Var22.g)).a;
            long f22 = au1.f(f7, j32);
            if (i == 1) {
            }
            z = false;
            if (ef0.f(ef0Var.f)) {
            }
            z2 = false;
            if (ef0.f(ef0Var.g)) {
            }
            if (ef0.f(ef0Var.d)) {
            }
            if (ef0.f(ef0Var.e)) {
            }
            z6 = z2;
            if (!z6) {
            }
            d();
            return au1.g(i2, j32);
        }
        e = 0.0f;
        if (au1.d(j) != 0.0f) {
        }
        j2 = 0.0f;
        i2 = ap.i(j2, e);
        if (!au1.b(i2, 0L)) {
        }
        long f72 = au1.f(j, i2);
        s72Var.getClass();
        cg2 cg2Var222 = (cg2) s72Var.n;
        long j322 = new au1(cg2.a(cg2Var222, cg2Var222.h, f72, cg2Var222.g)).a;
        long f222 = au1.f(f72, j322);
        if (i == 1) {
        }
        z = false;
        if (ef0.f(ef0Var.f)) {
        }
        z2 = false;
        if (ef0.f(ef0Var.g)) {
        }
        if (ef0.f(ef0Var.d)) {
        }
        if (ef0.f(ef0Var.e)) {
        }
        z6 = z2;
        if (!z6) {
        }
        d();
        return au1.g(i2, j322);
    }

    @Override // defpackage.px1
    public final boolean g() {
        ef0 ef0Var = this.n;
        EdgeEffect edgeEffect = ef0Var.d;
        ge geVar = ge.a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? geVar.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = ef0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? geVar.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = ef0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? geVar.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = ef0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? geVar.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // defpackage.px1
    public final vl1 h() {
        return this.t;
    }

    public final float i(long j) {
        float e = au1.e(c());
        float d = au1.d(j) / ql2.d(this.r);
        EdgeEffect c = this.n.c();
        float f = 1.0f - e;
        int i = Build.VERSION.SDK_INT;
        ge geVar = ge.a;
        if (i >= 31) {
            d = geVar.c(c, d, f);
        } else {
            c.onPull(d, f);
        }
        return (i >= 31 ? geVar.b(c) : 0.0f) == 0.0f ? ql2.d(this.r) * d : au1.d(j);
    }

    public final float j(long j) {
        float e = au1.e(c());
        float d = au1.d(j) / ql2.d(this.r);
        EdgeEffect d2 = this.n.d();
        float f = -d;
        int i = Build.VERSION.SDK_INT;
        ge geVar = ge.a;
        if (i >= 31) {
            f = geVar.c(d2, f, e);
        } else {
            d2.onPull(f, e);
        }
        return (i >= 31 ? geVar.b(d2) : 0.0f) == 0.0f ? ql2.d(this.r) * (-f) : au1.d(j);
    }

    public final float k(long j) {
        float d = au1.d(c());
        float e = au1.e(j) / ql2.b(this.r);
        EdgeEffect e2 = this.n.e();
        int i = Build.VERSION.SDK_INT;
        ge geVar = ge.a;
        if (i >= 31) {
            e = geVar.c(e2, e, d);
        } else {
            e2.onPull(e, d);
        }
        return (i >= 31 ? geVar.b(e2) : 0.0f) == 0.0f ? ql2.b(this.r) * e : au1.e(j);
    }

    public final void l(long j) {
        boolean a = ql2.a(this.r, 0L);
        boolean a2 = ql2.a(j, this.r);
        this.r = j;
        if (!a2) {
            long d = zm3.d(si1.b(ql2.d(j)), si1.b(ql2.b(j)));
            ef0 ef0Var = this.n;
            ef0Var.c = d;
            EdgeEffect edgeEffect = ef0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (d >> 32), (int) (d & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ef0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (d >> 32), (int) (d & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ef0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (d & 4294967295L), (int) (d >> 32));
            }
            EdgeEffect edgeEffect4 = ef0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (d & 4294967295L), (int) (d >> 32));
            }
            EdgeEffect edgeEffect5 = ef0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (d >> 32), (int) (d & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ef0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (d >> 32), (int) (d & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ef0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (d & 4294967295L), (int) (d >> 32));
            }
            EdgeEffect edgeEffect8 = ef0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (d & 4294967295L), (int) (d >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        d();
        a();
    }
}
