package com.baidu.mshield.x6.f.m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f8574a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8575b;

    /* renamed from: c, reason: collision with root package name */
    public String f8576c;

    /* renamed from: d, reason: collision with root package name */
    public int f8577d;

    public b() {
        this(5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f8576c + this.f8575b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i8 = this.f8577d;
        if (i8 != 5) {
            thread.setPriority(i8);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }

    public b(int i8) {
        this.f8575b = new AtomicInteger(1);
        this.f8576c = "fin-" + f8574a.getAndIncrement() + "-thread-";
        this.f8577d = i8;
    }
}
