package c2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.HandlerC1312d;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0285b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0285b f5654e = new ComponentCallbacks2C0285b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5655a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5656b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5657c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5658d = false;

    public final void a(boolean z) {
        synchronized (f5654e) {
            try {
                ArrayList arrayList = this.f5657c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    HandlerC1312d handlerC1312d = ((k) obj).f5679a.f5674m;
                    handlerC1312d.sendMessage(handlerC1312d.obtainMessage(1, Boolean.valueOf(z)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5655a.compareAndSet(true, false);
        this.f5656b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5655a.compareAndSet(true, false);
        this.f5656b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f5655a.compareAndSet(false, true)) {
            this.f5656b.set(true);
            a(true);
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
