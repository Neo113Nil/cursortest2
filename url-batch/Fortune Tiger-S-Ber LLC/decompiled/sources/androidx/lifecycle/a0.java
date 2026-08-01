package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a0 extends f {
    final /* synthetic */ b0 this$0;

    /* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
    public static final class a extends f {
        final /* synthetic */ b0 this$0;

        public a(b0 b0Var) {
            this.this$0 = b0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            u2.c.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            u2.c.e(activity, "activity");
            b0 b0Var = this.this$0;
            int i4 = b0Var.f571f + 1;
            b0Var.f571f = i4;
            if (i4 == 1 && b0Var.f572i) {
                b0Var.f574k.d(l.ON_START);
                b0Var.f572i = false;
            }
        }
    }

    public a0(b0 b0Var) {
        this.this$0 = b0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        u2.c.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = e0.g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            u2.c.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((e0) findFragmentByTag).f580f = this.this$0.f576m;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        u2.c.e(activity, "activity");
        b0 b0Var = this.this$0;
        int i4 = b0Var.g - 1;
        b0Var.g = i4;
        if (i4 == 0) {
            Handler handler = b0Var.f573j;
            u2.c.b(handler);
            handler.postDelayed(b0Var.f575l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        u2.c.e(activity, "activity");
        z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        u2.c.e(activity, "activity");
        b0 b0Var = this.this$0;
        int i4 = b0Var.f571f - 1;
        b0Var.f571f = i4;
        if (i4 == 0 && b0Var.h) {
            b0Var.f574k.d(l.ON_STOP);
            b0Var.f572i = true;
        }
    }
}
