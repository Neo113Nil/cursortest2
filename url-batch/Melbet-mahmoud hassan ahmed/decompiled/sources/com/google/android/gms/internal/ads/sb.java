package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class sb implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f11765a;

    sb(wb wbVar, Activity activity) {
        this.f11765a = activity;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f11765a);
    }
}
