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
    public final gh f4594a;

    /* renamed from: b, reason: collision with root package name */
    public int f4595b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4596c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4597d;

    public v0(gh ghVar) {
        this.f4594a = ghVar;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i3 = this.f4595b + 1;
        this.f4595b = i3;
        if (i3 != 1 || this.f4596c) {
            return;
        }
        if (!this.f4597d) {
            this.f4597d = true;
            if (this.f4594a.f3883g != null) {
                d9 d9Var = new d9(e9.f3728i);
                d9Var.f3685j = false;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3442U.f4601a;
                    if (aVar != null) {
                        ((t9) aVar.f3476q.a()).a(d9Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        gh ghVar = this.f4594a;
        Application application = ghVar.f3883g;
        if (application != null) {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(application).f3467g.a();
            ((k8) vhVar.f4619b.a()).f4053a.post(new nh(vhVar));
            u0 u0Var = (u0) com.startapp.sdk.components.a.a(ghVar.f3883g).f3458Q.a();
            u0Var.f4498a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = u0Var.f4502e;
            u0Var.f4499b.getClass();
            AppSessionConfig j4 = MetaData.E().j();
            if (elapsedRealtime > Math.max(0L, j4 != null ? j4.a() : 600000L) + j3 || u0Var.f4501d <= 0) {
                u0Var.f4501d = elapsedRealtime;
                u0Var.f4500c.clear();
            }
        }
        if (ghVar.f3883g != null) {
            d9 d9Var2 = new d9(e9.f3728i);
            d9Var2.f3685j = false;
            try {
                com.startapp.sdk.components.a aVar2 = com.startapp.sdk.components.a.f3442U.f4601a;
                if (aVar2 != null) {
                    ((t9) aVar2.f3476q.a()).a(d9Var2);
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
        this.f4595b--;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f4596c = isChangingConfigurations;
        if (this.f4595b != 0 || isChangingConfigurations) {
            return;
        }
        gh ghVar = this.f4594a;
        Application application = ghVar.f3883g;
        if (application != null) {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(application).f3467g.a();
            ((k8) vhVar.f4619b.a()).f4053a.post(new oh(vhVar));
            u0 u0Var = (u0) com.startapp.sdk.components.a.a(ghVar.f3883g).f3458Q.a();
            u0Var.f4498a.getClass();
            u0Var.f4502e = SystemClock.elapsedRealtime();
        }
        if (ghVar.f3883g != null) {
            d9 d9Var = new d9(e9.f3728i);
            d9Var.f3685j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3442U.f4601a;
                if (aVar != null) {
                    ((t9) aVar.f3476q.a()).a(d9Var);
                }
            } catch (Throwable unused) {
            }
        }
        Application application2 = ghVar.f3883g;
        if (application2 != null) {
            try {
                ((mc) com.startapp.sdk.components.a.a(application2).f3481w.a()).b();
            } catch (Throwable th) {
                d9.a(th);
            }
            if (MetaData.E().U() == null || !MetaData.E().U().h()) {
                return;
            }
            ig igVar = (ig) com.startapp.sdk.components.a.a(application2).f3482x.a();
            try {
                SensorManager sensorManager = igVar.f;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(igVar.f3986n);
                }
            } catch (Throwable th2) {
                if (igVar.a(2)) {
                    d9.a(th2);
                }
            }
        }
    }
}
