package androidx.compose.foundation.layout;

import U.p;
import f2.j;
import r.C0851M;
import r.InterfaceC0849K;
import t0.U;

/* loaded from: classes.dex */
final class PaddingValuesElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0849K f4815a;

    public PaddingValuesElement(InterfaceC0849K interfaceC0849K) {
        this.f4815a = interfaceC0849K;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return j.a(this.f4815a, paddingValuesElement.f4815a);
    }

    public final int hashCode() {
        return this.f4815a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        C0851M c0851m = new C0851M();
        c0851m.f7983q = this.f4815a;
        return c0851m;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0851M) pVar).f7983q = this.f4815a;
    }
}
