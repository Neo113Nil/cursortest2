package androidx.compose.ui.input.pointer;

import U.p;
import f2.u;
import n0.C0703a;
import n0.C0714l;
import n0.C0715m;
import t0.AbstractC0993f;
import t0.U;
import x.N;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4928a;

    public PointerHoverIconModifierElement(boolean z3) {
        this.f4928a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        pointerHoverIconModifierElement.getClass();
        C0703a c0703a = N.f9959b;
        return c0703a.equals(c0703a) && this.f4928a == pointerHoverIconModifierElement.f4928a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4928a) + (1008 * 31);
    }

    @Override // t0.U
    public final p l() {
        C0715m c0715m = new C0715m();
        c0715m.f7301q = this.f4928a;
        return c0715m;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0715m c0715m = (C0715m) pVar;
        c0715m.getClass();
        C0703a c0703a = N.f9959b;
        if (!c0703a.equals(c0703a) && c0715m.f7302r) {
            c0715m.z0();
        }
        boolean z3 = c0715m.f7301q;
        boolean z4 = this.f4928a;
        if (z3 != z4) {
            c0715m.f7301q = z4;
            if (z4) {
                if (c0715m.f7302r) {
                    c0715m.y0();
                    return;
                }
                return;
            }
            boolean z5 = c0715m.f7302r;
            if (z5 && z5) {
                if (!z4) {
                    u uVar = new u();
                    AbstractC0993f.x(c0715m, new C0714l(uVar, 1));
                    C0715m c0715m2 = (C0715m) uVar.f5832d;
                    if (c0715m2 != null) {
                        c0715m = c0715m2;
                    }
                }
                c0715m.y0();
            }
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + N.f9959b + ", overrideDescendants=" + this.f4928a + ')';
    }
}
