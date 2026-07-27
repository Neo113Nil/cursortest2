package G1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public static final c f3101k = new c();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3102d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3103e = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3104i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f3105j = false;

    public static void a(Application application) {
        c cVar = f3101k;
        synchronized (cVar) {
            try {
                if (!cVar.f3105j) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f3105j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z4) {
        synchronized (f3101k) {
            try {
                Iterator it = this.f3104i.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f3103e;
        boolean compareAndSet = this.f3102d.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f3103e;
        boolean compareAndSet = this.f3102d.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f3102d.compareAndSet(false, true)) {
            this.f3103e.set(true);
            b(true);
        }
    }
}
