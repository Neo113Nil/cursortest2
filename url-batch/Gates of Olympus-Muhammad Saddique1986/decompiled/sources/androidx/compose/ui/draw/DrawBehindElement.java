package androidx.compose.ui.draw;

import U.p;
import Y.d;
import e2.InterfaceC0424c;
import f2.j;
import t0.U;

/* loaded from: classes.dex */
final class DrawBehindElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4882a;

    public DrawBehindElement(InterfaceC0424c interfaceC0424c) {
        this.f4882a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && j.a(this.f4882a, ((DrawBehindElement) obj).f4882a);
    }

    public final int hashCode() {
        return this.f4882a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        d dVar = new d();
        dVar.f4653q = this.f4882a;
        return dVar;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((d) pVar).f4653q = this.f4882a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f4882a + ')';
    }
}
