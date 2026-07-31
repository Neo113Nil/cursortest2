package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f1729a;

    public f0(g0 g0Var) {
        this.f1729a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = e0.f1728a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.f1729a.d = true;
                return;
            }
            C0702n c0702n = this.f1729a.e;
            if (c0702n == null || !c0702n.f1740a) {
                return;
            }
            this.f1729a.d = false;
            g0 g0Var = this.f1729a;
            g0Var.c.postDelayed(g0Var.f, 0L);
        } catch (Throwable unused) {
        }
    }
}
