package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f13466a;

    public f0(g0 g0Var) {
        this.f13466a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i4 = e0.f13465a[activityEvent.ordinal()];
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                this.f13466a.f13470d = true;
                return;
            }
            C1156n c1156n = this.f13466a.f13471e;
            if (c1156n == null || !c1156n.f13493a) {
                return;
            }
            this.f13466a.f13470d = false;
            g0 g0Var = this.f13466a;
            g0Var.f13469c.postDelayed(g0Var.f13472f, 0L);
        } catch (Throwable unused) {
        }
    }
}
