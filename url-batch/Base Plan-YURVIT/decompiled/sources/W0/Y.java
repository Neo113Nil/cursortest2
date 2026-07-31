package W0;

import b1.AbstractC0115a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends b1.b {

    /* renamed from: b, reason: collision with root package name */
    public final U f935b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f938e;

    public Y(U u2, Z z2, Object obj) {
        this.f937d = z2;
        this.f938e = obj;
        this.f935b = u2;
    }

    @Override // b1.b
    public final void b(Object obj, Object obj2) {
        b1.l lVar = (b1.l) obj;
        boolean z2 = obj2 == null;
        b1.l lVar2 = this.f935b;
        b1.l lVar3 = z2 ? lVar2 : this.f936c;
        if (lVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.l.f1761e;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, lVar3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                b1.l lVar4 = this.f936c;
                P0.h.b(lVar4);
                lVar2.g(lVar4);
            }
        }
    }

    @Override // b1.b
    public final B0.E c(Object obj) {
        if (this.f937d.D() == this.f938e) {
            return null;
        }
        return AbstractC0115a.f1739e;
    }
}
