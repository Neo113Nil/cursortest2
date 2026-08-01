package A1;

import java.util.concurrent.ThreadFactory;
import k1.e;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12b;

    public /* synthetic */ b(String str, boolean z2) {
        this.f11a = str;
        this.f12b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f11a;
        e.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f12b);
        return thread;
    }
}
