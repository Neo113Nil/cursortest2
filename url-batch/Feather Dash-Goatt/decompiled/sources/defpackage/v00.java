package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v00 extends zl0 implements h10, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver s;
    public final u00 t = new u00(this, 0);
    public final u00 u = new u00(this, 1);

    @Override // defpackage.h10
    public final void J(f10 f10Var) {
        f10Var.d(false);
        f10Var.b(this.t);
        f10Var.a(this.u);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (op.I(this).s == null) {
            return;
        }
        View j = m90.j(this);
        b10 focusOwner = ((d4) op.J(this)).getFocusOwner();
        eu0 J = op.J(this);
        if (view != null && !view.equals(J)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == j.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(J)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == j.getParent()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            return;
        }
        if (!z2) {
            if (z && z0().E0().a()) {
                ((e10) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        o10 z0 = z0();
        int ordinal = z0.E0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return;
        }
        if (ordinal == 3) {
            la0.T(z0);
        } else {
            l.a();
        }
    }

    @Override // defpackage.zl0
    public final void r0() {
        ViewTreeObserver viewTreeObserver = m90.K(this).getViewTreeObserver();
        this.s = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.zl0
    public final void s0() {
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.s = null;
        m90.K(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final o10 z0() {
        if (!this.d.r) {
            o80.b("visitLocalDescendants called on an unattached node");
        }
        zl0 zl0Var = this.d;
        if ((zl0Var.h & 1024) != 0) {
            boolean z = false;
            for (zl0 zl0Var2 = zl0Var.j; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
                if ((zl0Var2.g & 1024) != 0) {
                    zl0 zl0Var3 = zl0Var2;
                    eo0 eo0Var = null;
                    while (zl0Var3 != null) {
                        if (zl0Var3 instanceof o10) {
                            o10 o10Var = (o10) zl0Var3;
                            if (z) {
                                return o10Var;
                            }
                            z = true;
                        } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                            int i = 0;
                            for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                if ((zl0Var4.g & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        zl0Var3 = zl0Var4;
                                    } else {
                                        if (eo0Var == null) {
                                            eo0Var = new eo0(new zl0[16]);
                                        }
                                        if (zl0Var3 != null) {
                                            eo0Var.b(zl0Var3);
                                            zl0Var3 = null;
                                        }
                                        eo0Var.b(zl0Var4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        zl0Var3 = op.o(eo0Var);
                    }
                }
            }
        }
        dd0.j("Could not find focus target of embedded view wrapper");
        return null;
    }
}
