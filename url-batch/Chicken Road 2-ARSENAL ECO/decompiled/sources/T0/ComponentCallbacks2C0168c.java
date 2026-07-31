package T0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: T0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0168c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j, reason: collision with root package name */
    public static final ComponentCallbacks2C0168c f2272j = new ComponentCallbacks2C0168c();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2273f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2274g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2275h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f2276i = false;

    public static void a(Application application) {
        ComponentCallbacks2C0168c componentCallbacks2C0168c = f2272j;
        synchronized (componentCallbacks2C0168c) {
            try {
                if (!componentCallbacks2C0168c.f2276i) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0168c);
                    application.registerComponentCallbacks(componentCallbacks2C0168c);
                    componentCallbacks2C0168c.f2276i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z5) {
        synchronized (f2272j) {
            try {
                ArrayList arrayList = this.f2275h;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((InterfaceC0167b) obj).a(z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2273f.compareAndSet(true, false);
        this.f2274g.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2273f.compareAndSet(true, false);
        this.f2274g.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f2273f.compareAndSet(false, true)) {
            this.f2274g.set(true);
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
