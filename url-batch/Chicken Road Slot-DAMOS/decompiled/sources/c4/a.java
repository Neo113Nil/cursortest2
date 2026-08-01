package c4;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1743a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1744b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1743a) {
            case 0:
                Thread thread = new Thread(runnable, this.f1744b);
                thread.setPriority(10);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, this.f1744b);
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
