package com.google.android.gms.internal.ads;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.EnumC4631b;

/* loaded from: classes2.dex */
public final class Ev {

    /* renamed from: a, reason: collision with root package name */
    public final t2.E f24848a;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f24850c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f24853f;

    /* renamed from: g, reason: collision with root package name */
    public final Mt f24854g;

    /* renamed from: h, reason: collision with root package name */
    public final S2.a f24855h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f24849b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f24851d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24852e = new AtomicBoolean(false);

    public Ev(t2.E e6, ScheduledExecutorService scheduledExecutorService, Mt mt, S2.a aVar) {
        this.f24848a = e6;
        this.f24853f = scheduledExecutorService;
        this.f24854g = mt;
        this.f24855h = aVar;
    }

    public static String g(String str, EnumC4631b enumC4631b) {
        return str + ":" + enumC4631b;
    }

    public final void a(Hv hv) {
        int i = 1;
        if (hv.t() <= 0 && !hv.f25457m.get()) {
            i = 0;
        }
        c(hv, i);
    }

    public final void b(Hv hv, boolean z8) {
        Mt mt = this.f24854g;
        if (z8) {
            long longValue = ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31604Z)).longValue();
            EnumC4631b q6 = hv.q();
            String r9 = hv.r();
            C2593Hm a9 = ((C3165eo) mt.f26393u).a();
            a9.r(NativeAdvancedJsUtils.f18064p, "poact");
            a9.r("ad_unit_id", r9);
            a9.r(com.anythink.expressad.f.a.b.aB, hv.f25456l);
            a9.r("poact_ts", Long.toString(longValue));
            if (q6 != null) {
                a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q6.name().toLowerCase(Locale.ENGLISH));
            }
            a9.s();
        } else {
            this.f24855h.getClass();
            System.currentTimeMillis();
            EnumC4631b q9 = hv.q();
            String r10 = hv.r();
            C2593Hm a10 = ((C3165eo) mt.f26393u).a();
            a10.r(NativeAdvancedJsUtils.f18064p, "poac");
            a10.r("ad_unit_id", r10);
            a10.r(com.anythink.expressad.f.a.b.aB, hv.f25456l);
            if (q9 != null) {
                a10.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q9.name().toLowerCase(Locale.ENGLISH));
            }
            a10.s();
        }
        this.f24849b.set(false);
        l();
    }

    public final void c(Hv hv, int i) {
        if (i(hv)) {
            return;
        }
        if (i > 0) {
            this.f24853f.execute(new Cv(this, hv, i));
        }
        if (this.f24849b.get() || hv.t() != 0 || !hv.u()) {
            k(0L);
            return;
        }
        hv.k();
        k(((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31643d0)).longValue());
    }

    public final void d(Hv hv) {
        EnumC4631b q6 = hv.q();
        if (q6 == null) {
            return;
        }
        String g9 = g(hv.f25456l, q6);
        LinkedHashMap linkedHashMap = this.f24851d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(g9)) {
                linkedHashMap.remove(g9);
                int t9 = hv.t();
                int i = t9 - 1;
                if (!hv.f25457m.get()) {
                    t9 = i;
                }
                this.f24853f.execute(new Cv(this, Math.max(t9, 0), hv));
            }
        }
    }

    public final int e() {
        UB n9;
        LinkedHashMap linkedHashMap = this.f24851d;
        synchronized (linkedHashMap) {
            n9 = UB.n(linkedHashMap.values());
        }
        int size = n9.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Hv hv = (Hv) n9.get(i4);
            int t9 = hv.t();
            int i9 = t9 - 1;
            if (!hv.f25457m.get()) {
                t9 = i9;
            }
            i += Math.max(t9, 0);
        }
        return i;
    }

    public final int f() {
        int i;
        t2.E e6 = this.f24848a;
        e6.i();
        synchronized (e6.f40830a) {
            i = e6.f40828F;
        }
        C3151ea c3151ea = AbstractC3368ia.f31543S;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && i > 0) {
            return i;
        }
        return ((Integer) rVar.f40119c.a(AbstractC3368ia.f31634c0)).intValue();
    }

    public final void h(Hv hv) {
        if (hv.t() > 0 || hv.f25457m.get()) {
            this.f24853f.execute(new Bv(this, hv, 0));
        }
        this.f24849b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f24850c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f24850c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24852e.set(true);
    }

    public final boolean i(Hv hv) {
        boolean z8;
        EnumC4631b q6 = hv.q();
        if (q6 == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f24851d;
        synchronized (linkedHashMap) {
            z8 = !linkedHashMap.containsKey(g(hv.f25456l, q6));
        }
        return z8;
    }

    public final boolean j() {
        UB n9;
        LinkedHashMap linkedHashMap = this.f24851d;
        synchronized (linkedHashMap) {
            n9 = UB.n(linkedHashMap.values());
        }
        int size = n9.size();
        for (int i = 0; i < size; i++) {
            Hv hv = (Hv) n9.get(i);
            if (hv.t() == 0 && hv.u()) {
                return true;
            }
        }
        return false;
    }

    public final void k(long j9) {
        if (this.f24852e.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j9 > 0) {
                        this.f24850c = this.f24853f.schedule(new Dv(this, 1), j9, TimeUnit.MILLISECONDS);
                    } else {
                        this.f24853f.execute(new Dv(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        Hv hv;
        UB n9;
        if (this.f24849b.get()) {
            return;
        }
        synchronized (this) {
            hv = null;
            this.f24850c = null;
        }
        int f6 = f();
        if (e() < f6 || j()) {
            LinkedHashMap linkedHashMap = this.f24851d;
            synchronized (linkedHashMap) {
                n9 = UB.n(linkedHashMap.values());
            }
            int size = n9.size();
            double d2 = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                Hv hv2 = (Hv) n9.get(i);
                if (hv2.u()) {
                    double t9 = hv2.t() / hv2.s();
                    if (t9 < d2) {
                        d2 = t9;
                    }
                    if (t9 < d2) {
                        hv = hv2;
                    }
                }
            }
            if (hv != null) {
                hv.k();
                if (hv.t() > 0) {
                    Mt mt = this.f24854g;
                    this.f24855h.getClass();
                    mt.z("acmpa", System.currentTimeMillis(), hv.f25456l, hv.r(), hv.q(), hv.s(), hv.t(), 0, e(), f6);
                }
            }
            if (e() >= f6) {
                m();
            }
            if (e() < f6 || j()) {
                if (j()) {
                    this.f24853f.execute(new Dv(this, 2));
                    return;
                }
                synchronized (this) {
                    this.f24850c = this.f24853f.schedule(new Dv(this, 3), ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31651e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            m();
        }
        this.f24852e.set(false);
    }

    public final void m() {
        int size;
        LinkedHashMap linkedHashMap = this.f24851d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        Mt mt = this.f24854g;
        this.f24855h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int f6 = f();
        C2593Hm a9 = ((C3165eo) mt.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, "acmlr");
        a9.r("pat", Long.toString(currentTimeMillis));
        a9.r("mpl", Integer.toString(f6));
        a9.r("pas", Integer.toString(size));
        a9.s();
    }

    public final void n(Hv hv, int i) {
        this.f24855h.getClass();
        this.f24854g.z("acmpr", System.currentTimeMillis(), hv.f25456l, hv.r(), hv.q(), hv.s(), hv.t(), i, e(), f());
    }
}
