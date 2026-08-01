package e2;

import android.content.Context;
import b4.d;
import b4.l;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1384f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1386b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1387c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1388e;

    public a(Context context) {
        boolean P = d.P(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer q4 = l.q(context, R.attr.elevationOverlayColor);
        int intValue = q4 != null ? q4.intValue() : 0;
        Integer q5 = l.q(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = q5 != null ? q5.intValue() : 0;
        Integer q6 = l.q(context, R.attr.colorSurface);
        int intValue3 = q6 != null ? q6.intValue() : 0;
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f1385a = P;
        this.f1386b = intValue;
        this.f1387c = intValue2;
        this.d = intValue3;
        this.f1388e = f5;
    }
}
