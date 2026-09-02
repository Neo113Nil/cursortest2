package n;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0082i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1068c;

    public /* synthetic */ RunnableC0082i(Context context, int i2) {
        this.f1067b = i2;
        this.f1068c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1067b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0082i(this.f1068c, 1));
                break;
            default:
                AbstractC0080g.s(this.f1068c, new ExecutorC0078e(), AbstractC0080g.f1055a, false);
                break;
        }
    }
}
