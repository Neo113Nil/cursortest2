package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class B extends AbstractC0071f {
    final /* synthetic */ C this$0;

    public static final class a extends AbstractC0071f {
        final /* synthetic */ C this$0;

        public a(C c2) {
            this.this$0 = c2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            j1.h.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            j1.h.e(activity, "activity");
            C c2 = this.this$0;
            int i = c2.f1900a + 1;
            c2.f1900a = i;
            if (i == 1 && c2.f1903d) {
                c2.f1904f.d(EnumC0077l.ON_START);
                c2.f1903d = false;
            }
        }
    }

    public B(C c2) {
        this.this$0 = c2;
    }

    @Override // androidx.lifecycle.AbstractC0071f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        j1.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = F.f1907b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            j1.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((F) findFragmentByTag).f1908a = this.this$0.f1906h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0071f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j1.h.e(activity, "activity");
        C c2 = this.this$0;
        int i = c2.f1901b - 1;
        c2.f1901b = i;
        if (i == 0) {
            Handler handler = c2.e;
            j1.h.b(handler);
            handler.postDelayed(c2.f1905g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        j1.h.e(activity, "activity");
        A.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0071f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        j1.h.e(activity, "activity");
        C c2 = this.this$0;
        int i = c2.f1900a - 1;
        c2.f1900a = i;
        if (i == 0 && c2.f1902c) {
            c2.f1904f.d(EnumC0077l.ON_STOP);
            c2.f1903d = true;
        }
    }
}
