package com.applovin.impl.sdk;

import com.applovin.impl.sdk.d.q;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class r implements m, AppLovinNativeAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    protected final j f3361a;

    /* renamed from: b, reason: collision with root package name */
    protected final p f3362b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3363c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, s> f3364d = new HashMap();
    private final Map<com.applovin.impl.sdk.ad.d, s> e = new HashMap();
    private final Map<com.applovin.impl.sdk.ad.d, Object> f = new HashMap();
    private final Set<com.applovin.impl.sdk.ad.d> g = new HashSet();

    r(j jVar) {
        this.f3361a = jVar;
        this.f3362b = jVar.u();
    }

    private void b(final com.applovin.impl.sdk.ad.d dVar, Object obj) {
        synchronized (this.f3363c) {
            if (this.f.containsKey(dVar)) {
                this.f3362b.c("PreloadManager", "Possibly missing prior registered preload callback.");
            }
            this.f.put(dVar, obj);
        }
        final int intValue = ((Integer) this.f3361a.a(com.applovin.impl.sdk.b.b.aH)).intValue();
        if (intValue > 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.r.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (r.this.f3363c) {
                        Object obj2 = r.this.f.get(dVar);
                        if (obj2 != null) {
                            r.this.f.remove(dVar);
                            r.this.f3362b.d("PreloadManager", "Load callback for zone " + dVar + " timed out after " + intValue + " seconds");
                            r.this.a(obj2, dVar, AppLovinErrorCodes.FETCH_AD_TIMEOUT);
                        }
                    }
                }
            }, TimeUnit.SECONDS.toMillis(intValue));
        }
    }

    private void c(com.applovin.impl.sdk.ad.j jVar) {
        i(a(jVar));
    }

    private s j(com.applovin.impl.sdk.ad.d dVar) {
        return this.f3364d.get(dVar);
    }

    private s k(com.applovin.impl.sdk.ad.d dVar) {
        return this.e.get(dVar);
    }

    private boolean l(com.applovin.impl.sdk.ad.d dVar) {
        boolean z;
        synchronized (this.f3363c) {
            s j = j(dVar);
            z = j != null && j.c();
        }
        return z;
    }

    private s m(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f3363c) {
            s k = k(dVar);
            if (k != null && k.a() > 0) {
                return k;
            }
            return j(dVar);
        }
    }

    private boolean n(com.applovin.impl.sdk.ad.d dVar) {
        boolean contains;
        synchronized (this.f3363c) {
            contains = this.g.contains(dVar);
        }
        return contains;
    }

    abstract com.applovin.impl.sdk.ad.d a(com.applovin.impl.sdk.ad.j jVar);

    abstract com.applovin.impl.sdk.d.a a(com.applovin.impl.sdk.ad.d dVar);

    abstract void a(Object obj, com.applovin.impl.sdk.ad.d dVar, int i);

    abstract void a(Object obj, com.applovin.impl.sdk.ad.j jVar);

    public void a(LinkedHashSet<com.applovin.impl.sdk.ad.d> linkedHashSet) {
        if (this.f == null || this.f.isEmpty()) {
            return;
        }
        synchronized (this.f3363c) {
            Iterator<com.applovin.impl.sdk.ad.d> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                com.applovin.impl.sdk.ad.d next = it.next();
                if (!next.l() && !linkedHashSet.contains(next)) {
                    Object obj = this.f.get(next);
                    it.remove();
                    this.f3362b.e("AppLovinAdService", "Failed to load ad for zone (" + next.a() + "). Please check that the zone has been added to your AppLovin account and given at least 30 minutes to fully propagate.");
                    a(obj, next, -7);
                }
            }
        }
    }

    public boolean a(com.applovin.impl.sdk.ad.d dVar, Object obj) {
        boolean z;
        synchronized (this.f3363c) {
            if (n(dVar)) {
                z = false;
            } else {
                b(dVar, obj);
                z = true;
            }
        }
        return z;
    }

    public void b(com.applovin.impl.sdk.ad.d dVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            i(dVar);
        }
    }

    void b(com.applovin.impl.sdk.ad.j jVar) {
        Object obj;
        p pVar;
        String str;
        String str2;
        com.applovin.impl.sdk.ad.d a2 = a(jVar);
        boolean k = a2.k();
        synchronized (this.f3363c) {
            obj = this.f.get(a2);
            this.f.remove(a2);
            this.g.add(a2);
            if (obj != null && !k) {
                pVar = this.f3362b;
                str = "PreloadManager";
                str2 = "Additional callback found or dummy ads are enabled; skipping enqueue...";
                pVar.a(str, str2);
            }
            j(a2).a(jVar);
            pVar = this.f3362b;
            str = "PreloadManager";
            str2 = "Ad enqueued: " + jVar;
            pVar.a(str, str2);
        }
        if (obj != null) {
            this.f3362b.a("PreloadManager", "Called additional callback regarding " + jVar);
            try {
                if (k) {
                    a(obj, new com.applovin.impl.sdk.ad.h(a2, this.f3361a));
                } else {
                    a(obj, jVar);
                    c(jVar);
                }
            } catch (Throwable th) {
                this.f3361a.u().c("PreloadManager", "Encountered throwable while notifying user callback", th);
            }
        }
        this.f3362b.a("PreloadManager", "Pulled ad from network and saved to preload cache: " + jVar);
    }

    public boolean b(com.applovin.impl.sdk.ad.d dVar) {
        return this.f.containsKey(dVar);
    }

    public com.applovin.impl.sdk.ad.j c(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.j f;
        synchronized (this.f3363c) {
            s m = m(dVar);
            f = m != null ? m.f() : null;
        }
        return f;
    }

    void c(com.applovin.impl.sdk.ad.d dVar, int i) {
        Object remove;
        this.f3362b.a("PreloadManager", "Failed to pre-load an ad of zone " + dVar + ", error code " + i);
        synchronized (this.f3363c) {
            remove = this.f.remove(dVar);
            this.g.add(dVar);
        }
        if (remove != null) {
            try {
                a(remove, dVar, i);
            } catch (Throwable th) {
                this.f3361a.u().c("PreloadManager", "Encountered exception while invoking user callback", th);
            }
        }
    }

    public com.applovin.impl.sdk.ad.j d(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.j e;
        synchronized (this.f3363c) {
            s m = m(dVar);
            e = m != null ? m.e() : null;
        }
        return e;
    }

    public com.applovin.impl.sdk.ad.j e(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.j jVar;
        p pVar;
        String str;
        StringBuilder sb;
        String str2;
        com.applovin.impl.sdk.ad.h hVar;
        synchronized (this.f3363c) {
            s j = j(dVar);
            jVar = null;
            if (j != null) {
                if (dVar.k()) {
                    s k = k(dVar);
                    if (k.c()) {
                        hVar = new com.applovin.impl.sdk.ad.h(dVar, this.f3361a);
                    } else if (j.a() > 0) {
                        k.a(j.e());
                        hVar = new com.applovin.impl.sdk.ad.h(dVar, this.f3361a);
                    } else if (k.a() > 0 && ((Boolean) this.f3361a.a(com.applovin.impl.sdk.b.b.bW)).booleanValue()) {
                        hVar = new com.applovin.impl.sdk.ad.h(dVar, this.f3361a);
                    }
                    jVar = hVar;
                } else {
                    jVar = j.e();
                }
            }
        }
        if (jVar != null) {
            pVar = this.f3362b;
            str = "PreloadManager";
            sb = new StringBuilder();
            str2 = "Retrieved ad of zone ";
        } else {
            pVar = this.f3362b;
            str = "PreloadManager";
            sb = new StringBuilder();
            str2 = "Unable to retrieve ad of zone ";
        }
        sb.append(str2);
        sb.append(dVar);
        sb.append("...");
        pVar.a(str, sb.toString());
        return jVar;
    }

    public void f(com.applovin.impl.sdk.ad.d dVar) {
        int b2;
        if (dVar == null) {
            return;
        }
        synchronized (this.f3363c) {
            s j = j(dVar);
            b2 = j != null ? j.b() - j.a() : 0;
        }
        b(dVar, b2);
    }

    public boolean g(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f3363c) {
            s k = k(dVar);
            boolean z = true;
            if (((Boolean) this.f3361a.a(com.applovin.impl.sdk.b.b.bX)).booleanValue() && k != null && k.a() > 0) {
                return true;
            }
            s j = j(dVar);
            if (j == null || j.d()) {
                z = false;
            }
            return z;
        }
    }

    public void h(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f3363c) {
            s j = j(dVar);
            if (j != null) {
                j.a(dVar.e());
            } else {
                this.f3364d.put(dVar, new s(dVar.e()));
            }
            s k = k(dVar);
            if (k != null) {
                k.a(dVar.f());
            } else {
                this.e.put(dVar, new s(dVar.f()));
            }
        }
    }

    public void i(com.applovin.impl.sdk.ad.d dVar) {
        if (!((Boolean) this.f3361a.a(com.applovin.impl.sdk.b.b.aI)).booleanValue() || l(dVar)) {
            return;
        }
        this.f3362b.a("PreloadManager", "Preloading ad for zone " + dVar + "...");
        this.f3361a.C().a(a(dVar), q.a.MAIN, 500L);
    }
}
