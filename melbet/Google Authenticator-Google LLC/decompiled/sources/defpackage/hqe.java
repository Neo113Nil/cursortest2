package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hqe implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    hqd d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ hqf h;
    volatile int i = 2;

    public hqe(hqf hqfVar, int i) {
        this.h = hqfVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.j) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(hqd hqdVar) {
        int i = this.e;
        if (i < 5) {
            hqdVar.a = this.d;
            hqdVar.b = this.a;
            this.d = hqdVar;
            this.e = i + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i;
        int i2;
        Thread currentThread = Thread.currentThread();
        this.b = currentThread;
        this.c = currentThread;
        hqf hqfVar = this.h;
        if (hqfVar.h.get()) {
            a();
            return;
        }
        loop0: while (true) {
            hqd hqdVar = (hqd) hqfVar.c.poll();
            if (hqdVar != null) {
                hqfVar.a();
                Runnable runnable = (Runnable) hqdVar.a;
                c(hqdVar);
                try {
                    hqfVar.k.run();
                    try {
                        runnable.run();
                        try {
                            hqfVar.l.run();
                            Thread.interrupted();
                            if (hqfVar.g) {
                                break;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            this.h.l.run();
                            throw th;
                        } finally {
                        }
                    }
                } catch (Error | RuntimeException e) {
                    if (this.h.h.get()) {
                        a();
                    } else {
                        b();
                    }
                    throw e;
                }
            } else {
                this.i = 2;
                hqd hqdVar2 = null;
                while (true) {
                    AtomicReference atomicReference = hqfVar.p;
                    hqd hqdVar3 = (hqd) atomicReference.get();
                    Object obj = hqdVar3.a;
                    z = false;
                    if (obj == hqf.a) {
                        int i3 = hqdVar3.b;
                        if (i3 == 0) {
                            i = 3;
                            break;
                        } else if (a.a(atomicReference, hqdVar3, hqfVar.n[i3 - 1])) {
                            if (hqdVar2 != null) {
                                c(hqdVar2);
                            }
                        }
                    } else if (obj != hqf.b || (i2 = hqdVar3.b) <= 0) {
                        if (hqdVar2 == null) {
                            hqdVar2 = this.d;
                            if (hqdVar2 == null) {
                                hqdVar2 = new hqd(hqfVar.m[0], this.a);
                            } else {
                                this.d = (hqd) hqdVar2.a;
                                this.e--;
                            }
                        }
                        hqdVar2.a = hqdVar3;
                        if (a.a(atomicReference, hqdVar3, hqdVar2)) {
                            i = 2;
                            break;
                        }
                    } else if (a.a(atomicReference, hqdVar3, hqfVar.m[i2 - 1])) {
                        if (hqdVar2 != null) {
                            c(hqdVar2);
                        }
                    }
                }
                i = 1;
                int i4 = i - 1;
                if (i4 == 0) {
                    this.i = 1;
                } else {
                    if (i4 == 2) {
                        this.i = 3;
                        break;
                    }
                    while (true) {
                        LockSupport.park(hqfVar);
                        int i5 = this.i;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 != 0) {
                            if (i6 == 1) {
                                z |= Thread.interrupted();
                            } else if (i6 == 2) {
                                break loop0;
                            }
                        } else if (z) {
                            Thread thread = this.b;
                            thread.getClass();
                            thread.interrupt();
                        }
                    }
                }
            }
        }
        a();
    }
}
