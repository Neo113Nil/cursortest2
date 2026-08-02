package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lg implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f4112a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4113b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f4114c;

    public lg(Executor executor) {
        this.f4113b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f4112a).poll();
        this.f4114c = runnable;
        if (runnable != null) {
            this.f4113b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f4112a).offer(new kg(this, runnable));
        if (this.f4114c == null) {
            a();
        }
    }
}
