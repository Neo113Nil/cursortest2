package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class eo implements lo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f4672a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f4673b;

    eo(mo moVar, Activity activity, Bundle bundle) {
        this.f4672a = activity;
        this.f4673b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f4672a, this.f4673b);
    }
}
