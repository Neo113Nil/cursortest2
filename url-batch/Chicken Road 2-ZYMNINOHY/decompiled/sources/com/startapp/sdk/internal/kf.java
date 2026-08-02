package com.startapp.sdk.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class kf extends k6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f7189a;

    public kf(pf pfVar) {
        this.f7189a = pfVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f7189a.a(activity);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
