package d3;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1489b;

    public /* synthetic */ b(String str, boolean z3) {
        this.f1488a = str;
        this.f1489b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f1488a;
        u2.c.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f1489b);
        return thread;
    }
}
