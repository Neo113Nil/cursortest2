package com.moat.analytics.mobile.you;

import android.app.Application;
import android.content.Context;
import com.moat.analytics.mobile.you.g;
import com.moat.analytics.mobile.you.w;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class k extends MoatAnalytics implements w.b {

    /* renamed from: d, reason: collision with root package name */
    g f7502d;
    WeakReference<Context> e;
    private String g;
    private MoatOptions h;

    /* renamed from: a, reason: collision with root package name */
    boolean f7499a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f7500b = false;

    /* renamed from: c, reason: collision with root package name */
    boolean f7501c = false;
    private boolean f = false;

    k() {
    }

    private void a(MoatOptions moatOptions, Application application) {
        if (this.f) {
            p.a(3, "Analytics", this, "Moat SDK has already been started.");
            return;
        }
        this.h = moatOptions;
        w.a().b();
        this.f7501c = moatOptions.disableLocationServices;
        if (application == null) {
            throw new m("Moat Analytics SDK didn't start, application was null");
        }
        if (moatOptions.loggingEnabled && s.b(application.getApplicationContext())) {
            this.f7499a = true;
        }
        this.e = new WeakReference<>(application.getApplicationContext());
        this.f = true;
        this.f7500b = moatOptions.autoTrackGMAInterstitials;
        a.a(application);
        w.a().a(this);
        if (!moatOptions.disableAdIdCollection) {
            s.a(application);
        }
        p.a("[SUCCESS] ", "Moat Analytics SDK Version 2.4.5 started");
    }

    private void e() {
        if (this.f7502d == null) {
            this.f7502d = new g(a.a(), g.a.DISPLAY);
            this.f7502d.a(this.g);
            p.a(3, "Analytics", this, "Preparing native display tracking with partner code " + this.g);
            p.a("[SUCCESS] ", "Prepared for native display tracking with partner code " + this.g);
        }
    }

    boolean a() {
        return this.f;
    }

    boolean b() {
        return this.h != null && this.h.disableLocationServices;
    }

    @Override // com.moat.analytics.mobile.you.w.b
    public void c() {
        m.a();
        o.a();
        if (this.g != null) {
            try {
                e();
            } catch (Exception e) {
                m.a(e);
            }
        }
    }

    @Override // com.moat.analytics.mobile.you.w.b
    public void d() {
    }

    @Override // com.moat.analytics.mobile.you.MoatAnalytics
    public void prepareNativeDisplayTracking(String str) {
        this.g = str;
        if (w.a().f7538a == w.d.OFF) {
            return;
        }
        try {
            e();
        } catch (Exception e) {
            m.a(e);
        }
    }

    @Override // com.moat.analytics.mobile.you.MoatAnalytics
    public void start(Application application) {
        start(new MoatOptions(), application);
    }

    @Override // com.moat.analytics.mobile.you.MoatAnalytics
    public void start(MoatOptions moatOptions, Application application) {
        try {
            a(moatOptions, application);
        } catch (Exception e) {
            m.a(e);
        }
    }
}
