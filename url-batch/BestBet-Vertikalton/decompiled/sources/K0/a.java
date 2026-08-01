package K0;

import H1.d;
import H1.l;
import android.content.Context;
import com.fortunequest.neontrack.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f678f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f681c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f682e;

    public a(Context context) {
        boolean e02 = d.e0(context, R.attr.elevationOverlayEnabled, false);
        int z2 = l.z(context, R.attr.elevationOverlayColor, 0);
        int z3 = l.z(context, R.attr.elevationOverlayAccentColor, 0);
        int z4 = l.z(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f679a = e02;
        this.f680b = z2;
        this.f681c = z3;
        this.d = z4;
        this.f682e = f2;
    }
}
