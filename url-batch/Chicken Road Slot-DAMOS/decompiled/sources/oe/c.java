package oe;

import ge.a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7566v = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f7567a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.e(kotlin.Unit.f5554a, r3.f7576e);
     */
    @Override // oe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nd.c cVar) {
        if (e()) {
            return Unit.f5554a;
        }
        ge.h n10 = a0.n(md.f.b(cVar));
        try {
            b bVar = new b(this, n10);
            while (true) {
                int andDecrement = g.f7574u.getAndDecrement(this);
                if (andDecrement <= this.f7575d) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (b(bVar)) {
                        break;
                    }
                }
            }
            Object r9 = n10.r();
            md.a aVar = md.a.f6622d;
            if (r9 != aVar) {
                r9 = Unit.f5554a;
            }
            return r9 == aVar ? r9 : Unit.f5554a;
        } catch (Throwable th) {
            n10.z();
            throw th;
        }
    }

    @Override // oe.a
    public final void d(Object obj) {
        while (Math.max(g.f7574u.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7566v;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a8.f fVar = d.f7567a;
            if (obj2 != fVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, fVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        i0.l("This mutex is not locked");
    }

    public final boolean e() {
        int i3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f7574u;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f7575d;
            if (i10 > i11) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f7566v.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(a0.m(this));
        sb2.append("[isLocked=");
        sb2.append(Math.max(g.f7574u.get(this), 0) == 0);
        sb2.append(",owner=");
        sb2.append(f7566v.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
