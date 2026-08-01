package D0;

import A1.d;
import A1.m;
import android.content.Context;
import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.winrandom.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f135f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f137b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f139e;

    public a(Context context) {
        boolean Y2 = m.Y(context, R.attr.elevationOverlayEnabled, false);
        int A2 = d.A(context, R.attr.elevationOverlayColor, 0);
        int A3 = d.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A4 = d.A(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f136a = Y2;
        this.f137b = A2;
        this.f138c = A3;
        this.d = A4;
        this.f139e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.f136a || D.a.d(i, 255) != this.d) {
            return i;
        }
        float min = (this.f139e <= RecyclerView.A0 || f2 <= RecyclerView.A0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int S2 = d.S(D.a.d(i, 255), this.f137b, min);
        if (min > RecyclerView.A0 && (i2 = this.f138c) != 0) {
            S2 = D.a.b(D.a.d(i2, f135f), S2);
        }
        return D.a.d(S2, alpha);
    }
}
