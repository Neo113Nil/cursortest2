package n3;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8557b;

    public /* synthetic */ a(String str, boolean z4) {
        this.f8556a = str;
        this.f8557b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f8556a;
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f8557b);
        return thread;
    }
}
