package e0;

import java.util.concurrent.Executor;
import o.C0793a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4683d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4683d) {
            case 0:
                runnable.run();
                break;
            default:
                C0793a.T().f7106b.f7109c.execute(runnable);
                break;
        }
    }
}
