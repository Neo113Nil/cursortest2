package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class z extends AbstractC0072f {
    final /* synthetic */ A this$0;

    public static final class a extends AbstractC0072f {
        final /* synthetic */ A this$0;

        public a(A a2) {
            this.this$0 = a2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            h1.d.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            h1.d.e(activity, "activity");
            A a2 = this.this$0;
            int i = a2.f1540a + 1;
            a2.f1540a = i;
            if (i == 1 && a2.d) {
                a2.f1544f.d(EnumC0078l.ON_START);
                a2.d = false;
            }
        }
    }

    public z(A a2) {
        this.this$0 = a2;
    }

    @Override // androidx.lifecycle.AbstractC0072f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h1.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = D.f1547b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            h1.d.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((D) findFragmentByTag).f1548a = this.this$0.f1546h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0072f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        h1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1541b - 1;
        a2.f1541b = i;
        if (i == 0) {
            Handler handler = a2.f1543e;
            h1.d.b(handler);
            handler.postDelayed(a2.f1545g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        h1.d.e(activity, "activity");
        y.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0072f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        h1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1540a - 1;
        a2.f1540a = i;
        if (i == 0 && a2.f1542c) {
            a2.f1544f.d(EnumC0078l.ON_STOP);
            a2.d = true;
        }
    }
}
