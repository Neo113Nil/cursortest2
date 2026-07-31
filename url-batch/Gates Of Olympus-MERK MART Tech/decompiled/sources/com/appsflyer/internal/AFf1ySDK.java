package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class AFf1ySDK extends TimerTask {
    private final Thread AFInAppEventType;

    public AFf1ySDK(Thread thread) {
        this.AFInAppEventType = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFInAppEventType.interrupt();
    }
}
