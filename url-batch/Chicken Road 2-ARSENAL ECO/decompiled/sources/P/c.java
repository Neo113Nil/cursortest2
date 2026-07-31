package P;

import java.util.concurrent.Executor;
import l.C0484a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1848f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1848f) {
            case 0:
                runnable.run();
                break;
            default:
                C0484a.o0().f5237b.f5240c.execute(runnable);
                break;
        }
    }
}
