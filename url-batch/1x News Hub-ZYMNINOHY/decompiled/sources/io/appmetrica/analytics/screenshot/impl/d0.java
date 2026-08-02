package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f9034a;

    public d0(g0 g0Var) {
        this.f9034a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C1031n c1031n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = c2.m.f2637a;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.j.a(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C1040x) g0Var.f9039b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f9040c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c1031n.f9064b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1031n c1031n = this.f9034a.f9042e;
        if (this.f9034a.f9041d || c1031n == null || !c1031n.f9063a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f9034a.f9038a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new A0.b(this.f9034a, this, c1031n, 4));
    }
}
