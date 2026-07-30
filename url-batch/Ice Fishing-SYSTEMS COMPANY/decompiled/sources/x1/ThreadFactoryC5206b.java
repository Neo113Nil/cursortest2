package x1;

import h3.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5206b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactoryC5205a f41775a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41776b;

    /* renamed from: c, reason: collision with root package name */
    public final C5207c f41777c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41778d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f41779e;

    public ThreadFactoryC5206b(ThreadFactoryC5205a threadFactoryC5205a, String str, boolean z8) {
        C5207c c5207c = C5207c.f41780a;
        this.f41779e = new AtomicInteger();
        this.f41775a = threadFactoryC5205a;
        this.f41776b = str;
        this.f41777c = c5207c;
        this.f41778d = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        l lVar = new l(12, this, runnable);
        this.f41775a.getClass();
        W2.d dVar = new W2.d(lVar);
        dVar.setName("glide-" + this.f41776b + "-thread-" + this.f41779e.getAndIncrement());
        return dVar;
    }
}
