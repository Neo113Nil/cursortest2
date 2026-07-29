package com.moat.analytics.mobile.iro;

import android.app.Application;
import android.content.Context;
import com.moat.analytics.mobile.iro.b;
import com.moat.analytics.mobile.iro.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class j extends MoatAnalytics implements t.a {

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f1165;

    /* renamed from: ˊ, reason: contains not printable characters */
    b f1166;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private MoatOptions f1167;

    /* renamed from: ˋ, reason: contains not printable characters */
    WeakReference<Context> f1168;

    /* renamed from: ॱ, reason: contains not printable characters */
    boolean f1171 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    boolean f1169 = false;

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean f1170 = false;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private boolean f1172 = false;

    j() {
    }

    @Override // com.moat.analytics.mobile.iro.MoatAnalytics
    public final void start(Application application) {
        start(new MoatOptions(), application);
    }

    @Override // com.moat.analytics.mobile.iro.MoatAnalytics
    public final void prepareNativeDisplayTracking(String str) {
        this.f1165 = str;
        if (t.m1319().f1230 == t.c.f1246) {
            return;
        }
        try {
            m1262();
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m1262() {
        if (this.f1166 == null) {
            this.f1166 = new b(a.m1173(), b.a.f1080);
            this.f1166.m1185(this.f1165);
            b.m1182(3, "Analytics", this, "Preparing native display tracking with partner code " + this.f1165);
            b.m1180("[SUCCESS] ", "Prepared for native display tracking with partner code " + this.f1165);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final boolean m1263() {
        return this.f1172;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final boolean m1264() {
        return this.f1167 != null && this.f1167.disableLocationServices;
    }

    @Override // com.moat.analytics.mobile.iro.t.a
    /* renamed from: ॱ, reason: contains not printable characters */
    public final void mo1265() throws o {
        o.m1287();
        k.m1275();
        if (this.f1165 != null) {
            try {
                m1262();
            } catch (Exception e) {
                o.m1290(e);
            }
        }
    }

    @Override // com.moat.analytics.mobile.iro.MoatAnalytics
    public final void start(MoatOptions moatOptions, Application application) {
        try {
            if (this.f1172) {
                b.m1182(3, "Analytics", this, "Moat SDK has already been started.");
                return;
            }
            this.f1167 = moatOptions;
            t.m1319().m1328();
            this.f1170 = moatOptions.disableLocationServices;
            if (application == null) {
                throw new o("Moat Analytics SDK didn't start, application was null");
            }
            if (moatOptions.loggingEnabled && p.m1299(application.getApplicationContext())) {
                this.f1171 = true;
            }
            this.f1168 = new WeakReference<>(application.getApplicationContext());
            this.f1172 = true;
            this.f1169 = moatOptions.autoTrackGMAInterstitials;
            a.m1171(application);
            t.m1319().m1329(this);
            if (!moatOptions.disableAdIdCollection) {
                p.m1294(application);
            }
            b.m1180("[SUCCESS] ", "Moat Analytics SDK Version 2.4.0 started");
        } catch (Exception e) {
            o.m1290(e);
        }
    }
}
