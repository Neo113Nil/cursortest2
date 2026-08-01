package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ax extends wq {
    public final /* synthetic */ bx q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(bx bxVar, Context context) {
        super(context);
        this.q = bxVar;
    }

    @Override // defpackage.wq
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.wq
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.wq
    public final void h(View view, xz xzVar) {
        bx bxVar = this.q;
        int[] a = bxVar.a(bxVar.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            xzVar.a = i;
            xzVar.b = i2;
            xzVar.c = ceil;
            xzVar.e = this.j;
            xzVar.f = true;
        }
    }
}
