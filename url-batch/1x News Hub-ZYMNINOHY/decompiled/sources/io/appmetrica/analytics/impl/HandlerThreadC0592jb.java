package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC0592jb extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f7634a;

    public HandlerThreadC0592jb(String str) {
        super(str);
        this.f7634a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f7634a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f7634a = false;
        interrupt();
    }
}
