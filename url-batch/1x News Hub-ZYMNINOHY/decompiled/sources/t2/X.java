package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class X extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X() {
        super(true);
        boolean z = true;
        G(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e0.f10414b;
        InterfaceC1199i interfaceC1199i = (InterfaceC1199i) atomicReferenceFieldUpdater.get(this);
        C1200j c1200j = interfaceC1199i instanceof C1200j ? (C1200j) interfaceC1199i : null;
        if (c1200j != null) {
            e0 j3 = c1200j.j();
            while (!j3.A()) {
                InterfaceC1199i interfaceC1199i2 = (InterfaceC1199i) atomicReferenceFieldUpdater.get(j3);
                C1200j c1200j2 = interfaceC1199i2 instanceof C1200j ? (C1200j) interfaceC1199i2 : null;
                if (c1200j2 != null) {
                    j3 = c1200j2.j();
                }
            }
            this.f10394c = z;
        }
        z = false;
        this.f10394c = z;
    }

    @Override // t2.e0
    public final boolean A() {
        return this.f10394c;
    }

    @Override // t2.e0
    public final boolean B() {
        return true;
    }
}
