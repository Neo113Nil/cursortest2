package k0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class N extends T {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(K k2) {
        super(true);
        boolean z = true;
        B(k2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f904c;
        InterfaceC0047h interfaceC0047h = (InterfaceC0047h) atomicReferenceFieldUpdater.get(this);
        C0048i c0048i = interfaceC0047h instanceof C0048i ? (C0048i) interfaceC0047h : null;
        if (c0048i != null) {
            T n2 = c0048i.n();
            while (!n2.w()) {
                InterfaceC0047h interfaceC0047h2 = (InterfaceC0047h) atomicReferenceFieldUpdater.get(n2);
                C0048i c0048i2 = interfaceC0047h2 instanceof C0048i ? (C0048i) interfaceC0047h2 : null;
                if (c0048i2 != null) {
                    n2 = c0048i2.n();
                }
            }
            this.f889d = z;
        }
        z = false;
        this.f889d = z;
    }

    @Override // k0.T
    public final boolean w() {
        return this.f889d;
    }
}
