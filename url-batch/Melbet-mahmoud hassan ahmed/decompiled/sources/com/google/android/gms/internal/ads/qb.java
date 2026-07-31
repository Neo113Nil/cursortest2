package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class qb implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f10637a;

    qb(wb wbVar, Activity activity) {
        this.f10637a = activity;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f10637a);
    }
}
