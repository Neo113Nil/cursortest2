package u3;

import i3.d;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3580b;

    public /* synthetic */ a(String str, boolean z4) {
        this.f3579a = str;
        this.f3580b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3579a;
        d.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f3580b);
        return thread;
    }
}
