package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e30 extends rc0 implements c30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(e30.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public e30() {
        super(1);
        this.owner$volatile = gk0.g;
    }

    @Override // defpackage.c30
    public final void i(Object obj) {
        while (Math.max(rc0.l.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            lm lmVar = gk0.g;
            if (obj2 != lmVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, lmVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        s9.u("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
    
        r1.j(r5.g);
     */
    @Override // defpackage.c30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(eg egVar) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = rc0.l;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                sk0 sk0Var = sk0.a;
                if (i2 <= 0) {
                    ka y = d50.y(n9.z(egVar));
                    try {
                        d30 d30Var = new d30(this, y);
                        while (true) {
                            int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                            if (andDecrement <= i3) {
                                if (andDecrement > 0) {
                                    break;
                                }
                                if (a(d30Var)) {
                                    break;
                                }
                            }
                        }
                        Object u = y.u();
                        bh bhVar = bh.COROUTINE_SUSPENDED;
                        if (u != bhVar) {
                            u = sk0Var;
                        }
                        return u == bhVar ? u : sk0Var;
                    } catch (Throwable th) {
                        y.A();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    m.set(this, null);
                    return sk0Var;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(bi.D(this));
        sb.append("[isLocked=");
        sb.append(Math.max(rc0.l.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(m.get(this));
        sb.append(']');
        return sb.toString();
    }
}
