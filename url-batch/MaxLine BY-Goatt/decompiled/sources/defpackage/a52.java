package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a52 extends wg0 {
    final /* synthetic */ b52 this$0;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a extends wg0 {
        final /* synthetic */ b52 this$0;

        public a(b52 b52Var) {
            this.this$0 = b52Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            b52 b52Var = this.this$0;
            int i = b52Var.m + 1;
            b52Var.m = i;
            if (i == 1 && b52Var.p) {
                b52Var.r.f(yc1.ON_START);
                b52Var.p = false;
            }
        }
    }

    public a52(b52 b52Var) {
        this.this$0 = b52Var;
    }

    @Override // defpackage.wg0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = b92.n;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((b92) findFragmentByTag).m = this.this$0.t;
        }
    }

    @Override // defpackage.wg0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        b52 b52Var = this.this$0;
        int i = b52Var.n - 1;
        b52Var.n = i;
        if (i == 0) {
            Handler handler = b52Var.q;
            handler.getClass();
            handler.postDelayed(b52Var.s, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        x6.q(activity, new a(this.this$0));
    }

    @Override // defpackage.wg0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        b52 b52Var = this.this$0;
        int i = b52Var.m - 1;
        b52Var.m = i;
        if (i == 0 && b52Var.o) {
            b52Var.r.f(yc1.ON_STOP);
            b52Var.p = true;
        }
    }
}
