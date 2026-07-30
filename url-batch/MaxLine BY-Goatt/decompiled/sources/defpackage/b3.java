package defpackage;

import android.content.Context;
import android.view.View;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b3 extends tk1 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ e3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(e3 e3Var, Context context, cq2 cq2Var, View view) {
        super(context, cq2Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = e3Var;
        if ((cq2Var.A.x & 32) != 32) {
            View view2 = e3Var.u;
            this.e = view2 == null ? (View) e3Var.t : view2;
        }
        ar0 ar0Var = e3Var.I;
        this.h = ar0Var;
        rk1 rk1Var = this.i;
        if (rk1Var != null) {
            rk1Var.e(ar0Var);
        }
    }

    @Override // defpackage.tk1
    public final void c() {
        int i = this.l;
        e3 e3Var = this.m;
        switch (i) {
            case 0:
                e3Var.F = null;
                super.c();
                break;
            default:
                fk1 fk1Var = e3Var.o;
                if (fk1Var != null) {
                    fk1Var.c(true);
                }
                e3Var.E = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(e3 e3Var, Context context, fk1 fk1Var, View view) {
        super(context, fk1Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = e3Var;
        this.f = 8388613;
        ar0 ar0Var = e3Var.I;
        this.h = ar0Var;
        rk1 rk1Var = this.i;
        if (rk1Var != null) {
            rk1Var.e(ar0Var);
        }
    }
}
