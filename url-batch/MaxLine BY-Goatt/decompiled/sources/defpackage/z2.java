package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z2 extends tq0 {
    public final /* synthetic */ int v = 0;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override // defpackage.tq0
    public final cl2 b() {
        b3 b3Var;
        int i = this.v;
        View view = this.w;
        switch (i) {
            case 0:
                a3 a3Var = ((ActionMenuItemView) view).y;
                if (a3Var == null || (b3Var = ((c3) a3Var).a.F) == null) {
                    return null;
                }
                return b3Var.a();
            default:
                b3 b3Var2 = ((d3) view).p.E;
                if (b3Var2 == null) {
                    return null;
                }
                return b3Var2.a();
        }
    }

    @Override // defpackage.tq0
    public final boolean c() {
        cl2 b;
        int i = this.v;
        View view = this.w;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                ek1 ek1Var = actionMenuItemView.w;
                if (ek1Var == null || !ek1Var.a(actionMenuItemView.t) || (b = b()) == null || !b.a()) {
                }
                break;
            default:
                ((d3) view).p.l();
                break;
        }
        return true;
    }

    @Override // defpackage.tq0
    public boolean d() {
        switch (this.v) {
            case 1:
                e3 e3Var = ((d3) this.w).p;
                if (e3Var.G != null) {
                    return false;
                }
                e3Var.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(d3 d3Var, d3 d3Var2) {
        super(d3Var2);
        this.w = d3Var;
    }
}
