package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1172d f10009a;

    public C1171c(C1172d c1172d) {
        this.f10009a = c1172d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i2 = AbstractC1170b.f10008a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                C1178j c1178j = this.f10009a.f10012c;
                if (c1178j == null || !c1178j.f10028a) {
                    return;
                }
                mainExecutor = this.f10009a.f10010a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C1172d.d(this.f10009a));
            } else if (i2 != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(C1172d.d(this.f10009a));
            }
        } catch (Throwable unused) {
        }
    }
}
