package A1;

import j1.h;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18b;

    public /* synthetic */ b(String str, boolean z2) {
        this.f17a = str;
        this.f18b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f17a;
        h.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f18b);
        return thread;
    }
}
