package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hul extends AtomicReference implements Executor, Runnable {
    hum a;
    Executor b;
    Runnable c;
    Thread d;

    public hul(Executor executor, hum humVar) {
        super(huk.a);
        this.b = executor;
        this.a = humVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == huk.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            hum humVar = this.a;
            humVar.getClass();
            iyh iyhVar = humVar.a;
            if (iyhVar.c == this.d) {
                this.a = null;
                hoq.H(iyhVar.a == null);
                iyhVar.a = runnable;
                Executor executor = this.b;
                executor.getClass();
                iyhVar.b = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        iyh iyhVar = new iyh();
        iyhVar.c = currentThread;
        hum humVar = this.a;
        humVar.getClass();
        humVar.a = iyhVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                ?? r3 = iyhVar.a;
                if (r3 == 0 || (r0 = iyhVar.b) == 0) {
                    break;
                }
                iyhVar.a = null;
                iyhVar.b = null;
                r0.execute(r3);
            }
        } finally {
            iyhVar.c = null;
        }
    }
}
