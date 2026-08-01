package defpackage;

import android.content.Context;
import android.view.View;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d1 extends wt {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ h1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(h1 h1Var, Context context, m40 m40Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, m40Var, context, view, false);
        this.n = h1Var;
        if ((m40Var.A.x & 32) != 32) {
            View view2 = h1Var.n;
            this.f = view2 == null ? (View) h1Var.m : view2;
        }
        k0 k0Var = h1Var.B;
        this.i = k0Var;
        ut utVar = this.j;
        if (utVar != null) {
            utVar.e(k0Var);
        }
    }

    @Override // defpackage.wt
    public final void c() {
        int i = this.m;
        h1 h1Var = this.n;
        switch (i) {
            case 0:
                h1Var.y = null;
                super.c();
                break;
            default:
                mt mtVar = h1Var.h;
                if (mtVar != null) {
                    mtVar.c(true);
                }
                h1Var.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(h1 h1Var, Context context, mt mtVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, mtVar, context, view, true);
        this.n = h1Var;
        this.g = 8388613;
        k0 k0Var = h1Var.B;
        this.i = k0Var;
        ut utVar = this.j;
        if (utVar != null) {
            utVar.e(k0Var);
        }
    }
}
