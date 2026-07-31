package u;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public y0 f6962a;

    /* renamed from: b, reason: collision with root package name */
    public t.j f6963b;

    /* renamed from: c, reason: collision with root package name */
    public i f6964c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f6965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6966e;

    /* renamed from: f, reason: collision with root package name */
    public c5.x f6967f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f6968g;

    /* renamed from: h, reason: collision with root package name */
    public final u f6969h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f6970j = 1;

    /* renamed from: k, reason: collision with root package name */
    public l0 f6971k = r0.f7083b;

    /* renamed from: l, reason: collision with root package name */
    public final c1 f6972l = new c1(this);

    /* renamed from: m, reason: collision with root package name */
    public final a0.t f6973m = new a0.t(24, this);

    public e1(y0 y0Var, t.j jVar, i iVar, j0 j0Var, boolean z3, c5.x xVar, x0 x0Var, u uVar) {
        this.f6962a = y0Var;
        this.f6963b = jVar;
        this.f6964c = iVar;
        this.f6965d = j0Var;
        this.f6966e = z3;
        this.f6967f = xVar;
        this.f6968g = x0Var;
        this.f6969h = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j7, i6.c cVar) {
        z0 z0Var;
        int i;
        e1 e1Var;
        Throwable th;
        q6.r rVar;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i8 = z0Var.f7137j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                z0Var.f7137j = i8 - Integer.MIN_VALUE;
                Object obj = z0Var.f7136h;
                i = z0Var.f7137j;
                if (i != 0) {
                    s6.a.K(obj);
                    q6.r rVar2 = new q6.r();
                    rVar2.f6204d = j7;
                    this.i = true;
                    try {
                        t.j0 j0Var = t.j0.f6794d;
                        e1Var = this;
                        try {
                            b1 b1Var = new b1(e1Var, rVar2, j7, null);
                            z0Var.f7135g = rVar2;
                            z0Var.f7137j = 1;
                            Object f6 = f(j0Var, b1Var, z0Var);
                            h6.a aVar = h6.a.f3204d;
                            if (f6 == aVar) {
                                return aVar;
                            }
                            rVar = rVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            e1Var.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        e1Var = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = z0Var.f7135g;
                    try {
                        s6.a.K(obj);
                        e1Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        e1Var = this;
                        e1Var.i = false;
                        throw th;
                    }
                }
                e1Var.i = false;
                return new r2.q(rVar.f6204d);
            }
        }
        z0Var = new z0(this, cVar);
        Object obj2 = z0Var.f7136h;
        i = z0Var.f7137j;
        if (i != 0) {
        }
        e1Var.i = false;
        return new r2.q(rVar.f6204d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r7 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j7, boolean z3, i6.i iVar) {
        c6.m mVar = c6.m.f1757a;
        if (z3) {
            i iVar2 = this.f6964c;
            s1 s1Var = r0.f7082a;
        }
        long a8 = r2.q.a(j7, 0.0f, 0.0f, this.f6965d == j0.f7028e ? 1 : 2);
        d1 d1Var = new d1(this, null);
        t.j jVar = this.f6963b;
        h6.a aVar = h6.a.f3204d;
        if (jVar == null || !(this.f6962a.d() || this.f6962a.a())) {
            d1 d1Var2 = new d1(d1Var.f6954k, iVar);
            d1Var2.f6953j = a8;
            Object p7 = d1Var2.p(mVar);
            if (p7 == aVar) {
                return p7;
            }
        } else {
            Object b8 = jVar.b(a8, d1Var, iVar);
            if (b8 == aVar) {
                return b8;
            }
        }
        return mVar;
    }

    public final long c(l0 l0Var, long j7, int i) {
        p1.e eVar = (p1.e) this.f6967f.f1737d;
        p1.e eVar2 = null;
        p1.e eVar3 = (eVar == null || !eVar.f8718q) ? null : (p1.e) w1.f.j(eVar);
        long v02 = eVar3 != null ? eVar3.v0(i, j7) : 0L;
        long d8 = e1.b.d(j7, v02);
        long e8 = e(h(l0Var.a(g(e(this.f6965d == j0.f7028e ? e1.b.a(1, d8) : e1.b.a(2, d8))))));
        x0 x0Var = this.f6968g;
        if (x0Var.f8718q) {
            ViewTreeObserver viewTreeObserver = ((x1.t) w1.f.v(x0Var)).getViewTreeObserver();
            try {
                if (x1.t.N0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    x1.t.N0 = declaredMethod;
                }
                Method method = x1.t.N0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long d9 = e1.b.d(d8, e8);
        p1.e eVar4 = (p1.e) this.f6967f.f1737d;
        if (eVar4 != null && eVar4.f8718q) {
            eVar2 = (p1.e) w1.f.j(eVar4);
        }
        p1.e eVar5 = eVar2;
        return e1.b.e(e1.b.e(v02, e8), eVar5 != null ? eVar5.t0(i, e8, d9) : 0L);
    }

    public final float d(float f6) {
        return this.f6966e ? f6 * (-1) : f6;
    }

    public final long e(long j7) {
        return this.f6966e ? e1.b.f(j7, -1.0f) : j7;
    }

    public final Object f(t.j0 j0Var, p6.e eVar, i6.c cVar) {
        Object c8 = this.f6962a.c(j0Var, new b0.c(this, eVar, null, 15), cVar);
        return c8 == h6.a.f3204d ? c8 : c6.m.f1757a;
    }

    public final float g(long j7) {
        return Float.intBitsToFloat((int) (this.f6965d == j0.f7028e ? j7 >> 32 : j7 & 4294967295L));
    }

    public final long h(float f6) {
        long floatToRawIntBits;
        long j7;
        if (f6 == 0.0f) {
            return 0L;
        }
        if (this.f6965d == j0.f7028e) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f6);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j7 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f6);
            j7 = floatToRawIntBits3 << 32;
        }
        return j7 | (floatToRawIntBits & 4294967295L);
    }
}
