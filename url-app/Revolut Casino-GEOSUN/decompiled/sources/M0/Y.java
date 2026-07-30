package M0;

import R0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends R0.b {

    /* renamed from: b, reason: collision with root package name */
    public final U f646b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f649e;

    public Y(U u2, Z z2, L l2) {
        this.f648d = z2;
        this.f649e = l2;
        this.f646b = u2;
    }

    @Override // R0.b
    public final void b(Object obj, Object obj2) {
        R0.l lVar = (R0.l) obj;
        boolean z2 = obj2 == null;
        U u2 = this.f646b;
        L l2 = z2 ? u2 : this.f647c;
        if (l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R0.l.f919e;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, l2)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                a0 a0Var = this.f647c;
                F0.i.b(a0Var);
                u2.j(a0Var);
            }
        }
    }

    @Override // R0.b
    public final A.j c(Object obj) {
        if (this.f648d.C() == this.f649e) {
            return null;
        }
        return AbstractC0068a.f897e;
    }
}
