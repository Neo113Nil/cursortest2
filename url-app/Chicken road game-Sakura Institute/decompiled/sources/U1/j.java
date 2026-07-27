package U1;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final P1.e f4122d;

    public j() {
        P1.e eVar = new P1.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f4122d = eVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4122d.post(runnable);
    }
}
