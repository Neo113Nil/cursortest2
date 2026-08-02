package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f9037a;

    public f0(g0 g0Var) {
        this.f9037a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i3 = e0.f9036a[activityEvent.ordinal()];
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                this.f9037a.f9041d = true;
                return;
            }
            C1031n c1031n = this.f9037a.f9042e;
            if (c1031n == null || !c1031n.f9063a) {
                return;
            }
            this.f9037a.f9041d = false;
            g0 g0Var = this.f9037a;
            g0Var.f9040c.postDelayed(g0Var.f, 0L);
        } catch (Throwable unused) {
        }
    }
}
