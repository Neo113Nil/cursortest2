package s1;

import g1.d;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3606b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f3605a = str;
        this.f3606b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3605a;
        d.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f3606b);
        return thread;
    }
}
