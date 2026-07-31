package H2;

import f2.j;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2631b;

    public /* synthetic */ a(String str, boolean z3) {
        this.f2630a = str;
        this.f2631b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2630a;
        j.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2631b);
        return thread;
    }
}
