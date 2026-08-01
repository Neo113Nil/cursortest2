package b1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z extends x {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a0 f955q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Context context) {
        super(context);
        this.f955q = a0Var;
    }

    @Override // b1.x
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // b1.x
    public final int e(int i4) {
        return Math.min(100, super.e(i4));
    }

    @Override // b1.x
    public final void h(View view, x0 x0Var) {
        a0 a0Var = this.f955q;
        int[] a4 = a0Var.a(a0Var.f729a.getLayoutManager(), view);
        int i4 = a4[0];
        int i5 = a4[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i4), Math.abs(i5))) / 0.3356d);
        if (ceil > 0) {
            x0Var.f949a = i4;
            x0Var.f950b = i5;
            x0Var.c = ceil;
            x0Var.f952e = this.f942j;
            x0Var.f953f = true;
        }
    }
}
