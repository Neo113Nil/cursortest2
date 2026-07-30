package b0;

import java.util.concurrent.ThreadFactory;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0097a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f1639a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i2 = this.f1639a;
        this.f1639a = i2 + 1;
        sb.append(i2);
        thread.setName(sb.toString());
        return thread;
    }
}
