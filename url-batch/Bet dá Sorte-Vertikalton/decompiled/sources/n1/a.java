package n1;

import b1.d;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3318b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f3317a = str;
        this.f3318b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3317a;
        d.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f3318b);
        return thread;
    }
}
