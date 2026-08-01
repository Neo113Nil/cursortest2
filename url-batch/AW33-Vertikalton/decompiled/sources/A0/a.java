package A0;

import android.content.Context;
import com.luckycalc.loanfinance.R;
import i1.s;
import q1.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f0f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4e;

    public a(Context context) {
        boolean P2 = l.P(context, R.attr.elevationOverlayEnabled, false);
        int h = s.h(context, R.attr.elevationOverlayColor, 0);
        int h2 = s.h(context, R.attr.elevationOverlayAccentColor, 0);
        int h3 = s.h(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1a = P2;
        this.f2b = h;
        this.f3c = h2;
        this.d = h3;
        this.f4e = f2;
    }
}
