package com.digitalturbine.ignite.authenticator.decorator;

import android.content.Context;
import android.content.Intent;
import com.digitalturbine.ignite.authenticator.logger.ILogger;

/* loaded from: classes11.dex */
public final class b implements Runnable {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.l) {
            try {
                Intent intent = new Intent();
                intent.setClassName(this.a.h, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                e eVar = this.a;
                Context context = eVar.e;
                if (context != null) {
                    try {
                        context.bindService(intent, eVar, 1);
                    } catch (Throwable th) {
                        Object[] objArr = {th};
                        ILogger iLogger = com.digitalturbine.ignite.authenticator.logger.a.b.a;
                        if (iLogger != null) {
                            iLogger.e("Failed to bind IgniteRemoteService", objArr);
                        }
                        if (th.getMessage() != null && th.getMessage().contains("Too many bind requests")) {
                        } else {
                            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, com.digitalturbine.ignite.authenticator.utils.events.a.a(th, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
