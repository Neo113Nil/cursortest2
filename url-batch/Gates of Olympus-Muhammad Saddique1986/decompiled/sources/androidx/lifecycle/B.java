package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class B extends AbstractC0279h {
    final /* synthetic */ C this$0;

    public static final class a extends AbstractC0279h {
        final /* synthetic */ C this$0;

        public a(C c2) {
            this.this$0 = c2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            f2.j.f(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f2.j.f(activity, "activity");
            C c2 = this.this$0;
            int i3 = c2.f5139d + 1;
            c2.f5139d = i3;
            if (i3 == 1 && c2.f5142g) {
                c2.f5144i.d(EnumC0285n.ON_START);
                c2.f5142g = false;
            }
        }
    }

    public B(C c2) {
        this.this$0 = c2;
    }

    @Override // androidx.lifecycle.AbstractC0279h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        f2.j.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = K.f5174e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            f2.j.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((K) findFragmentByTag).f5175d = this.this$0.f5146k;
        }
    }

    @Override // androidx.lifecycle.AbstractC0279h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        f2.j.f(activity, "activity");
        C c2 = this.this$0;
        int i3 = c2.f5140e - 1;
        c2.f5140e = i3;
        if (i3 == 0) {
            Handler handler = c2.f5143h;
            f2.j.c(handler);
            handler.postDelayed(c2.f5145j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        f2.j.f(activity, "activity");
        A.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0279h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        f2.j.f(activity, "activity");
        C c2 = this.this$0;
        int i3 = c2.f5139d - 1;
        c2.f5139d = i3;
        if (i3 == 0 && c2.f5141f) {
            c2.f5144i.d(EnumC0285n.ON_STOP);
            c2.f5142g = true;
        }
    }
}
