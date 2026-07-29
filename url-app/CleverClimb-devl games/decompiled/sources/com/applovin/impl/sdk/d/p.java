package com.applovin.impl.sdk.d;

import android.app.Activity;
import com.applovin.impl.sdk.d.q;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class p extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3112a;

    public p(com.applovin.impl.sdk.j jVar) {
        super("TaskInitializeSdk", jVar);
        this.f3112a = jVar;
    }

    private void a(com.applovin.impl.sdk.b.b<Boolean> bVar) {
        if (((Boolean) this.f3112a.a(bVar)).booleanValue()) {
            this.f3112a.L().f(com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, this.f3112a));
        }
    }

    private boolean f() {
        if (com.applovin.impl.sdk.k.a("android.permission.INTERNET", d())) {
            return true;
        }
        b().u().e(c(), "Unable to enable AppLovin SDK: no android.permission.INTERNET");
        return false;
    }

    private void g() {
        b bVar = new b(this.f3112a);
        if (((Boolean) this.f3112a.a(com.applovin.impl.sdk.b.b.dQ)).booleanValue()) {
            this.f3112a.C().a(bVar);
        } else {
            this.f3112a.C().a(bVar, q.a.MAIN);
        }
    }

    private void h() {
        this.f3112a.L().a();
        this.f3112a.M().a();
    }

    private void i() {
        j();
        k();
        l();
    }

    private void j() {
        LinkedHashSet<com.applovin.impl.sdk.ad.d> b2 = this.f3112a.O().b();
        if (b2.isEmpty()) {
            return;
        }
        a("Scheduling preload(s) for " + b2.size() + " zone(s)");
        Iterator<com.applovin.impl.sdk.ad.d> it = b2.iterator();
        while (it.hasNext()) {
            com.applovin.impl.sdk.ad.d next = it.next();
            if (next.d()) {
                this.f3112a.o().preloadAds(next);
            } else {
                this.f3112a.n().preloadAds(next);
            }
        }
    }

    private void k() {
        com.applovin.impl.sdk.b.b<Boolean> bVar = com.applovin.impl.sdk.b.b.aK;
        String str = (String) this.f3112a.a(com.applovin.impl.sdk.b.b.aJ);
        boolean z = false;
        if (str.length() > 0) {
            Iterator<String> it = com.applovin.impl.sdk.e.c.a(str).iterator();
            while (it.hasNext()) {
                AppLovinAdSize fromString = AppLovinAdSize.fromString(it.next());
                if (fromString != null) {
                    this.f3112a.L().f(com.applovin.impl.sdk.ad.d.a(fromString, AppLovinAdType.REGULAR, this.f3112a));
                    if (AppLovinAdSize.INTERSTITIAL.getLabel().equals(fromString.getLabel())) {
                        a(bVar);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        a(bVar);
    }

    private void l() {
        if (((Boolean) this.f3112a.a(com.applovin.impl.sdk.b.b.aL)).booleanValue()) {
            this.f3112a.M().f(com.applovin.impl.sdk.ad.d.h(this.f3112a));
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.f3056a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00de, code lost:
    
        if (r6.f3112a.d() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        r3 = "succeeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e5, code lost:
    
        r2.append(r3);
        r2.append(" in ");
        r2.append(java.lang.System.currentTimeMillis() - r0);
        r2.append("ms");
        a(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0157, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e3, code lost:
    
        r3 = "failed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        if (r6.f3112a.d() == false) goto L16;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        StringBuilder sb;
        long currentTimeMillis = System.currentTimeMillis();
        a("Initializing AppLovin SDK 9.1.3...");
        try {
            try {
                if (f()) {
                    this.f3112a.D().d();
                    this.f3112a.D().c(com.applovin.impl.sdk.c.g.f3051b);
                    this.f3112a.N().c(d());
                    this.f3112a.N().b(d());
                    h();
                    i();
                    if (this.f3112a.y() != null) {
                        Activity y = this.f3112a.y();
                        this.f3112a.a(y).maybeInitialize(y);
                    }
                    this.f3112a.P().a();
                    this.f3112a.h();
                    g();
                    this.f3112a.G().e();
                    this.f3112a.a(true);
                    this.f3112a.F().a();
                    this.f3112a.p().trackEvent("landing");
                } else {
                    this.f3112a.a(false);
                    b().u().e(c(), "Couldn't initialize the AppLovin SDK due to missing INTERNET permission");
                }
                this.f3112a.e();
                if (((Boolean) this.f3112a.a(com.applovin.impl.sdk.b.b.aj)).booleanValue()) {
                    this.f3112a.a(((Long) this.f3112a.a(com.applovin.impl.sdk.b.b.ak)).longValue());
                }
                sb = new StringBuilder();
                sb.append("AppLovin SDK 9.1.3 initialization ");
            } catch (Throwable th) {
                a("Unable to initialize SDK.", th);
                this.f3112a.a(false);
                this.f3112a.E().a(a());
                this.f3112a.e();
                if (((Boolean) this.f3112a.a(com.applovin.impl.sdk.b.b.aj)).booleanValue()) {
                    this.f3112a.a(((Long) this.f3112a.a(com.applovin.impl.sdk.b.b.ak)).longValue());
                }
                sb = new StringBuilder();
                sb.append("AppLovin SDK 9.1.3 initialization ");
            }
        } catch (Throwable th2) {
            this.f3112a.e();
            if (((Boolean) this.f3112a.a(com.applovin.impl.sdk.b.b.aj)).booleanValue()) {
                this.f3112a.a(((Long) this.f3112a.a(com.applovin.impl.sdk.b.b.ak)).longValue());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AppLovin SDK 9.1.3 initialization ");
            sb2.append(this.f3112a.d() ? "succeeded" : "failed");
            sb2.append(" in ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append("ms");
            a(sb2.toString());
            throw th2;
        }
    }
}
