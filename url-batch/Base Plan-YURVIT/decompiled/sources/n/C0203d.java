package n;

import androidx.datastore.preferences.protobuf.k0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203d extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2896e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2897f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2898g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2899h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2900i;

    public C0203d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2896e = atomicReferenceFieldUpdater;
        this.f2897f = atomicReferenceFieldUpdater2;
        this.f2898g = atomicReferenceFieldUpdater3;
        this.f2899h = atomicReferenceFieldUpdater4;
        this.f2900i = atomicReferenceFieldUpdater5;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean e(AbstractFutureC0206g abstractFutureC0206g, C0202c c0202c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2899h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0206g, c0202c, C0202c.f2894b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0206g) == c0202c);
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean f(AbstractFutureC0206g abstractFutureC0206g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2900i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0206g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0206g) == obj);
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean g(AbstractFutureC0206g abstractFutureC0206g, C0205f c0205f, C0205f c0205f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2898g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0206g, c0205f, c0205f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0206g) == c0205f);
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void y(C0205f c0205f, C0205f c0205f2) {
        this.f2897f.lazySet(c0205f, c0205f2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void z(C0205f c0205f, Thread thread) {
        this.f2896e.lazySet(c0205f, thread);
    }
}
