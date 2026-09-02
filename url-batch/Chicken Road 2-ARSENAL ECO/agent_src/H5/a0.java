package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class a0 extends g0 implements InterfaceC0154n {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0() {
        super(true);
        boolean z5 = true;
        F(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0.f1081g;
        InterfaceC0150j interfaceC0150j = (InterfaceC0150j) atomicReferenceFieldUpdater.get(this);
        C0151k c0151k = interfaceC0150j instanceof C0151k ? (C0151k) interfaceC0150j : null;
        if (c0151k != null) {
            g0 j4 = c0151k.j();
            while (!j4.z()) {
                InterfaceC0150j interfaceC0150j2 = (InterfaceC0150j) atomicReferenceFieldUpdater.get(j4);
                C0151k c0151k2 = interfaceC0150j2 instanceof C0151k ? (C0151k) interfaceC0150j2 : null;
                if (c0151k2 != null) {
                    j4 = c0151k2.j();
                }
            }
            this.f1054h = z5;
        }
        z5 = false;
        this.f1054h = z5;
    }

    @Override // H5.g0
    public final boolean A() {
        return true;
    }

    @Override // H5.g0
    public final boolean z() {
        return this.f1054h;
    }
}
