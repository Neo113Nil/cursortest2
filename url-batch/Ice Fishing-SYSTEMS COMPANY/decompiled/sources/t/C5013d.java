package t;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5013d extends com.bumptech.glide.e {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40537g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40538h;
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40539j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40540k;

    public C5013d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(11);
        this.f40537g = atomicReferenceFieldUpdater;
        this.f40538h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.f40539j = atomicReferenceFieldUpdater4;
        this.f40540k = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.e
    public final void A(C5015f c5015f, Thread thread) {
        this.f40537g.lazySet(c5015f, thread);
    }

    @Override // com.bumptech.glide.e
    public final boolean c(AbstractC5016g abstractC5016g, C5012c c5012c, C5012c c5012c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40539j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5016g, c5012c, c5012c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5016g) == c5012c);
        return false;
    }

    @Override // com.bumptech.glide.e
    public final boolean e(AbstractC5016g abstractC5016g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40540k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5016g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5016g) == obj);
        return false;
    }

    @Override // com.bumptech.glide.e
    public final boolean g(AbstractC5016g abstractC5016g, C5015f c5015f, C5015f c5015f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5016g, c5015f, c5015f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5016g) == c5015f);
        return false;
    }

    @Override // com.bumptech.glide.e
    public final void y(C5015f c5015f, C5015f c5015f2) {
        this.f40538h.lazySet(c5015f, c5015f2);
    }
}
