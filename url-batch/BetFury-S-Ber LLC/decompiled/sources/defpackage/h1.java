package defpackage;

import android.content.Context;
import android.view.View;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class h1 extends b20 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ l1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l1 l1Var, Context context, wf0 wf0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, wf0Var, context, view, false);
        this.n = l1Var;
        if ((wf0Var.A.x & 32) != 32) {
            View view2 = l1Var.n;
            this.f = view2 == null ? (View) l1Var.m : view2;
        }
        o0 o0Var = l1Var.B;
        this.i = o0Var;
        z10 z10Var = this.j;
        if (z10Var != null) {
            z10Var.e(o0Var);
        }
    }

    @Override // defpackage.b20
    public final void c() {
        int i = this.m;
        l1 l1Var = this.n;
        switch (i) {
            case 0:
                l1Var.y = null;
                super.c();
                break;
            default:
                r10 r10Var = l1Var.h;
                if (r10Var != null) {
                    r10Var.c(true);
                }
                l1Var.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l1 l1Var, Context context, r10 r10Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, r10Var, context, view, true);
        this.n = l1Var;
        this.g = 8388613;
        o0 o0Var = l1Var.B;
        this.i = o0Var;
        z10 z10Var = this.j;
        if (z10Var != null) {
            z10Var.e(o0Var);
        }
    }
}
