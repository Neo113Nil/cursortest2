package f1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y extends w {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f1535q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Context context) {
        super(context);
        this.f1535q = zVar;
    }

    @Override // f1.w
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // f1.w
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // f1.w
    public final void h(View view, w0 w0Var) {
        z zVar = this.f1535q;
        int[] a2 = zVar.a(zVar.f1548a.getLayoutManager(), view);
        int i = a2[0];
        int i4 = a2[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i4))) / 0.3356d);
        if (ceil > 0) {
            w0Var.f1529a = i;
            w0Var.f1530b = i4;
            w0Var.f1531c = ceil;
            w0Var.f1532e = this.f1522j;
            w0Var.f1533f = true;
        }
    }
}
