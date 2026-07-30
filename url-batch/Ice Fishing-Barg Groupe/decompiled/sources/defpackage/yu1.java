package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class yu1 extends Fragment {
    public static final wu1 Companion = new wu1();
    public i2 rtx2ld2ELZv4;

    /* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
    public static final class PxuCJdSBwIXG implements Application.ActivityLifecycleCallbacks {
        public static final xu1 Companion = new xu1();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new PxuCJdSBwIXG());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            wu1 wu1Var = yu1.Companion;
            e01 e01Var = e01.ON_CREATE;
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            wu1 wu1Var = yu1.Companion;
            e01 e01Var = e01.ON_RESUME;
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            wu1 wu1Var = yu1.Companion;
            e01 e01Var = e01.ON_START;
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            wu1 wu1Var = yu1.Companion;
            e01 e01Var = e01.ON_DESTROY;
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            wu1 wu1Var = yu1.Companion;
            e01 e01Var = e01.ON_PAUSE;
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            wu1 wu1Var = yu1.Companion;
            e01 e01Var = e01.ON_STOP;
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void PxuCJdSBwIXG(e01 e01Var) {
        if (Build.VERSION.SDK_INT < 29) {
            wu1 wu1Var = Companion;
            Activity activity = getActivity();
            activity.getClass();
            wu1Var.getClass();
            wu1.PxuCJdSBwIXG(activity, e01Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        PxuCJdSBwIXG(e01.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PxuCJdSBwIXG(e01.ON_DESTROY);
        this.rtx2ld2ELZv4 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        PxuCJdSBwIXG(e01.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        i2 i2Var = this.rtx2ld2ELZv4;
        if (i2Var != null) {
            ((jq1) i2Var.OPXfSBeufaJ8).PxuCJdSBwIXG();
        }
        PxuCJdSBwIXG(e01.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        i2 i2Var = this.rtx2ld2ELZv4;
        if (i2Var != null) {
            jq1 jq1Var = (jq1) i2Var.OPXfSBeufaJ8;
            int i = jq1Var.rtx2ld2ELZv4 + 1;
            jq1Var.rtx2ld2ELZv4 = i;
            if (i == 1 && jq1Var.dgRBjINgWbAK) {
                jq1Var.cpQdD2nAriOS.Y1f8riQaR6yg(e01.ON_START);
                jq1Var.dgRBjINgWbAK = false;
            }
        }
        PxuCJdSBwIXG(e01.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        PxuCJdSBwIXG(e01.ON_STOP);
    }
}
