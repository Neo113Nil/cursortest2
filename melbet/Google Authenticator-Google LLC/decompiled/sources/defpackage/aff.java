package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aff extends aee {
    final /* synthetic */ afh a;

    public aff(afh afhVar) {
        this.a = afhVar;
    }

    @Override // defpackage.aee, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = afp.b;
            activity.getClass();
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((afp) findFragmentByTag).a = this.a.h;
        }
    }

    @Override // defpackage.aee, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        afh afhVar = this.a;
        int i = afhVar.c - 1;
        afhVar.c = i;
        if (i == 0) {
            afhVar.e.postDelayed(afhVar.f, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        afg.a(activity, new afe(this));
    }

    @Override // defpackage.aee, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r0.b--;
        this.a.c();
    }
}
