package B2;

import Z1.i;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f414b;

    public /* synthetic */ b(String str, boolean z3) {
        this.f413a = str;
        this.f414b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f413a;
        i.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f414b);
        return thread;
    }
}
