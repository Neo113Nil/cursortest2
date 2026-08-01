package G0;

import H1.l;
import a.AbstractC0058a;
import android.content.Context;
import android.graphics.Color;
import com.winpower.neonfit.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f333f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335b;

    /* renamed from: c, reason: collision with root package name */
    public final int f336c;

    /* renamed from: d, reason: collision with root package name */
    public final int f337d;
    public final float e;

    public a(Context context) {
        boolean W2 = AbstractC0058a.W(context, R.attr.elevationOverlayEnabled, false);
        int t2 = l.t(context, R.attr.elevationOverlayColor, 0);
        int t3 = l.t(context, R.attr.elevationOverlayAccentColor, 0);
        int t4 = l.t(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f334a = W2;
        this.f335b = t2;
        this.f336c = t3;
        this.f337d = t4;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.f334a || E.a.d(i, 255) != this.f337d) {
            return i;
        }
        float min = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int H = l.H(E.a.d(i, 255), this.f335b, min);
        if (min > 0.0f && (i2 = this.f336c) != 0) {
            H = E.a.b(E.a.d(i2, f333f), H);
        }
        return E.a.d(H, alpha);
    }
}
