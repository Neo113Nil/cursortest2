package m;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0072h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1017c;

    public /* synthetic */ RunnableC0072h(Context context, int i2) {
        this.f1016b = i2;
        this.f1017c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1016b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0072h(this.f1017c, 1));
                break;
            default:
                AbstractC0071g.s(this.f1017c, new ExecutorC0069e(), AbstractC0071g.f1006a, false);
                break;
        }
    }
}
