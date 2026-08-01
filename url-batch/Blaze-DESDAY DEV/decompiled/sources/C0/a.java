package C0;

import android.content.Context;
import com.winworm.neongrid.R;
import k0.AbstractC0180a;
import z1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f92f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f96e;

    public a(Context context) {
        boolean g02 = d.g0(context, R.attr.elevationOverlayEnabled, false);
        int h = AbstractC0180a.h(context, R.attr.elevationOverlayColor, 0);
        int h2 = AbstractC0180a.h(context, R.attr.elevationOverlayAccentColor, 0);
        int h3 = AbstractC0180a.h(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f93a = g02;
        this.f94b = h;
        this.f95c = h2;
        this.d = h3;
        this.f96e = f2;
    }
}
