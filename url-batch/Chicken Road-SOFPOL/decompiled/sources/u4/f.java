package u4;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f7402e;

    public /* synthetic */ f(Context context, int i) {
        this.f7401d = i;
        this.f7402e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7401d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f7402e, 1));
                break;
            default:
                e.t(this.f7402e, new c(), e.f7392a, false);
                break;
        }
    }
}
