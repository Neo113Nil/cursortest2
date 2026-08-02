package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1021d f9029a;

    public C1020c(C1021d c1021d) {
        this.f9029a = c1021d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i3 = AbstractC1019b.f9028a[activityEvent.ordinal()];
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C1021d.d(this.f9029a));
            } else {
                C1027j c1027j = this.f9029a.f9032c;
                if (c1027j == null || !c1027j.f9047a) {
                    return;
                }
                mainExecutor = this.f9029a.f9030a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C1021d.d(this.f9029a));
            }
        } catch (Throwable unused) {
        }
    }
}
