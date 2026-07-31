package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerThreadC0121db extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f1214a;

    public HandlerThreadC0121db(String str) {
        super(str);
        this.f1214a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f1214a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f1214a = false;
        interrupt();
    }
}
