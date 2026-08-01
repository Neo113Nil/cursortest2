package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class z extends AbstractC0066f {
    final /* synthetic */ A this$0;

    public static final class a extends AbstractC0066f {
        final /* synthetic */ A this$0;

        public a(A a2) {
            this.this$0 = a2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g1.d.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            g1.d.e(activity, "activity");
            A a2 = this.this$0;
            int i = a2.f1480a + 1;
            a2.f1480a = i;
            if (i == 1 && a2.d) {
                a2.f1484f.d(EnumC0072l.ON_START);
                a2.d = false;
            }
        }
    }

    public z(A a2) {
        this.this$0 = a2;
    }

    @Override // androidx.lifecycle.AbstractC0066f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        g1.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = D.f1486b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            g1.d.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((D) findFragmentByTag).f1487a = this.this$0.h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0066f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        g1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1481b - 1;
        a2.f1481b = i;
        if (i == 0) {
            Handler handler = a2.f1483e;
            g1.d.b(handler);
            handler.postDelayed(a2.f1485g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        g1.d.e(activity, "activity");
        y.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0066f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        g1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1480a - 1;
        a2.f1480a = i;
        if (i == 0 && a2.f1482c) {
            a2.f1484f.d(EnumC0072l.ON_STOP);
            a2.d = true;
        }
    }
}
