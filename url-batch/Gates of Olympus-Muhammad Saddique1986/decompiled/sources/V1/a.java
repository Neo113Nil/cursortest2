package V1;

import e2.InterfaceC0426e;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: d, reason: collision with root package name */
    public final h f4551d;

    public a(h hVar) {
        this.f4551d = hVar;
    }

    @Override // V1.i
    public final i d(i iVar) {
        return AbstractC0508a.L(this, iVar);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    @Override // V1.g
    public final h getKey() {
        return this.f4551d;
    }

    @Override // V1.i
    public i l(h hVar) {
        return AbstractC0508a.K(this, hVar);
    }

    @Override // V1.i
    public g v(h hVar) {
        return AbstractC0508a.C(this, hVar);
    }
}
