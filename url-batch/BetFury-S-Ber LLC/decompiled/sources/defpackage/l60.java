package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l60 extends tm {
    final /* synthetic */ m60 this$0;

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static final class a extends tm {
        final /* synthetic */ m60 this$0;

        public a(m60 m60Var) {
            this.this$0 = m60Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            m60 m60Var = this.this$0;
            int i = m60Var.f + 1;
            m60Var.f = i;
            if (i == 1 && m60Var.i) {
                m60Var.k.d(fx.ON_START);
                m60Var.i = false;
            }
        }
    }

    public l60(m60 m60Var) {
        this.this$0 = m60Var;
    }

    @Override // defpackage.tm, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = i90.g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((i90) findFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.tm, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        m60 m60Var = this.this$0;
        int i = m60Var.g - 1;
        m60Var.g = i;
        if (i == 0) {
            Handler handler = m60Var.j;
            handler.getClass();
            handler.postDelayed(m60Var.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        v6.d(activity, new a(this.this$0));
    }

    @Override // defpackage.tm, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        m60 m60Var = this.this$0;
        int i = m60Var.f - 1;
        m60Var.f = i;
        if (i == 0 && m60Var.h) {
            m60Var.k.d(fx.ON_STOP);
            m60Var.i = true;
        }
    }
}
