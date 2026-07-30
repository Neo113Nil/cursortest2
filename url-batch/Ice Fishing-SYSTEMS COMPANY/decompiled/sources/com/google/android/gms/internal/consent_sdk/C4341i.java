package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4341i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public final Activity f35847n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4349k f35848u;

    public C4341i(C4349k c4349k, Activity activity) {
        Objects.requireNonNull(c4349k);
        this.f35848u = c4349k;
        this.f35847n = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C4349k c4349k = this.f35848u;
        Dialog dialog = c4349k.f35864g;
        if (dialog == null || !c4349k.f35869m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        r rVar = c4349k.f35859b;
        if (rVar != null) {
            rVar.f35905a = activity;
        }
        AtomicReference atomicReference = c4349k.f35868l;
        C4341i c4341i = (C4341i) atomicReference.getAndSet(null);
        if (c4341i != null) {
            c4341i.f35848u.f35858a.unregisterActivityLifecycleCallbacks(c4341i);
            C4341i c4341i2 = new C4341i(c4349k, activity);
            c4349k.f35858a.registerActivityLifecycleCallbacks(c4341i2);
            atomicReference.set(c4341i2);
        }
        Dialog dialog2 = c4349k.f35864g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f35847n) {
            return;
        }
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        C4349k c4349k = this.f35848u;
        if (isChangingConfigurations && c4349k.f35869m && (dialog = c4349k.f35864g) != null) {
            dialog.dismiss();
            return;
        }
        C4354l0 c4354l0 = new C4354l0(3, "Activity is destroyed.");
        Dialog dialog2 = c4349k.f35864g;
        if (dialog2 != null) {
            dialog2.dismiss();
            c4349k.f35864g = null;
        }
        c4349k.f35859b.f35905a = null;
        C4341i c4341i = (C4341i) c4349k.f35868l.getAndSet(null);
        if (c4341i != null) {
            c4341i.f35848u.f35858a.unregisterActivityLifecycleCallbacks(c4341i);
        }
        I3.b bVar = (I3.b) c4349k.f35867k.getAndSet(null);
        if (bVar == null) {
            return;
        }
        c4349k.d(c4354l0);
        bVar.onConsentFormDismissed(c4354l0.a());
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
