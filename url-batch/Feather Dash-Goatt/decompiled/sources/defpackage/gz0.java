package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gz0 extends jv {
    final /* synthetic */ hz0 this$0;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public static final class a extends jv {
        final /* synthetic */ hz0 this$0;

        public a(hz0 hz0Var) {
            this.this$0 = hz0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            hz0 hz0Var = this.this$0;
            int i = hz0Var.e + 1;
            hz0Var.e = i;
            if (i == 1) {
                if (hz0Var.g) {
                    hz0Var.j.d(ng0.ON_RESUME);
                    hz0Var.g = false;
                } else {
                    Handler handler = hz0Var.i;
                    handler.getClass();
                    handler.removeCallbacks(hz0Var.k);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            hz0 hz0Var = this.this$0;
            int i = hz0Var.d + 1;
            hz0Var.d = i;
            if (i == 1 && hz0Var.h) {
                hz0Var.j.d(ng0.ON_START);
                hz0Var.h = false;
            }
        }
    }

    public gz0(hz0 hz0Var) {
        this.this$0 = hz0Var;
    }

    @Override // defpackage.jv, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // defpackage.jv, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        hz0 hz0Var = this.this$0;
        int i = hz0Var.e - 1;
        hz0Var.e = i;
        if (i == 0) {
            Handler handler = hz0Var.i;
            handler.getClass();
            handler.postDelayed(hz0Var.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        a aVar = new a(this.this$0);
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    @Override // defpackage.jv, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        hz0 hz0Var = this.this$0;
        int i = hz0Var.d - 1;
        hz0Var.d = i;
        if (i == 0 && hz0Var.g) {
            hz0Var.j.d(ng0.ON_STOP);
            hz0Var.h = true;
        }
    }
}
