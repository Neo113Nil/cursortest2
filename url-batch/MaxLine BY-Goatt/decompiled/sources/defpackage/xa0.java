package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xa0 extends iv {
    public final /* synthetic */ ya0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ya0 ya0Var) {
        super(1);
        this.o = ya0Var;
    }

    @Override // defpackage.iv
    public final c83 g(c83 c83Var, List list) {
        ya0 ya0Var = this.o;
        if (!ya0Var.x) {
            View childAt = ya0Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, ya0Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, ya0Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return c83Var.a.q(max, max2, max3, max4);
            }
        }
        return c83Var;
    }

    @Override // defpackage.iv
    public final tt1 h(i73 i73Var, tt1 tt1Var) {
        ya0 ya0Var = this.o;
        if (!ya0Var.x) {
            View childAt = ya0Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, ya0Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, ya0Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                z21 b = z21.b(max, max2, max3, max4);
                int i = b.a;
                z21 z21Var = (z21) tt1Var.n;
                int i2 = b.b;
                int i3 = b.c;
                int i4 = b.d;
                return new tt1(16, c83.a(z21Var, i, i2, i3, i4), c83.a((z21) tt1Var.o, i, i2, i3, i4));
            }
        }
        return tt1Var;
    }
}
