package x3;

import o3.InterfaceC1339l;

/* renamed from: x3.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540O implements P {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1339l f16003a;

    public C1540O(InterfaceC1339l interfaceC1339l) {
        this.f16003a = interfaceC1339l;
    }

    @Override // x3.P
    public final void d(Throwable th) {
        this.f16003a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f16003a.getClass().getSimpleName() + '@' + AbstractC1562w.c(this) + ']';
    }
}
