package U;

import java.util.concurrent.Executor;
import m.C1263a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3052a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3052a) {
            case 0:
                runnable.run();
                break;
            default:
                C1263a.U().f11083g.f11086h.execute(runnable);
                break;
        }
    }
}
