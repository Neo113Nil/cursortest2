package com.applovin.impl.sdk.d;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f3088c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3089d;
    private boolean e;

    public d(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, jVar, appLovinAdLoadListener);
        this.f3088c = aVar;
    }

    private void h() {
        a("Caching HTML resources...");
        this.f3088c.a(a(this.f3088c.a(), this.f3088c.G(), this.f3088c));
        this.f3088c.a(true);
        a("Finish caching non-video resources for ad #" + this.f3088c.getAdIdNumber());
        a("Ad updated with cachedHTML = " + this.f3088c.a());
    }

    private void i() {
        Uri e = e(this.f3088c.f());
        if (e != null) {
            this.f3088c.c();
            this.f3088c.a(e);
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.i;
    }

    public void a(boolean z) {
        this.f3089d = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b2 = this.f3088c.b();
        boolean z = this.e;
        if (b2 || z) {
            a("Begin caching for streaming ad #" + this.f3088c.getAdIdNumber() + "...");
            f();
            if (b2) {
                if (this.f3089d) {
                    g();
                }
                h();
                if (!this.f3089d) {
                    g();
                }
                i();
            } else {
                g();
                h();
            }
        } else {
            a("Begin processing for non-streaming ad #" + this.f3088c.getAdIdNumber() + "...");
            f();
            h();
            i();
            g();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3088c.getCreatedAtMillis();
        com.applovin.impl.sdk.c.d.a(this.f3088c, this.f3073b);
        com.applovin.impl.sdk.c.d.a(currentTimeMillis, this.f3088c, this.f3073b);
        a(this.f3088c);
    }
}
