package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atl implements asz {
    private final Handler a;

    public atl() {
        Handler createAsync;
        createAsync = Handler.createAsync(Looper.getMainLooper());
        this.a = createAsync;
    }

    @Override // defpackage.asz
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.asz
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
