package j0;

import java.util.concurrent.ThreadFactory;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0181a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f2643a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i2 = this.f2643a;
        this.f2643a = i2 + 1;
        sb.append(i2);
        thread.setName(sb.toString());
        return thread;
    }
}
