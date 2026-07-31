package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.a0;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f40736a;

    public a0(d0 d0Var) {
        this.f40736a = d0Var;
    }

    public static final Boolean a(d0 d0Var, a0 a0Var, C3167m c3167m, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = CollectionsKt.emptyList();
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
            if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C3175v) d0Var.f40746b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(d0Var.f40747c.postDelayed(a0Var, TimeUnit.SECONDS.toMillis(c3167m.f40773b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C3167m c3167m = this.f40736a.f40749e;
        if (this.f40736a.f40748d || c3167m == null || !c3167m.f40772a) {
            return;
        }
        Context context = this.f40736a.f40745a.getContext();
        final d0 d0Var = this.f40736a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: U1.b
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return a0.a(d0.this, this, c3167m, (ActivityManager) obj);
            }
        });
    }
}
