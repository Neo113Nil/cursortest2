package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rz extends xs {
    public final /* synthetic */ sz q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(sz szVar, Context context) {
        super(context);
        this.q = szVar;
    }

    @Override // defpackage.xs
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.xs
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.xs
    public final void h(View view, l20 l20Var) {
        sz szVar = this.q;
        int[] a = szVar.a(szVar.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            l20Var.a = i;
            l20Var.b = i2;
            l20Var.c = ceil;
            l20Var.e = this.j;
            l20Var.f = true;
        }
    }
}
