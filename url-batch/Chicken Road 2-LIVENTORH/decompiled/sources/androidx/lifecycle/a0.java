package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a0 extends f {
    final /* synthetic */ b0 this$0;

    /* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
    public static final class a extends f {
        final /* synthetic */ b0 this$0;

        public a(b0 b0Var) {
            this.this$0 = b0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            f3.d.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f3.d.e(activity, "activity");
            b0 b0Var = this.this$0;
            int i = b0Var.f593f + 1;
            b0Var.f593f = i;
            if (i == 1 && b0Var.i) {
                b0Var.f597k.d(l.ON_START);
                b0Var.i = false;
            }
        }
    }

    public a0(b0 b0Var) {
        this.this$0 = b0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        f3.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = e0.f604g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            f3.d.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((e0) findFragmentByTag).f605f = this.this$0.f599m;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        f3.d.e(activity, "activity");
        b0 b0Var = this.this$0;
        int i = b0Var.f594g - 1;
        b0Var.f594g = i;
        if (i == 0) {
            Handler handler = b0Var.f596j;
            f3.d.b(handler);
            handler.postDelayed(b0Var.f598l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        f3.d.e(activity, "activity");
        z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        f3.d.e(activity, "activity");
        b0 b0Var = this.this$0;
        int i = b0Var.f593f - 1;
        b0Var.f593f = i;
        if (i == 0 && b0Var.f595h) {
            b0Var.f597k.d(l.ON_STOP);
            b0Var.i = true;
        }
    }
}
