package com.moat.analytics.mobile.iro;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.iro.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
abstract class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private WeakReference<View> f1083;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f1084;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f1085;

    /* renamed from: ˊ, reason: contains not printable characters */
    TrackerListener f1086;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private final y f1087;

    /* renamed from: ˋ, reason: contains not printable characters */
    o f1088 = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    final String f1089;

    /* renamed from: ˏ, reason: contains not printable characters */
    f f1090;

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private boolean f1091;

    /* renamed from: ॱ, reason: contains not printable characters */
    WeakReference<WebView> f1092;

    /* renamed from: ᐝ, reason: contains not printable characters */
    final boolean f1093;

    @Deprecated
    public void setActivity(Activity activity) {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    abstract String mo1190();

    c(View view, boolean z, boolean z2) {
        String str;
        b.m1182(3, "BaseTracker", this, "Initializing.");
        if (z) {
            str = "m" + hashCode();
        } else {
            str = "";
        }
        this.f1089 = str;
        this.f1083 = new WeakReference<>(view);
        this.f1084 = z;
        this.f1093 = z2;
        this.f1085 = false;
        this.f1091 = false;
        this.f1087 = new y();
    }

    public void setListener(TrackerListener trackerListener) {
        this.f1086 = trackerListener;
    }

    public void removeListener() {
        this.f1086 = null;
    }

    public void startTracking() {
        try {
            b.m1182(3, "BaseTracker", this, "In startTracking method.");
            mo1193();
            if (this.f1086 != null) {
                this.f1086.onTrackingStarted("Tracking started on " + b.m1184(this.f1083.get()));
            }
            String str = "startTracking succeeded for " + b.m1184(this.f1083.get());
            b.m1182(3, "BaseTracker", this, str);
            b.m1180("[SUCCESS] ", mo1190() + " " + str);
        } catch (Exception e) {
            m1196("startTracking", e);
        }
    }

    public void stopTracking() {
        boolean z = false;
        try {
            b.m1182(3, "BaseTracker", this, "In stopTracking method.");
            this.f1091 = true;
            if (this.f1090 != null) {
                this.f1090.m1234(this);
                z = true;
            }
        } catch (Exception e) {
            o.m1290(e);
        }
        StringBuilder sb = new StringBuilder("Attempt to stop tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        b.m1182(3, "BaseTracker", this, sb.toString());
        String str = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo1190());
        sb2.append(" stopTracking ");
        sb2.append(z ? "succeeded" : "failed");
        sb2.append(" for ");
        sb2.append(b.m1184(this.f1083.get()));
        b.m1180(str, sb2.toString());
        if (this.f1086 != null) {
            this.f1086.onTrackingStopped("");
            this.f1086 = null;
        }
    }

    public void changeTargetView(View view) {
        b.m1182(3, "BaseTracker", this, "changing view to " + b.m1184(view));
        this.f1083 = new WeakReference<>(view);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void mo1193() throws o {
        b.m1182(3, "BaseTracker", this, "Attempting to start impression.");
        m1191();
        if (this.f1085) {
            throw new o("Tracker already started");
        }
        if (!this.f1091) {
            mo1195(new ArrayList());
            if (this.f1090 != null) {
                this.f1090.m1236(this);
                this.f1085 = true;
                b.m1182(3, "BaseTracker", this, "Impression started.");
                return;
            }
            b.m1182(3, "BaseTracker", this, "Bridge is null, won't start tracking");
            throw new o("Bridge is null");
        }
        throw new o("Tracker already stopped");
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1192(WebView webView) throws o {
        if (webView != null) {
            this.f1092 = new WeakReference<>(webView);
            if (this.f1090 == null) {
                if (!(this.f1084 || this.f1093)) {
                    b.m1182(3, "BaseTracker", this, "Attempting bridge installation.");
                    if (this.f1092.get() != null) {
                        this.f1090 = new f(this.f1092.get(), f.b.f1133);
                        b.m1182(3, "BaseTracker", this, "Bridge installed.");
                    } else {
                        this.f1090 = null;
                        b.m1182(3, "BaseTracker", this, "Bridge not installed, WebView is null.");
                    }
                }
            }
            if (this.f1090 != null) {
                this.f1090.m1233(this);
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1191() throws o {
        if (this.f1088 == null) {
            return;
        }
        throw new o("Tracker initialization failed: " + this.f1088.getMessage());
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final boolean m1197() {
        return this.f1085 && !this.f1091;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    final View m1187() {
        return this.f1083.get();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final String m1188() {
        this.f1087.m1343(this.f1089, this.f1083.get());
        return this.f1087.f1263;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1196(String str, Exception exc) {
        try {
            o.m1290(exc);
            String m1289 = o.m1289(str, exc);
            if (this.f1086 != null) {
                this.f1086.onTrackingFailedToStart(m1289);
            }
            b.m1182(3, "BaseTracker", this, m1289);
            b.m1180("[ERROR] ", mo1190() + " " + m1289);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final void m1194() throws o {
        if (this.f1085) {
            throw new o("Tracker already started");
        }
        if (this.f1091) {
            throw new o("Tracker already stopped");
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void mo1195(List<String> list) throws o {
        if (this.f1083.get() == null && !this.f1093) {
            list.add("Tracker's target view is null");
        }
        if (!list.isEmpty()) {
            throw new o(TextUtils.join(" and ", list));
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    final String m1189() {
        return b.m1184(this.f1083.get());
    }
}
