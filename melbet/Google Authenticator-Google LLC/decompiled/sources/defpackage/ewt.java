package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewt implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ gzp c;
    final /* synthetic */ Set d;
    final /* synthetic */ gzp e;
    final /* synthetic */ koe f;
    final /* synthetic */ fwm g;

    public ewt(Application application, gzp gzpVar, Set set, fwm fwmVar, gzp gzpVar2, koe koeVar) {
        this.b = application;
        this.c = gzpVar;
        this.d = set;
        this.g = fwmVar;
        this.e = gzpVar2;
        this.f = koeVar;
    }

    private final hel a() {
        if (this.a) {
            int i = hel.d;
            return his.a;
        }
        this.a = true;
        Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        hfk hfkVar = new hfk();
        hfkVar.j(this.d);
        if (this.g.l() || ((Boolean) this.e.d(false)).booleanValue()) {
            hfkVar.j(((jsd) this.f).b());
        }
        hfm g = hfkVar.g();
        heg d = hel.d(g.size());
        hjr it = g.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((gzf) ((gzs) this.c).a).a((Application.ActivityLifecycleCallbacks) it.next());
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            d.h(activityLifecycleCallbacks);
        }
        return d.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        hel a = a();
        int i = ((his) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        hoq.H(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        hoq.H(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        hel a = a();
        int i = ((his) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        hoq.H(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        hoq.H(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        hoq.H(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        hoq.H(this.a);
    }
}
