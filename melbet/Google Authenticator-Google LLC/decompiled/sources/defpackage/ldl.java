package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldl implements Executor, Closeable {
    public static final ldb a = new ldb("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final kuj f;
    public final lcx g;
    public final kuj h;
    public final bst i;
    public final bst j;
    private final kuh k;

    public ldl(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.ai(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.af(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.ai(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
        }
        this.i = new bst((char[]) null);
        this.j = new bst((char[]) null);
        kul kulVar = kul.a;
        this.f = new kuj(0L, kulVar);
        int i3 = i + 1;
        this.g = new lcx(i3 + i3);
        this.h = new kuj(i << 42, kulVar);
        this.k = new kuh(false, kulVar);
    }

    public static final void e(ldp ldpVar) {
        try {
            ldpVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final int g() {
        lcx lcxVar = this.g;
        synchronized (lcxVar) {
            if (d()) {
                return -1;
            }
            kuj kujVar = this.h;
            long j = kujVar.b;
            int i = (int) (j & 2097151);
            int f = ksl.f(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (f >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (kujVar.b & 2097151)) + 1;
            if (lcxVar.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ldk ldkVar = new ldk(this, i2);
            lcxVar.b(i2, ldkVar);
            if (i2 != ((int) (2097151 & kuj.a.incrementAndGet(kujVar)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = f + 1;
            ldkVar.start();
            return i3;
        }
    }

    private final ldk h() {
        Thread currentThread = Thread.currentThread();
        ldk ldkVar = currentThread instanceof ldk ? (ldk) currentThread : null;
        if (ldkVar == null || !ksp.b(ldkVar.d, this)) {
            return null;
        }
        return ldkVar;
    }

    private final boolean i(long j) {
        int f = ksl.f(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0);
        int i = this.b;
        if (f < i) {
            int g = g();
            if (g == 1) {
                if (i > 1) {
                    g();
                }
            } else if (g <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        ldk ldkVar;
        do {
            kuj kujVar = this.f;
            while (true) {
                long j = kujVar.b;
                ldkVar = (ldk) this.g.a((int) (2097151 & j));
                if (ldkVar != null) {
                    long j2 = 2097152 + j;
                    int k = k(ldkVar);
                    if (k >= 0 && kujVar.c(j, (j2 & (-2097152)) | k)) {
                        ldkVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    ldkVar = null;
                    break;
                }
            }
            if (ldkVar == null) {
                return false;
            }
        } while (!ldkVar.b.d(-1, 0));
        LockSupport.unpark(ldkVar);
        return true;
    }

    private static final int k(ldk ldkVar) {
        int i;
        do {
            Object obj = ldkVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            ldkVar = (ldk) obj;
            i = ldkVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        ldp ldqVar;
        int i;
        String str = ldr.a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof ldp) {
            ldqVar = (ldp) runnable;
            ldqVar.g = nanoTime;
            ldqVar.h = z;
        } else {
            ldqVar = new ldq(runnable, nanoTime, z);
        }
        boolean z3 = ldqVar.h;
        long a2 = z3 ? this.h.a(2097152L) : 0L;
        ldk h = h();
        if (h != null && (i = h.e) != 5 && (ldqVar.h || i != 2)) {
            h.c = true;
            ldt ldtVar = h.a;
            if (z2) {
                ldqVar = ldtVar.b(ldqVar);
            } else {
                ldp ldpVar = (ldp) ((kuk) ldtVar.b).a(ldqVar);
                ldqVar = ldpVar == null ? null : ldtVar.b(ldpVar);
            }
        }
        if (ldqVar != null) {
            if (!(ldqVar.h ? this.j.z(ldqVar) : this.i.z(ldqVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(a2)) {
                return;
            }
            j();
        }
    }

    public final void b(ldk ldkVar, int i, int i2) {
        while (true) {
            kuj kujVar = this.f;
            long j = kujVar.b;
            long j2 = 2097152 + j;
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                i3 = i2 == 0 ? k(ldkVar) : i2;
            }
            if (i3 >= 0) {
                if (kujVar.c(j, i3 | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable, false, false);
    }

    public final void f() {
        long j;
        ldp ldpVar;
        if (this.k.b()) {
            ldk h = h();
            synchronized (this.g) {
                j = this.h.b & 2097151;
            }
            int i = (int) j;
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    Object a2 = this.g.a(i2);
                    a2.getClass();
                    ldk ldkVar = (ldk) a2;
                    if (ldkVar != h) {
                        while (ldkVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(ldkVar);
                            ldkVar.join(10000L);
                        }
                        boolean z = kvo.a;
                        ldt ldtVar = ldkVar.a;
                        bst bstVar = this.j;
                        ldp ldpVar2 = (ldp) ((kuk) ldtVar.b).a(null);
                        if (ldpVar2 != null) {
                            bstVar.z(ldpVar2);
                        }
                        while (true) {
                            ldp c = ldtVar.c();
                            if (c == null) {
                                break;
                            } else {
                                bstVar.z(c);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            bst bstVar2 = this.j;
            bstVar2.y();
            bst bstVar3 = this.i;
            bstVar3.y();
            while (true) {
                if (h != null) {
                    ldpVar = h.b(true);
                    if (ldpVar != null) {
                        continue;
                        e(ldpVar);
                    }
                }
                ldpVar = (ldp) bstVar3.x();
                if (ldpVar == null && (ldpVar = (ldp) bstVar2.x()) == null) {
                    break;
                }
                e(ldpVar);
            }
            if (h != null) {
                h.d(5);
            }
            boolean z2 = kvo.a;
            this.f.b = 0L;
            this.h.b = 0L;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        lcx lcxVar = this.g;
        int length = lcxVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            ldk ldkVar = (ldk) lcxVar.a(i6);
            if (ldkVar != null) {
                ldt ldtVar = ldkVar.a;
                int a2 = ((kuk) ldtVar.b).a != null ? ldtVar.a() + 1 : ldtVar.a();
                int i7 = ldkVar.e;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(a2 + "c");
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(a2 + "b");
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (a2 > 0) {
                        arrayList.add(a2 + "d");
                    }
                } else {
                    if (i8 != 4) {
                        throw new koj();
                    }
                    i5++;
                }
            }
        }
        kuj kujVar = this.h;
        String str = this.e;
        long j = kujVar.b;
        String b = kvp.b(this);
        int i9 = this.b;
        int i10 = this.c;
        bst bstVar = this.i;
        bst bstVar2 = this.j;
        long j2 = 2097151 & j;
        long j3 = j & 4398044413952L;
        long j4 = j & 9223367638808264704L;
        return str + "@" + b + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + bstVar.w() + ", global blocking queue size = " + bstVar2.w() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
