package B0;

import android.content.Context;
import com.playgen.securelock.R;
import k0.k;
import u1.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f51f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f55e;

    public a(Context context) {
        boolean T2 = l.T(context, R.attr.elevationOverlayEnabled, false);
        int i = k.i(context, R.attr.elevationOverlayColor, 0);
        int i2 = k.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i3 = k.i(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f52a = T2;
        this.f53b = i;
        this.f54c = i2;
        this.d = i3;
        this.f55e = f2;
    }
}
