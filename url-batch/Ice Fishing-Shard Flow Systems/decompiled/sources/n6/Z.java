package n6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z extends f0 implements InterfaceC0782o {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z() {
        super(true);
        boolean z7 = true;
        E(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f7055e;
        InterfaceC0778k interfaceC0778k = (InterfaceC0778k) atomicReferenceFieldUpdater.get(this);
        C0779l c0779l = interfaceC0778k instanceof C0779l ? (C0779l) interfaceC0778k : null;
        if (c0779l != null) {
            f0 i2 = c0779l.i();
            while (!i2.y()) {
                InterfaceC0778k interfaceC0778k2 = (InterfaceC0778k) atomicReferenceFieldUpdater.get(i2);
                C0779l c0779l2 = interfaceC0778k2 instanceof C0779l ? (C0779l) interfaceC0778k2 : null;
                if (c0779l2 != null) {
                    i2 = c0779l2.i();
                }
            }
            this.f7036i = z7;
        }
        z7 = false;
        this.f7036i = z7;
    }

    @Override // n6.f0
    public final boolean y() {
        return this.f7036i;
    }

    @Override // n6.f0
    public final boolean z() {
        return true;
    }
}
