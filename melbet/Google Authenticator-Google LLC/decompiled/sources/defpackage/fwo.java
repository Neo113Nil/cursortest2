package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fwo implements Executor {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fwo(Object obj, Executor executor, int i) {
        this.c = i;
        this.a = obj;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        int i2 = 3;
        int i3 = 2;
        if (i == 0) {
            ?? r0 = this.b;
            r0.getClass();
            runnable.getClass();
            cbc cbcVar = new cbc(runnable, i3);
            Object obj = this.a;
            r0.execute(new dgc(obj, hnu.aN(cbcVar, new cob(obj, i2)), 8));
            return;
        }
        if (i == 1) {
            ((iyi) this.a).b.execute(new evb(this.b, runnable, 5, null));
            return;
        }
        if (i == 2) {
            this.a.c(runnable, this.b);
        } else if (i == 3) {
            this.b.execute(new iep(this.a, runnable, 9));
        } else {
            try {
                this.a.execute(runnable);
            } catch (RejectedExecutionException e) {
                ((ljj) this.b).g(e);
            }
        }
    }

    public fwo(ljj ljjVar, Executor executor, int i) {
        this.c = i;
        this.a = executor;
        this.b = ljjVar;
    }
}
