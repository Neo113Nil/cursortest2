package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gob implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof gje) {
            eql eqlVar = eql.a;
            long x = ((gje) activity).x();
            ems emsVar = new ems(x, x);
            ems emsVar2 = eqlVar.n.b;
            if (fao.g() && eqlVar.b != null) {
                long j = emsVar.a;
                if (j <= SystemClock.elapsedRealtime() && ((emsVar2 == null || j <= emsVar2.a) && eqlVar.g == null)) {
                    eqlVar.g = emsVar;
                }
            }
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
