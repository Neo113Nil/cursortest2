package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends i {
    final /* synthetic */ g0 this$0;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i {
        final /* synthetic */ g0 this$0;

        public a(g0 g0Var) {
            this.this$0 = g0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            g0 g0Var = this.this$0;
            int i3 = g0Var.f684d + 1;
            g0Var.f684d = i3;
            if (i3 == 1 && g0Var.f687r) {
                g0Var.f689t.d(o.ON_START);
                g0Var.f687r = false;
            }
        }
    }

    public f0(g0 g0Var) {
        this.this$0 = g0Var;
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = k0.f695e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((k0) findFragmentByTag).f696d = this.this$0.f691v;
        }
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        g0 g0Var = this.this$0;
        int i3 = g0Var.f685e - 1;
        g0Var.f685e = i3;
        if (i3 == 0) {
            Handler handler = g0Var.f688s;
            handler.getClass();
            handler.postDelayed(g0Var.f690u, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        e0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        g0 g0Var = this.this$0;
        int i3 = g0Var.f684d - 1;
        g0Var.f684d = i3;
        if (i3 == 0 && g0Var.f686i) {
            g0Var.f689t.d(o.ON_STOP);
            g0Var.f687r = true;
        }
    }
}
