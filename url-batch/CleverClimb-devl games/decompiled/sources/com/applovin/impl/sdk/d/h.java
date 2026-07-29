package com.applovin.impl.sdk.d;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.a.e;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.List;

/* loaded from: classes.dex */
class h extends c {

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a.a f3093c;

    public h(com.applovin.impl.a.a aVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, jVar, appLovinAdLoadListener);
        this.f3093c = aVar;
    }

    private void h() {
        String str;
        com.applovin.impl.a.a aVar;
        String str2;
        if (this.f3093c.l()) {
            com.applovin.impl.a.b d2 = this.f3093c.d();
            if (d2 != null) {
                com.applovin.impl.a.e b2 = d2.b();
                if (b2 == null) {
                    d("Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                try {
                    Uri b3 = b2.b();
                    String uri = b3 != null ? b3.toString() : "";
                    String c2 = b2.c();
                    if (!URLUtil.isValidUrl(uri) && !com.applovin.impl.sdk.e.i.b(c2)) {
                        c("Companion ad does not have any resources attached. Skipping...");
                        return;
                    }
                    if (b2.a() == e.a.STATIC) {
                        a("Caching static companion ad at " + uri + "...");
                        List<String> f = this.f3093c.f();
                        Uri b4 = b(uri, f, (f == null || f.isEmpty()) ? false : true);
                        if (b4 == null) {
                            str2 = "Failed to cache static companion ad";
                            d(str2);
                            return;
                        } else {
                            b2.a(b4);
                            aVar = this.f3093c;
                            aVar.a(true);
                            return;
                        }
                    }
                    if (b2.a() != e.a.HTML) {
                        if (b2.a() == e.a.IFRAME) {
                            a("Skip caching of iFrame resource...");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.e.i.b(uri)) {
                        a("Begin caching HTML companion ad. Fetching from " + uri + "...");
                        String g = g(uri);
                        if (!com.applovin.impl.sdk.e.i.b(g)) {
                            str2 = "Unable to load companion ad resources from " + uri;
                            d(str2);
                            return;
                        }
                        a("HTML fetched. Caching HTML now...");
                        b2.a(a(g, this.f3093c.f(), this.f3093c));
                        aVar = this.f3093c;
                    } else {
                        a("Caching provided HTML for companion ad. No fetch required. HTML: " + c2);
                        b2.a(a(c2, this.f3093c.f(), this.f3093c));
                        aVar = this.f3093c;
                    }
                    aVar.a(true);
                    return;
                } catch (Throwable th) {
                    a("Failed to cache companion ad", th);
                    return;
                }
            }
            str = "No companion ad provided. Skipping...";
        } else {
            str = "Companion ad caching disabled. Skipping...";
        }
        a(str);
    }

    private void i() {
        com.applovin.impl.a.k c2;
        Uri b2;
        if (!this.f3093c.ax()) {
            a("Video caching disabled. Skipping...");
            return;
        }
        if (this.f3093c.a() == null || (c2 = this.f3093c.c()) == null || (b2 = c2.b()) == null) {
            return;
        }
        List<String> f = this.f3093c.f();
        Uri a2 = a(b2.toString(), f, (f == null || f.isEmpty()) ? false : true);
        if (a2 == null) {
            d("Failed to cache video file: " + c2);
            return;
        }
        a("Video file successfully cached into: " + a2);
        c2.a(a2);
    }

    private void j() {
        String j;
        String str;
        if (this.f3093c.k() != null) {
            a("Begin caching HTML template. Fetching from " + this.f3093c.k() + "...");
            j = a(this.f3093c.k().toString(), this.f3093c.G());
        } else {
            j = this.f3093c.j();
        }
        if (com.applovin.impl.sdk.e.i.b(j)) {
            this.f3093c.a(a(j, this.f3093c.G(), this.f3093c));
            str = "Finish caching HTML template " + this.f3093c.j() + " for ad #" + this.f3093c.getAdIdNumber();
        } else {
            str = "Unable to load HTML template";
        }
        a(str);
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.l;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Begin caching for VAST ad #" + this.f3093c.getAdIdNumber() + "...");
        f();
        h();
        i();
        j();
        g();
        a("Finished caching VAST ad #" + this.f3093c.getAdIdNumber());
        long currentTimeMillis = System.currentTimeMillis() - this.f3093c.getCreatedAtMillis();
        com.applovin.impl.sdk.c.d.a(this.f3093c, this.f3073b);
        com.applovin.impl.sdk.c.d.a(currentTimeMillis, this.f3093c, this.f3073b);
        a(this.f3093c);
    }
}
