package j1;

import X0.f;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2970b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f2969a = str;
        this.f2970b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2969a;
        f.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2970b);
        return thread;
    }
}
