package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class ob implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f9591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f9592b;

    ob(wb wbVar, Activity activity, Bundle bundle) {
        this.f9591a = activity;
        this.f9592b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f9591a, this.f9592b);
    }
}
