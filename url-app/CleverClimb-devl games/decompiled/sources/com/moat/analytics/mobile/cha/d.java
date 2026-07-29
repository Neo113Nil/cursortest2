package com.moat.analytics.mobile.cha;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.cha.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
abstract class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private WeakReference<View> f870;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f871;

    /* renamed from: ʽ, reason: contains not printable characters */
    final boolean f872;

    /* renamed from: ˊ, reason: contains not printable characters */
    TrackerListener f873;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private boolean f874;

    /* renamed from: ˋ, reason: contains not printable characters */
    final String f875;

    /* renamed from: ˎ, reason: contains not printable characters */
    j f876;

    /* renamed from: ˏ, reason: contains not printable characters */
    WeakReference<WebView> f877;

    /* renamed from: ͺ, reason: contains not printable characters */
    private boolean f878;

    /* renamed from: ॱ, reason: contains not printable characters */
    o f879 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private final u f880;

    @Deprecated
    public void setActivity(Activity activity) {
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    abstract String mo1024();

    d(View view, boolean z, boolean z2) {
        String str;
        a.m994(3, "BaseTracker", this, "Initializing.");
        if (z) {
            str = "m" + hashCode();
        } else {
            str = "";
        }
        this.f875 = str;
        this.f870 = new WeakReference<>(view);
        this.f871 = z;
        this.f872 = z2;
        this.f874 = false;
        this.f878 = false;
        this.f880 = new u();
    }

    public void setListener(TrackerListener trackerListener) {
        this.f873 = trackerListener;
    }

    public void removeListener() {
        this.f873 = null;
    }

    public void startTracking() {
        try {
            a.m994(3, "BaseTracker", this, "In startTracking method.");
            mo1007();
            if (this.f873 != null) {
                this.f873.onTrackingStarted("Tracking started on " + a.m993(this.f870.get()));
            }
            String str = "startTracking succeeded for " + a.m993(this.f870.get());
            a.m994(3, "BaseTracker", this, str);
            a.m991("[SUCCESS] ", mo1024() + " " + str);
        } catch (Exception e) {
            m1028("startTracking", e);
        }
    }

    public void stopTracking() {
        boolean z = false;
        try {
            a.m994(3, "BaseTracker", this, "In stopTracking method.");
            this.f878 = true;
            if (this.f876 != null) {
                this.f876.m1080(this);
                z = true;
            }
        } catch (Exception e) {
            o.m1110(e);
        }
        StringBuilder sb = new StringBuilder("Attempt to stop tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        a.m994(3, "BaseTracker", this, sb.toString());
        String str = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo1024());
        sb2.append(" stopTracking ");
        sb2.append(z ? "succeeded" : "failed");
        sb2.append(" for ");
        sb2.append(a.m993(this.f870.get()));
        a.m991(str, sb2.toString());
        if (this.f873 != null) {
            this.f873.onTrackingStopped("");
            this.f873 = null;
        }
    }

    public void changeTargetView(View view) {
        a.m994(3, "BaseTracker", this, "changing view to " + a.m993(view));
        this.f870 = new WeakReference<>(view);
    }

    /* renamed from: ˏ */
    void mo1007() throws o {
        a.m994(3, "BaseTracker", this, "Attempting to start impression.");
        m1025();
        if (this.f874) {
            throw new o("Tracker already started");
        }
        if (!this.f878) {
            mo1004(new ArrayList());
            if (this.f876 != null) {
                this.f876.m1081(this);
                this.f874 = true;
                a.m994(3, "BaseTracker", this, "Impression started.");
                return;
            }
            a.m994(3, "BaseTracker", this, "Bridge is null, won't start tracking");
            throw new o("Bridge is null");
        }
        throw new o("Tracker already stopped");
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1027(WebView webView) throws o {
        if (webView != null) {
            this.f877 = new WeakReference<>(webView);
            if (this.f876 == null) {
                if (!(this.f871 || this.f872)) {
                    a.m994(3, "BaseTracker", this, "Attempting bridge installation.");
                    if (this.f877.get() != null) {
                        this.f876 = new j(this.f877.get(), j.e.f949);
                        a.m994(3, "BaseTracker", this, "Bridge installed.");
                    } else {
                        this.f876 = null;
                        a.m994(3, "BaseTracker", this, "Bridge not installed, WebView is null.");
                    }
                }
            }
            if (this.f876 != null) {
                this.f876.m1079(this);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final void m1025() throws o {
        if (this.f879 == null) {
            return;
        }
        throw new o("Tracker initialization failed: " + this.f879.getMessage());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final boolean m1023() {
        return this.f874 && !this.f878;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final View m1021() {
        return this.f870.get();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    final String m1022() {
        this.f880.m1164(this.f875, this.f870.get());
        return this.f880.f1042;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1028(String str, Exception exc) {
        try {
            o.m1110(exc);
            String m1109 = o.m1109(str, exc);
            if (this.f873 != null) {
                this.f873.onTrackingFailedToStart(m1109);
            }
            a.m994(3, "BaseTracker", this, m1109);
            a.m991("[ERROR] ", mo1024() + " " + m1109);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1026() throws o {
        if (this.f874) {
            throw new o("Tracker already started");
        }
        if (this.f878) {
            throw new o("Tracker already stopped");
        }
    }

    /* renamed from: ˋ */
    void mo1004(List<String> list) throws o {
        if (this.f870.get() == null && !this.f872) {
            list.add("Tracker's target view is null");
        }
        if (!list.isEmpty()) {
            throw new o(TextUtils.join(" and ", list));
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    final String m1020() {
        return a.m993(this.f870.get());
    }
}
