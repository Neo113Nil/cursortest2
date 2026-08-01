package r1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b0 extends V {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(N n2) {
        super(true);
        boolean z2 = true;
        v(n2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V.f4061b;
        InterfaceC0358h interfaceC0358h = (InterfaceC0358h) atomicReferenceFieldUpdater.get(this);
        C0359i c0359i = interfaceC0358h instanceof C0359i ? (C0359i) interfaceC0358h : null;
        if (c0359i != null) {
            V n3 = c0359i.n();
            while (!n3.p()) {
                InterfaceC0358h interfaceC0358h2 = (InterfaceC0358h) atomicReferenceFieldUpdater.get(n3);
                C0359i c0359i2 = interfaceC0358h2 instanceof C0359i ? (C0359i) interfaceC0358h2 : null;
                if (c0359i2 != null) {
                    n3 = c0359i2.n();
                }
            }
            this.f4065c = z2;
        }
        z2 = false;
        this.f4065c = z2;
    }

    @Override // r1.V
    public final boolean k(Throwable th) {
        return false;
    }

    @Override // r1.V
    public final boolean p() {
        return this.f4065c;
    }
}
