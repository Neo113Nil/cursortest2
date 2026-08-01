package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d1 extends bk {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.bk
    public final b30 b() {
        f1 f1Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                e1 e1Var = ((ActionMenuItemView) view).r;
                if (e1Var == null || (f1Var = ((g1) e1Var).a.y) == null) {
                    return null;
                }
                return f1Var.a();
            default:
                f1 f1Var2 = ((i1) view).f.x;
                if (f1Var2 == null) {
                    return null;
                }
                return f1Var2.a();
        }
    }

    @Override // defpackage.bk
    public final boolean c() {
        b30 b;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                zt ztVar = actionMenuItemView.p;
                if (ztVar == null || !ztVar.a(actionMenuItemView.m) || (b = b()) == null || !b.b()) {
                }
                break;
            default:
                ((i1) view).f.l();
                break;
        }
        return true;
    }

    @Override // defpackage.bk
    public boolean d() {
        switch (this.o) {
            case 1:
                k1 k1Var = ((i1) this.p).f;
                if (k1Var.z != null) {
                    return false;
                }
                k1Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(i1 i1Var, i1 i1Var2) {
        super(i1Var2);
        this.p = i1Var;
    }
}
