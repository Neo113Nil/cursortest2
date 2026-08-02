package x3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class W extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W() {
        super(true);
        boolean z = true;
        D(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0.f16030b;
        InterfaceC1549i interfaceC1549i = (InterfaceC1549i) atomicReferenceFieldUpdater.get(this);
        C1550j c1550j = interfaceC1549i instanceof C1550j ? (C1550j) interfaceC1549i : null;
        if (c1550j != null) {
            d0 j4 = c1550j.j();
            while (!j4.x()) {
                InterfaceC1549i interfaceC1549i2 = (InterfaceC1549i) atomicReferenceFieldUpdater.get(j4);
                C1550j c1550j2 = interfaceC1549i2 instanceof C1550j ? (C1550j) interfaceC1549i2 : null;
                if (c1550j2 != null) {
                    j4 = c1550j2.j();
                }
            }
            this.f16009c = z;
        }
        z = false;
        this.f16009c = z;
    }

    @Override // x3.d0
    public final boolean x() {
        return this.f16009c;
    }

    @Override // x3.d0
    public final boolean y() {
        return true;
    }
}
