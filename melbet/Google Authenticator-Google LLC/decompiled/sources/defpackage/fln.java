package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fln extends flb {
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;

    public fln(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a = fjw.a(context, attributeSet, fmh.b, i, i2, new int[0]);
        this.q = a.getInt(0, 0);
        int c = fny.c(context, a, 4, dimensionPixelSize);
        int i3 = this.a;
        this.r = Math.max(c, i3 + i3);
        this.s = fny.c(context, a, 3, dimensionPixelSize2);
        this.t = a.getInt(2, 0);
        this.u = a.getBoolean(1, true);
        a.recycle();
        b();
    }
}
