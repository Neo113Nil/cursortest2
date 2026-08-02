package defpackage;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dgs implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    private final /* synthetic */ int b;

    public /* synthetic */ dgs(ThreadFactory threadFactory, int i) {
        this.b = i;
        this.a = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            Thread newThread = this.a.newThread(runnable);
            if (newThread.getContextClassLoader() == null) {
                newThread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
            }
            return newThread;
        }
        if (i == 1) {
            return this.a.newThread(new ath(runnable, 12));
        }
        ThreadLocal threadLocal = ikt.a;
        return this.a.newThread(new iaq(runnable, 10));
    }
}
