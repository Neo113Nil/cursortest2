package k1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class p0 extends p1.b {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f708b;

    /* renamed from: c, reason: collision with root package name */
    public r0 f709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f711e;

    public p0(m0 m0Var, q0 q0Var, g0 g0Var) {
        this.f710d = q0Var;
        this.f711e = g0Var;
        this.f708b = m0Var;
    }

    @Override // p1.b
    public final void a(Object obj, Object obj2) {
        p1.l lVar = (p1.l) obj;
        boolean z2 = obj2 == null;
        m0 m0Var = this.f708b;
        Object obj3 = z2 ? m0Var : this.f709c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.l.f1059b;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                r0 r0Var = this.f709c;
                r0Var.getClass();
                m0Var.j(r0Var);
            }
        }
    }

    @Override // p1.b
    public final o0.a c(Object obj) {
        if (this.f710d.x() == this.f711e) {
            return null;
        }
        return p1.a.f1037e;
    }
}
