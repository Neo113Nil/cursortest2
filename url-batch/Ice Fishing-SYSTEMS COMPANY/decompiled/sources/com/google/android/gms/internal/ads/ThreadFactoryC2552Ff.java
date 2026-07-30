package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2552Ff implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24973a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f24974b;

    public ThreadFactoryC2552Ff() {
        this.f24973a = 1;
        this.f24974b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f24973a) {
            case 0:
                int andIncrement = this.f24974b.getAndIncrement();
                return new Thread(runnable, D.y.j(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = this.f24974b.getAndIncrement();
                return new Thread(runnable, D.y.j(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public ThreadFactoryC2552Ff(C2569Gf c2569Gf) {
        this.f24973a = 0;
        Objects.requireNonNull(c2569Gf);
        this.f24974b = new AtomicInteger(1);
    }
}
