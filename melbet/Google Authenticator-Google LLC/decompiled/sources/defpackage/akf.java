package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akf implements Executor {
    private final Executor a;
    private Runnable c;
    private final ArrayDeque b = new ArrayDeque();
    private final Object d = new Object();

    public akf(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.d) {
            Object poll = this.b.poll();
            Runnable runnable = (Runnable) poll;
            this.c = runnable;
            if (poll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new at(runnable, this, 20));
            if (this.c == null) {
                a();
            }
        }
    }
}
