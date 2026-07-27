package e3;

import W2.B;
import W2.C0286h;
import b3.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6259g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner$volatile = z4 ? null : d.f6260a;
    }

    public final Object c(Object obj, E2.c frame) {
        if (d(obj)) {
            return Unit.f7487a;
        }
        C0286h h4 = B.h(D2.f.b(frame));
        try {
            a(new b(this, h4, obj));
            Object r2 = h4.r();
            D2.a aVar = D2.a.f2163d;
            if (r2 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (r2 != aVar) {
                r2 = Unit.f7487a;
            }
            return r2 == aVar ? r2 : Unit.f7487a;
        } catch (Throwable th) {
            h4.C();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i2;
        char c4;
        char c5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f6267f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6259g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c5 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != d.f6260a) {
                                c5 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c5 == 1) {
                            c4 = 2;
                            break;
                        }
                        if (c5 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c4 = 0;
                    break;
                }
            }
        }
        c4 = 1;
        if (c4 == 0) {
            return true;
        }
        if (c4 == 1) {
            return false;
        }
        if (c4 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(g.f6267f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6259g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.f6260a;
            if (obj2 != tVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
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
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(B.f(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f6267f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f6259g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
