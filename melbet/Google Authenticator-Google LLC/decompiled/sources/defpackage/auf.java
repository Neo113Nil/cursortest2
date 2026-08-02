package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auf implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public auf(hvi hviVar, kuv kuvVar, int i) {
        this.a = i;
        this.b = hviVar;
        this.c = kuvVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v6, types: [hvi, java.lang.Object, java.util.concurrent.Future, kuv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kuv] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kuv] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kqj, kuv] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kqj] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kqj] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kqj] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ?? r0 = this.b;
            boolean isCancelled = r0.isCancelled();
            ?? r3 = this.c;
            if (isCancelled) {
                r3.j(null);
                return;
            }
            try {
                r3.ca(avk.b(r0));
                return;
            } catch (ExecutionException e) {
                this.c.ca(ixc.X(avk.c(e)));
                return;
            }
        }
        if (i == 1) {
            ?? r02 = this.b;
            boolean isCancelled2 = r02.isCancelled();
            ?? r32 = this.c;
            if (isCancelled2) {
                r32.j(null);
                return;
            }
            try {
                int i2 = rl.c;
                r32.ca(a.n(r02));
                return;
            } catch (ExecutionException e2) {
                this.c.ca(ixc.X(ow.k(e2)));
                return;
            }
        }
        if (i == 2) {
            try {
                this.c.run();
                Object obj = this.b;
                synchronized (((ayo) obj).a) {
                    ((ayo) obj).a();
                }
                return;
            } catch (Throwable th) {
                Object obj2 = this.b;
                synchronized (((ayo) obj2).a) {
                    ((ayo) obj2).a();
                    throw th;
                }
            }
        }
        if (i == 3) {
            ((jxk) this.b).j((Throwable) this.c);
            return;
        }
        ?? r2 = this.b;
        if (i == 4) {
            r2.c((kvj) this.c, kow.a);
            return;
        }
        boolean isCancelled3 = r2.isCancelled();
        ?? r33 = this.c;
        if (isCancelled3) {
            r33.j(null);
            return;
        }
        try {
            r33.ca(a.n(r2));
        } catch (ExecutionException e3) {
            this.c.ca(ixc.X(ixl.d(e3)));
        }
    }

    public auf(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public auf(kvj kvjVar, kuv kuvVar, int i) {
        this.a = i;
        this.c = kvjVar;
        this.b = kuvVar;
    }
}
