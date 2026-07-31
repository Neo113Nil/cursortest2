package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f40740a;

    public c0(d0 d0Var) {
        this.f40740a = d0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i4 = b0.f40738a[activityEvent.ordinal()];
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                this.f40740a.f40748d = true;
                return;
            }
            C3167m c3167m = this.f40740a.f40749e;
            if (c3167m == null || !c3167m.f40772a) {
                return;
            }
            this.f40740a.f40748d = false;
            d0 d0Var = this.f40740a;
            d0Var.f40747c.postDelayed(d0Var.f40750f, 0L);
        } catch (Throwable unused) {
        }
    }
}
