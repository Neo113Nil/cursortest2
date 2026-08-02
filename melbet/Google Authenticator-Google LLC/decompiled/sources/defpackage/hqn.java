package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hqn implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ hqq b;

    public hqn(hqq hqqVar, Executor executor) {
        this.a = executor;
        this.b = hqqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.p(e);
        }
    }
}
