package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oo implements Executor {
    private final /* synthetic */ int a;

    public oo(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            new Thread(runnable).start();
        } else {
            ((oq) op.a().b).b.execute(runnable);
        }
    }
}
