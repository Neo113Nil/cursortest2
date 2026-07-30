package v6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import n6.AbstractC0792z;
import n6.C0775h;

/* loaded from: classes.dex */
public final class c extends g implements InterfaceC0979a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8238g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f8239a;

    public final Object c(X5.c frame) {
        if (d()) {
            return Unit.f6114a;
        }
        C0775h h7 = AbstractC0792z.h(W5.d.b(frame));
        try {
            a(new C0980b(this, h7));
            Object r7 = h7.r();
            W5.a aVar = W5.a.f2787d;
            if (r7 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (r7 != aVar) {
                r7 = Unit.f6114a;
            }
            return r7 == aVar ? r7 : Unit.f6114a;
        } catch (Throwable th) {
            h7.z();
            throw th;
        }
    }

    public final boolean d() {
        int i2;
        char c7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f8246f;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                if (i5 <= 0) {
                    c7 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 - 1)) {
                    f8238g.set(this, null);
                    c7 = 0;
                    break;
                }
            }
        }
        if (c7 == 0) {
            return true;
        }
        if (c7 == 1) {
            return false;
        }
        if (c7 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(g.f8246f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8238g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0654a c0654a = d.f8239a;
            if (obj2 != c0654a) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0654a)) {
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
        sb.append(AbstractC0792z.g(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f8246f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f8238g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
