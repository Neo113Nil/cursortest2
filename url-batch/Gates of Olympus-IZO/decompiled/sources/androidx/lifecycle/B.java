package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class B extends AbstractC0223h {
    final /* synthetic */ C this$0;

    public static final class a extends AbstractC0223h {
        final /* synthetic */ C this$0;

        public a(C c3) {
            this.this$0 = c3;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Z1.i.f(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Z1.i.f(activity, "activity");
            C c3 = this.this$0;
            int i3 = c3.f3938d + 1;
            c3.f3938d = i3;
            if (i3 == 1 && c3.f3941g) {
                c3.f3943i.d(EnumC0229n.ON_START);
                c3.f3941g = false;
            }
        }
    }

    public B(C c3) {
        this.this$0 = c3;
    }

    @Override // androidx.lifecycle.AbstractC0223h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Z1.i.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = K.f3973e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Z1.i.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((K) findFragmentByTag).f3974d = this.this$0.f3945k;
        }
    }

    @Override // androidx.lifecycle.AbstractC0223h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Z1.i.f(activity, "activity");
        C c3 = this.this$0;
        int i3 = c3.f3939e - 1;
        c3.f3939e = i3;
        if (i3 == 0) {
            Handler handler = c3.f3942h;
            Z1.i.c(handler);
            handler.postDelayed(c3.f3944j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Z1.i.f(activity, "activity");
        A.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0223h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Z1.i.f(activity, "activity");
        C c3 = this.this$0;
        int i3 = c3.f3938d - 1;
        c3.f3938d = i3;
        if (i3 == 0 && c3.f3940f) {
            c3.f3943i.d(EnumC0229n.ON_STOP);
            c3.f3941g = true;
        }
    }
}
