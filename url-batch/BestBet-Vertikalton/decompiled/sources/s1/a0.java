package s1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 extends U {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(M m2) {
        super(true);
        boolean z2 = true;
        A(m2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U.f4031b;
        InterfaceC0324g interfaceC0324g = (InterfaceC0324g) atomicReferenceFieldUpdater.get(this);
        C0325h c0325h = interfaceC0324g instanceof C0325h ? (C0325h) interfaceC0324g : null;
        if (c0325h != null) {
            U n2 = c0325h.n();
            while (!n2.v()) {
                InterfaceC0324g interfaceC0324g2 = (InterfaceC0324g) atomicReferenceFieldUpdater.get(n2);
                C0325h c0325h2 = interfaceC0324g2 instanceof C0325h ? (C0325h) interfaceC0324g2 : null;
                if (c0325h2 != null) {
                    n2 = c0325h2.n();
                }
            }
            this.f4034c = z2;
        }
        z2 = false;
        this.f4034c = z2;
    }

    @Override // s1.U
    public final boolean q(Throwable th) {
        return false;
    }

    @Override // s1.U
    public final boolean v() {
        return this.f4034c;
    }
}
