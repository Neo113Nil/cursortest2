package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class B extends AbstractC0065f {
    final /* synthetic */ C this$0;

    public static final class a extends AbstractC0065f {
        final /* synthetic */ C this$0;

        public a(C c2) {
            this.this$0 = c2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            k1.e.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            k1.e.e(activity, "activity");
            C c2 = this.this$0;
            int i = c2.f1853a + 1;
            c2.f1853a = i;
            if (i == 1 && c2.d) {
                c2.f1857f.d(EnumC0071l.ON_START);
                c2.d = false;
            }
        }
    }

    public B(C c2) {
        this.this$0 = c2;
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k1.e.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = F.f1859b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            k1.e.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((F) findFragmentByTag).f1860a = this.this$0.h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k1.e.e(activity, "activity");
        C c2 = this.this$0;
        int i = c2.f1854b - 1;
        c2.f1854b = i;
        if (i == 0) {
            Handler handler = c2.f1856e;
            k1.e.b(handler);
            handler.postDelayed(c2.f1858g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        k1.e.e(activity, "activity");
        A.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0065f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        k1.e.e(activity, "activity");
        C c2 = this.this$0;
        int i = c2.f1853a - 1;
        c2.f1853a = i;
        if (i == 0 && c2.f1855c) {
            c2.f1857f.d(EnumC0071l.ON_STOP);
            c2.d = true;
        }
    }
}
