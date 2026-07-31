package q3;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class t implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f20319f;

    private t(Handler handler) {
        this.f20319f = handler;
    }

    static Executor a(Handler handler) {
        return new t(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20319f.post(runnable);
    }
}
