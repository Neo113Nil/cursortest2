package H5;

import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import q5.AbstractC0605a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class h0 extends m0 {

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0564d f1083i;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(InterfaceC0569i interfaceC0569i, InterfaceC0747p interfaceC0747p) {
        super(interfaceC0569i, false);
        this.f1083i = ((AbstractC0605a) interfaceC0747p).create(this, this);
    }

    @Override // H5.g0
    public final void O() {
        try {
            M5.a.h(k5.v.f5219a, AbstractC0676f.m(this.f1083i));
        } catch (Throwable th) {
            resumeWith(AbstractC0676f.f(th));
            throw th;
        }
    }
}
