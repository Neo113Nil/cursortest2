package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayo implements Executor {
    public final Object a;
    private final Executor b;
    private Runnable c;
    private final /* synthetic */ int d;
    private final Queue e;

    public ayo(Executor executor, int i, byte[] bArr) {
        this.d = i;
        this.a = new Object();
        this.e = new ArrayDeque();
        this.b = executor;
    }

    public final void a() {
        if (this.d == 0) {
            Runnable runnable = (Runnable) ((ArrayDeque) this.e).poll();
            this.c = runnable;
            if (runnable != null) {
                this.b.execute(runnable);
                return;
            }
            return;
        }
        synchronized (this.a) {
            Runnable runnable2 = (Runnable) this.e.poll();
            this.c = runnable2;
            if (runnable2 != null) {
                this.b.execute(runnable2);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.d;
        Object obj = this.a;
        if (i != 0) {
            synchronized (obj) {
                this.e.add(new at(this, runnable, 8, (char[]) null));
                if (this.c == null) {
                    a();
                }
            }
            return;
        }
        synchronized (obj) {
            ((ArrayDeque) this.e).add(new auf(this, runnable, 2));
            if (this.c == null) {
                a();
            }
        }
    }

    public ayo(Executor executor, int i) {
        this.d = i;
        this.b = executor;
        this.e = new ArrayDeque();
        this.a = new Object();
    }
}
