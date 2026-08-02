package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class v0 extends k6 {

    /* renamed from: a, reason: collision with root package name */
    public final gh f7736a;

    /* renamed from: b, reason: collision with root package name */
    public int f7737b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7738c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7739d;

    public v0(gh ghVar) {
        this.f7736a = ghVar;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i4 = this.f7737b + 1;
        this.f7737b = i4;
        if (i4 != 1 || this.f7738c) {
            return;
        }
        if (!this.f7739d) {
            this.f7739d = true;
            if (this.f7736a.f7006g != null) {
                d9 d9Var = new d9(e9.f6843i);
                d9Var.f6798j = false;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f6540U.f7743a;
                    if (aVar != null) {
                        ((t9) aVar.f6574q.a()).a(d9Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        gh ghVar = this.f7736a;
        Application application = ghVar.f7006g;
        if (application != null) {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(application).f6566g.a();
            ((k8) vhVar.f7761b.a()).f7181a.post(new nh(vhVar));
            u0 u0Var = (u0) com.startapp.sdk.components.a.a(ghVar.f7006g).f6556Q.a();
            u0Var.f7637a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = u0Var.f7641e;
            u0Var.f7638b.getClass();
            AppSessionConfig j5 = MetaData.E().j();
            if (elapsedRealtime > Math.max(0L, j5 != null ? j5.a() : 600000L) + j4 || u0Var.f7640d <= 0) {
                u0Var.f7640d = elapsedRealtime;
                u0Var.f7639c.clear();
            }
        }
        if (ghVar.f7006g != null) {
            d9 d9Var2 = new d9(e9.f6843i);
            d9Var2.f6798j = false;
            try {
                com.startapp.sdk.components.a aVar2 = com.startapp.sdk.components.a.f6540U.f7743a;
                if (aVar2 != null) {
                    ((t9) aVar2.f6574q.a()).a(d9Var2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f7737b--;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f7738c = isChangingConfigurations;
        if (this.f7737b != 0 || isChangingConfigurations) {
            return;
        }
        gh ghVar = this.f7736a;
        Application application = ghVar.f7006g;
        if (application != null) {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(application).f6566g.a();
            ((k8) vhVar.f7761b.a()).f7181a.post(new oh(vhVar));
            u0 u0Var = (u0) com.startapp.sdk.components.a.a(ghVar.f7006g).f6556Q.a();
            u0Var.f7637a.getClass();
            u0Var.f7641e = SystemClock.elapsedRealtime();
        }
        if (ghVar.f7006g != null) {
            d9 d9Var = new d9(e9.f6843i);
            d9Var.f6798j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f6540U.f7743a;
                if (aVar != null) {
                    ((t9) aVar.f6574q.a()).a(d9Var);
                }
            } catch (Throwable unused) {
            }
        }
        Application application2 = ghVar.f7006g;
        if (application2 != null) {
            try {
                ((mc) com.startapp.sdk.components.a.a(application2).f6579w.a()).b();
            } catch (Throwable th) {
                d9.a(th);
            }
            if (MetaData.E().U() == null || !MetaData.E().U().h()) {
                return;
            }
            ig igVar = (ig) com.startapp.sdk.components.a.a(application2).f6580x.a();
            try {
                SensorManager sensorManager = igVar.f7105f;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(igVar.n);
                }
            } catch (Throwable th2) {
                if (igVar.a(2)) {
                    d9.a(th2);
                }
            }
        }
    }
}
