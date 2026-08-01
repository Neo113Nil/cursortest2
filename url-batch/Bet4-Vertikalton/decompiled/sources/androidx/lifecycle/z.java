package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class z extends AbstractC0065f {
    final /* synthetic */ A this$0;

    public static final class a extends AbstractC0065f {
        final /* synthetic */ A this$0;

        public a(A a2) {
            this.this$0 = a2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            d1.d.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            d1.d.e(activity, "activity");
            A a2 = this.this$0;
            int i = a2.f1449a + 1;
            a2.f1449a = i;
            if (i == 1 && a2.d) {
                a2.f1453f.d(EnumC0071l.ON_START);
                a2.d = false;
            }
        }
    }

    public z(A a2) {
        this.this$0 = a2;
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        d1.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = D.f1455b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            d1.d.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((D) findFragmentByTag).f1456a = this.this$0.h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1450b - 1;
        a2.f1450b = i;
        if (i == 0) {
            Handler handler = a2.f1452e;
            d1.d.b(handler);
            handler.postDelayed(a2.f1454g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        d1.d.e(activity, "activity");
        y.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1449a - 1;
        a2.f1449a = i;
        if (i == 0 && a2.f1451c) {
            a2.f1453f.d(EnumC0071l.ON_STOP);
            a2.d = true;
        }
    }
}
