package androidx.compose.ui.graphics;

import U.p;
import b0.C0346o;
import e2.InterfaceC0424c;
import f2.j;
import t0.AbstractC0993f;
import t0.U;
import t0.b0;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4909a;

    public BlockGraphicsLayerElement(InterfaceC0424c interfaceC0424c) {
        this.f4909a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && j.a(this.f4909a, ((BlockGraphicsLayerElement) obj).f4909a);
    }

    public final int hashCode() {
        return this.f4909a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        return new C0346o(this.f4909a);
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0346o c0346o = (C0346o) pVar;
        c0346o.f5428q = this.f4909a;
        b0 b0Var = AbstractC0993f.r(c0346o, 2).f8712p;
        if (b0Var != null) {
            b0Var.f1(c0346o.f5428q, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f4909a + ')';
    }
}
