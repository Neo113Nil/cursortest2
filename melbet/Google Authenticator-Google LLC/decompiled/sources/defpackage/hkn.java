package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hkn implements hkv, hlu {
    private static final String a = new String();
    public final long b;
    public hkm c;
    public hld d;
    private final Level e;
    private hkq f;
    private hmw g;
    private Object[] h;

    protected hkn(Level level) {
        long b = hmu.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = b;
    }

    private final void J(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof hki) {
                objArr[i] = ((hki) obj).a();
            }
        }
        if (str != a) {
            this.g = new hmw(a(), str);
        }
        hob k = hmu.k();
        if (!k.a()) {
            hma k2 = k();
            hky hkyVar = hkl.h;
            hob hobVar = (hob) k2.d(hkyVar);
            if (hobVar != null && !hobVar.a()) {
                k = k.a() ? hobVar : new hob(new hnz(k.c, hobVar.c));
            }
            p(hkyVar, k);
        }
        hjy c = c();
        try {
            hoo a2 = hoo.a();
            int i2 = a2.a + 1;
            a2.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    c.a.b(this);
                } else {
                    hjy.i("unbounded recursion in log statement", this);
                }
                if (a2 != null) {
                    a2.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                c.a.a(e, this);
            } catch (hlx e2) {
                throw e2;
            } catch (RuntimeException e3) {
                hjy.i(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean K() {
        hkr hkrVar;
        hkm hkmVar;
        int i;
        hkq hkqVar = this.f;
        if (hkqVar == null) {
            hkqVar = hmu.g().a(hkn.class, 1);
            this.f = hkqVar;
        }
        if (hkqVar != hkq.a) {
            hkrVar = this.f;
            hkm hkmVar2 = this.c;
            if (hkmVar2 != null && (i = hkmVar2.b) > 0) {
                hkrVar.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (hkl.f.equals(hkmVar2.c(i2))) {
                        Object e = hkmVar2.e(i2);
                        hkrVar = e instanceof hkw ? ((hkw) e).b() : new hlh(hkrVar, e);
                    }
                }
            }
        } else {
            hkrVar = null;
        }
        boolean b = b(hkrVar);
        hld hldVar = this.d;
        if (hldVar == null) {
            return b;
        }
        hlc hlcVar = (hlc) hlc.a.b(hkrVar, this.c);
        int incrementAndGet = hlcVar.c.incrementAndGet();
        int i3 = -1;
        if (hldVar != hld.c && hlcVar.b.compareAndSet(false, true)) {
            try {
                hldVar.a();
                hlcVar.b.set(false);
                hlcVar.c.addAndGet(-incrementAndGet);
                i3 = (-1) + incrementAndGet;
            } catch (Throwable th) {
                hlcVar.b.set(false);
                throw th;
            }
        }
        if (b && i3 > 0 && (hkmVar = this.c) != null) {
            hkmVar.f(hkl.e, Integer.valueOf(i3));
        }
        return b & (i3 >= 0);
    }

    @Override // defpackage.hlu
    public final boolean A() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(hkl.g));
    }

    @Override // defpackage.hlu
    public final Object[] B() {
        hoq.h(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.hkv
    public final hkv C(TimeUnit timeUnit) {
        if (A()) {
            return d();
        }
        hky hkyVar = hkl.d;
        hks hksVar = hkd.a;
        p(hkyVar, new hkc(timeUnit));
        return d();
    }

    @Override // defpackage.hkv
    public final void D(long j, Object obj) {
        if (K()) {
            J("Recording trace %d: %s", Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.hkv
    public final void E(Object obj, long j) {
        if (K()) {
            J("Scheduled worker: %s at %s", obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.hkv
    public final void F(Object obj, Object obj2, Object obj3, Object obj4) {
        if (K()) {
            J("Processes: %s, %s, %s, %s", obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.hkv
    public final void G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (K()) {
            J("Cannot get fresh accounts after retries. hasLastSyncTimestampMs: %s, lastSyncTimestampMs: %s, hasLastInvalidateTimestampMs: %s, lastInvalidateTimestampMs: %s, requestTimeMs: %s, maxAgeMs: %s", obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.hkv
    public final void H(boolean z, boolean z2) {
        if (K()) {
            J("BuildCompat.isAtLeastU()=%b, isTargetSdkAtLeastU()=%b", Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.hkv
    public final void I(long j) {
        if (K()) {
            J("Invalid frame time: %d", Long.valueOf(j));
        }
    }

    protected abstract hoj a();

    protected boolean b(hkr hkrVar) {
        throw null;
    }

    protected abstract hjy c();

    protected abstract hkv d();

    @Override // defpackage.hlu
    public final long e() {
        return this.b;
    }

    @Override // defpackage.hlu
    public final hkq f() {
        hkq hkqVar = this.f;
        if (hkqVar != null) {
            return hkqVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.hkv
    public final hkv g(hky hkyVar, Object obj) {
        hkyVar.getClass();
        if (obj != null) {
            p(hkyVar, obj);
        }
        return d();
    }

    @Override // defpackage.hkv
    public final hkv h(Throwable th) {
        return g(hkl.a, th);
    }

    @Override // defpackage.hkv
    public final hkv i(String str, String str2, int i, String str3) {
        hkq hkqVar = hkq.a;
        hkp hkpVar = new hkp(str, str2, i, str3);
        if (this.f == null) {
            this.f = hkpVar;
        }
        return d();
    }

    @Override // defpackage.hkv
    public final hkv j(hlj hljVar) {
        hljVar.getClass();
        if (hljVar != hlj.NONE) {
            p(hkl.i, hljVar);
        }
        return d();
    }

    @Override // defpackage.hlu
    public final hma k() {
        hkm hkmVar = this.c;
        return hkmVar != null ? hkmVar : hlz.a;
    }

    @Override // defpackage.hlu
    public final hmw l() {
        return this.g;
    }

    @Override // defpackage.hlu
    public final Object m() {
        hoq.h(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.hlu
    public final String n() {
        return c().a.d();
    }

    @Override // defpackage.hlu
    public final Level o() {
        return this.e;
    }

    protected final void p(hky hkyVar, Object obj) {
        hkm hkmVar = this.c;
        if (hkmVar == null) {
            hkmVar = new hkm();
            this.c = hkmVar;
        }
        hkmVar.f(hkyVar, obj);
    }

    @Override // defpackage.hkv
    public final void q() {
        if (K()) {
            J(a, "");
        }
    }

    @Override // defpackage.hkv
    public final void r(Object obj) {
        if (K()) {
            J("%s", obj);
        }
    }

    @Override // defpackage.hkv
    public final void s(String str) {
        if (K()) {
            J(a, str);
        }
    }

    @Override // defpackage.hkv
    public final void t(String str, int i) {
        if (K()) {
            J(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.hkv
    public final void u(String str, Object obj) {
        if (K()) {
            J(str, obj);
        }
    }

    @Override // defpackage.hkv
    public final void v(String str, int i, int i2) {
        if (K()) {
            J(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.hkv
    public final void w(String str, Object obj, Object obj2) {
        if (K()) {
            J(str, obj, obj2);
        }
    }

    @Override // defpackage.hkv
    public final void x(String str, Object obj, Object obj2, Object obj3) {
        if (K()) {
            J(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.hkv
    public final void y(String str, Object[] objArr) {
        if (K()) {
            J(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.hkv
    public final boolean z() {
        return A() || c().j(this.e);
    }
}
