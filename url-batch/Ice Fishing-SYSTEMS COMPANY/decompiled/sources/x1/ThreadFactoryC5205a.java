package x1;

import java.util.concurrent.ThreadFactory;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5205a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new W2.d(runnable);
    }
}
