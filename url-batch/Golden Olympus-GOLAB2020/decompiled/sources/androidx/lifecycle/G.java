package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.C1336b;

/* loaded from: classes.dex */
class G implements InterfaceC1351q {

    /* renamed from: b, reason: collision with root package name */
    private final Object f12573b;

    /* renamed from: c, reason: collision with root package name */
    private final C1336b.a f12574c;

    G(Object obj) {
        this.f12573b = obj;
        this.f12574c = C1336b.f12628c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
        this.f12574c.a(interfaceC1354u, aVar, this.f12573b);
    }
}
