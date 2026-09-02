package w0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712d extends i6.g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6159a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6160b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6161c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6162d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6163e;

    public C0712d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6159a = atomicReferenceFieldUpdater;
        this.f6160b = atomicReferenceFieldUpdater2;
        this.f6161c = atomicReferenceFieldUpdater3;
        this.f6162d = atomicReferenceFieldUpdater4;
        this.f6163e = atomicReferenceFieldUpdater5;
    }

    @Override // i6.g
    public final boolean d(h hVar, C0711c c0711c, C0711c c0711c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6162d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, c0711c, c0711c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == c0711c);
        return false;
    }

    @Override // i6.g
    public final boolean e(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6163e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // i6.g
    public final boolean f(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6161c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // i6.g
    public final void t(g gVar, g gVar2) {
        this.f6160b.lazySet(gVar, gVar2);
    }

    @Override // i6.g
    public final void u(g gVar, Thread thread) {
        this.f6159a.lazySet(gVar, thread);
    }
}
