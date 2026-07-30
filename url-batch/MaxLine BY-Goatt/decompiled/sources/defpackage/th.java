package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class th implements Executor {
    public final /* synthetic */ int m;

    public /* synthetic */ th(int i) {
        this.m = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.m) {
            case 0:
                uh.t().a.b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
