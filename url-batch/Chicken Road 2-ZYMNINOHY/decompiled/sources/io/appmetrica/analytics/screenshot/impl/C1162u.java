package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1163v f13502a;

    public C1162u(C1163v c1163v) {
        this.f13502a = c1163v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i4 = AbstractC1161t.f13501a[activityEvent.ordinal()];
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                this.f13502a.f13503a.getContext().getContentResolver().unregisterContentObserver(this.f13502a.f13506d);
            } else {
                C1153k c1153k = this.f13502a.f13505c;
                if (c1153k == null || !c1153k.f13480a) {
                    return;
                }
                this.f13502a.f13503a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f13502a.f13506d);
            }
        } catch (Throwable unused) {
        }
    }
}
