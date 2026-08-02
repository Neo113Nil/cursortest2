package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class D5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E5 f10176a;

    public D5(E5 e5) {
        this.f10176a = e5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i4 = C5.f10152a[activityEvent.ordinal()];
        if (i4 == 1) {
            this.f10176a.f10238b.resumeSession();
        } else {
            if (i4 != 2) {
                return;
            }
            this.f10176a.f10238b.pauseSession();
        }
    }
}
