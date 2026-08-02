package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djr implements hut {
    final /* synthetic */ hvi a;
    final /* synthetic */ bry b;
    final /* synthetic */ bst c;

    public djr(bst bstVar, hvi hviVar, bry bryVar) {
        this.c = bstVar;
        this.a = hviVar;
        this.b = bryVar;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            this.b.a();
            return;
        }
        boolean z = th instanceof Exception;
        bst bstVar = this.c;
        if (z) {
            bstVar.b((Exception) th);
        } else {
            bstVar.b(new ExecutionException(th));
        }
    }

    @Override // defpackage.hut
    public final void b(Object obj) {
        this.c.c(obj);
    }
}
