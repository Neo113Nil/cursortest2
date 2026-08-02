package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1145c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1146d f13458a;

    public C1145c(C1146d c1146d) {
        this.f13458a = c1146d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i4 = AbstractC1144b.f13457a[activityEvent.ordinal()];
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C1146d.d(this.f13458a));
            } else {
                C1152j c1152j = this.f13458a.f13461c;
                if (c1152j == null || !c1152j.f13477a) {
                    return;
                }
                mainExecutor = this.f13458a.f13459a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C1146d.d(this.f13458a));
            }
        } catch (Throwable unused) {
        }
    }
}
