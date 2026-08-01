package defpackage;

import android.content.Context;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class fj {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public fj(Context context) {
        boolean L = b9.L(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer p = xf.p(context, R.attr.elevationOverlayColor);
        int intValue = p != null ? p.intValue() : 0;
        Integer p2 = xf.p(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = p2 != null ? p2.intValue() : 0;
        Integer p3 = xf.p(context, R.attr.colorSurface);
        int intValue3 = p3 != null ? p3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = L;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }
}
