package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public class fb extends Handler {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16230b = "DownloadHandler";

    /* renamed from: a, reason: collision with root package name */
    qo f16231a;

    public fb(Looper looper) {
        super(looper);
    }

    public void a() {
        this.f16231a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        qo qoVar = this.f16231a;
        if (qoVar == null) {
            Logger.i(f16230b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i4 = message.what;
            if (i4 == 1016) {
                qoVar.a((oh) message.obj);
            } else {
                this.f16231a.a((oh) message.obj, new gh(i4, nv.a(i4)));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.i(f16230b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a(qo qoVar) {
        if (qoVar == null) {
            throw new IllegalArgumentException();
        }
        this.f16231a = qoVar;
    }
}
