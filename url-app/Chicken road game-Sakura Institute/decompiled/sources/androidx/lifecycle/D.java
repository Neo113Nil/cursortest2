package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D extends AbstractC0468h {
    final /* synthetic */ E this$0;

    public static final class a extends AbstractC0468h {
        final /* synthetic */ E this$0;

        public a(E e4) {
            this.this$0 = e4;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            E e4 = this.this$0;
            int i2 = e4.f5421d + 1;
            e4.f5421d = i2;
            if (i2 == 1 && e4.f5424j) {
                e4.f5426l.d(EnumC0474n.ON_START);
                e4.f5424j = false;
            }
        }
    }

    public D(E e4) {
        this.this$0 = e4;
    }

    @Override // androidx.lifecycle.AbstractC0468h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = H.f5429e;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) findFragmentByTag).f5430d = this.this$0.f5428n;
        }
    }

    @Override // androidx.lifecycle.AbstractC0468h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E e4 = this.this$0;
        int i2 = e4.f5422e - 1;
        e4.f5422e = i2;
        if (i2 == 0) {
            Handler handler = e4.f5425k;
            Intrinsics.c(handler);
            handler.postDelayed(e4.f5427m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0468h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E e4 = this.this$0;
        int i2 = e4.f5421d - 1;
        e4.f5421d = i2;
        if (i2 == 0 && e4.f5423i) {
            e4.f5426l.d(EnumC0474n.ON_STOP);
            e4.f5424j = true;
        }
    }
}
