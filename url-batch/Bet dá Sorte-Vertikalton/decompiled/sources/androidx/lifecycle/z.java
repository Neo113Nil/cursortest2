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
            b1.d.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            b1.d.e(activity, "activity");
            A a2 = this.this$0;
            int i = a2.f1407a + 1;
            a2.f1407a = i;
            if (i == 1 && a2.d) {
                a2.f1411f.d(EnumC0071l.ON_START);
                a2.d = false;
            }
        }
    }

    public z(A a2) {
        this.this$0 = a2;
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        b1.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = D.f1413b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            b1.d.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((D) findFragmentByTag).f1414a = this.this$0.h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1408b - 1;
        a2.f1408b = i;
        if (i == 0) {
            Handler handler = a2.f1410e;
            b1.d.b(handler);
            handler.postDelayed(a2.f1412g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        b1.d.e(activity, "activity");
        y.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b1.d.e(activity, "activity");
        A a2 = this.this$0;
        int i = a2.f1407a - 1;
        a2.f1407a = i;
        if (i == 0 && a2.f1409c) {
            a2.f1411f.d(EnumC0071l.ON_STOP);
            a2.d = true;
        }
    }
}
