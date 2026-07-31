package androidx.compose.foundation.layout;

import U.k;
import Z1.i;
import r.C0798J;
import r.InterfaceC0796H;
import t0.T;

/* loaded from: classes.dex */
final class PaddingValuesElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0796H f3636a;

    public PaddingValuesElement(InterfaceC0796H interfaceC0796H) {
        this.f3636a = interfaceC0796H;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return i.a(this.f3636a, paddingValuesElement.f3636a);
    }

    @Override // t0.T
    public final k h() {
        C0798J c0798j = new C0798J();
        c0798j.f7010q = this.f3636a;
        return c0798j;
    }

    public final int hashCode() {
        return this.f3636a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0798J) kVar).f7010q = this.f3636a;
    }
}
