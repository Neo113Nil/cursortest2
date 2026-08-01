package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class b1 extends gk {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.gk
    public final q20 b() {
        d1 d1Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                c1 c1Var = ((ActionMenuItemView) view).r;
                if (c1Var == null || (d1Var = ((e1) c1Var).a.y) == null) {
                    return null;
                }
                return d1Var.a();
            default:
                d1 d1Var2 = ((g1) view).i.x;
                if (d1Var2 == null) {
                    return null;
                }
                return d1Var2.a();
        }
    }

    @Override // defpackage.gk
    public final boolean c() {
        q20 b;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                lt ltVar = actionMenuItemView.p;
                if (ltVar == null || !ltVar.a(actionMenuItemView.m) || (b = b()) == null || !b.b()) {
                }
                break;
            default:
                ((g1) view).i.l();
                break;
        }
        return true;
    }

    @Override // defpackage.gk
    public boolean d() {
        switch (this.o) {
            case 1:
                h1 h1Var = ((g1) this.p).i;
                if (h1Var.z != null) {
                    return false;
                }
                h1Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(g1 g1Var, g1 g1Var2) {
        super(g1Var2);
        this.p = g1Var;
    }
}
