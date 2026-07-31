package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class pb implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f10160a;

    pb(wb wbVar, Activity activity) {
        this.f10160a = activity;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f10160a);
    }
}
