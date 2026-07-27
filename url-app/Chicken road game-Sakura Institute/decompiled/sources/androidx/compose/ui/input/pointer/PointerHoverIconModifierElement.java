package androidx.compose.ui.input.pointer;

import M2.E;
import S.n;
import kotlin.Metadata;
import l0.C0803a;
import l0.C0814l;
import l0.C0815m;
import r0.AbstractC1065f;
import r0.T;
import w.M;

@Metadata
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5203a;

    public PointerHoverIconModifierElement(boolean z4) {
        this.f5203a = z4;
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
        C0803a c0803a = M.f11038b;
        return c0803a.equals(c0803a) && this.f5203a == pointerHoverIconModifierElement.f5203a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5203a) + (1008 * 31);
    }

    @Override // r0.T
    public final n l() {
        C0815m c0815m = new C0815m();
        c0815m.f7916t = this.f5203a;
        return c0815m;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0815m c0815m = (C0815m) nVar;
        c0815m.getClass();
        C0803a c0803a = M.f11038b;
        if (!c0803a.equals(c0803a) && c0815m.f7917u) {
            c0815m.C0();
        }
        boolean z4 = c0815m.f7916t;
        boolean z5 = this.f5203a;
        if (z4 != z5) {
            c0815m.f7916t = z5;
            if (z5) {
                if (c0815m.f7917u) {
                    c0815m.B0();
                    return;
                }
                return;
            }
            boolean z6 = c0815m.f7917u;
            if (z6 && z6) {
                if (!z5) {
                    E e4 = new E();
                    AbstractC1065f.z(c0815m, new C0814l(e4, 1));
                    C0815m c0815m2 = (C0815m) e4.f3580d;
                    if (c0815m2 != null) {
                        c0815m = c0815m2;
                    }
                }
                c0815m.B0();
            }
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + M.f11038b + ", overrideDescendants=" + this.f5203a + ')';
    }
}
