package F0;

import android.content.Context;
import com.glasspulse.glasspulse.R;
import u1.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f166f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f169c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f170e;

    public a(Context context) {
        boolean e02 = l.e0(context, R.attr.elevationOverlayEnabled, false);
        int t2 = l.t(context, R.attr.elevationOverlayColor, 0);
        int t3 = l.t(context, R.attr.elevationOverlayAccentColor, 0);
        int t4 = l.t(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f167a = e02;
        this.f168b = t2;
        this.f169c = t3;
        this.d = t4;
        this.f170e = f2;
    }
}
