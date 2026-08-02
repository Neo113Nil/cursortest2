package Y0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T extends Z {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(P p2) {
        super(true);
        boolean z2 = true;
        H(p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f1194f;
        InterfaceC0115i interfaceC0115i = (InterfaceC0115i) atomicReferenceFieldUpdater.get(this);
        C0116j c0116j = interfaceC0115i instanceof C0116j ? (C0116j) interfaceC0115i : null;
        if (c0116j != null) {
            Z n2 = c0116j.n();
            while (!n2.B()) {
                InterfaceC0115i interfaceC0115i2 = (InterfaceC0115i) atomicReferenceFieldUpdater.get(n2);
                C0116j c0116j2 = interfaceC0115i2 instanceof C0116j ? (C0116j) interfaceC0115i2 : null;
                if (c0116j2 != null) {
                    n2 = c0116j2.n();
                }
            }
            this.f1178g = z2;
        }
        z2 = false;
        this.f1178g = z2;
    }

    @Override // Y0.Z
    public final boolean B() {
        return this.f1178g;
    }

    @Override // Y0.Z
    public final boolean C() {
        return true;
    }
}
