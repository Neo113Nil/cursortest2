package com.moat.analytics.mobile.cha;

import android.app.Application;
import com.moat.analytics.mobile.cha.NoOp;

/* loaded from: classes2.dex */
public abstract class MoatAnalytics {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static MoatAnalytics f838;

    public abstract void prepareNativeDisplayTracking(String str);

    public abstract void start(Application application);

    public abstract void start(MoatOptions moatOptions, Application application);

    public static synchronized MoatAnalytics getInstance() {
        MoatAnalytics moatAnalytics;
        synchronized (MoatAnalytics.class) {
            if (f838 == null) {
                try {
                    f838 = new f();
                } catch (Exception e) {
                    o.m1110(e);
                    f838 = new NoOp.MoatAnalytics();
                }
            }
            moatAnalytics = f838;
        }
        return moatAnalytics;
    }
}
