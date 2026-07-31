package androidx.compose.ui.input.rotary;

import U.p;
import f2.j;
import p0.C0800a;
import t0.U;
import u0.C1112m;

/* loaded from: classes.dex */
final class RotaryInputElement extends U {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C1112m.f9401h;
        return obj2.equals(obj2) && j.a(null, null);
    }

    public final int hashCode() {
        return C1112m.f9401h.hashCode() * 31;
    }

    @Override // t0.U
    public final p l() {
        C0800a c0800a = new C0800a();
        c0800a.f7817q = C1112m.f9401h;
        return c0800a;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0800a) pVar).f7817q = C1112m.f9401h;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C1112m.f9401h + ", onPreRotaryScrollEvent=null)";
    }
}
