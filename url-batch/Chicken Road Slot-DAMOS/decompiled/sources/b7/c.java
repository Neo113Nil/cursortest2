package b7;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: s, reason: collision with root package name */
    public static final c f1252s = new c();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1253d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1254e = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1255i = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f1256r = false;

    public static void a(Application application) {
        c cVar = f1252s;
        synchronized (cVar) {
            try {
                if (!cVar.f1256r) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f1256r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z10) {
        synchronized (f1252s) {
            try {
                ArrayList arrayList = this.f1255i;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((b) obj).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f1253d.compareAndSet(true, false);
        this.f1254e.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f1253d.compareAndSet(true, false);
        this.f1254e.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f1253d.compareAndSet(false, true)) {
            this.f1254e.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
