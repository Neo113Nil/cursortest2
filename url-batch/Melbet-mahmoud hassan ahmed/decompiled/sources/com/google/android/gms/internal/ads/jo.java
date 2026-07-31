package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class jo implements lo {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f7192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f7193b;

    jo(mo moVar, Activity activity, Bundle bundle) {
        this.f7192a = activity;
        this.f7193b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.lo
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f7192a, this.f7193b);
    }
}
