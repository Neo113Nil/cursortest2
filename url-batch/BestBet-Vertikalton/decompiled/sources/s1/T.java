package s1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class T extends w1.b {

    /* renamed from: b, reason: collision with root package name */
    public final P f4027b;

    /* renamed from: c, reason: collision with root package name */
    public V f4028c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I f4029e;

    public T(P p2, U u2, I i) {
        this.d = u2;
        this.f4029e = i;
        this.f4027b = p2;
    }

    @Override // w1.b
    public final void b(Object obj, Object obj2) {
        w1.i iVar = (w1.i) obj;
        boolean z2 = obj2 == null;
        w1.i iVar2 = this.f4027b;
        w1.i iVar3 = z2 ? iVar2 : this.f4028c;
        if (iVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.i.f4504a;
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, iVar3)) {
                if (atomicReferenceFieldUpdater.get(iVar) != this) {
                    return;
                }
            }
            if (z2) {
                w1.i iVar4 = this.f4028c;
                k1.e.b(iVar4);
                iVar2.j(iVar4);
            }
        }
    }

    @Override // w1.b
    public final U.q c(Object obj) {
        if (this.d.x() == this.f4029e) {
            return null;
        }
        return w1.a.d;
    }
}
