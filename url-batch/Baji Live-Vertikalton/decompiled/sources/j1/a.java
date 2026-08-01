package j1;

import X0.e;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2580b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f2579a = str;
        this.f2580b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2579a;
        e.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2580b);
        return thread;
    }
}
