package j4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a0 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f18156f = new e4.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18156f.post(runnable);
    }
}
