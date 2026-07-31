package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class tb implements vb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12164a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f12165b;

    tb(wb wbVar, Activity activity, Bundle bundle) {
        this.f12164a = activity;
        this.f12165b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.vb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f12164a, this.f12165b);
    }
}
