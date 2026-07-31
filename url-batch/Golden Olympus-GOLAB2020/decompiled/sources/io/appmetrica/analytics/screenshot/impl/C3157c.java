package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3157c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3158d f40739a;

    public C3157c(C3158d c3158d) {
        this.f40739a = c3158d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i4 = AbstractC3156b.f40737a[activityEvent.ordinal()];
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C3158d.d(this.f40739a));
            } else {
                C3163i c3163i = this.f40739a.f40743c;
                if (c3163i == null || !c3163i.f40761a) {
                    return;
                }
                mainExecutor = this.f40739a.f40741a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C3158d.d(this.f40739a));
            }
        } catch (Throwable unused) {
        }
    }
}
