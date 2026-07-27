package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class E extends AbstractC0236f {
    final /* synthetic */ F this$0;

    public E(F f3) {
        this.this$0 = f3;
    }

    @Override // androidx.lifecycle.AbstractC0236f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = I.f4529b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((I) findFragmentByTag).f4530a = this.this$0.f4528h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0236f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        F f3 = this.this$0;
        int i2 = f3.f4522b - 1;
        f3.f4522b = i2;
        if (i2 == 0) {
            Handler handler = f3.f4525e;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(f3.f4527g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        C.a(activity, new D(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0236f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        F f3 = this.this$0;
        int i2 = f3.f4521a - 1;
        f3.f4521a = i2;
        if (i2 == 0 && f3.f4523c) {
            f3.f4526f.e(EnumC0243m.ON_STOP);
            f3.f4524d = true;
        }
    }
}
