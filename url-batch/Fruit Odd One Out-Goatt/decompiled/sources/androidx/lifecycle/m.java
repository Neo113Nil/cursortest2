package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class m extends androidx.lifecycle.a {
    final /* synthetic */ o this$0;

    /* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
    public static final class a extends androidx.lifecycle.a {
        final /* synthetic */ o this$0;

        public a(o oVar) {
            this.this$0 = oVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            o oVar = this.this$0;
            int i2 = oVar.f42a + 1;
            oVar.f42a = i2;
            if (i2 == 1 && oVar.f45d) {
                oVar.f47f.a(d.ON_START);
                oVar.f45d = false;
            }
        }
    }

    public m(o oVar) {
        this.this$0 = oVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = s.f50b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((s) findFragmentByTag).f51a = this.this$0.f49h;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        o oVar = this.this$0;
        int i2 = oVar.f43b - 1;
        oVar.f43b = i2;
        if (i2 == 0) {
            Handler handler = oVar.f46e;
            handler.getClass();
            handler.postDelayed(oVar.f48g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        l.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        o oVar = this.this$0;
        int i2 = oVar.f42a - 1;
        oVar.f42a = i2;
        if (i2 == 0 && oVar.f44c) {
            oVar.f47f.a(d.ON_STOP);
            oVar.f45d = true;
        }
    }
}
