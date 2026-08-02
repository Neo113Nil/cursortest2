package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kig implements Executor {
    private final kjm a;
    private Executor b;

    public kig(kjm kjmVar) {
        this.a = kjmVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized Executor a() {
        if (this.b == null) {
            ?? a = this.a.a();
            a.getClass();
            this.b = a;
        }
        return this.b;
    }

    final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
