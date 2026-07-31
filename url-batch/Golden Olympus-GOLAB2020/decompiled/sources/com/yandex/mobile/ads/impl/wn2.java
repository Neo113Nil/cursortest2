package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wn2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static wn2 f34152d = new wn2();

    /* renamed from: a, reason: collision with root package name */
    private boolean f34153a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34154b;

    /* renamed from: c, reason: collision with root package name */
    private a f34155c;

    public interface a {
    }

    private wn2() {
    }

    public static wn2 a() {
        return f34152d;
    }

    public final void b() {
        this.f34153a = true;
        this.f34154b = false;
        Iterator<ln2> it = mn2.a().b().iterator();
        while (it.hasNext()) {
            it.next().j().a(true);
        }
    }

    public final void c() {
        this.f34153a = false;
        this.f34154b = false;
        this.f34155c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f34154b) {
            this.f34154b = false;
            if (this.f34153a) {
                Iterator<ln2> it = mn2.a().b().iterator();
                while (it.hasNext()) {
                    it.next().j().a(true);
                }
                if (this.f34155c != null) {
                    v62.g().getClass();
                    v62.a();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View f4;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z4 = false;
        boolean z5 = runningAppProcessInfo.importance != 100;
        boolean z6 = true;
        for (ln2 ln2Var : mn2.a().c()) {
            if (ln2Var.g() && (f4 = ln2Var.f()) != null && f4.hasWindowFocus()) {
                z6 = false;
            }
        }
        if (z5 && z6) {
            z4 = true;
        }
        if (this.f34154b != z4) {
            this.f34154b = z4;
            if (this.f34153a) {
                boolean z7 = !z4;
                Iterator<ln2> it = mn2.a().b().iterator();
                while (it.hasNext()) {
                    it.next().j().a(z7);
                }
                if (this.f34155c != null) {
                    if (z4) {
                        v62.g().getClass();
                        v62.c();
                    } else {
                        v62.g().getClass();
                        v62.a();
                    }
                }
            }
        }
    }

    public final void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a(a aVar) {
        this.f34155c = aVar;
    }
}
