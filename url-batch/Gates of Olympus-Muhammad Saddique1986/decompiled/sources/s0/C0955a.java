package s0;

import n.t0;
import n.z0;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955a extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0960f f8343a;

    @Override // n.t0
    public final boolean g(C0962h c0962h) {
        return c0962h == this.f8343a.getKey();
    }

    @Override // n.t0
    public final Object j(C0962h c0962h) {
        if (c0962h == this.f8343a.getKey()) {
            return this.f8343a.getValue();
        }
        z0.o("Check failed.");
        throw null;
    }
}
