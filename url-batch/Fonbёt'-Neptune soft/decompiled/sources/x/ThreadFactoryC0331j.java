package x;

import java.util.concurrent.ThreadFactory;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0331j implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0330i(runnable);
    }
}
