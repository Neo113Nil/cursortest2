package A0;

import android.content.Context;
import com.luckyarcade.spinthrow.R;
import i1.r;
import q1.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f0f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5e;

    public a(Context context) {
        boolean e02 = l.e0(context, R.attr.elevationOverlayEnabled, false);
        int g2 = r.g(context, R.attr.elevationOverlayColor, 0);
        int g3 = r.g(context, R.attr.elevationOverlayAccentColor, 0);
        int g4 = r.g(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1a = e02;
        this.f2b = g2;
        this.f3c = g3;
        this.f4d = g4;
        this.f5e = f2;
    }
}
