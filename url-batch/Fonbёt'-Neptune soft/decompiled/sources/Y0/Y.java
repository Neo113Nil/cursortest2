package Y0;

import d1.AbstractC0184a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends d1.b {

    /* renamed from: b, reason: collision with root package name */
    public final U f1189b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f1190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f1191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f1192e;

    public Y(U u2, Z z2, L l2) {
        this.f1191d = z2;
        this.f1192e = l2;
        this.f1189b = u2;
    }

    @Override // d1.b
    public final void b(Object obj, Object obj2) {
        d1.l lVar = (d1.l) obj;
        boolean z2 = obj2 == null;
        d1.l lVar2 = this.f1189b;
        d1.l lVar3 = z2 ? lVar2 : this.f1190c;
        if (lVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.l.f2088e;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, lVar3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                d1.l lVar4 = this.f1190c;
                Q0.h.b(lVar4);
                lVar2.j(lVar4);
            }
        }
    }

    @Override // d1.b
    public final B.m c(Object obj) {
        if (this.f1191d.E() == this.f1192e) {
            return null;
        }
        return AbstractC0184a.f2066e;
    }
}
