package t7;

import java.util.concurrent.ThreadFactory;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8931b;

    public /* synthetic */ a(String str, boolean z8) {
        this.f8930a = str;
        this.f8931b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f8930a;
        k.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f8931b);
        return thread;
    }
}
