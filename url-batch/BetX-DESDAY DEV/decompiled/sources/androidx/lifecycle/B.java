package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class B extends AbstractC0074g {
    final /* synthetic */ C this$0;

    public static final class a extends AbstractC0074g {
        final /* synthetic */ C this$0;

        public a(C c2) {
            this.this$0 = c2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            X0.f.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            X0.f.e(activity, "activity");
            C c2 = this.this$0;
            int i = c2.f1436a + 1;
            c2.f1436a = i;
            if (i == 1 && c2.f1439d) {
                c2.f1441f.e(EnumC0080m.ON_START);
                c2.f1439d = false;
            }
        }
    }

    public B(C c2) {
        this.this$0 = c2;
    }

    @Override // androidx.lifecycle.AbstractC0074g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        X0.f.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = F.f1443b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            X0.f.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((F) findFragmentByTag).f1444a = this.this$0.h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0074g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        X0.f.e(activity, "activity");
        C c2 = this.this$0;
        int i = c2.f1437b - 1;
        c2.f1437b = i;
        if (i == 0) {
            Handler handler = c2.f1440e;
            X0.f.b(handler);
            handler.postDelayed(c2.f1442g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        X0.f.e(activity, "activity");
        A.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0074g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        X0.f.e(activity, "activity");
        C c2 = this.this$0;
        int i = c2.f1436a - 1;
        c2.f1436a = i;
        if (i == 0 && c2.f1438c) {
            c2.f1441f.e(EnumC0080m.ON_STOP);
            c2.f1439d = true;
        }
    }
}
