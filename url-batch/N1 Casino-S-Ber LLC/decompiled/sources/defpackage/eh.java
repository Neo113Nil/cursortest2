package defpackage;

import android.content.Context;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class eh {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public eh(Context context) {
        boolean J = zo.J(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer t = jw.t(context, R.attr.elevationOverlayColor);
        int intValue = t != null ? t.intValue() : 0;
        Integer t2 = jw.t(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = t2 != null ? t2.intValue() : 0;
        Integer t3 = jw.t(context, R.attr.colorSurface);
        int intValue3 = t3 != null ? t3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = J;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }
}
