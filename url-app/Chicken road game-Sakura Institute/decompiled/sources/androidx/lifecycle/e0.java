package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends h {
    final /* synthetic */ f0 this$0;

    /* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
    public static final class a extends h {
        final /* synthetic */ f0 this$0;

        public a(f0 f0Var) {
            this.this$0 = f0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            r6.k.f(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            r6.k.f(activity, "activity");
            f0 f0Var = this.this$0;
            int i7 = f0Var.f964f + 1;
            f0Var.f964f = i7;
            if (i7 == 1 && f0Var.f967i) {
                f0Var.f969k.d(n.ON_START);
                f0Var.f967i = false;
            }
        }
    }

    public e0(f0 f0Var) {
        this.this$0 = f0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        r6.k.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = l0.f996g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            r6.k.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((l0) findFragmentByTag).f997f = this.this$0.f971m;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        r6.k.f(activity, "activity");
        f0 f0Var = this.this$0;
        int i7 = f0Var.f965g - 1;
        f0Var.f965g = i7;
        if (i7 == 0) {
            Handler handler = f0Var.f968j;
            r6.k.c(handler);
            handler.postDelayed(f0Var.f970l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        r6.k.f(activity, "activity");
        d0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        r6.k.f(activity, "activity");
        f0 f0Var = this.this$0;
        int i7 = f0Var.f964f - 1;
        f0Var.f964f = i7;
        if (i7 == 0 && f0Var.f966h) {
            f0Var.f969k.d(n.ON_STOP);
            f0Var.f967i = true;
        }
    }
}
