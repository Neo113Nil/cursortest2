package h;

import java.util.concurrent.Executor;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0412a implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4858d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4858d) {
            case 0:
                C0413b.A().f4861a.f4864b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
