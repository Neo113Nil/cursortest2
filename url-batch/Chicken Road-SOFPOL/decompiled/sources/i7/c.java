package i7;

import a7.x;
import c6.m;
import d4.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3468g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f3469a;

    public final boolean c() {
        return Math.max(g.f3476f.get(this), 0) == 0;
    }

    public final Object d(i6.c cVar) {
        boolean e8 = e();
        m mVar = m.f1757a;
        if (!e8) {
            a7.h i = x.i(m.a.G(cVar));
            try {
                a(new b(this, i));
                Object s5 = i.s();
                h6.a aVar = h6.a.f3204d;
                if (s5 != aVar) {
                    s5 = mVar;
                }
                if (s5 == aVar) {
                    return s5;
                }
            } catch (Throwable th) {
                i.B();
                throw th;
            }
        }
        return mVar;
    }

    public final boolean e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f3476f;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    f3468g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3468g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.f3469a;
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
        return "Mutex@" + x.g(this) + "[isLocked=" + c() + ",owner=" + f3468g.get(this) + ']';
    }
}
