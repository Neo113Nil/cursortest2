package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f13463a;

    public d0(g0 g0Var) {
        this.f13463a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C1156n c1156n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = d3.q.f8333a;
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
            if (kotlin.jvm.internal.i.a(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C1165x) g0Var.f13468b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f13469c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c1156n.f13494b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1156n c1156n = this.f13463a.f13471e;
        if (this.f13463a.f13470d || c1156n == null || !c1156n.f13493a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f13463a.f13467a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new Q1.b(this.f13463a, this, c1156n, 4));
    }
}
