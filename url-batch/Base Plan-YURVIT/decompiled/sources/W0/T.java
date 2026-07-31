package W0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T extends Z {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T() {
        super(true);
        boolean z2 = true;
        G(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f940f;
        InterfaceC0069i interfaceC0069i = (InterfaceC0069i) atomicReferenceFieldUpdater.get(this);
        C0070j c0070j = interfaceC0069i instanceof C0070j ? (C0070j) interfaceC0069i : null;
        if (c0070j != null) {
            Z o2 = c0070j.o();
            while (!o2.A()) {
                InterfaceC0069i interfaceC0069i2 = (InterfaceC0069i) atomicReferenceFieldUpdater.get(o2);
                C0070j c0070j2 = interfaceC0069i2 instanceof C0070j ? (C0070j) interfaceC0069i2 : null;
                if (c0070j2 != null) {
                    o2 = c0070j2.o();
                }
            }
            this.f924g = z2;
        }
        z2 = false;
        this.f924g = z2;
    }

    @Override // W0.Z
    public final boolean A() {
        return this.f924g;
    }

    @Override // W0.Z
    public final boolean B() {
        return true;
    }
}
