package com.yandex.mobile.ads.impl;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.yandex.mobile.ads.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC1957gm implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ op1 f26221b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1981hm f26222c;

    RunnableC1957gm(C1981hm c1981hm, op1 op1Var) {
        this.f26222c = c1981hm;
        this.f26221b = op1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f26222c.f26803c;
            blockingQueue.put(this.f26221b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
