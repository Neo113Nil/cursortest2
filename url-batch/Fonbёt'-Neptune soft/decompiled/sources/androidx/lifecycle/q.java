package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class q extends c {
    final /* synthetic */ r this$0;

    public static final class a extends c {
        final /* synthetic */ r this$0;

        public a(r rVar) {
            this.this$0 = rVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Q0.h.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Q0.h.e(activity, "activity");
            r rVar = this.this$0;
            int i2 = rVar.f1787e + 1;
            rVar.f1787e = i2;
            if (i2 == 1 && rVar.f1790h) {
                rVar.f1792j.c(f.ON_START);
                rVar.f1790h = false;
            }
        }
    }

    public q(r rVar) {
        this.this$0 = rVar;
    }

    @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Q0.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = u.f1795f;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Q0.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((u) findFragmentByTag).f1796e = this.this$0.f1794l;
        }
    }

    @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Q0.h.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f1788f - 1;
        rVar.f1788f = i2;
        if (i2 == 0) {
            Handler handler = rVar.f1791i;
            Q0.h.b(handler);
            handler.postDelayed(rVar.f1793k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Q0.h.e(activity, "activity");
        p.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Q0.h.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f1787e - 1;
        rVar.f1787e = i2;
        if (i2 == 0 && rVar.f1789g) {
            rVar.f1792j.c(f.ON_STOP);
            rVar.f1790h = true;
        }
    }
}
