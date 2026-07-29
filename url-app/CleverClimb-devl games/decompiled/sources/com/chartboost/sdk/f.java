package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.h.a;
import com.chartboost.sdk.impl.ac;
import com.chartboost.sdk.impl.aq;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.s;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    boolean f3662a = false;

    /* renamed from: b, reason: collision with root package name */
    Chartboost.CBFramework f3663b = null;

    /* renamed from: c, reason: collision with root package name */
    Chartboost.CBMediation f3664c = null;

    /* renamed from: d, reason: collision with root package name */
    String f3665d = null;
    String e = null;
    CBLogging.Level f = null;
    ChartboostDelegate g = null;
    Activity h = null;
    String i = null;
    String j = null;
    private final int k;

    f(int i) {
        this.k = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            switch (this.k) {
                case 0:
                    if (h.a() == null) {
                        synchronized (h.class) {
                            if (h.a() == null) {
                                if (this.h == null) {
                                    CBLogging.b("ChartboostCommand", "Activity object is null. Please pass a valid activity object");
                                    return;
                                }
                                if (!b.a((Context) this.h)) {
                                    CBLogging.b("ChartboostCommand", "Permissions not set correctly");
                                    return;
                                }
                                if (!b.b(this.h)) {
                                    CBLogging.b("ChartboostCommand", "Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions.");
                                }
                                if (!TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.j)) {
                                    s a2 = s.a();
                                    g a3 = g.a();
                                    Handler handler = a2.f3859a;
                                    o.a();
                                    ScheduledExecutorService scheduledExecutorService = null;
                                    try {
                                        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) a3.a(ac.a());
                                        try {
                                            h hVar = new h(this.h, this.i, this.j, a2, scheduledExecutorService2, handler, (ExecutorService) a3.a(ac.a(4)));
                                            h.a(hVar);
                                            hVar.f3668b.c();
                                            hVar.getClass();
                                            hVar.a(hVar.new a(3));
                                        } catch (Throwable th) {
                                            th = th;
                                            scheduledExecutorService = scheduledExecutorService2;
                                            if (scheduledExecutorService != null) {
                                                scheduledExecutorService.shutdown();
                                            }
                                            CBLogging.a("ChartboostCommand", "Unable to start threads", th);
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                CBLogging.b("ChartboostCommand", "AppId or AppSignature is null. Please pass a valid id's");
                                return;
                            }
                            return;
                        }
                    }
                    return;
                case 1:
                    i.u = this.f3662a;
                    return;
                case 2:
                default:
                    return;
                case 3:
                    i.i = this.f3664c;
                    i.j = this.f3665d;
                    i.h = i.i + " " + i.j;
                    return;
                case 4:
                    if (this.f3663b == null) {
                        CBLogging.b("ChartboostCommand", "Pass a valid CBFramework enum value");
                        return;
                    }
                    i.f3680d = this.f3663b;
                    i.e = this.f3665d;
                    i.f = String.format("%s %s", this.f3663b, this.f3665d);
                    return;
                case 5:
                    b.a(this.f3665d);
                    return;
                case 6:
                    i.f3677a = this.e;
                    return;
                case 7:
                    if (b.b()) {
                        CBLogging.f3567a = this.f;
                        return;
                    }
                    return;
                case 8:
                    i.f3679c = this.g;
                    aq.a("SdkSettings.assignDelegate", this.g);
                    return;
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(f.class, "run (" + this.k + ")", e);
        }
        com.chartboost.sdk.Tracking.a.a(f.class, "run (" + this.k + ")", e);
    }
}
