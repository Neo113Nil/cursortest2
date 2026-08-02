package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dig {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public dig(Thread thread, int i, boolean z, int i2, boolean z2, boolean z3) {
        thread.getClass();
        this.a = thread;
        this.b = i;
        this.c = z2;
        this.g = z3;
        this.d = !z2;
        this.f = new AtomicLong(dja.b(z, false, false, i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (dif.c(j)) {
            boolean z = false;
            while (true) {
                try {
                    LockSupport.park(this);
                    if (!dif.b(this.f.get())) {
                        break;
                    } else {
                        z |= Thread.interrupted();
                    }
                } catch (Throwable th) {
                    if (z) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            boolean d = dif.d(j);
            int a = dif.a(j, 2);
            int a2 = dif.a(j, 1);
            int a3 = dif.a(j, 0);
            boolean c = dif.c(j);
            int f = dif.f(d, a, a2, a3);
            if (!c) {
                throw new IllegalStateException("Unexpected not set, saw " + ("State{started=" + dif.d(j) + ", setting=" + dif.c(j) + ", pool=" + dif.a(j, 2) + ", local=" + dif.a(j, 1) + ", inherited=" + dif.a(j, 0) + "}") + " " + Long.toBinaryString(j));
            }
            if (!dif.d(j)) {
                int a4 = dhw.a(f);
                if (a4 != dhw.a(i)) {
                    this.a.setPriority(a4);
                }
            } else if (f != i) {
                Process.setThreadPriority(this.b, f);
                i = f;
            }
        } while (!atomicLong.compareAndSet(j, dif.e(j, false, false, false, 0, 0, 0L, 121)));
        if (dif.b(j)) {
            LockSupport.unpark(this.a);
        }
    }

    public final void b() {
        long j;
        boolean z;
        while (true) {
            AtomicLong atomicLong = this.f;
            j = atomicLong.get();
            boolean c = dif.c(j);
            z = this.g;
            long e = dif.e(j, false, false, c & (!z), 0, -21, (8796093022207L & j) + 1, 27);
            if (!dif.c(j)) {
                if (dif.f(dif.d(j), dif.a(j, 2), dif.a(j, 1), dif.a(j, 0)) == dif.f(dif.d(e), dif.a(e, 2), dif.a(e, 1), dif.a(e, 0))) {
                    if (atomicLong.compareAndSet(j, e)) {
                        break;
                    }
                } else if (atomicLong.compareAndSet(j, dif.e(e, false, true, false, 0, 0, 0L, 125))) {
                    a(dif.f(dif.d(j), dif.a(j, 2), dif.a(j, 1), dif.a(j, 0)));
                    break;
                }
            } else if (atomicLong.compareAndSet(j, e)) {
                break;
            }
        }
        if (z) {
            return;
        }
        e(j);
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, dif.e(j, false, false, dif.c(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            if (!dif.b(j)) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, dif.e(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final String toString() {
        return this.a.getName() + " " + this.b;
    }
}
