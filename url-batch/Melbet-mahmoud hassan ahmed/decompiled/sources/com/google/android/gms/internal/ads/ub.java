package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class ub implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12727a;

    ub(wb wbVar, Activity activity) {
        this.f12727a = activity;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f12727a);
    }
}
