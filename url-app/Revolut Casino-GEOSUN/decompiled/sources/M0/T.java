package M0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T extends Z {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(P p2) {
        super(true);
        boolean z2 = true;
        F(p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f651f;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) atomicReferenceFieldUpdater.get(this);
        C0052j c0052j = interfaceC0051i instanceof C0052j ? (C0052j) interfaceC0051i : null;
        if (c0052j != null) {
            Z n2 = c0052j.n();
            while (!n2.z()) {
                InterfaceC0051i interfaceC0051i2 = (InterfaceC0051i) atomicReferenceFieldUpdater.get(n2);
                C0052j c0052j2 = interfaceC0051i2 instanceof C0052j ? (C0052j) interfaceC0051i2 : null;
                if (c0052j2 != null) {
                    n2 = c0052j2.n();
                }
            }
            this.f635g = z2;
        }
        z2 = false;
        this.f635g = z2;
    }

    @Override // M0.Z
    public final boolean A() {
        return true;
    }

    @Override // M0.Z
    public final boolean z() {
        return this.f635g;
    }
}
