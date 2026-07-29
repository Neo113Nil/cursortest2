package j1;

import X0.e;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2581b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f2580a = str;
        this.f2581b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2580a;
        e.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2581b);
        return thread;
    }
}
