package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class uf implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f456a = new ArrayDeque();
    public final Executor b;
    public Runnable c;

    public uf(Executor executor) {
        this.b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f456a).poll();
        this.c = runnable;
        if (runnable != null) {
            this.b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f456a).offer(new tf(this, runnable));
        if (this.c == null) {
            a();
        }
    }
}
