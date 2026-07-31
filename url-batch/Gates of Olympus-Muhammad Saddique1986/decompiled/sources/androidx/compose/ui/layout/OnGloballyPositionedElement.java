package androidx.compose.ui.layout;

import U.p;
import e2.InterfaceC0424c;
import r0.C0889K;
import t0.U;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4935a;

    public OnGloballyPositionedElement(InterfaceC0424c interfaceC0424c) {
        this.f4935a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f4935a == ((OnGloballyPositionedElement) obj).f4935a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4935a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        C0889K c0889k = new C0889K();
        c0889k.f8121q = this.f4935a;
        return c0889k;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0889K) pVar).f8121q = this.f4935a;
    }
}
