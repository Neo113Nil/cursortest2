package d4;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2282a;

    public p(Context context, int i) {
        switch (i) {
            case 1:
                this.f2282a = context;
                break;
            default:
                this.f2282a = context.getApplicationContext();
                break;
        }
    }

    @Override // d4.k
    public void a(final a.a aVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: d4.n
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = p.this;
                a.a aVar2 = aVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    w k3 = s6.a.k(pVar.f2282a);
                    if (k3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v vVar = (v) k3.f2300a;
                    synchronized (vVar.f2294d) {
                        vVar.f2296f = threadPoolExecutor2;
                    }
                    k3.f2300a.a(new o(aVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    aVar2.t(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }
}
