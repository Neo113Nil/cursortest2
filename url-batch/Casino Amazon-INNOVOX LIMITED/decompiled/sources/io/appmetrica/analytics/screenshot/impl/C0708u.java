package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0708u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0709v f1745a;

    public C0708u(C0709v c0709v) {
        this.f1745a = c0709v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC0707t.f1744a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.f1745a.f1746a.getContext().getContentResolver().unregisterContentObserver(this.f1745a.d);
            } else {
                C0699k c0699k = this.f1745a.c;
                if (c0699k == null || !c0699k.f1735a) {
                    return;
                }
                this.f1745a.f1746a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f1745a.d);
            }
        } catch (Throwable unused) {
        }
    }
}
