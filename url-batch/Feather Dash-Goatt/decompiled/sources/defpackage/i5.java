package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i5 {
    public final nr a;
    public long b = 9205357640488583168L;
    public final su c;
    public final av0 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final zq i;

    public i5(Context context, nr nrVar, long j, ku0 ku0Var) {
        this.a = nrVar;
        su suVar = new su(context, la0.W(j));
        this.c = suVar;
        this.d = new av0(Unit.a, j50.A);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        h5 h5Var = new h5(this);
        mx0 mx0Var = uf1.a;
        wf1 wf1Var = new wf1(null, null, h5Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new a50(wf1Var, this, suVar) : new a50(wf1Var, this, suVar, ku0Var);
    }

    public final void a() {
        boolean z;
        su suVar = this.c;
        EdgeEffect edgeEffect = suVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = suVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = suVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = suVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        if (r0.k(kotlin.Unit.a) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0139, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, c81 c81Var, fn fnVar) {
        f5 f5Var;
        int i;
        long d;
        if (fnVar instanceof f5) {
            f5Var = (f5) fnVar;
            int i2 = f5Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f5Var.k = i2 - Integer.MIN_VALUE;
                Object obj = f5Var.i;
                tn tnVar = tn.d;
                i = f5Var.k;
                su suVar = this.c;
                if (i != 0) {
                    ca0.v(obj);
                    if (va1.c(this.g)) {
                        f5Var.k = 1;
                        c81Var.getClass();
                        c81 c81Var2 = new c81(c81Var.l, f5Var);
                        c81Var2.k = j;
                    } else {
                        boolean g = su.g(suVar.f);
                        nr nrVar = this.a;
                        long d2 = ca0.d((!g || xm1.b(j) >= 0.0f) ? (!su.g(suVar.g) || xm1.b(j) <= 0.0f) ? 0.0f : -m90.g(suVar.d(), -xm1.b(j), Float.intBitsToFloat((int) (this.g >> 32)), nrVar) : m90.g(suVar.c(), xm1.b(j), Float.intBitsToFloat((int) (this.g >> 32)), nrVar), (!su.g(suVar.d) || xm1.c(j) >= 0.0f) ? (!su.g(suVar.e) || xm1.c(j) <= 0.0f) ? 0.0f : -m90.g(suVar.b(), -xm1.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), nrVar) : m90.g(suVar.e(), xm1.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), nrVar));
                        if (d2 != 0) {
                            d();
                        }
                        d = xm1.d(j, d2);
                        f5Var.h = d;
                        f5Var.k = 2;
                        c81Var.getClass();
                        c81 c81Var3 = new c81(c81Var.l, f5Var);
                        c81Var3.k = d;
                        obj = c81Var3.k(Unit.a);
                    }
                    return tnVar;
                }
                if (i == 1) {
                    ca0.v(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d = f5Var.h;
                ca0.v(obj);
                long d3 = xm1.d(d, ((xm1) obj).a);
                this.f = false;
                if (xm1.b(d3) > 0.0f) {
                    EdgeEffect c = suVar.c();
                    int a = pk0.a(xm1.b(d3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c.onAbsorb(a);
                    } else if (c.isFinished()) {
                        c.onAbsorb(a);
                    }
                } else if (xm1.b(d3) < 0.0f) {
                    EdgeEffect d4 = suVar.d();
                    int i3 = -pk0.a(xm1.b(d3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d4.onAbsorb(i3);
                    } else if (d4.isFinished()) {
                        d4.onAbsorb(i3);
                    }
                }
                if (xm1.c(d3) > 0.0f) {
                    EdgeEffect e = suVar.e();
                    int a2 = pk0.a(xm1.c(d3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e.onAbsorb(a2);
                    } else if (e.isFinished()) {
                        e.onAbsorb(a2);
                    }
                } else if (xm1.c(d3) < 0.0f) {
                    EdgeEffect b = suVar.b();
                    int i4 = -pk0.a(xm1.c(d3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b.onAbsorb(i4);
                    } else if (b.isFinished()) {
                        b.onAbsorb(i4);
                    }
                }
                a();
                return Unit.a;
            }
        }
        f5Var = new f5(this, fnVar);
        Object obj2 = f5Var.i;
        tn tnVar2 = tn.d;
        i = f5Var.k;
        su suVar2 = this.c;
        if (i != 0) {
        }
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = t90.q(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(Unit.a);
        }
    }

    public final float e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = d8.d(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? d8.c(b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = d8.d(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? d8.c(c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = d8.d(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? d8.c(d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = d8.d(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? d8.c(e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean a = va1.a(this.g, 0L);
        boolean a2 = va1.a(j, this.g);
        this.g = j;
        if (!a2) {
            long a3 = (pk0.a(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (pk0.a(Float.intBitsToFloat((int) (j >> 32))) << 32);
            su suVar = this.c;
            suVar.c = a3;
            EdgeEffect edgeEffect = suVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = suVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = suVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
            EdgeEffect edgeEffect4 = suVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
            EdgeEffect edgeEffect5 = suVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = suVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = suVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (a3 & 4294967295L), (int) (a3 >> 32));
            }
            EdgeEffect edgeEffect8 = suVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & a3), (int) (a3 >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        a();
    }
}
