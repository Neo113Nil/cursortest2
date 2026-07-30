package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r3 extends zl0 implements be, j81, hc0, ad0, kj1 {
    public final a3 s = new a3(2, this);
    public final /* synthetic */ d4 t;

    public r3(d4 d4Var) {
        this.t = d4Var;
    }

    @Override // defpackage.hc0
    public final boolean K(KeyEvent keyEvent) {
        s00 s00Var;
        int[] iArr = y00.a;
        long a = xa0.a(keyEvent.getKeyCode());
        if (fc0.a(a, fc0.b)) {
            s00Var = new s00(2);
        } else if (fc0.a(a, fc0.c)) {
            s00Var = new s00(1);
        } else if (fc0.a(a, fc0.i)) {
            s00Var = new s00(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            s00Var = fc0.a(a, fc0.g) ? new s00(4) : fc0.a(a, fc0.f) ? new s00(3) : (fc0.a(a, fc0.d) || fc0.a(a, fc0.m)) ? new s00(5) : (fc0.a(a, fc0.e) || fc0.a(a, fc0.n)) ? new s00(6) : (fc0.a(a, fc0.h) || fc0.a(a, fc0.k) || fc0.a(a, fc0.o)) ? new s00(7) : (fc0.a(a, fc0.a) || fc0.a(a, fc0.l)) ? new s00(8) : null;
        }
        if (s00Var != null) {
            int i = s00Var.a;
            if (ka0.t(keyEvent) == 2) {
                d4 d4Var = this.t;
                o10 f = ((e10) d4Var.getFocusOwner()).f();
                if (f == null || !f.s || !d4Var.v(i)) {
                    Boolean e = ((e10) d4Var.getFocusOwner()).e(i, d4Var.getEmbeddedViewFocusRect(), new a3(1, s00Var));
                    if (!(e != null ? e.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer c = y00.c(i);
                            int intValue = c != null ? c.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = d4Var.getRootView();
                            rootView.getClass();
                            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, d4Var.getView(), intValue);
                            if (findNextFocus == null || findNextFocus.equals(d4Var)) {
                                return ((e10) d4Var.getFocusOwner()).g(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        zw0 c = qk0Var.c(j);
        int i = c.d;
        int i2 = c.e;
        q3 q3Var = new q3(c, 0);
        ov ovVar = ov.d;
        ovVar.getClass();
        return ej0Var.D(i, i2, ovVar, this.s, q3Var);
    }

    @Override // defpackage.be
    public final Object c0(qp0 qp0Var, w3 w3Var, sf1 sf1Var) {
        long M = qp0Var.M(0L);
        s11 s11Var = (s11) w3Var.invoke();
        s11 e = s11Var != null ? s11Var.e(M) : null;
        if (e != null) {
            this.t.requestRectangleOnScreen(new Rect((int) e.a, (int) e.b, (int) e.c, (int) e.d), false);
        }
        return Unit.a;
    }

    @Override // defpackage.kj1
    public final Object h() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
    }
}
