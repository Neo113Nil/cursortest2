package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sx extends th {
    final /* synthetic */ ux this$0;

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public static final class a extends th {
        final /* synthetic */ ux this$0;

        public a(ux uxVar) {
            this.this$0 = uxVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ux uxVar = this.this$0;
            int i = uxVar.f + 1;
            uxVar.f = i;
            if (i == 1 && uxVar.i) {
                uxVar.k.e(gq.ON_START);
                uxVar.i = false;
            }
        }
    }

    public sx(ux uxVar) {
        this.this$0 = uxVar;
    }

    @Override // defpackage.th, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = l00.g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((l00) findFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.th, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ux uxVar = this.this$0;
        int i = uxVar.g - 1;
        uxVar.g = i;
        if (i == 0) {
            Handler handler = uxVar.j;
            handler.getClass();
            handler.postDelayed(uxVar.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        rx.a(activity, new a(this.this$0));
    }

    @Override // defpackage.th, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ux uxVar = this.this$0;
        int i = uxVar.f - 1;
        uxVar.f = i;
        if (i == 0 && uxVar.h) {
            uxVar.k.e(gq.ON_STOP);
            uxVar.i = true;
        }
    }
}
