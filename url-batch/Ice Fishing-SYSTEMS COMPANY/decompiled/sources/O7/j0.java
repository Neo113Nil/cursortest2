package O7;

import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class j0 extends B {

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5133d f2610x;

    public j0(InterfaceC5138i interfaceC5138i, E7.p pVar) {
        super(interfaceC5138i, false, 1);
        this.f2610x = w8.a.d(pVar, this, this);
    }

    @Override // O7.h0
    public final void P() {
        try {
            T7.a.h(q7.v.f40183a, w8.a.f(this.f2610x));
        } catch (Throwable th) {
            resumeWith(com.bumptech.glide.f.e(th));
            throw th;
        }
    }
}
