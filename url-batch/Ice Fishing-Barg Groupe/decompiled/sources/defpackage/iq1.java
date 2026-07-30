package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class iq1 extends k50 {
    final /* synthetic */ jq1 this$0;

    /* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
    public static final class PxuCJdSBwIXG extends k50 {
        final /* synthetic */ jq1 this$0;

        public PxuCJdSBwIXG(jq1 jq1Var) {
            this.this$0 = jq1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.PxuCJdSBwIXG();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            jq1 jq1Var = this.this$0;
            int i = jq1Var.rtx2ld2ELZv4 + 1;
            jq1Var.rtx2ld2ELZv4 = i;
            if (i == 1 && jq1Var.dgRBjINgWbAK) {
                jq1Var.cpQdD2nAriOS.Y1f8riQaR6yg(e01.ON_START);
                jq1Var.dgRBjINgWbAK = false;
            }
        }
    }

    public iq1(jq1 jq1Var) {
        this.this$0 = jq1Var;
    }

    @Override // defpackage.k50, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            yu1.Companion.getClass();
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((yu1) findFragmentByTag).rtx2ld2ELZv4 = this.this$0.QrzZRwfaDlRX;
        }
    }

    @Override // defpackage.k50, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        jq1 jq1Var = this.this$0;
        int i = jq1Var.OPXfSBeufaJ8 - 1;
        jq1Var.OPXfSBeufaJ8 = i;
        if (i == 0) {
            Handler handler = jq1Var.x50lh2ztY7Y5;
            handler.getClass();
            handler.postDelayed(jq1Var.r3s1LDPKFs1S, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        yr.OPXfSBeufaJ8(activity, new PxuCJdSBwIXG(this.this$0));
    }

    @Override // defpackage.k50, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        jq1 jq1Var = this.this$0;
        int i = jq1Var.rtx2ld2ELZv4 - 1;
        jq1Var.rtx2ld2ELZv4 = i;
        if (i == 0 && jq1Var.wdg6QnbFHrFF) {
            jq1Var.cpQdD2nAriOS.Y1f8riQaR6yg(e01.ON_STOP);
            jq1Var.dgRBjINgWbAK = true;
        }
    }
}
