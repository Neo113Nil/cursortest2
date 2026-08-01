package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nw extends jq {
    public final /* synthetic */ ow q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ow owVar, Context context) {
        super(context);
        this.q = owVar;
    }

    @Override // defpackage.jq
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.jq
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.jq
    public final void h(View view, iz izVar) {
        ow owVar = this.q;
        int[] a = owVar.a(owVar.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            izVar.a = i;
            izVar.b = i2;
            izVar.c = ceil;
            izVar.e = this.j;
            izVar.f = true;
        }
    }
}
