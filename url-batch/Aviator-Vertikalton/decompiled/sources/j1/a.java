package j1;

import X0.f;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2966b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f2965a = str;
        this.f2966b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2965a;
        f.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2966b);
        return thread;
    }
}
