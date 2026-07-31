package k2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z extends f0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(X x3) {
        super(true);
        boolean z3 = true;
        N(x3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f5357e;
        InterfaceC0539k interfaceC0539k = (InterfaceC0539k) atomicReferenceFieldUpdater.get(this);
        C0540l c0540l = interfaceC0539k instanceof C0540l ? (C0540l) interfaceC0539k : null;
        if (c0540l != null) {
            f0 j3 = c0540l.j();
            while (!j3.H()) {
                InterfaceC0539k interfaceC0539k2 = (InterfaceC0539k) atomicReferenceFieldUpdater.get(j3);
                C0540l c0540l2 = interfaceC0539k2 instanceof C0540l ? (C0540l) interfaceC0539k2 : null;
                if (c0540l2 != null) {
                    j3 = c0540l2.j();
                }
            }
            this.f5337f = z3;
        }
        z3 = false;
        this.f5337f = z3;
    }

    @Override // k2.f0
    public final boolean H() {
        return this.f5337f;
    }

    @Override // k2.f0
    public final boolean I() {
        return true;
    }
}
