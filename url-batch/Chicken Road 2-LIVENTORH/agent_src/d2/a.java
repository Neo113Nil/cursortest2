package d2;

import a.y;
import android.content.Context;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1121f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1124c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1125e;

    public a(Context context) {
        boolean b02 = h.a.b0(context, R.attr.elevationOverlayEnabled, false);
        int z3 = y.z(context, R.attr.elevationOverlayColor, 0);
        int z4 = y.z(context, R.attr.elevationOverlayAccentColor, 0);
        int z5 = y.z(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1122a = b02;
        this.f1123b = z3;
        this.f1124c = z4;
        this.d = z5;
        this.f1125e = f2;
    }
}
