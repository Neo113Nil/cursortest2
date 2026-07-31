package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class fo implements lo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5164a;

    fo(mo moVar, Activity activity) {
        this.f5164a = activity;
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f5164a);
    }
}
