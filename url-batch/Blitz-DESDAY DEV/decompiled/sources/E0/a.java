package E0;

import android.content.Context;
import com.winfour.neondrop.R;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f183f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f184a;

    /* renamed from: b, reason: collision with root package name */
    public final int f185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f186c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f187e;

    public a(Context context) {
        boolean l02 = l.l0(context, R.attr.elevationOverlayEnabled, false);
        int s2 = d.s(context, R.attr.elevationOverlayColor, 0);
        int s3 = d.s(context, R.attr.elevationOverlayAccentColor, 0);
        int s4 = d.s(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f184a = l02;
        this.f185b = s2;
        this.f186c = s3;
        this.d = s4;
        this.f187e = f2;
    }
}
