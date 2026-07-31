package com.iab.omid.library.ironsrc.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14539a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f14540b;

    /* renamed from: c, reason: collision with root package name */
    private a f14541c;

    public interface a {
        void a(boolean z4);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f14540b;
    }

    protected boolean d() {
        return false;
    }

    public void e() {
        this.f14539a = true;
        boolean a4 = a();
        this.f14540b = a4;
        b(a4);
    }

    public void f() {
        this.f14539a = false;
        this.f14541c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f14541c = aVar;
    }

    protected void b(boolean z4) {
    }

    private void a(boolean z4) {
        if (this.f14540b != z4) {
            this.f14540b = z4;
            if (this.f14539a) {
                b(z4);
                a aVar = this.f14541c;
                if (aVar != null) {
                    aVar.a(z4);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
