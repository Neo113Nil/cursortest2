package h;

import java.util.concurrent.Executor;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0444a implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5846d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5846d) {
            case 0:
                C0445b.b0().f5849d.f5852e.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
