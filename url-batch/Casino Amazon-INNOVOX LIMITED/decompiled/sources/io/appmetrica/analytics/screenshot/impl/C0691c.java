package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0691c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0692d f1724a;

    public C0691c(C0692d c0692d) {
        this.f1724a = c0692d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC0690b.f1723a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C0692d.d(this.f1724a));
            } else {
                C0698j c0698j = this.f1724a.c;
                if (c0698j == null || !c0698j.f1733a) {
                    return;
                }
                activity.registerScreenCaptureCallback(this.f1724a.f1725a.getContext().getMainExecutor(), C0692d.d(this.f1724a));
            }
        } catch (Throwable unused) {
        }
    }
}
