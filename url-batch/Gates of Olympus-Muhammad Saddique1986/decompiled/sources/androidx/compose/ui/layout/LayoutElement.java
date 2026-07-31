package androidx.compose.ui.layout;

import U.p;
import e2.InterfaceC0427f;
import f2.j;
import r0.C0922s;
import t0.U;

/* loaded from: classes.dex */
final class LayoutElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0427f f4933a;

    public LayoutElement(InterfaceC0427f interfaceC0427f) {
        this.f4933a = interfaceC0427f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && j.a(this.f4933a, ((LayoutElement) obj).f4933a);
    }

    public final int hashCode() {
        return this.f4933a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        C0922s c0922s = new C0922s();
        c0922s.f8172q = this.f4933a;
        return c0922s;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0922s) pVar).f8172q = this.f4933a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f4933a + ')';
    }
}
