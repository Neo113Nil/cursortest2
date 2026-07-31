package o2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class C0 extends t2.r implements InterfaceC3353s0, InterfaceC3320b0, InterfaceC3350q0 {

    /* renamed from: e, reason: collision with root package name */
    public D0 f41965e;

    @Override // o2.InterfaceC3350q0
    public I0 c() {
        return null;
    }

    @Override // o2.InterfaceC3320b0
    public void dispose() {
        u().C0(this);
    }

    @Override // o2.InterfaceC3350q0
    public boolean isActive() {
        return true;
    }

    @Override // t2.r
    public String toString() {
        return N.a(this) + '@' + N.b(this) + "[job@" + N.b(u()) + ']';
    }

    public final D0 u() {
        D0 d02 = this.f41965e;
        if (d02 != null) {
            return d02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void v(D0 d02) {
        this.f41965e = d02;
    }
}
