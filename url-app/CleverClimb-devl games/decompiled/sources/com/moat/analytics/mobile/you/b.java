package com.moat.analytics.mobile.you;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.you.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    m f7457a = null;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<WebView> f7458b;

    /* renamed from: c, reason: collision with root package name */
    j f7459c;

    /* renamed from: d, reason: collision with root package name */
    TrackerListener f7460d;
    final String e;
    final boolean f;
    private WeakReference<View> g;
    private final z h;
    private final boolean i;
    private boolean j;
    private boolean k;

    b(View view, boolean z, boolean z2) {
        String str;
        p.a(3, "BaseTracker", this, "Initializing.");
        if (z) {
            str = "m" + hashCode();
        } else {
            str = "";
        }
        this.e = str;
        this.g = new WeakReference<>(view);
        this.i = z;
        this.f = z2;
        this.j = false;
        this.k = false;
        this.h = new z();
    }

    private void i() {
        String str;
        String str2;
        p.a(3, "BaseTracker", this, "Attempting bridge installation.");
        if (this.f7458b.get() != null) {
            this.f7459c = new j(this.f7458b.get(), j.a.WEBVIEW);
            str = "BaseTracker";
            str2 = "Bridge installed.";
        } else {
            this.f7459c = null;
            str = "BaseTracker";
            str2 = "Bridge not installed, WebView is null.";
        }
        p.a(3, str, this, str2);
    }

    private void j() {
        if (this.j) {
            throw new m("Tracker already started");
        }
    }

    private void k() {
        if (this.k) {
            throw new m("Tracker already stopped");
        }
    }

    private boolean l() {
        return this.i || this.f;
    }

    abstract String a();

    void a(WebView webView) {
        if (webView != null) {
            this.f7458b = new WeakReference<>(webView);
            if (this.f7459c == null && !l()) {
                i();
            }
            if (this.f7459c != null) {
                this.f7459c.a(this);
            }
        }
    }

    void a(j jVar) {
        this.f7459c = jVar;
    }

    void a(String str, Exception exc) {
        try {
            m.a(exc);
            String a2 = m.a(str, exc);
            if (this.f7460d != null) {
                this.f7460d.onTrackingFailedToStart(a2);
            }
            p.a(3, "BaseTracker", this, a2);
            p.a("[ERROR] ", a() + " " + a2);
        } catch (Exception unused) {
        }
    }

    void a(List<String> list) {
        if (f() == null && !this.f) {
            list.add("Tracker's target view is null");
        }
        if (!list.isEmpty()) {
            throw new m(TextUtils.join(" and ", list));
        }
    }

    void b() {
        p.a(3, "BaseTracker", this, "Attempting to start impression.");
        c();
        d();
        a(new ArrayList());
        if (this.f7459c == null) {
            p.a(3, "BaseTracker", this, "Bridge is null, won't start tracking");
            throw new m("Bridge is null");
        }
        this.f7459c.b(this);
        this.j = true;
        p.a(3, "BaseTracker", this, "Impression started.");
    }

    void c() {
        if (this.f7457a == null) {
            return;
        }
        throw new m("Tracker initialization failed: " + this.f7457a.getMessage());
    }

    public void changeTargetView(View view) {
        p.a(3, "BaseTracker", this, "changing view to " + p.a(view));
        this.g = new WeakReference<>(view);
    }

    void d() {
        j();
        k();
    }

    boolean e() {
        return this.j && !this.k;
    }

    View f() {
        return this.g.get();
    }

    String g() {
        return p.a(f());
    }

    String h() {
        this.h.a(this.e, f());
        return this.h.f7567a;
    }

    public void removeListener() {
        this.f7460d = null;
    }

    @Deprecated
    public void setActivity(Activity activity) {
    }

    public void setListener(TrackerListener trackerListener) {
        this.f7460d = trackerListener;
    }

    public void startTracking() {
        try {
            p.a(3, "BaseTracker", this, "In startTracking method.");
            b();
            if (this.f7460d != null) {
                this.f7460d.onTrackingStarted("Tracking started on " + g());
            }
            String str = "startTracking succeeded for " + g();
            p.a(3, "BaseTracker", this, str);
            p.a("[SUCCESS] ", a() + " " + str);
        } catch (Exception e) {
            a("startTracking", e);
        }
    }

    public void stopTracking() {
        boolean z = false;
        try {
            p.a(3, "BaseTracker", this, "In stopTracking method.");
            this.k = true;
            if (this.f7459c != null) {
                this.f7459c.c(this);
                z = true;
            }
        } catch (Exception e) {
            m.a(e);
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
        sb2.append(g());
        p.a(str, sb2.toString());
        if (this.f7460d != null) {
            this.f7460d.onTrackingStopped("");
            this.f7460d = null;
        }
    }
}
