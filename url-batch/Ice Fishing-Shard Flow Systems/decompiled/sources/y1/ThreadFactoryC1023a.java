package y1;

import T1.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1023a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f8528a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f8529b = Executors.defaultThreadFactory();

    public ThreadFactoryC1023a(String str) {
        this.f8528a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8529b.newThread(new i(runnable, 2));
        newThread.setName(this.f8528a);
        return newThread;
    }
}
