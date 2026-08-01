package s1;

import g1.d;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3720b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f3719a = str;
        this.f3720b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3719a;
        d.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f3720b);
        return thread;
    }
}
