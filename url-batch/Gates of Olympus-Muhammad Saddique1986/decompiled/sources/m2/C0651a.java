package m2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651a implements InterfaceC0656f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6994a;

    public C0651a(InterfaceC0656f interfaceC0656f) {
        this.f6994a = new AtomicReference(interfaceC0656f);
    }

    @Override // m2.InterfaceC0656f
    public final Iterator iterator() {
        InterfaceC0656f interfaceC0656f = (InterfaceC0656f) this.f6994a.getAndSet(null);
        if (interfaceC0656f != null) {
            return interfaceC0656f.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
