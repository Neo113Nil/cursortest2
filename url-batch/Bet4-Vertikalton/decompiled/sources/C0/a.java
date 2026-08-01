package C0;

import android.content.Context;
import com.playbag.tripgear.R;
import m.C0260a;
import w1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f128f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f130b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f132e;

    public a(Context context) {
        boolean f02 = d.f0(context, R.attr.elevationOverlayEnabled, false);
        int i = C0260a.i(context, R.attr.elevationOverlayColor, 0);
        int i2 = C0260a.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i3 = C0260a.i(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f129a = f02;
        this.f130b = i;
        this.f131c = i2;
        this.d = i3;
        this.f132e = f2;
    }
}
