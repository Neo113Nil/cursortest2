package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f1 extends rp {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.rp
    public final vd0 b() {
        h1 h1Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                g1 g1Var = ((ActionMenuItemView) view).r;
                if (g1Var == null || (h1Var = ((i1) g1Var).a.y) == null) {
                    return null;
                }
                return h1Var.a();
            default:
                h1 h1Var2 = ((k1) view).i.x;
                if (h1Var2 == null) {
                    return null;
                }
                return h1Var2.a();
        }
    }

    @Override // defpackage.rp
    public final boolean c() {
        vd0 b;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                q10 q10Var = actionMenuItemView.p;
                if (q10Var == null || !q10Var.a(actionMenuItemView.m) || (b = b()) == null || !b.b()) {
                }
                break;
            default:
                ((k1) view).i.l();
                break;
        }
        return true;
    }

    @Override // defpackage.rp
    public boolean d() {
        switch (this.o) {
            case 1:
                l1 l1Var = ((k1) this.p).i;
                if (l1Var.z != null) {
                    return false;
                }
                l1Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var, k1 k1Var2) {
        super(k1Var2);
        this.p = k1Var;
    }
}
