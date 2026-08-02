package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhx extends Thread {
    public Runnable a;
    public Runnable b;
    public final dig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhx(int i, Runnable runnable) {
        super(runnable);
        runnable.getClass();
        dig digVar = new dig(this, -1, false, -21, true, true);
        this.c = digVar;
        if (!digVar.c) {
            throw new IllegalStateException("Cannot override priority of non-boostable thread");
        }
        while (true) {
            long j = digVar.f.get();
            long e = dif.e(j, false, false, false, i, 0, 0L, 119);
            if (!dif.c(j)) {
                if (dif.f(dif.d(j), dif.a(j, 2), dif.a(j, 1), dif.a(j, 0)) == dif.f(dif.d(e), dif.a(e, 2), dif.a(e, 1), dif.a(e, 0))) {
                    if (digVar.f.compareAndSet(j, e)) {
                        return;
                    }
                } else if (digVar.f.compareAndSet(j, dif.e(e, false, true, false, 0, 0, 0L, 125))) {
                    digVar.a(dif.f(dif.d(j), dif.a(j, 2), dif.a(j, 1), dif.a(j, 0)));
                    return;
                }
            } else if (digVar.f.compareAndSet(j, e)) {
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLong atomicLong;
        long j;
        dig digVar = this.c;
        digVar.b = Process.myTid();
        do {
            atomicLong = digVar.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, dif.e(j, true, true, false, 0, 0, 0L, 124)));
        if (!dif.c(j)) {
            digVar.a(-21);
        }
        Runnable runnable = null;
        try {
            try {
                Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    ksp.a("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    ksp.a("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (Throwable th) {
                th = th;
                Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    ksp.a("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                this.c.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.c.c();
            throw th;
        }
    }
}
