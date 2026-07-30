package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class hq implements ThreadFactory {
    public final /* synthetic */ String PxuCJdSBwIXG;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.PxuCJdSBwIXG);
        thread.setPriority(10);
        return thread;
    }
}
