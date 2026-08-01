package l1;

import Z0.d;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3251b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f3250a = str;
        this.f3251b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3250a;
        d.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f3251b);
        return thread;
    }
}
