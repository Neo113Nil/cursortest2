package com.aiming.mdt.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.aiming.mdt.a.C0193;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0282;
import com.mopub.common.logging.MoPubLog;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.aiming.mdt.a.ʼʽʾˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0114 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ʼ, reason: contains not printable characters */
    private AtomicReference<Activity> f325;

    /* renamed from: com.aiming.mdt.a.ʼʽʾˈˉ$ʻʼ, reason: contains not printable characters */
    static final class C0115 {

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private static final C0114 f326 = new C0114(0);
    }

    private C0114() {
        this.f325 = new AtomicReference<>(null);
        try {
            C0226.m829().registerActivityLifecycleCallbacks(this);
        } catch (Exception e) {
            C0076.m232().m236(e);
        }
    }

    /* synthetic */ C0114(byte b2) {
        this();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0114 m427() {
        return C0115.f326;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static boolean m428(Activity activity) {
        String obj = activity.toString();
        return obj.startsWith("com.aiming") || obj.startsWith("com.google.android.gms.ads") || obj.startsWith("com.facebook") || obj.startsWith("com.unity3d") || obj.startsWith("com.vungle") || obj.startsWith("com.applovin") || obj.startsWith("com.adcolony") || obj.startsWith("com.tapjoy") || obj.startsWith("com.chartboost") || obj.startsWith(MoPubLog.LOGGER_NAMESPACE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f325.set(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        StringBuilder sb = new StringBuilder("onActivityDestroyed: ");
        sb.append(activity.toString());
        C0282.m971(sb.toString());
        C0193.C0194.f668.m728();
        if (this.f325.get() == activity) {
            this.f325.set(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        StringBuilder sb = new StringBuilder("onActivityStarted: ");
        sb.append(activity.toString());
        C0282.m971(sb.toString());
        Activity activity2 = this.f325.get();
        if ((activity2 == null || activity2 != activity) && !m428(activity)) {
            this.f325.set(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final Activity m429() {
        return this.f325.get();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m430(Activity activity) {
        this.f325.set(activity);
    }
}
