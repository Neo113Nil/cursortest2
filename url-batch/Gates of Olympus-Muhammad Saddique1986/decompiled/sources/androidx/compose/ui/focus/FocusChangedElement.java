package androidx.compose.ui.focus;

import U.p;
import e2.InterfaceC0424c;
import f2.j;
import t0.U;

/* loaded from: classes.dex */
final class FocusChangedElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4895a;

    public FocusChangedElement(InterfaceC0424c interfaceC0424c) {
        this.f4895a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && j.a(this.f4895a, ((FocusChangedElement) obj).f4895a);
    }

    public final int hashCode() {
        return this.f4895a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        Z.a aVar = new Z.a();
        aVar.f4664q = this.f4895a;
        return aVar;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((Z.a) pVar).f4664q = this.f4895a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f4895a + ')';
    }
}
