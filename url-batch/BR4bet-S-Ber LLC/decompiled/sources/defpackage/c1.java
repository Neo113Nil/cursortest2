package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c1 extends km {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.km
    public final s50 b() {
        e1 e1Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                d1 d1Var = ((ActionMenuItemView) view).r;
                if (d1Var == null || (e1Var = ((f1) d1Var).a.y) == null) {
                    return null;
                }
                return e1Var.a();
            default:
                e1 e1Var2 = ((h1) view).i.x;
                if (e1Var2 == null) {
                    return null;
                }
                return e1Var2.a();
        }
    }

    @Override // defpackage.km
    public final boolean c() {
        s50 b;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                lw lwVar = actionMenuItemView.p;
                if (lwVar == null || !lwVar.a(actionMenuItemView.m) || (b = b()) == null || !b.b()) {
                }
                break;
            default:
                ((h1) view).i.l();
                break;
        }
        return true;
    }

    @Override // defpackage.km
    public boolean d() {
        switch (this.o) {
            case 1:
                i1 i1Var = ((h1) this.p).i;
                if (i1Var.z != null) {
                    return false;
                }
                i1Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(h1 h1Var, h1 h1Var2) {
        super(h1Var2);
        this.p = h1Var;
    }
}
