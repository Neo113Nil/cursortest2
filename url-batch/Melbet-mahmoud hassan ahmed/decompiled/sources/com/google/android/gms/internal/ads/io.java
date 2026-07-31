package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class io implements lo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f6718a;

    io(mo moVar, Activity activity) {
        this.f6718a = activity;
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f6718a);
    }
}
