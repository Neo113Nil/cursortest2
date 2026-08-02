package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwk extends huq {
    final /* synthetic */ iyi a;
    private final hvi b;

    public fwk(iyi iyiVar, hvi hviVar) {
        this.a = iyiVar;
        this.b = hviVar;
    }

    @Override // defpackage.huq
    protected final hvi a() {
        return this.b;
    }

    @Override // defpackage.huq
    protected final /* synthetic */ Future b() {
        return this.b;
    }

    @Override // defpackage.huq, defpackage.hvi
    public final void c(Runnable runnable, Executor executor) {
        if (isDone()) {
            this.b.c(runnable, executor);
        }
        this.b.c(runnable, new fwo(this.a, executor, 1));
    }

    @Override // defpackage.huq, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.b;
    }
}
