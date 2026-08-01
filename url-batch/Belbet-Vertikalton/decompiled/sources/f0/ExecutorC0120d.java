package f0;

import java.util.concurrent.Executor;
import o.C0318a;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0120d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2672a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2672a) {
            case 0:
                runnable.run();
                break;
            default:
                C0318a.l0().f3765b.f3768c.execute(runnable);
                break;
        }
    }
}
