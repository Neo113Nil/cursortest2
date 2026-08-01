package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements Executor {
    public final /* synthetic */ int f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                x6.F().a.b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
