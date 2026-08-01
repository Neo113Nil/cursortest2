package defpackage;

import android.content.Context;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class tl {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public tl(Context context) {
        boolean K = n9.K(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer z = bi.z(context, R.attr.elevationOverlayColor);
        int intValue = z != null ? z.intValue() : 0;
        Integer z2 = bi.z(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = z2 != null ? z2.intValue() : 0;
        Integer z3 = bi.z(context, R.attr.colorSurface);
        int intValue3 = z3 != null ? z3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = K;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }
}
