package d2;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends d1.k implements c2.x1, v1.b, c2.v, c2.c2 {
    public final a3.e C = new a3.e(5, this);
    public final /* synthetic */ v D;

    public l(v vVar) {
        this.D = vVar;
    }

    @Override // c2.c2
    public final Object d() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // v1.b
    public final boolean i(KeyEvent keyEvent) {
        i1.c cVar;
        int[] iArr = i1.d.f4590a;
        long e2 = cf.c.e(keyEvent.getKeyCode());
        boolean z10 = true;
        if (v1.a.a(e2, v1.a.f9934b)) {
            cVar = new i1.c(2);
        } else if (v1.a.a(e2, v1.a.f9935c)) {
            cVar = new i1.c(1);
        } else if (v1.a.a(e2, v1.a.f9940i)) {
            cVar = new i1.c(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            cVar = v1.a.a(e2, v1.a.g) ? new i1.c(4) : v1.a.a(e2, v1.a.f9938f) ? new i1.c(3) : (v1.a.a(e2, v1.a.f9936d) || v1.a.a(e2, v1.a.f9943m)) ? new i1.c(5) : (v1.a.a(e2, v1.a.f9937e) || v1.a.a(e2, v1.a.f9944n)) ? new i1.c(6) : (v1.a.a(e2, v1.a.f9939h) || v1.a.a(e2, v1.a.f9941k) || v1.a.a(e2, v1.a.f9945o)) ? new i1.c(7) : (v1.a.a(e2, v1.a.f9933a) || v1.a.a(e2, v1.a.f9942l)) ? new i1.c(8) : null;
        }
        if (cVar != null) {
            int i3 = cVar.f4589a;
            if (c6.f.K(keyEvent) == 2) {
                v vVar = this.D;
                i1.t f3 = ((i1.k) vVar.getFocusOwner()).f();
                if (f3 == null || !f3.C || !vVar.x(i3)) {
                    Boolean e9 = ((i1.k) vVar.getFocusOwner()).e(i3, vVar.getEmbeddedViewFocusRect(), new a3.e(4, cVar));
                    if (!(e9 != null ? e9.booleanValue() : true)) {
                        if (i3 != 1 && i3 != 2) {
                            z10 = false;
                        }
                        if (z10) {
                            Integer c10 = i1.d.c(i3);
                            int intValue = c10 != null ? c10.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = vVar.getRootView();
                            rootView.getClass();
                            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, vVar.getView(), intValue);
                            if (findNextFocus == null || findNextFocus.equals(vVar)) {
                                return ((i1.k) vVar.getFocusOwner()).g(i3);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // c2.v
    public final a2.h0 v(c2.o0 o0Var, a2.f0 f0Var, long j) {
        a2.o0 c10 = f0Var.c(j);
        int i3 = c10.f131d;
        int i10 = c10.f132e;
        a2.r0 r0Var = new a2.r0(c10, 1);
        kotlin.collections.k0 k0Var = kotlin.collections.k0.f5575d;
        k0Var.getClass();
        return o0Var.x(i3, i10, k0Var, this.C, r0Var);
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
    }
}
