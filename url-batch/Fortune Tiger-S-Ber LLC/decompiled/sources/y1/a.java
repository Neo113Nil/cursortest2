package y1;

import android.content.Context;
import com.gglhk.bofio.fortunetiger.R;
import k3.d;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f3612f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3614b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3615d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3616e;

    public a(Context context) {
        boolean Y = d.Y(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int h = g.h(context, R.attr.elevationOverlayColor, 0);
        int h4 = g.h(context, R.attr.elevationOverlayAccentColor, 0);
        int h5 = g.h(context, R.attr.colorSurface, 0);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3613a = Y;
        this.f3614b = h;
        this.c = h4;
        this.f3615d = h5;
        this.f3616e = f4;
    }
}
