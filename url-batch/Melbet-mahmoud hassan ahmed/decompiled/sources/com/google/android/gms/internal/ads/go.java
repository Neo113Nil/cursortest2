package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class go implements lo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5694a;

    go(mo moVar, Activity activity) {
        this.f5694a = activity;
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f5694a);
    }
}
