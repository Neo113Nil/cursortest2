package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 extends f {
    final /* synthetic */ b0 this$0;

    /* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
    public static final class a extends f {
        final /* synthetic */ b0 this$0;

        public a(b0 b0Var) {
            this.this$0 = b0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            i3.d.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            i3.d.e(activity, "activity");
            b0 b0Var = this.this$0;
            int i = b0Var.f698f + 1;
            b0Var.f698f = i;
            if (i == 1 && b0Var.i) {
                b0Var.f701k.d(l.ON_START);
                b0Var.i = false;
            }
        }
    }

    public a0(b0 b0Var) {
        this.this$0 = b0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i3.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = e0.f708g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            i3.d.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((e0) findFragmentByTag).f709f = this.this$0.f703m;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        i3.d.e(activity, "activity");
        b0 b0Var = this.this$0;
        int i = b0Var.f699g - 1;
        b0Var.f699g = i;
        if (i == 0) {
            Handler handler = b0Var.f700j;
            i3.d.b(handler);
            handler.postDelayed(b0Var.f702l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        i3.d.e(activity, "activity");
        z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        i3.d.e(activity, "activity");
        b0 b0Var = this.this$0;
        int i = b0Var.f698f - 1;
        b0Var.f698f = i;
        if (i == 0 && b0Var.h) {
            b0Var.f701k.d(l.ON_STOP);
            b0Var.i = true;
        }
    }
}
