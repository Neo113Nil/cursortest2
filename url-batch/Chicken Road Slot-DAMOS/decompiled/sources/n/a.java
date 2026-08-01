package n;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6631d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6631d) {
            case 0:
                b.Q().f6634a.f6637b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
