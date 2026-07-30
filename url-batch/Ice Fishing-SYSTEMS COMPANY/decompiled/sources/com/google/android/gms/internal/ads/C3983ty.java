package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ty, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3983ty implements InterfaceC3929sy {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f34500a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f34501b = new PriorityQueue();

    public C3983ty(Executor executor) {
        this.f34500a = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3929sy
    public final void a(Runnable runnable, long j9) {
        if (j9 <= 0) {
            this.f34500a.execute(runnable);
            return;
        }
        C4091vy c4091vy = new C4091vy(runnable, System.currentTimeMillis() + j9);
        PriorityQueue priorityQueue = this.f34501b;
        synchronized (priorityQueue) {
            priorityQueue.add(c4091vy);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3929sy
    public final void d() {
        PriorityQueue priorityQueue = this.f34501b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long currentTimeMillis = System.currentTimeMillis();
                for (C4091vy c4091vy = (C4091vy) priorityQueue.peek(); c4091vy != null && c4091vy.f34907u <= currentTimeMillis; c4091vy = (C4091vy) priorityQueue.peek()) {
                    priorityQueue2.add(c4091vy);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f34500a.execute(((C4091vy) it.next()).f34906n);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
