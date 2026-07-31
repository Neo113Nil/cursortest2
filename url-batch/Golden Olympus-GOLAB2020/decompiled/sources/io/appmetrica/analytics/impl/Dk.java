package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Dk implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37374a;

    /* renamed from: b, reason: collision with root package name */
    public final Ck f37375b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f37376c = new HashMap();

    public Dk(@NotNull Context context, @NotNull Ck ck) {
        this.f37374a = context;
        this.f37375b = ck;
    }

    @NotNull
    public final String a(@NotNull String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        try {
            if (this.f37376c.get(str) == null) {
                HashMap hashMap = this.f37376c;
                Ck ck = this.f37375b;
                Context context = this.f37374a;
                String a4 = a(str);
                ck.f37310a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a4);
                Bk bk = new Bk();
                try {
                    context.bindService(intent, bk, 1);
                } catch (Throwable unused) {
                    bk = null;
                }
                hashMap.put(str, bk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37376c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f37376c.get(str);
        if (serviceConnection != null) {
            Ck ck = this.f37375b;
            a(str);
            Context context = this.f37374a;
            ck.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
