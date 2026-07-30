package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3993u7 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34542a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f34543b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34544c;

    public ThreadFactoryC3993u7() {
        this.f34542a = 0;
        this.f34544c = Executors.defaultThreadFactory();
        this.f34543b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f34542a) {
            case 0:
                AtomicInteger atomicInteger = this.f34543b;
                Thread newThread = ((ThreadFactory) this.f34544c).newThread(runnable);
                int andIncrement = atomicInteger.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb.append("gads-");
                sb.append(andIncrement);
                newThread.setName(sb.toString());
                return newThread;
            default:
                int andIncrement2 = this.f34543b.getAndIncrement();
                int length = String.valueOf(andIncrement2).length();
                String str = (String) this.f34544c;
                StringBuilder sb2 = new StringBuilder(AbstractC5051n.a(12, length, str));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
        }
    }

    public ThreadFactoryC3993u7(String str) {
        this.f34542a = 1;
        this.f34544c = str;
        this.f34543b = new AtomicInteger(1);
    }
}
