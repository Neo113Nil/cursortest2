package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqk implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final /* synthetic */ eql b;

    public eqk(eql eqlVar, Application application) {
        this.b = eqlVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        eql eqlVar = this.b;
        eqh eqhVar = eqlVar.n;
        if (eqhVar.b != null) {
            eqhVar = eqlVar.o;
        }
        eqhVar.a = activity.getClass().getSimpleName();
        eqhVar.b = ems.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        eql eqlVar = this.b;
        eqh eqhVar = eqlVar.o;
        if (eqhVar.b == null) {
            eqhVar = eqlVar.n;
        }
        if (eqhVar.d == null) {
            eqhVar.d = ems.a();
        }
        try {
            View findViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new eqi(this, findViewById));
            viewTreeObserver.addOnPreDrawListener(new eqj(this, findViewById));
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        eql eqlVar = this.b;
        eqh eqhVar = eqlVar.o;
        if (eqhVar.b == null) {
            eqhVar = eqlVar.n;
        }
        if (eqhVar.c == null) {
            eqhVar.c = ems.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
