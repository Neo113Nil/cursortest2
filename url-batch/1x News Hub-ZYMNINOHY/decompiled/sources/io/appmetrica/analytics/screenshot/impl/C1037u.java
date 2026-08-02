package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1037u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1038v f9072a;

    public C1037u(C1038v c1038v) {
        this.f9072a = c1038v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i3 = AbstractC1036t.f9071a[activityEvent.ordinal()];
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                this.f9072a.f9073a.getContext().getContentResolver().unregisterContentObserver(this.f9072a.f9076d);
            } else {
                C1028k c1028k = this.f9072a.f9075c;
                if (c1028k == null || !c1028k.f9050a) {
                    return;
                }
                this.f9072a.f9073a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f9072a.f9076d);
            }
        } catch (Throwable unused) {
        }
    }
}
