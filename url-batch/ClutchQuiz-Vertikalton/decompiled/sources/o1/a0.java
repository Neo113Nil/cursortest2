package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 extends U {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(M m2) {
        super(true);
        boolean z2 = true;
        z(m2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U.f3328b;
        InterfaceC0288g interfaceC0288g = (InterfaceC0288g) atomicReferenceFieldUpdater.get(this);
        C0289h c0289h = interfaceC0288g instanceof C0289h ? (C0289h) interfaceC0288g : null;
        if (c0289h != null) {
            U n2 = c0289h.n();
            while (!n2.t()) {
                InterfaceC0288g interfaceC0288g2 = (InterfaceC0288g) atomicReferenceFieldUpdater.get(n2);
                C0289h c0289h2 = interfaceC0288g2 instanceof C0289h ? (C0289h) interfaceC0288g2 : null;
                if (c0289h2 != null) {
                    n2 = c0289h2.n();
                }
            }
            this.f3331c = z2;
        }
        z2 = false;
        this.f3331c = z2;
    }

    @Override // o1.U
    public final boolean n(Throwable th) {
        return false;
    }

    @Override // o1.U
    public final boolean t() {
        return this.f3331c;
    }
}
