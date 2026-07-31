package t;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import m0.h1;
import u.d1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r2.c f6786a;

    /* renamed from: b, reason: collision with root package name */
    public long f6787b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f6788c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f6789d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6790e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6791f;

    /* renamed from: g, reason: collision with root package name */
    public long f6792g;

    /* renamed from: h, reason: collision with root package name */
    public long f6793h;
    public final w1.l i;

    public j(Context context, r2.c cVar, long j7, x.f0 f0Var) {
        this.f6786a = cVar;
        a0 a0Var = new a0(context, f1.p.u(j7));
        this.f6788c = a0Var;
        this.f6789d = new h1(c6.m.f1757a, m0.v0.f5133f);
        this.f6790e = true;
        this.f6792g = 0L;
        this.f6793h = -1L;
        i iVar = new i(0, this);
        q1.f fVar = q1.q.f6022a;
        q1.s sVar = new q1.s(null, null, iVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new f0(sVar, this, a0Var) : new f0(sVar, this, a0Var, f0Var);
    }

    public final void a() {
        boolean z3;
        a0 a0Var = this.f6788c;
        EdgeEffect edgeEffect = a0Var.f6740d;
        boolean z7 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = !edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = a0Var.f6741e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 = !edgeEffect2.isFinished() || z3;
        }
        EdgeEffect edgeEffect3 = a0Var.f6742f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = !edgeEffect3.isFinished() || z3;
        }
        EdgeEffect edgeEffect4 = a0Var.f6743g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z3) {
                z7 = false;
            }
            z3 = z7;
        }
        if (z3) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j7, d1 d1Var, i6.c cVar) {
        g gVar;
        int i;
        long d8;
        long d9;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i8 = gVar.f6776j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f6776j = i8 - Integer.MIN_VALUE;
                Object obj = gVar.f6775h;
                i = gVar.f6776j;
                c6.m mVar = c6.m.f1757a;
                a0 a0Var = this.f6788c;
                if (i != 0) {
                    s6.a.K(obj);
                    boolean c8 = e1.e.c(this.f6792g);
                    h6.a aVar = h6.a.f3204d;
                    if (c8) {
                        gVar.f6776j = 1;
                        d1Var.getClass();
                        d1 d1Var2 = new d1(d1Var.f6954k, gVar);
                        d1Var2.f6953j = j7;
                        if (d1Var2.p(mVar) != aVar) {
                            return mVar;
                        }
                    } else {
                        boolean g3 = a0.g(a0Var.f6742f);
                        r2.c cVar2 = this.f6786a;
                        long c9 = r2.r.c((!g3 || r2.q.b(j7) >= 0.0f) ? (!a0.g(a0Var.f6743g) || r2.q.b(j7) <= 0.0f) ? 0.0f : -r2.r.d(a0Var.d(), -r2.q.b(j7), Float.intBitsToFloat((int) (this.f6792g >> 32)), cVar2) : r2.r.d(a0Var.c(), r2.q.b(j7), Float.intBitsToFloat((int) (this.f6792g >> 32)), cVar2), (!a0.g(a0Var.f6740d) || r2.q.c(j7) >= 0.0f) ? (!a0.g(a0Var.f6741e) || r2.q.c(j7) <= 0.0f) ? 0.0f : -r2.r.d(a0Var.b(), -r2.q.c(j7), Float.intBitsToFloat((int) (this.f6792g & 4294967295L)), cVar2) : r2.r.d(a0Var.e(), r2.q.c(j7), Float.intBitsToFloat((int) (this.f6792g & 4294967295L)), cVar2));
                        if (c9 != 0) {
                            d();
                        }
                        d8 = r2.q.d(j7, c9);
                        gVar.f6774g = d8;
                        gVar.f6776j = 2;
                        d1Var.getClass();
                        d1 d1Var3 = new d1(d1Var.f6954k, gVar);
                        d1Var3.f6953j = d8;
                        obj = d1Var3.p(mVar);
                    }
                    return aVar;
                }
                if (i == 1) {
                    s6.a.K(obj);
                    return mVar;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d8 = gVar.f6774g;
                s6.a.K(obj);
                d9 = r2.q.d(d8, ((r2.q) obj).f6537a);
                this.f6791f = false;
                if (r2.q.b(d9) <= 0.0f) {
                    EdgeEffect c10 = a0Var.c();
                    int B = s6.a.B(r2.q.b(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c10.onAbsorb(B);
                    } else if (c10.isFinished()) {
                        c10.onAbsorb(B);
                    }
                } else if (r2.q.b(d9) < 0.0f) {
                    EdgeEffect d10 = a0Var.d();
                    int i9 = -s6.a.B(r2.q.b(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d10.onAbsorb(i9);
                    } else if (d10.isFinished()) {
                        d10.onAbsorb(i9);
                    }
                }
                if (r2.q.c(d9) <= 0.0f) {
                    EdgeEffect e8 = a0Var.e();
                    int B2 = s6.a.B(r2.q.c(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e8.onAbsorb(B2);
                    } else if (e8.isFinished()) {
                        e8.onAbsorb(B2);
                    }
                } else if (r2.q.c(d9) < 0.0f) {
                    EdgeEffect b8 = a0Var.b();
                    int i10 = -s6.a.B(r2.q.c(d9));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b8.onAbsorb(i10);
                    } else if (b8.isFinished()) {
                        b8.onAbsorb(i10);
                    }
                }
                a();
                return mVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f6775h;
        i = gVar.f6776j;
        c6.m mVar2 = c6.m.f1757a;
        a0 a0Var2 = this.f6788c;
        if (i != 0) {
        }
        d9 = r2.q.d(d8, ((r2.q) obj2).f6537a);
        this.f6791f = false;
        if (r2.q.b(d9) <= 0.0f) {
        }
        if (r2.q.c(d9) <= 0.0f) {
        }
        a();
        return mVar2;
    }

    public final long c() {
        long j7 = this.f6787b;
        if ((9223372034707292159L & j7) == 9205357640488583168L) {
            j7 = a.a.k(this.f6792g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (this.f6792g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (this.f6792g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f6790e) {
            this.f6789d.setValue(c6.m.f1757a);
        }
    }

    public final float e(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j7 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f6792g & 4294967295L));
        EdgeEffect b8 = this.f6788c.b();
        float f6 = -intBitsToFloat2;
        float f8 = 1 - intBitsToFloat;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            f6 = m.c(b8, f6, f8);
        } else {
            b8.onPull(f6, f8);
        }
        return (i8 >= 31 ? m.b(b8) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f6792g)) * (-f6) : Float.intBitsToFloat(i);
    }

    public final float f(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j7 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f6792g >> 32));
        EdgeEffect c8 = this.f6788c.c();
        float f6 = 1 - intBitsToFloat;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            intBitsToFloat2 = m.c(c8, intBitsToFloat2, f6);
        } else {
            c8.onPull(intBitsToFloat2, f6);
        }
        return (i8 >= 31 ? m.b(c8) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f6792g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j7 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f6792g >> 32));
        EdgeEffect d8 = this.f6788c.d();
        float f6 = -intBitsToFloat2;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            f6 = m.c(d8, f6, intBitsToFloat);
        } else {
            d8.onPull(f6, intBitsToFloat);
        }
        return (i8 >= 31 ? m.b(d8) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f6792g >> 32)) * (-f6) : Float.intBitsToFloat(i);
    }

    public final float h(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j7 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f6792g & 4294967295L));
        EdgeEffect e8 = this.f6788c.e();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            intBitsToFloat2 = m.c(e8, intBitsToFloat2, intBitsToFloat);
        } else {
            e8.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i8 >= 31 ? m.b(e8) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f6792g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j7) {
        boolean a8 = e1.e.a(this.f6792g, 0L);
        boolean a9 = e1.e.a(j7, this.f6792g);
        this.f6792g = j7;
        if (!a9) {
            long B = (s6.a.B(Float.intBitsToFloat((int) (j7 & 4294967295L))) & 4294967295L) | (s6.a.B(Float.intBitsToFloat((int) (j7 >> 32))) << 32);
            a0 a0Var = this.f6788c;
            a0Var.f6739c = B;
            EdgeEffect edgeEffect = a0Var.f6740d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect2 = a0Var.f6741e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect3 = a0Var.f6742f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (B & 4294967295L), (int) (B >> 32));
            }
            EdgeEffect edgeEffect4 = a0Var.f6743g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (B & 4294967295L), (int) (B >> 32));
            }
            EdgeEffect edgeEffect5 = a0Var.f6744h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect6 = a0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect7 = a0Var.f6745j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (B & 4294967295L), (int) (B >> 32));
            }
            EdgeEffect edgeEffect8 = a0Var.f6746k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & B), (int) (B >> 32));
            }
        }
        if (a8 || a9) {
            return;
        }
        a();
    }
}
