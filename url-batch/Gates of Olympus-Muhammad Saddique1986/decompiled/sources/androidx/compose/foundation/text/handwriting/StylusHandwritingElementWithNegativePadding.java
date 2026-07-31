package androidx.compose.foundation.text.handwriting;

import U.p;
import e2.InterfaceC0422a;
import f2.j;
import t0.U;
import y.C1229c;

/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0422a f4858a;

    public StylusHandwritingElementWithNegativePadding(InterfaceC0422a interfaceC0422a) {
        this.f4858a = interfaceC0422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && j.a(this.f4858a, ((StylusHandwritingElementWithNegativePadding) obj).f4858a);
    }

    public final int hashCode() {
        return this.f4858a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        return new C1229c(this.f4858a);
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C1229c) pVar).f10374s = this.f4858a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f4858a + ')';
    }
}
