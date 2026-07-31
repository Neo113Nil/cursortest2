package androidx.compose.ui.input.rotary;

import U.k;
import Z1.i;
import p0.C0760a;
import t0.T;
import u0.C0984m;

/* loaded from: classes.dex */
final class RotaryInputElement extends T {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C0984m.f8365h;
        return obj2.equals(obj2) && i.a(null, null);
    }

    @Override // t0.T
    public final k h() {
        C0760a c0760a = new C0760a();
        c0760a.f6753q = C0984m.f8365h;
        return c0760a;
    }

    public final int hashCode() {
        return C0984m.f8365h.hashCode() * 31;
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0760a) kVar).f6753q = C0984m.f8365h;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C0984m.f8365h + ", onPreRotaryScrollEvent=null)";
    }
}
