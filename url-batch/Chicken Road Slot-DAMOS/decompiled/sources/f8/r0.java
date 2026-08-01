package f8;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Executor f4177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f4178e;

    public r0(Executor executor, g0 g0Var) {
        this.f4177d = executor;
        this.f4178e = g0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f4177d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.f4178e.m(e2);
        }
    }
}
