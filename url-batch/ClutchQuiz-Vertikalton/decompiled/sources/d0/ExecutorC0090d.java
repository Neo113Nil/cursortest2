package d0;

import java.util.concurrent.Executor;
import m.C0255a;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0090d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2088a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2088a) {
            case 0:
                runnable.run();
                break;
            default:
                C0255a.q().f3093g.h.execute(runnable);
                break;
        }
    }
}
