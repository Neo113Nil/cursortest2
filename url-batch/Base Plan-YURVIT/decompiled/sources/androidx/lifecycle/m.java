package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class m extends androidx.lifecycle.a {
    final /* synthetic */ n this$0;

    public static final class a extends androidx.lifecycle.a {
        final /* synthetic */ n this$0;

        public a(n nVar) {
            this.this$0 = nVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            P0.h.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            P0.h.e(activity, "activity");
            n nVar = this.this$0;
            int i2 = nVar.f1621e + 1;
            nVar.f1621e = i2;
            if (i2 == 1 && nVar.f1624h) {
                nVar.f1626j.a(d.ON_START);
                nVar.f1624h = false;
            }
        }
    }

    public m(n nVar) {
        this.this$0 = nVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        P0.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = r.f1629f;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            P0.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((r) findFragmentByTag).f1630e = this.this$0.f1628l;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        P0.h.e(activity, "activity");
        n nVar = this.this$0;
        int i2 = nVar.f1622f - 1;
        nVar.f1622f = i2;
        if (i2 == 0) {
            Handler handler = nVar.f1625i;
            P0.h.b(handler);
            handler.postDelayed(nVar.f1627k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        P0.h.e(activity, "activity");
        l.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        P0.h.e(activity, "activity");
        n nVar = this.this$0;
        int i2 = nVar.f1621e - 1;
        nVar.f1621e = i2;
        if (i2 == 0 && nVar.f1623g) {
            nVar.f1626j.a(d.ON_STOP);
            nVar.f1624h = true;
        }
    }
}
