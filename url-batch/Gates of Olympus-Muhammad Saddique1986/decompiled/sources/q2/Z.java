package q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z extends f0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(X x3) {
        super(true);
        boolean z3 = true;
        S(x3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f7896e;
        InterfaceC0824k interfaceC0824k = (InterfaceC0824k) atomicReferenceFieldUpdater.get(this);
        C0825l c0825l = interfaceC0824k instanceof C0825l ? (C0825l) interfaceC0824k : null;
        if (c0825l != null) {
            f0 j3 = c0825l.j();
            while (!j3.N()) {
                InterfaceC0824k interfaceC0824k2 = (InterfaceC0824k) atomicReferenceFieldUpdater.get(j3);
                C0825l c0825l2 = interfaceC0824k2 instanceof C0825l ? (C0825l) interfaceC0824k2 : null;
                if (c0825l2 != null) {
                    j3 = c0825l2.j();
                }
            }
            this.f7876f = z3;
        }
        z3 = false;
        this.f7876f = z3;
    }

    @Override // q2.f0
    public final boolean N() {
        return this.f7876f;
    }

    @Override // q2.f0
    public final boolean O() {
        return true;
    }
}
