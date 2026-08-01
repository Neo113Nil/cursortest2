package g1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l0 extends h0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m0 f1711q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Context context) {
        super(context);
        this.f1711q = m0Var;
    }

    @Override // g1.h0
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // g1.h0
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // g1.h0
    public final void h(View view, k1 k1Var) {
        m0 m0Var = this.f1711q;
        int[] a5 = m0Var.a(m0Var.f1717a.getLayoutManager(), view);
        int i = a5[0];
        int i4 = a5[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i4))) / 0.3356d);
        if (ceil > 0) {
            k1Var.f1701a = i;
            k1Var.f1702b = i4;
            k1Var.f1703c = ceil;
            k1Var.f1704e = this.f1681j;
            k1Var.f1705f = true;
        }
    }
}
