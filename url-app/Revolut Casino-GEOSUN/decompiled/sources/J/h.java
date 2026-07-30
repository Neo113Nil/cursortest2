package J;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f450f;

    public /* synthetic */ h(Context context, int i2) {
        this.f449e = i2;
        this.f450f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f449e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f450f, 1));
                break;
            default:
                f.s(this.f450f, new d(), f.f436a, false);
                break;
        }
    }
}
