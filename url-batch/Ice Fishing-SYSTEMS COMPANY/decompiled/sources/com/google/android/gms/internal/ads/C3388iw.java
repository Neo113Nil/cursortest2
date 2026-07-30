package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.iw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3388iw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public boolean f32025n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32026u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3336hw f32027v;

    public boolean a() {
        return false;
    }

    public void b(boolean z8) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f32026u) {
            this.f32026u = true;
            if (this.f32025n) {
                b(true);
                InterfaceC3336hw interfaceC3336hw = this.f32027v;
                if (interfaceC3336hw != null) {
                    interfaceC3336hw.b(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z8 = runningAppProcessInfo.importance == 100 || a();
        if (this.f32026u != z8) {
            this.f32026u = z8;
            if (this.f32025n) {
                b(z8);
                InterfaceC3336hw interfaceC3336hw = this.f32027v;
                if (interfaceC3336hw != null) {
                    interfaceC3336hw.b(z8);
                }
            }
        }
    }
}
