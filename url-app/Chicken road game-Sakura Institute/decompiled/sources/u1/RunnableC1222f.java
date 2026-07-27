package u1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: u1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1222f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f10920e;

    public /* synthetic */ RunnableC1222f(Context context, int i2) {
        this.f10919d = i2;
        this.f10920e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10919d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1222f(this.f10920e, 1));
                break;
            default:
                AbstractC1221e.s(this.f10920e, new ExecutorC1219c(), AbstractC1221e.f10909a, false);
                break;
        }
    }
}
