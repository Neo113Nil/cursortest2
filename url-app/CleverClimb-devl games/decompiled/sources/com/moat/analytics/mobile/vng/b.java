package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.vng.j;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    j f7337a;

    /* renamed from: b, reason: collision with root package name */
    final String f7338b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f7339c;

    /* renamed from: d, reason: collision with root package name */
    boolean f7340d;
    boolean e;
    private WeakReference<View> f;
    private WeakReference<WebView> g;
    private final z h;
    private final boolean i;

    b(View view, boolean z, boolean z2) {
        String str;
        p.a(3, "BaseTracker", this, "Initializing.");
        if (z) {
            str = "m" + hashCode();
        } else {
            str = "";
        }
        this.f7338b = str;
        this.f = new WeakReference<>(view);
        this.i = z;
        this.f7339c = z2;
        this.f7340d = false;
        this.e = false;
        this.h = new z();
    }

    private void g() {
        com.moat.analytics.mobile.vng.a.a.a.a(this.g);
        p.a(3, "BaseTracker", this, "Attempting bridge installation.");
        if (this.g.get() == null) {
            this.f7337a = null;
            p.a(3, "BaseTracker", this, "Bridge not installed, WebView is null.");
            return;
        }
        if (!this.i && !this.f7339c) {
            this.f7337a = new j(this.g.get(), j.a.WEBVIEW);
        }
        boolean z = this.f7337a.f7366a;
        StringBuilder sb = new StringBuilder();
        sb.append("Bridge ");
        sb.append(z ? "" : "not ");
        sb.append("installed.");
        p.a(3, "BaseTracker", this, sb.toString());
    }

    abstract String a();

    void a(WebView webView) {
        if (webView != null) {
            this.g = new WeakReference<>(webView);
            if (this.f7337a == null) {
                g();
            }
            if (this.f7337a == null || !this.f7337a.f7366a) {
                return;
            }
            this.f7337a.a(this);
        }
    }

    void a(j jVar) {
        this.f7337a = jVar;
    }

    boolean b() {
        p.a(3, "BaseTracker", this, "Attempting to start impression.");
        if (this.e) {
            p.a(3, "BaseTracker", this, "startTracking failed, tracker already started");
            p.a("[INFO] ", a() + " already started");
            return false;
        }
        boolean b2 = this.f7337a.b(this);
        StringBuilder sb = new StringBuilder();
        sb.append("Impression ");
        sb.append(b2 ? "" : "not ");
        sb.append("started.");
        p.a(3, "BaseTracker", this, sb.toString());
        if (!b2) {
            return b2;
        }
        this.f7340d = true;
        this.e = true;
        return b2;
    }

    boolean c() {
        p.a(3, "BaseTracker", this, "Attempting to stop impression.");
        this.f7340d = false;
        boolean c2 = this.f7337a.c(this);
        StringBuilder sb = new StringBuilder();
        sb.append("Impression tracking ");
        sb.append(c2 ? "" : "not ");
        sb.append("stopped.");
        p.a(3, "BaseTracker", this, sb.toString());
        return c2;
    }

    public void changeTargetView(View view) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("changing view to ");
        if (view != null) {
            str = view.getClass().getSimpleName() + "@" + view.hashCode();
        } else {
            str = "null";
        }
        sb.append(str);
        p.a(3, "BaseTracker", this, sb.toString());
        this.f = new WeakReference<>(view);
    }

    View d() {
        return this.f.get();
    }

    String e() {
        if (d() == null) {
            return "";
        }
        return d().getClass().getSimpleName() + "@" + d().hashCode();
    }

    String f() {
        this.h.a(this.f7338b, d());
        return this.h.f7434a;
    }

    @Deprecated
    public void setActivity(Activity activity) {
    }

    public void startTracking() {
        boolean z;
        try {
            p.a(3, "BaseTracker", this, "In startTracking method.");
            z = b();
        } catch (Exception e) {
            m.a(e);
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to start tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        p.a(3, "BaseTracker", this, sb.toString());
        String str = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append(" startTracking ");
        sb2.append(z ? "succeeded" : "failed");
        sb2.append(" for ");
        sb2.append(e());
        p.a(str, sb2.toString());
    }

    public void stopTracking() {
        boolean z;
        try {
            p.a(3, "BaseTracker", this, "In stopTracking method.");
            z = c();
        } catch (Exception e) {
            m.a(e);
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to stop tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        p.a(3, "BaseTracker", this, sb.toString());
        String str = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append(" stopTracking ");
        sb2.append(z ? "succeeded" : "failed");
        sb2.append(" for ");
        sb2.append(e());
        p.a(str, sb2.toString());
    }
}
