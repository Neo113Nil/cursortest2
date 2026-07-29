package com.moat.analytics.mobile.you;

import android.app.Application;
import com.moat.analytics.mobile.you.v;

/* loaded from: classes2.dex */
public abstract class MoatAnalytics {

    /* renamed from: a, reason: collision with root package name */
    private static MoatAnalytics f7447a;

    public static synchronized MoatAnalytics getInstance() {
        MoatAnalytics moatAnalytics;
        synchronized (MoatAnalytics.class) {
            if (f7447a == null) {
                try {
                    f7447a = new k();
                } catch (Exception e) {
                    m.a(e);
                    f7447a = new v.a();
                }
            }
            moatAnalytics = f7447a;
        }
        return moatAnalytics;
    }

    public abstract void prepareNativeDisplayTracking(String str);

    public abstract void start(Application application);

    public abstract void start(MoatOptions moatOptions, Application application);
}
