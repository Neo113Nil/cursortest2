package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s0 extends b6 {

    /* renamed from: a, reason: collision with root package name */
    public final qg f411a;
    public int b;
    public boolean c;
    public boolean d;

    public s0(qg qgVar) {
        this.f411a = qgVar;
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i = this.b + 1;
        this.b = i;
        if (i != 1 || this.c) {
            return;
        }
        if (!this.d) {
            this.d = true;
            if (this.f411a.g != null) {
                qg.a(false, (id) null);
            }
        }
        qg qgVar = this.f411a;
        Application application = qgVar.g;
        if (application != null) {
            eh ehVar = (eh) com.startapp.sdk.components.a.a(application).f.a();
            ((v7) ehVar.b.a()).f464a.post(new wg(ehVar));
            r0 r0Var = (r0) com.startapp.sdk.components.a.a(qgVar.g).P.a();
            r0Var.f397a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = r0Var.e;
            r0Var.b.getClass();
            AppSessionConfig i2 = MetaData.A().i();
            if (elapsedRealtime > Math.max(0L, i2 != null ? i2.a() : 600000L) + j || r0Var.d <= 0) {
                r0Var.d = elapsedRealtime;
                r0Var.c.clear();
            }
        }
        if (qgVar.g != null) {
            qg.a(false, (id) null);
        }
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.b--;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.c = isChangingConfigurations;
        if (this.b != 0 || isChangingConfigurations) {
            return;
        }
        qg qgVar = this.f411a;
        Application application = qgVar.g;
        if (application != null) {
            eh ehVar = (eh) com.startapp.sdk.components.a.a(application).f.a();
            ((v7) ehVar.b.a()).f464a.post(new xg(ehVar));
            r0 r0Var = (r0) com.startapp.sdk.components.a.a(qgVar.g).P.a();
            r0Var.f397a.getClass();
            r0Var.e = SystemClock.elapsedRealtime();
        }
        if (qgVar.g != null) {
            qg.a(false, (id) null);
        }
        Application application2 = qgVar.g;
        if (application2 != null) {
            try {
                ((ub) com.startapp.sdk.components.a.a(application2).w.a()).b();
            } catch (Throwable th) {
                n8.a(th);
            }
            if (MetaData.A().P() == null || !MetaData.A().P().h()) {
                return;
            }
            rf rfVar = (rf) com.startapp.sdk.components.a.a(application2).x.a();
            try {
                SensorManager sensorManager = rfVar.f;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(rfVar.n);
                }
            } catch (Throwable th2) {
                if (rfVar.a(2)) {
                    n8.a(th2);
                }
            }
        }
    }
}
