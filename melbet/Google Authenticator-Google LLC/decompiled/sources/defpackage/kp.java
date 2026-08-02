package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kp extends ll {
    final /* synthetic */ kq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(kq kqVar, Context context) {
        super(context);
        this.a = kqVar;
    }

    @Override // defpackage.ll
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.ll
    protected final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.ll
    protected final void c(View view, lj ljVar) {
        kq kqVar = this.a;
        int[] d = kqVar.d(kqVar.a.m, view);
        int i = d[0];
        int i2 = d[1];
        int g = g(Math.max(Math.abs(i), Math.abs(i2)));
        if (g > 0) {
            ljVar.b(i, i2, g, this.j);
        }
    }
}
