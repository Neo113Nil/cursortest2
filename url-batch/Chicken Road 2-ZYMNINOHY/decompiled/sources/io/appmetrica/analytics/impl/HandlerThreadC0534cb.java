package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC0534cb extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f11600a;

    public HandlerThreadC0534cb(String str) {
        super(str);
        this.f11600a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f11600a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f11600a = false;
        interrupt();
    }
}
