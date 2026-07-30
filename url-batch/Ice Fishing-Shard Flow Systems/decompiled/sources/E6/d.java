package E6;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f711b;

    public /* synthetic */ d(String str, boolean z7) {
        this.f710a = str;
        this.f711b = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f710a);
        thread.setDaemon(this.f711b);
        return thread;
    }
}
