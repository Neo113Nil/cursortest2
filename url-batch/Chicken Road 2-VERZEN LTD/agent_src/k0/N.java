package k0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class N extends T {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(K k2) {
        super(true);
        boolean z2 = true;
        B(k2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f851c;
        InterfaceC0049h interfaceC0049h = (InterfaceC0049h) atomicReferenceFieldUpdater.get(this);
        C0050i c0050i = interfaceC0049h instanceof C0050i ? (C0050i) interfaceC0049h : null;
        if (c0050i != null) {
            T n2 = c0050i.n();
            while (!n2.w()) {
                InterfaceC0049h interfaceC0049h2 = (InterfaceC0049h) atomicReferenceFieldUpdater.get(n2);
                C0050i c0050i2 = interfaceC0049h2 instanceof C0050i ? (C0050i) interfaceC0049h2 : null;
                if (c0050i2 != null) {
                    n2 = c0050i2.n();
                }
            }
            this.f836d = z2;
        }
        z2 = false;
        this.f836d = z2;
    }

    @Override // k0.T
    public final boolean w() {
        return this.f836d;
    }
}
