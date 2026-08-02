package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Hk implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6092a;

    /* renamed from: b, reason: collision with root package name */
    public final Gk f6093b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6094c = new HashMap();

    public Hk(Context context, Gk gk) {
        this.f6092a = context;
        this.f6093b = gk;
    }

    public final String a(String str) {
        return AbstractC0033i.j("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f6094c.get(str) == null) {
                HashMap hashMap = this.f6094c;
                Gk gk = this.f6093b;
                Context context = this.f6092a;
                String a3 = a(str);
                gk.f6053a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a3);
                Fk fk = new Fk();
                try {
                    context.bindService(intent, fk, 1);
                } catch (Throwable unused) {
                    fk = null;
                }
                hashMap.put(str, fk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6094c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f6094c.get(str);
        if (serviceConnection != null) {
            Gk gk = this.f6093b;
            a(str);
            Context context = this.f6092a;
            gk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
