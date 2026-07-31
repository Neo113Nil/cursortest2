package q3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j, reason: collision with root package name */
    private static final c f20228j = new c();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f20229f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f20230g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<a> f20231h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private boolean f20232i = false;

    public interface a {
        void a(boolean z6);
    }

    private c() {
    }

    @RecentlyNonNull
    public static c b() {
        return f20228j;
    }

    public static void c(@RecentlyNonNull Application application) {
        c cVar = f20228j;
        synchronized (cVar) {
            if (!cVar.f20232i) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f20232i = true;
            }
        }
    }

    private final void f(boolean z6) {
        synchronized (f20228j) {
            Iterator<a> it = this.f20231h.iterator();
            while (it.hasNext()) {
                it.next().a(z6);
            }
        }
    }

    public void a(@RecentlyNonNull a aVar) {
        synchronized (f20228j) {
            this.f20231h.add(aVar);
        }
    }

    public boolean d() {
        return this.f20229f.get();
    }

    @TargetApi(16)
    public boolean e(boolean z6) {
        if (!this.f20230g.get()) {
            if (!v3.l.b()) {
                return z6;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f20230g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f20229f.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f20229f.compareAndSet(true, false);
        this.f20230g.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.f20229f.compareAndSet(true, false);
        this.f20230g.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f20229f.compareAndSet(false, true)) {
            this.f20230g.set(true);
            f(true);
        }
    }
}
