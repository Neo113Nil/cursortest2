package Y5;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3101b;

    public /* synthetic */ d(String str, boolean z5) {
        this.f3100a = str;
        this.f3101b = z5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f3100a);
        thread.setDaemon(this.f3101b);
        return thread;
    }
}
