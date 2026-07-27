package q0;

import n.AbstractC0864b;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048a extends AbstractC0864b {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1053f f9352a;

    @Override // n.AbstractC0864b
    public final boolean n(C1055h c1055h) {
        return c1055h == this.f9352a.getKey();
    }

    @Override // n.AbstractC0864b
    public final Object r(C1055h c1055h) {
        if (c1055h == this.f9352a.getKey()) {
            return this.f9352a.getValue();
        }
        AbstractC0864b.D("Check failed.");
        throw null;
    }
}
