package defpackage;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class die {
    public final Queue a;
    private final Executor b;
    private final AtomicReference c;
    private final did d;
    private Throwable e;

    public die(Executor executor) {
        executor.getClass();
        this.b = executor;
        this.c = new AtomicReference();
        this.a = new ConcurrentLinkedQueue();
        this.d = new did();
    }

    public final hvi a(Executor executor, htq htqVar) {
        return hnu.aM(gvx.i(new bsp(this, hnu.aN(gvx.b(htqVar), new cob(this, 4)), 8)), executor);
    }

    public final Object b(htq htqVar) {
        return c(hnu.aN(htqVar, new cob(this, 5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0313, code lost:
    
        r21 = r5;
        r22 = r7;
        r6 = r8;
        r23 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0311, code lost:
    
        r30 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f1, code lost:
    
        r6 = android.os.Process.getThreadPriority(r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0362, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0363, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b6, code lost:
    
        r5 = r8 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b7, code lost:
    
        r9 = r3.f;
        r19 = r9.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d5, code lost:
    
        if (r9.compareAndSet(r19, defpackage.dif.e(r19, false, false, true, 0, 0, 0, 123)) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0353, code lost:
    
        r8 = r8 ? 1 : 0;
        r6 = r6;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d9, code lost:
    
        if (r3.c == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01db, code lost:
    
        r6 = defpackage.dif.f(defpackage.dif.d(r19), defpackage.dif.a(r19, r6), defpackage.dif.a(r19, 1), defpackage.dif.a(r19, r8 ? 1 : 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f7, code lost:
    
        r9 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        if (defpackage.dic.a(r9) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0203, code lost:
    
        if ((r9 >> 2) > r6) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0211, code lost:
    
        if (r0.compareAndSet(r9, defpackage.dic.c(r9, r6, true, r8, 4)) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0304, code lost:
    
        r8 = r8 ? 1 : 0;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0213, code lost:
    
        r12 = defpackage.dja.b(false, false, false, -21, -21, r6, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0229, code lost:
    
        if (r4.c == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022b, code lost:
    
        r6 = r4.f;
        r14 = r6.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0237, code lost:
    
        if ((r14 & r16) != (r12 & r16)) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0239, code lost:
    
        r30 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0243, code lost:
    
        if (defpackage.dif.a(r14, r8 ? 1 : 0) == (-21)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0252, code lost:
    
        if (defpackage.dif.a(r14, r8 ? 1 : 0) <= ((((int) (r12 >> 43)) & 63) - 21)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0257, code lost:
    
        r0 = defpackage.dif.e(r14, false, false, false, 0, (((int) (r12 >> 43)) & 63) - 21, 0, 95);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0274, code lost:
    
        if (defpackage.dif.c(r14) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028c, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028f, code lost:
    
        r22 = r7;
        r23 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02b6, code lost:
    
        if (defpackage.dif.f(defpackage.dif.d(r14), defpackage.dif.a(r14, 2), defpackage.dif.a(r14, 1), defpackage.dif.a(r14, 0)) != defpackage.dif.f(defpackage.dif.d(r0), defpackage.dif.a(r0, 2), defpackage.dif.a(r0, 1), defpackage.dif.a(r0, 0))) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02bc, code lost:
    
        if (r6.compareAndSet(r14, r0) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02c0, code lost:
    
        r5 = r21;
        r7 = r22;
        r11 = r23;
        r0 = r30;
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02be, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x031a, code lost:
    
        r7 = 2;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031c, code lost:
    
        java.util.concurrent.locks.LockSupport.park(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0323, code lost:
    
        if (r22.get() != r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0341, code lost:
    
        r5 = r21 | java.lang.Thread.interrupted();
        r8 = r6;
        r6 = r7;
        r7 = r22;
        r11 = r23;
        r0 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0325, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0328, code lost:
    
        if (r21 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x032a, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x032f, code lost:
    
        r1 = r8;
        r8 = r6;
        r6 = r7;
        r7 = r1;
        r1 = r41;
        r2 = r42;
        r4 = r16;
        r11 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e7, code lost:
    
        if (r6.compareAndSet(r14, defpackage.dif.e(r0, false, true, false, 0, 0, 0, 125)) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e9, code lost:
    
        r7 = 2;
        r8 = true;
        r6 = false;
        r4.a(defpackage.dif.f(defpackage.dif.d(r14), defpackage.dif.a(r14, 2), defpackage.dif.a(r14, 1), defpackage.dif.a(r14, 0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0351, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0365, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0368, code lost:
    
        if (r21 != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x036a, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x036f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027a, code lost:
    
        if (r6.compareAndSet(r14, r0) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x027e, code lost:
    
        r0 = r30;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x014e A[LOOP:5: B:126:0x00b4->B:135:0x014e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(hvi hviVar) {
        dig digVar;
        long b;
        long j;
        die dieVar = this;
        hvi hviVar2 = hviVar;
        dih dihVar = dij.a;
        Thread currentThread = Thread.currentThread();
        if (currentThread == dij.b) {
            digVar = dij.c;
            if (digVar == null) {
                digVar = dihVar.a();
            }
        } else if (currentThread instanceof dhx) {
            digVar = ((dhx) currentThread).c;
        } else {
            Object obj = dii.a.get();
            obj.getClass();
            digVar = (dig) obj;
        }
        long j2 = 8796093022207L;
        int i = 2;
        boolean z = true;
        boolean z2 = false;
        if (digVar.c) {
            long j3 = digVar.f.get();
            b = dja.b(false, false, false, -21, -21, dif.f(dif.d(j3), dif.a(j3, 2), dif.a(j3, 1), dif.a(j3, 0)), j3 & 8796093022207L);
        } else {
            b = dja.b(false, false, false, -21, -21, Process.getThreadPriority(digVar.b), 0L);
        }
        dib dibVar = new dib(b, digVar, hviVar2);
        while (!hviVar2.isDone()) {
            if (a.j(dieVar.c, dibVar)) {
                boolean z3 = digVar.d;
                if (!z3) {
                    digVar.d = z;
                }
                dieVar.d.a(digVar.a);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                boolean interrupted = Thread.interrupted();
                while (true) {
                    try {
                        Runnable runnable = (Runnable) dieVar.a.poll();
                        if (runnable != null) {
                            try {
                                try {
                                    runnable.run();
                                    interrupted = Thread.interrupted() | interrupted;
                                } catch (Error e) {
                                    dieVar.e = e;
                                    j = j2;
                                    dieVar.b.execute(gvx.h(new ath(e, 16)));
                                    interrupted = Thread.interrupted() | interrupted;
                                    if (!hviVar2.isDone()) {
                                    }
                                } catch (RuntimeException e2) {
                                    j = j2;
                                    dieVar.e = e2;
                                    dieVar.b.execute(gvx.h(new ath(e2, 15)));
                                    interrupted = Thread.interrupted() | interrupted;
                                    if (!hviVar2.isDone()) {
                                    }
                                }
                            } catch (Throwable th) {
                                boolean interrupted2 = interrupted | Thread.interrupted();
                                throw th;
                            }
                        } else if (!hviVar2.isDone()) {
                            String ab = a.ab(hviVar2, "Expected ", " to be done, as no runnables were queued");
                            if (dieVar.e != null) {
                                throw new ExecutionException(ab, dieVar.e);
                            }
                            throw new dik(ab);
                        }
                        j = j2;
                        if (!hviVar2.isDone()) {
                            j2 = j;
                        }
                    } finally {
                        dieVar.d.a(null);
                        dieVar.c.set(null);
                        dibVar.a();
                        if (!z3) {
                            digVar.d = z2;
                            if (digVar.e) {
                                digVar.e = z2;
                                digVar.b();
                            }
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        StrictMode.setThreadPolicy(threadPolicy);
                        if (interrupted) {
                            digVar.a.interrupt();
                        }
                    }
                }
            } else {
                j = j2;
                dib dibVar2 = (dib) dieVar.c.get();
                if (dibVar2 != null) {
                    dig digVar2 = dibVar2.a;
                    if (!ksp.b(digVar2, digVar)) {
                        digVar.getClass();
                        dia diaVar = new dia(digVar);
                        while (true) {
                            AtomicReference atomicReference = dibVar2.c;
                            dja djaVar = (dja) atomicReference.get();
                            dhz dhzVar = dhz.a;
                            if (djaVar == dhzVar) {
                                break;
                            }
                            diaVar.b = (dia) djaVar;
                            if (a.a(atomicReference, djaVar, diaVar)) {
                                break;
                            }
                            Object[] objArr = z2 ? 1 : 0;
                            i = i;
                        }
                    } else {
                        throw new IllegalStateException("Reentrant call would deadlock!");
                    }
                }
                Object[] objArr2 = z2 ? 1 : 0;
                dieVar = this;
                hviVar2 = hviVar;
                i = i;
            }
            j2 = j;
            z = true;
        }
        return hnu.aR(hviVar);
    }

    public final void d(Runnable runnable) {
        this.a.add(runnable);
    }
}
