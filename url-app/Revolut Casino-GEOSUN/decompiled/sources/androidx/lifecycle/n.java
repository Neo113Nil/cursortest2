package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class n extends a {
    final /* synthetic */ o this$0;

    public n(o oVar) {
        this.this$0 = oVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        F0.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = s.f1539f;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            F0.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((s) findFragmentByTag).f1540e = this.this$0.f1538l;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        F0.i.e(activity, "activity");
        o oVar = this.this$0;
        int i2 = oVar.f1532f - 1;
        oVar.f1532f = i2;
        if (i2 == 0) {
            Handler handler = oVar.f1535i;
            F0.i.b(handler);
            handler.postDelayed(oVar.f1537k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        F0.i.e(activity, "activity");
        l.a(activity, new m(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        F0.i.e(activity, "activity");
        o oVar = this.this$0;
        int i2 = oVar.f1531e - 1;
        oVar.f1531e = i2;
        if (i2 == 0 && oVar.f1533g) {
            oVar.f1536j.a(d.ON_STOP);
            oVar.f1534h = true;
        }
    }
}
