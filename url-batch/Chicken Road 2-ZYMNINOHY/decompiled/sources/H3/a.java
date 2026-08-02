package H3;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1102b;

    public /* synthetic */ a(String str, boolean z) {
        this.f1101a = str;
        this.f1102b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f1101a;
        i.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f1102b);
        return thread;
    }
}
