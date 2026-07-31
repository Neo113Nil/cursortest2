package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class D extends AbstractC0239f {
    final /* synthetic */ E this$0;

    public static final class a extends AbstractC0239f {
        final /* synthetic */ E this$0;

        public a(E e4) {
            this.this$0 = e4;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            E e4 = this.this$0;
            int i7 = e4.f3456f + 1;
            e4.f3456f = i7;
            if (i7 == 1 && e4.f3459i) {
                e4.f3461k.e(EnumC0246m.ON_START);
                e4.f3459i = false;
            }
        }
    }

    public D(E e4) {
        this.this$0 = e4;
    }

    @Override // androidx.lifecycle.AbstractC0239f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = H.f3464g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) findFragmentByTag).f3465f = this.this$0.f3463m;
        }
    }

    @Override // androidx.lifecycle.AbstractC0239f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        E e4 = this.this$0;
        int i7 = e4.f3457g - 1;
        e4.f3457g = i7;
        if (i7 == 0) {
            Handler handler = e4.f3460j;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(e4.f3462l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0239f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        E e4 = this.this$0;
        int i7 = e4.f3456f - 1;
        e4.f3456f = i7;
        if (i7 == 0 && e4.f3458h) {
            e4.f3461k.e(EnumC0246m.ON_STOP);
            e4.f3459i = true;
        }
    }
}
