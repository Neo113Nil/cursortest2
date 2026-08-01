package defpackage;

import android.content.Context;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class wg {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public wg(Context context) {
        boolean Q = l70.Q(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer p = j8.p(context, R.attr.elevationOverlayColor);
        int intValue = p != null ? p.intValue() : 0;
        Integer p2 = j8.p(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = p2 != null ? p2.intValue() : 0;
        Integer p3 = j8.p(context, R.attr.colorSurface);
        int intValue3 = p3 != null ? p3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = Q;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }
}
