package q2;

import e2.InterfaceC0426e;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class v0 implements V1.g, V1.h {

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f7933d = new v0();

    @Override // V1.i
    public final V1.i d(V1.i iVar) {
        return AbstractC0508a.L(this, iVar);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    @Override // V1.i
    public final V1.i l(V1.h hVar) {
        return AbstractC0508a.K(this, hVar);
    }

    @Override // V1.i
    public final V1.g v(V1.h hVar) {
        return AbstractC0508a.C(this, hVar);
    }

    @Override // V1.g
    public final V1.h getKey() {
        return this;
    }
}
