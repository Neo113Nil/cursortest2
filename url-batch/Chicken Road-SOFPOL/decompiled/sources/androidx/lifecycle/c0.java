package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 extends i {
    final /* synthetic */ d0 this$0;

    /* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
    public static final class a extends i {
        final /* synthetic */ d0 this$0;

        public a(d0 d0Var) {
            this.this$0 = d0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            q6.i.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            q6.i.e(activity, "activity");
            d0 d0Var = this.this$0;
            int i = d0Var.f816d + 1;
            d0Var.f816d = i;
            if (i == 1 && d0Var.f819g) {
                d0Var.i.d(o.ON_START);
                d0Var.f819g = false;
            }
        }
    }

    public c0(d0 d0Var) {
        this.this$0 = d0Var;
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        q6.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = h0.f829e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            q6.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((h0) findFragmentByTag).f830d = this.this$0.f822k;
        }
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        q6.i.e(activity, "activity");
        d0 d0Var = this.this$0;
        int i = d0Var.f817e - 1;
        d0Var.f817e = i;
        if (i == 0) {
            Handler handler = d0Var.f820h;
            q6.i.b(handler);
            handler.postDelayed(d0Var.f821j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        q6.i.e(activity, "activity");
        b0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q6.i.e(activity, "activity");
        d0 d0Var = this.this$0;
        int i = d0Var.f816d - 1;
        d0Var.f816d = i;
        if (i == 0 && d0Var.f818f) {
            d0Var.i.d(o.ON_STOP);
            d0Var.f819g = true;
        }
    }
}
