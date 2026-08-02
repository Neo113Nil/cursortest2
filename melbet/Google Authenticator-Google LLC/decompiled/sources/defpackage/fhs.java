package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhs {
    private static final int b = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    private final int c;
    private final int d;
    private final int e;
    private final float f;

    public fhs(Context context) {
        boolean m = fny.m(context, R.attr.elevationOverlayEnabled, false);
        int d = fhq.d(context, R.attr.elevationOverlayColor, 0);
        int d2 = fhq.d(context, R.attr.elevationOverlayAccentColor, 0);
        int d3 = fhq.d(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = m;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float min = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int e = fhq.e(va.c(i, 255), this.c, min);
        if (min > 0.0f && (i2 = this.d) != 0) {
            e = va.b(va.c(i2, b), e);
        }
        return va.c(e, alpha);
    }

    public final int b(int i, float f) {
        return (this.a && va.c(i, 255) == this.e) ? a(i, f) : i;
    }
}
