package g2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405a implements InterfaceC0410f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4839a;

    public C0405a(InterfaceC0410f interfaceC0410f) {
        this.f4839a = new AtomicReference(interfaceC0410f);
    }

    @Override // g2.InterfaceC0410f
    public final Iterator iterator() {
        InterfaceC0410f interfaceC0410f = (InterfaceC0410f) this.f4839a.getAndSet(null);
        if (interfaceC0410f != null) {
            return interfaceC0410f.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
