package s1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0872c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: m, reason: collision with root package name */
    public static final ComponentCallbacks2C0872c f7638m = new ComponentCallbacks2C0872c();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7639d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7640e = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7641i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public boolean f7642l = false;

    public static void a(Application application) {
        ComponentCallbacks2C0872c componentCallbacks2C0872c = f7638m;
        synchronized (componentCallbacks2C0872c) {
            try {
                if (!componentCallbacks2C0872c.f7642l) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0872c);
                    application.registerComponentCallbacks(componentCallbacks2C0872c);
                    componentCallbacks2C0872c.f7642l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z7) {
        synchronized (f7638m) {
            try {
                ArrayList arrayList = this.f7641i;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((InterfaceC0871b) obj).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7639d.compareAndSet(true, false);
        this.f7640e.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7639d.compareAndSet(true, false);
        this.f7640e.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f7639d.compareAndSet(false, true)) {
            this.f7640e.set(true);
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
