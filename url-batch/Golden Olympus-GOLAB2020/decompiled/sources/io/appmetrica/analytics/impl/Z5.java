package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Z5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2483a6 f38598a;

    public Z5(C2483a6 c2483a6) {
        this.f38598a = c2483a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i4 = Y5.f38550a[activityEvent.ordinal()];
        if (i4 == 1) {
            this.f38598a.f38661b.resumeSession();
        } else {
            if (i4 != 2) {
                return;
            }
            this.f38598a.f38661b.pauseSession();
        }
    }
}
