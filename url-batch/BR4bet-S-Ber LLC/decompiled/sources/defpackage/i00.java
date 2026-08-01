package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i00 extends fk {
    final /* synthetic */ j00 this$0;

    /* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
    public static final class a extends fk {
        final /* synthetic */ j00 this$0;

        public a(j00 j00Var) {
            this.this$0 = j00Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            j00 j00Var = this.this$0;
            int i = j00Var.f + 1;
            j00Var.f = i;
            if (i == 1 && j00Var.i) {
                j00Var.k.d(gs.ON_START);
                j00Var.i = false;
            }
        }
    }

    public i00(j00 j00Var) {
        this.this$0 = j00Var;
    }

    @Override // defpackage.fk, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = a30.g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((a30) findFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.fk, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        j00 j00Var = this.this$0;
        int i = j00Var.g - 1;
        j00Var.g = i;
        if (i == 0) {
            Handler handler = j00Var.j;
            handler.getClass();
            handler.postDelayed(j00Var.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        h00.a(activity, new a(this.this$0));
    }

    @Override // defpackage.fk, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        j00 j00Var = this.this$0;
        int i = j00Var.f - 1;
        j00Var.f = i;
        if (i == 0 && j00Var.h) {
            j00Var.k.d(gs.ON_STOP);
            j00Var.i = true;
        }
    }
}
