package W2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class e0 extends k0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4257i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(InterfaceC0280c0 interfaceC0280c0) {
        super(true);
        boolean z4 = true;
        R(interfaceC0280c0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k0.f4280e;
        InterfaceC0289k interfaceC0289k = (InterfaceC0289k) atomicReferenceFieldUpdater.get(this);
        C0290l c0290l = interfaceC0289k instanceof C0290l ? (C0290l) interfaceC0289k : null;
        if (c0290l != null) {
            k0 j4 = c0290l.j();
            while (!j4.M()) {
                InterfaceC0289k interfaceC0289k2 = (InterfaceC0289k) atomicReferenceFieldUpdater.get(j4);
                C0290l c0290l2 = interfaceC0289k2 instanceof C0290l ? (C0290l) interfaceC0289k2 : null;
                if (c0290l2 != null) {
                    j4 = c0290l2.j();
                }
            }
            this.f4257i = z4;
        }
        z4 = false;
        this.f4257i = z4;
    }

    @Override // W2.k0
    public final boolean M() {
        return this.f4257i;
    }

    @Override // W2.k0
    public final boolean N() {
        return true;
    }
}
