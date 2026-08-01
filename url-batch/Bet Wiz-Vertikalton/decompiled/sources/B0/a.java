package B0;

import android.content.Context;
import com.neonpulse.gridlogic.R;
import k0.k;
import x1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f49f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f53e;

    public a(Context context) {
        boolean Y2 = d.Y(context, R.attr.elevationOverlayEnabled, false);
        int i = k.i(context, R.attr.elevationOverlayColor, 0);
        int i2 = k.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i3 = k.i(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f50a = Y2;
        this.f51b = i;
        this.f52c = i2;
        this.d = i3;
        this.f53e = f2;
    }
}
