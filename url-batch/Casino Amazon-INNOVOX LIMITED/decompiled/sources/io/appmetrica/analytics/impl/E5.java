package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class E5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f820a;

    public E5(F5 f5) {
        this.f820a = f5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = D5.f807a[activityEvent.ordinal()];
        if (i == 1) {
            this.f820a.b.resumeSession();
        } else {
            if (i != 2) {
                return;
            }
            this.f820a.b.pauseSession();
        }
    }
}
