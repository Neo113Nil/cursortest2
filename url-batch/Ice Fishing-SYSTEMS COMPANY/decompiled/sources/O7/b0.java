package O7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class b0 extends h0 implements InterfaceC0389n {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2580v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0() {
        super(true);
        boolean z8 = true;
        F(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f2607u;
        InterfaceC0385j interfaceC0385j = (InterfaceC0385j) atomicReferenceFieldUpdater.get(this);
        C0386k c0386k = interfaceC0385j instanceof C0386k ? (C0386k) interfaceC0385j : null;
        if (c0386k != null) {
            h0 h9 = c0386k.h();
            while (!h9.y()) {
                InterfaceC0385j interfaceC0385j2 = (InterfaceC0385j) atomicReferenceFieldUpdater.get(h9);
                C0386k c0386k2 = interfaceC0385j2 instanceof C0386k ? (C0386k) interfaceC0385j2 : null;
                if (c0386k2 != null) {
                    h9 = c0386k2.h();
                }
            }
            this.f2580v = z8;
        }
        z8 = false;
        this.f2580v = z8;
    }

    @Override // O7.h0
    public final boolean A() {
        return true;
    }

    @Override // O7.h0
    public final boolean y() {
        return this.f2580v;
    }
}
