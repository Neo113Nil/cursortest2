package O7;

import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class i0 extends B {

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5133d f2609x;

    public i0(InterfaceC5138i interfaceC5138i, E7.p pVar) {
        super(interfaceC5138i, false, 0);
        this.f2609x = w8.a.d(pVar, this, this);
    }

    @Override // O7.h0
    public final void P() {
        try {
            T7.a.h(q7.v.f40183a, w8.a.f(this.f2609x));
        } catch (Throwable th) {
            resumeWith(com.bumptech.glide.f.e(th));
            throw th;
        }
    }
}
