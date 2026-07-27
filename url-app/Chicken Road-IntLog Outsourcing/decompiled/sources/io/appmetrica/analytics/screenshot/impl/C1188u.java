package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1189v f10053a;

    public C1188u(C1189v c1189v) {
        this.f10053a = c1189v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i2 = AbstractC1187t.f10052a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                C1179k c1179k = this.f10053a.f10056c;
                if (c1179k == null || !c1179k.f10031a) {
                } else {
                    this.f10053a.f10054a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f10053a.f10057d);
                }
            } else if (i2 != 2) {
            } else {
                this.f10053a.f10054a.getContext().getContentResolver().unregisterContentObserver(this.f10053a.f10057d);
            }
        } catch (Throwable unused) {
        }
    }
}
