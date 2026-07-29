package com.moat.analytics.mobile.cha;

import android.app.Application;
import android.content.Context;
import com.moat.analytics.mobile.cha.a;
import com.moat.analytics.mobile.cha.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class f extends MoatAnalytics implements t.b {

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f884;

    /* renamed from: ʽ, reason: contains not printable characters */
    private MoatOptions f885;

    /* renamed from: ˊ, reason: contains not printable characters */
    WeakReference<Context> f886;

    /* renamed from: ॱ, reason: contains not printable characters */
    a f890;

    /* renamed from: ˎ, reason: contains not printable characters */
    boolean f888 = false;

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean f889 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    boolean f887 = false;

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f883 = false;

    f() {
    }

    @Override // com.moat.analytics.mobile.cha.MoatAnalytics
    public final void start(Application application) {
        start(new MoatOptions(), application);
    }

    @Override // com.moat.analytics.mobile.cha.MoatAnalytics
    public final void prepareNativeDisplayTracking(String str) {
        this.f884 = str;
        if (t.m1144().f1011 == t.a.f1023) {
            return;
        }
        try {
            m1030();
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m1030() {
        if (this.f890 == null) {
            this.f890 = new a(c.m1015(), a.d.f850);
            this.f890.m998(this.f884);
            a.m994(3, "Analytics", this, "Preparing native display tracking with partner code " + this.f884);
            a.m991("[SUCCESS] ", "Prepared for native display tracking with partner code " + this.f884);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final boolean m1031() {
        return this.f883;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final boolean m1032() {
        return this.f885 != null && this.f885.disableLocationServices;
    }

    @Override // com.moat.analytics.mobile.cha.t.b
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo1033() throws o {
        o.m1111();
        n.m1096();
        if (this.f884 != null) {
            try {
                m1030();
            } catch (Exception e) {
                o.m1110(e);
            }
        }
    }

    @Override // com.moat.analytics.mobile.cha.MoatAnalytics
    public final void start(MoatOptions moatOptions, Application application) {
        try {
            if (this.f883) {
                a.m994(3, "Analytics", this, "Moat SDK has already been started.");
                return;
            }
            this.f885 = moatOptions;
            t.m1144().m1150();
            this.f887 = moatOptions.disableLocationServices;
            if (application == null) {
                throw new o("Moat Analytics SDK didn't start, application was null");
            }
            if (moatOptions.loggingEnabled && r.m1126(application.getApplicationContext())) {
                this.f888 = true;
            }
            this.f886 = new WeakReference<>(application.getApplicationContext());
            this.f883 = true;
            this.f889 = moatOptions.autoTrackGMAInterstitials;
            c.m1017(application);
            t.m1144().m1149(this);
            if (!moatOptions.disableAdIdCollection) {
                r.m1129(application);
            }
            a.m991("[SUCCESS] ", "Moat Analytics SDK Version 2.4.1 started");
        } catch (Exception e) {
            o.m1110(e);
        }
    }
}
