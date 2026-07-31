package com.startapp.sdk.internal;

import android.app.Activity;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class se extends b6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe f424a;

    public se(xe xeVar) {
        this.f424a = xeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f424a.a(activity);
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
