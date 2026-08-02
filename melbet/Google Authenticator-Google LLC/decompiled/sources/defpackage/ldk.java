package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldk extends Thread {
    public final ldt a;
    public final kui b;
    public boolean c;
    final /* synthetic */ ldl d;
    public int e;
    private final ksw f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public ldk(ldl ldlVar, int i) {
        this.d = ldlVar;
        setDaemon(true);
        setContextClassLoader(ldlVar.getClass().getClassLoader());
        this.a = new ldt();
        this.f = new ksw();
        this.e = 4;
        this.b = new kui(0, kul.a);
        this.nextParkedWorker = ldl.a;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        c(i);
    }

    private final ldp e() {
        int a = a(2);
        ldl ldlVar = this.d;
        if (a == 0) {
            ldp ldpVar = (ldp) ldlVar.i.x();
            return ldpVar != null ? ldpVar : (ldp) ldlVar.j.x();
        }
        ldp ldpVar2 = (ldp) ldlVar.j.x();
        return ldpVar2 != null ? ldpVar2 : (ldp) ldlVar.i.x();
    }

    private final ldp f(int i) {
        long j;
        ldp ldpVar;
        long j2;
        long j3;
        long j4;
        ldl ldlVar = this.d;
        int i2 = (int) (ldlVar.h.b & 2097151);
        ldp ldpVar2 = null;
        if (i2 < 2) {
            return null;
        }
        int a = a(i2);
        int i3 = 0;
        long j5 = Long.MAX_VALUE;
        while (i3 < i2) {
            a++;
            if (a > i2) {
                a = 1;
            }
            ldk ldkVar = (ldk) ldlVar.g.a(a);
            if (ldkVar != null && ldkVar != this) {
                ldt ldtVar = ldkVar.a;
                ksw kswVar = this.f;
                if (i == 3) {
                    ldpVar = ldtVar.c();
                    j = 0;
                } else {
                    boolean z = i == 1;
                    int i4 = ((kui) ldtVar.d).b;
                    j = 0;
                    int i5 = ((kui) ldtVar.c).b;
                    while (i4 != i5 && (!z || ((kui) ldtVar.e).b != 0)) {
                        int i6 = i4 + 1;
                        ldp d = ldtVar.d(i4, z);
                        if (d != null) {
                            ldpVar = d;
                            break;
                        }
                        i4 = i6;
                    }
                    ldpVar = ldpVar2;
                }
                if (ldpVar != null) {
                    kswVar.a = ldpVar;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        kuk kukVar = (kuk) ldtVar.b;
                        ldp ldpVar3 = (ldp) kukVar.a;
                        j2 = -2;
                        j3 = -1;
                        if (ldpVar3 == null) {
                            break;
                        }
                        if (((true != ldpVar3.h ? 2 : 1) & i) == 0) {
                            break;
                        }
                        String str = ldr.a;
                        ldt ldtVar2 = ldtVar;
                        long nanoTime = System.nanoTime() - ldpVar3.g;
                        long j6 = ldr.b;
                        if (nanoTime < j6) {
                            j2 = j6 - nanoTime;
                            ldpVar2 = null;
                            break;
                        }
                        ldpVar2 = null;
                        if (kukVar.d(ldpVar3, null)) {
                            kswVar.a = ldpVar3;
                            j2 = -1;
                            break;
                        }
                        ldtVar = ldtVar2;
                    }
                    j4 = j2;
                }
                if (j4 == j3) {
                    ldp ldpVar4 = (ldp) kswVar.a;
                    kswVar.a = ldpVar2;
                    return ldpVar4;
                }
                if (j4 > j) {
                    j5 = Math.min(j5, j4);
                }
            }
            i3++;
            ldpVar2 = null;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.h = j5;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != ldl.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ldp b(boolean z) {
        ldp e;
        ldp e2;
        kuj kujVar;
        long j;
        kuk kukVar;
        ldp ldpVar;
        ldp ldpVar2 = null;
        if (this.e != 1) {
            ldl ldlVar = this.d;
            do {
                kujVar = ldlVar.h;
                j = kujVar.b;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ldt ldtVar = this.a;
                    do {
                        kukVar = (kuk) ldtVar.b;
                        ldpVar = (ldp) kukVar.a;
                        if (ldpVar == null || !ldpVar.h) {
                            int i = ((kui) ldtVar.d).b;
                            int i2 = ((kui) ldtVar.c).b;
                            while (true) {
                                if (i == i2 || ((kui) ldtVar.e).b == 0) {
                                    break;
                                }
                                i2--;
                                ldp d = ldtVar.d(i2, true);
                                if (d != null) {
                                    ldpVar2 = d;
                                    break;
                                }
                            }
                        }
                        if (ldpVar2 == null) {
                            return ldpVar2;
                        }
                        ldp ldpVar3 = (ldp) ldlVar.j.x();
                        return ldpVar3 == null ? f(1) : ldpVar3;
                    } while (!kukVar.d(ldpVar, null));
                    ldpVar2 = ldpVar;
                    if (ldpVar2 == null) {
                    }
                }
            } while (!kujVar.c(j, (-4398046511104L) + j));
            this.e = 1;
        }
        if (z) {
            int i3 = this.d.b;
            boolean z2 = a(i3 + i3) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            ldt ldtVar2 = this.a;
            ldp ldpVar4 = (ldp) ((kuk) ldtVar2.b).a(null);
            if (ldpVar4 == null) {
                ldpVar4 = ldtVar2.c();
            }
            if (ldpVar4 != null) {
                return ldpVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            ldp e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return f(3);
    }

    public final void c(int i) {
        String valueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + valueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                ldl ldlVar = this.d;
                if (ldlVar.d() || this.e == 5) {
                    break loop0;
                }
                ldp b = b(this.c);
                long j = -2097152;
                if (b != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = kvo.a;
                        this.e = 2;
                    }
                    if (b.h) {
                        if (d(2)) {
                            ldlVar.c();
                        }
                        ldl.e(b);
                        ldlVar.h.a(-2097152L);
                        if (this.e != 5) {
                            boolean z3 = kvo.a;
                            this.e = 4;
                        }
                    } else {
                        ldl.e(b);
                    }
                } else {
                    this.c = false;
                    if (this.h == 0) {
                        long j2 = 2097151;
                        if (g()) {
                            kui kuiVar = this.b;
                            kuiVar.b = -1;
                            while (g() && kuiVar.b == -1 && !ldlVar.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + ldlVar.d;
                                }
                                LockSupport.parkNanos(ldlVar.d);
                                long j3 = j2;
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    lcx lcxVar = ldlVar.g;
                                    synchronized (lcxVar) {
                                        if (!ldlVar.d()) {
                                            kuj kujVar = ldlVar.h;
                                            if (((int) (kujVar.b & j3)) > ldlVar.b && kuiVar.d(-1, 1)) {
                                                int i = this.indexInArray;
                                                c(0);
                                                ldlVar.b(this, i, 0);
                                                int andDecrement = (int) (kuj.a.getAndDecrement(kujVar) & j3);
                                                if (andDecrement != i) {
                                                    Object a = lcxVar.a(andDecrement);
                                                    a.getClass();
                                                    ldk ldkVar = (ldk) a;
                                                    lcxVar.b(i, ldkVar);
                                                    ldkVar.c(i);
                                                    ldlVar.b(ldkVar, andDecrement, i);
                                                }
                                                lcxVar.b(andDecrement, null);
                                                this.e = 5;
                                            }
                                        }
                                    }
                                }
                                j2 = j3;
                            }
                        } else if (this.nextParkedWorker == ldl.a) {
                            kuj kujVar2 = ldlVar.f;
                            while (true) {
                                long j4 = kujVar2.b;
                                int i2 = this.indexInArray;
                                boolean z4 = kvo.a;
                                long j5 = j;
                                this.nextParkedWorker = ldlVar.g.a((int) (j4 & 2097151));
                                if (kujVar2.c(j4, ((2097152 + j4) & j5) | i2)) {
                                    break;
                                } else {
                                    j = j5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
