package com.baidu.ar;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h9 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f2376a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f2377b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f2378c;

    public h9(String str) {
        this.f2378c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f2376a.newThread(runnable);
        newThread.setName(this.f2378c + "-" + this.f2377b);
        return newThread;
    }
}
