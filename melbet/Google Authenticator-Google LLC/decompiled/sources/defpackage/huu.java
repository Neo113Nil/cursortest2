package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huu implements Runnable {
    final hvi a;
    final hut b;

    public huu(hvi hviVar, hut hutVar) {
        this.a = hviVar;
        this.b = hutVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable j;
        hvi hviVar = this.a;
        if ((hviVar instanceof hwf) && (j = ((hwf) hviVar).j()) != null) {
            this.b.a(j);
            return;
        }
        try {
            this.b.b(hnu.aR(hviVar));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.a(this.b);
        return T.toString();
    }
}
