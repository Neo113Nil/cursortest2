package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huv implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public huv(htq htqVar, Executor executor, int i) {
        this.c = i;
        this.a = htqVar;
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            hnu.aT(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public huv(hvi hviVar, Future future, int i) {
        this.c = i;
        this.a = hviVar;
        this.b = future;
    }
}
