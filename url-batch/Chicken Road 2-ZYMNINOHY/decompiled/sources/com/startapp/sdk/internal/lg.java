package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lg implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f7240a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7241b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f7242c;

    public lg(Executor executor) {
        this.f7241b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f7240a).poll();
        this.f7242c = runnable;
        if (runnable != null) {
            this.f7241b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f7240a).offer(new kg(this, runnable));
        if (this.f7242c == null) {
            a();
        }
    }
}
