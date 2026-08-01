package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class i50 extends wx {
    public final /* synthetic */ j50 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(j50 j50Var, Context context) {
        super(context);
        this.q = j50Var;
    }

    @Override // defpackage.wx
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.wx
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.wx
    public final void h(View view, s80 s80Var) {
        j50 j50Var = this.q;
        int[] a = j50Var.a(j50Var.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            s80Var.a = i;
            s80Var.b = i2;
            s80Var.c = ceil;
            s80Var.e = this.j;
            s80Var.f = true;
        }
    }
}
