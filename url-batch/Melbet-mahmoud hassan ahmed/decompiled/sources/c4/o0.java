package c4;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class o0 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f2052f;

    private o0(Handler handler) {
        this.f2052f = handler;
    }

    static Executor a(Handler handler) {
        return new o0(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2052f.post(runnable);
    }
}
