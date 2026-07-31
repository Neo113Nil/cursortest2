package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class rb implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f11098a;

    rb(wb wbVar, Activity activity) {
        this.f11098a = activity;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f11098a);
    }
}
