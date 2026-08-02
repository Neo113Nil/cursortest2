package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ck implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10169a;

    /* renamed from: b, reason: collision with root package name */
    public final Bk f10170b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10171c = new HashMap();

    public Ck(Context context, Bk bk) {
        this.f10169a = context;
        this.f10170b = bk;
    }

    public final String a(String str) {
        return AbstractC0005f.n("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f10171c.get(str) == null) {
                HashMap hashMap = this.f10171c;
                Bk bk = this.f10170b;
                Context context = this.f10169a;
                String a3 = a(str);
                bk.f10121a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a3);
                Ak ak = new Ak();
                try {
                    context.bindService(intent, ak, 1);
                } catch (Throwable unused) {
                    ak = null;
                }
                hashMap.put(str, ak);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10171c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f10171c.get(str);
        if (serviceConnection != null) {
            Bk bk = this.f10170b;
            a(str);
            Context context = this.f10169a;
            bk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
