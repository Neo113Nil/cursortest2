package d4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class f0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g0 f15667f;

    f0(g0 g0Var) {
        this.f15667f = g0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f15667f.o(new y(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f15667f.o(new e0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f15667f.o(new b0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f15667f.o(new a0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m0 m0Var = new m0();
        this.f15667f.o(new d0(this, activity, m0Var));
        Bundle O0 = m0Var.O0(50L);
        if (O0 != null) {
            bundle.putAll(O0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f15667f.o(new z(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f15667f.o(new c0(this, activity));
    }
}
