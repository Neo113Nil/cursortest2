package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends AbstractC0242h {
    final /* synthetic */ G this$0;

    public static final class a extends AbstractC0242h {
        final /* synthetic */ G this$0;

        public a(G g7) {
            this.this$0 = g7;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            G g7 = this.this$0;
            int i2 = g7.f3848d + 1;
            g7.f3848d = i2;
            if (i2 == 1 && g7.f3851l) {
                g7.f3853n.e(EnumC0248n.ON_START);
                g7.f3851l = false;
            }
        }
    }

    public F(G g7) {
        this.this$0 = g7;
    }

    @Override // androidx.lifecycle.AbstractC0242h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = J.f3856e;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((J) findFragmentByTag).f3857d = this.this$0.f3855p;
        }
    }

    @Override // androidx.lifecycle.AbstractC0242h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        G g7 = this.this$0;
        int i2 = g7.f3849e - 1;
        g7.f3849e = i2;
        if (i2 == 0) {
            Handler handler = g7.f3852m;
            Intrinsics.b(handler);
            handler.postDelayed(g7.f3854o, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0242h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        G g7 = this.this$0;
        int i2 = g7.f3848d - 1;
        g7.f3848d = i2;
        if (i2 == 0 && g7.f3850i) {
            g7.f3853n.e(EnumC0248n.ON_STOP);
            g7.f3851l = true;
        }
    }
}
