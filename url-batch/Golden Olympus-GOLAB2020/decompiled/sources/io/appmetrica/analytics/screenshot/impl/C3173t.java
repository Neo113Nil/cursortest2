package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3173t implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3174u f40781a;

    public C3173t(C3174u c3174u) {
        this.f40781a = c3174u;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i4 = AbstractC3172s.f40780a[activityEvent.ordinal()];
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                this.f40781a.f40782a.getContext().getContentResolver().unregisterContentObserver(this.f40781a.f40785d);
            } else {
                C3164j c3164j = this.f40781a.f40784c;
                if (c3164j == null || !c3164j.f40764a) {
                    return;
                }
                this.f40781a.f40782a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f40781a.f40785d);
            }
        } catch (Throwable unused) {
        }
    }
}
