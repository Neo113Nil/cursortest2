package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class pn extends ln implements fj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(pn.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(pn.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(pn.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // defpackage.tg
    public final void O(qg qgVar, Runnable runnable) {
        V(runnable);
    }

    @Override // defpackage.ln
    public final long T() {
        Runnable runnable;
        nn nnVar;
        lm lmVar = gk0.f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        if (!U()) {
            W();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof cz)) {
                    if (obj != lmVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                cz czVar = (cz) obj;
                Object d = czVar.d();
                if (d != cz.g) {
                    runnable = (Runnable) d;
                    break;
                }
                cz c = czVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            z6 z6Var = this.j;
            if (((z6Var == null || z6Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof cz) {
                        long j = cz.f.get((cz) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == lmVar) {
                        return Long.MAX_VALUE;
                    }
                }
                on onVar = (on) m.get(this);
                if (onVar != null) {
                    synchronized (onVar) {
                        nn[] nnVarArr = onVar.a;
                        nnVar = nnVarArr != null ? nnVarArr[0] : null;
                    }
                    if (nnVar != null) {
                        long nanoTime = nnVar.f - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void V(Runnable runnable) {
        W();
        if (!X(runnable)) {
            fi.o.V(runnable);
            return;
        }
        Thread Y = Y();
        if (Thread.currentThread() != Y) {
            LockSupport.unpark(Y);
        }
    }

    public final void W() {
        nn nnVar;
        on onVar = (on) m.get(this);
        if (onVar == null || ci0.b.get(onVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (onVar) {
                try {
                    nn[] nnVarArr = onVar.a;
                    nn nnVar2 = nnVarArr != null ? nnVarArr[0] : null;
                    if (nnVar2 != null) {
                        nnVar = ((nanoTime - nnVar2.f) > 0L ? 1 : ((nanoTime - nnVar2.f) == 0L ? 0 : -1)) >= 0 ? X(nnVar2) : false ? onVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (nnVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (n.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof cz)) {
                        if (obj != gk0.f) {
                            cz czVar = new cz(8, true);
                            czVar.a((Runnable) obj);
                            czVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, czVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    cz czVar2 = (cz) obj;
                    int a = czVar2.a(runnable);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        cz c = czVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public abstract Thread Y();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((defpackage.ci0.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        z6 z6Var = this.j;
        if (z6Var != null ? z6Var.isEmpty() : true) {
            on onVar = (on) m.get(this);
            if (onVar != null) {
            }
            Object obj = l.get(this);
            if (obj != null) {
                if (obj instanceof cz) {
                    long j = cz.f.get((cz) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == gk0.f) {
                }
            }
            return true;
        }
        return false;
    }

    public void a0(long j, nn nnVar) {
        fi.o.b0(j, nnVar);
    }

    public final void b0(long j, nn nnVar) {
        int b;
        Thread Y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        if (n.get(this) != 0) {
            b = 1;
        } else {
            on onVar = (on) atomicReferenceFieldUpdater.get(this);
            if (onVar == null) {
                on onVar2 = new on();
                onVar2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, onVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                onVar = (on) obj;
            }
            b = nnVar.b(j, onVar, this);
        }
        if (b != 0) {
            if (b == 1) {
                a0(j, nnVar);
                return;
            } else {
                if (b == 2) {
                    return;
                }
                s9.u("unexpected result");
                return;
            }
        }
        on onVar3 = (on) atomicReferenceFieldUpdater.get(this);
        if (onVar3 != null) {
            synchronized (onVar3) {
                nn[] nnVarArr = onVar3.a;
                r2 = nnVarArr != null ? nnVarArr[0] : null;
            }
        }
        if (r2 != nnVar || Thread.currentThread() == (Y = Y())) {
            return;
        }
        LockSupport.unpark(Y);
    }

    public nk i(long j, ii0 ii0Var, qg qgVar) {
        return gi.a.i(j, ii0Var, qgVar);
    }

    @Override // defpackage.ln
    public void shutdown() {
        nn b;
        ai0.a.set(null);
        n.set(this, 1);
        lm lmVar = gk0.f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof cz)) {
                    if (obj != lmVar) {
                        cz czVar = new cz(8, true);
                        czVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, czVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((cz) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lmVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (T() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            on onVar = (on) m.get(this);
            if (onVar == null) {
                return;
            }
            synchronized (onVar) {
                b = ci0.b.get(onVar) > 0 ? onVar.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                a0(nanoTime, b);
            }
        }
    }
}
