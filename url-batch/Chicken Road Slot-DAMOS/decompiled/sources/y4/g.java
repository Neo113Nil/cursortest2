package y4;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f10608e;

    public /* synthetic */ g(Context context, int i3) {
        this.f10607d = i3;
        this.f10608e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10607d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f10608e, 1));
                break;
            default:
                e.t(this.f10608e, new n.a(1), e.f10598a, false);
                break;
        }
    }
}
