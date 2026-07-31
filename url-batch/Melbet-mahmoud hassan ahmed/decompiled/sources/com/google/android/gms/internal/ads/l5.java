package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class l5 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a6 f7817f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m5 f7818g;

    l5(m5 m5Var, a6 a6Var) {
        this.f7818g = m5Var;
        this.f7817f = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f7818g.f8410g;
            blockingQueue.put(this.f7817f);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
