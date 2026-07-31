package androidx.compose.ui.focus;

import U.p;
import Z.i;
import Z.m;
import Z.o;
import f2.j;
import t0.U;

/* loaded from: classes.dex */
final class FocusPropertiesElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final m f4897a;

    public FocusPropertiesElement(m mVar) {
        this.f4897a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && j.a(this.f4897a, ((FocusPropertiesElement) obj).f4897a);
    }

    public final int hashCode() {
        return i.f4678f.hashCode();
    }

    @Override // t0.U
    public final p l() {
        o oVar = new o();
        oVar.f4697q = this.f4897a;
        return oVar;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((o) pVar).f4697q = this.f4897a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f4897a + ')';
    }
}
