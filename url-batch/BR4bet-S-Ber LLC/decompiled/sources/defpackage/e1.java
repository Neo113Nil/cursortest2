package defpackage;

import android.content.Context;
import android.view.View;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e1 extends xw {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ i1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, Context context, p70 p70Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, p70Var, context, view, false);
        this.n = i1Var;
        if ((p70Var.A.x & 32) != 32) {
            View view2 = i1Var.n;
            this.f = view2 == null ? (View) i1Var.m : view2;
        }
        rc0 rc0Var = i1Var.B;
        this.i = rc0Var;
        vw vwVar = this.j;
        if (vwVar != null) {
            vwVar.e(rc0Var);
        }
    }

    @Override // defpackage.xw
    public final void c() {
        int i = this.m;
        i1 i1Var = this.n;
        switch (i) {
            case 0:
                i1Var.y = null;
                super.c();
                break;
            default:
                mw mwVar = i1Var.h;
                if (mwVar != null) {
                    mwVar.c(true);
                }
                i1Var.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, Context context, mw mwVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, mwVar, context, view, true);
        this.n = i1Var;
        this.g = 8388613;
        rc0 rc0Var = i1Var.B;
        this.i = rc0Var;
        vw vwVar = this.j;
        if (vwVar != null) {
            vwVar.e(rc0Var);
        }
    }
}
