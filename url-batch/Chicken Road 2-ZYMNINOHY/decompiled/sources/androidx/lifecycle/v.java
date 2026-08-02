package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class v extends AbstractC0223b {
    final /* synthetic */ w this$0;

    public static final class a extends AbstractC0223b {
        final /* synthetic */ w this$0;

        public a(w wVar) {
            this.this$0 = wVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            w wVar = this.this$0;
            int i4 = wVar.f5075a + 1;
            wVar.f5075a = i4;
            if (i4 == 1 && wVar.f5078d) {
                wVar.f5080f.e(EnumC0229h.ON_START);
                wVar.f5078d = false;
            }
        }
    }

    public v(w wVar) {
        this.this$0 = wVar;
    }

    @Override // androidx.lifecycle.AbstractC0223b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = z.f5083b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((z) findFragmentByTag).f5084a = this.this$0.f5082h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0223b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        w wVar = this.this$0;
        int i4 = wVar.f5076b - 1;
        wVar.f5076b = i4;
        if (i4 == 0) {
            Handler handler = wVar.f5079e;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(wVar.f5081g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        u.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0223b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        w wVar = this.this$0;
        int i4 = wVar.f5075a - 1;
        wVar.f5075a = i4;
        if (i4 == 0 && wVar.f5077c) {
            wVar.f5080f.e(EnumC0229h.ON_STOP);
            wVar.f5078d = true;
        }
    }
}
