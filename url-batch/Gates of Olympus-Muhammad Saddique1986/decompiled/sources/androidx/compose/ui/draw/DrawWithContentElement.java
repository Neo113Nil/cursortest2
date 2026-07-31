package androidx.compose.ui.draw;

import U.p;
import Y.f;
import e2.InterfaceC0424c;
import f2.j;
import t0.U;

/* loaded from: classes.dex */
final class DrawWithContentElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4884a;

    public DrawWithContentElement(InterfaceC0424c interfaceC0424c) {
        this.f4884a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && j.a(this.f4884a, ((DrawWithContentElement) obj).f4884a);
    }

    public final int hashCode() {
        return this.f4884a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        f fVar = new f();
        fVar.f4654q = this.f4884a;
        return fVar;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((f) pVar).f4654q = this.f4884a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f4884a + ')';
    }
}
