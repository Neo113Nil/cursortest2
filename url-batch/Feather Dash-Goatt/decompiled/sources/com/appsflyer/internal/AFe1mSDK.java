package com.appsflyer.internal;

import java.util.TimerTask;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFe1mSDK extends TimerTask {
    private final Thread getCurrencyIso4217Code;

    public AFe1mSDK(Thread thread) {
        this.getCurrencyIso4217Code = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getCurrencyIso4217Code.interrupt();
    }
}
