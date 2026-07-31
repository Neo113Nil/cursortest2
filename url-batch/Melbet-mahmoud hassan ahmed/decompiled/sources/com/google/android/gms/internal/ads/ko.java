package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class ko implements lo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f7561a;

    ko(mo moVar, Activity activity) {
        this.f7561a = activity;
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f7561a);
    }
}
