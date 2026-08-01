package e0;

import java.util.concurrent.Executor;
import m.C0286a;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0105d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2493a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2493a) {
            case 0:
                runnable.run();
                break;
            default:
                C0286a.D().d.f3533e.execute(runnable);
                break;
        }
    }
}
