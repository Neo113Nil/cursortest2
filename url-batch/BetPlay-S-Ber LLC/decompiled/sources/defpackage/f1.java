package defpackage;

import android.content.Context;
import android.view.View;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f1 extends lu {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ k1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var, Context context, v40 v40Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, v40Var, context, view, false);
        this.n = k1Var;
        if ((v40Var.A.x & 32) != 32) {
            View view2 = k1Var.n;
            this.f = view2 == null ? (View) k1Var.m : view2;
        }
        j1 j1Var = k1Var.B;
        this.i = j1Var;
        ju juVar = this.j;
        if (juVar != null) {
            juVar.e(j1Var);
        }
    }

    @Override // defpackage.lu
    public final void c() {
        int i = this.m;
        k1 k1Var = this.n;
        switch (i) {
            case 0:
                k1Var.y = null;
                super.c();
                break;
            default:
                au auVar = k1Var.h;
                if (auVar != null) {
                    auVar.c(true);
                }
                k1Var.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var, Context context, au auVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, auVar, context, view, true);
        this.n = k1Var;
        this.g = 8388613;
        j1 j1Var = k1Var.B;
        this.i = j1Var;
        ju juVar = this.j;
        if (juVar != null) {
            juVar.e(j1Var);
        }
    }
}
