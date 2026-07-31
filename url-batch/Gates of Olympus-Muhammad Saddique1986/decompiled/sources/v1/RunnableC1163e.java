package v1;

import android.content.Context;
import h.ExecutorC0444a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: v1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1163e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f9771e;

    public /* synthetic */ RunnableC1163e(Context context, int i3) {
        this.f9770d = i3;
        this.f9771e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9770d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1163e(this.f9771e, 1));
                break;
            default:
                AbstractC1162d.s(this.f9771e, new ExecutorC0444a(1), AbstractC1162d.f9760a, false);
                break;
        }
    }
}
