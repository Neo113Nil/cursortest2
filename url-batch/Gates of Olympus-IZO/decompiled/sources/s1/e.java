package s1;

import android.content.Context;
import h.ExecutorC0412a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f7538e;

    public /* synthetic */ e(Context context, int i3) {
        this.f7537d = i3;
        this.f7538e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7537d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f7538e, 1));
                break;
            default:
                d.s(this.f7538e, new ExecutorC0412a(1), d.f7527a, false);
                break;
        }
    }
}
