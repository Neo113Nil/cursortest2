package N;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f812f;

    public /* synthetic */ g(Context context, int i2) {
        this.f811e = i2;
        this.f812f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f811e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f812f, 1));
                break;
            default:
                f.s(this.f812f, new d(), f.f801a, false);
                break;
        }
    }
}
