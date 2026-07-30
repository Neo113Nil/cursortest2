package F;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f751a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f751a) {
            case 0:
                return new l(runnable);
            default:
                Thread thread = new Thread(runnable, "OneSignalFlutterBg");
                thread.setDaemon(true);
                return thread;
        }
    }
}
