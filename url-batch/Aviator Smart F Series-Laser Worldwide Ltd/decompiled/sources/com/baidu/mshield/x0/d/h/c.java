package com.baidu.mshield.x0.d.h;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f8443a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8444b;

    /* renamed from: c, reason: collision with root package name */
    public String f8445c;

    /* renamed from: d, reason: collision with root package name */
    public int f8446d;

    public c() {
        this(5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f8445c + this.f8444b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i8 = this.f8446d;
        if (i8 != 5) {
            thread.setPriority(i8);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }

    public c(int i8) {
        this.f8444b = new AtomicInteger(1);
        this.f8445c = "sec-" + f8443a.getAndIncrement() + "-thread-";
        this.f8446d = i8;
    }
}
