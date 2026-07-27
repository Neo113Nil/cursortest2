package U;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3065b;

    public /* synthetic */ h(Context context, int i2) {
        this.f3064a = i2;
        this.f3065b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3064a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f3065b, 1));
                break;
            default:
                g.s(this.f3065b, new d(0), g.f3054a, false);
                break;
        }
    }
}
