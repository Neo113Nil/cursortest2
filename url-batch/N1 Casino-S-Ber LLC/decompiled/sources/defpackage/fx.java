package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fx extends bi {
    final /* synthetic */ gx this$0;

    /* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
    public static final class a extends bi {
        final /* synthetic */ gx this$0;

        public a(gx gxVar) {
            this.this$0 = gxVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            gx gxVar = this.this$0;
            int i = gxVar.f + 1;
            gxVar.f = i;
            if (i == 1 && gxVar.i) {
                gxVar.k.d(up.ON_START);
                gxVar.i = false;
            }
        }
    }

    public fx(gx gxVar) {
        this.this$0 = gxVar;
    }

    @Override // defpackage.bi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = wz.g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((wz) findFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.bi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        gx gxVar = this.this$0;
        int i = gxVar.g - 1;
        gxVar.g = i;
        if (i == 0) {
            Handler handler = gxVar.j;
            handler.getClass();
            handler.postDelayed(gxVar.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ex.a(activity, new a(this.this$0));
    }

    @Override // defpackage.bi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        gx gxVar = this.this$0;
        int i = gxVar.f - 1;
        gxVar.f = i;
        if (i == 0 && gxVar.h) {
            gxVar.k.d(up.ON_STOP);
            gxVar.i = true;
        }
    }
}
