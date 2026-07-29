package com.moat.analytics.mobile.iro;

import android.app.Application;
import com.moat.analytics.mobile.iro.NoOp;

/* loaded from: classes2.dex */
public abstract class MoatAnalytics {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static MoatAnalytics f1063;

    public abstract void prepareNativeDisplayTracking(String str);

    public abstract void start(Application application);

    public abstract void start(MoatOptions moatOptions, Application application);

    public static synchronized MoatAnalytics getInstance() {
        MoatAnalytics moatAnalytics;
        synchronized (MoatAnalytics.class) {
            if (f1063 == null) {
                try {
                    f1063 = new j();
                } catch (Exception e) {
                    o.m1290(e);
                    f1063 = new NoOp.MoatAnalytics();
                }
            }
            moatAnalytics = f1063;
        }
        return moatAnalytics;
    }
}
