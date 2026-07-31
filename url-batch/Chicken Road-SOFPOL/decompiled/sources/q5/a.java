package q5;

import android.content.Context;
import android.util.TypedValue;
import com.snovikpovik.vuevnxsj.R;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f6175f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6179d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6180e;

    public a(Context context) {
        TypedValue P = r.P(context, R.attr.elevationOverlayEnabled);
        boolean z3 = (P == null || P.type != 18 || P.data == 0) ? false : true;
        int A = h0.a.A(context, R.attr.elevationOverlayColor, 0);
        int A2 = h0.a.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A3 = h0.a.A(context, R.attr.colorSurface, 0);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f6176a = z3;
        this.f6177b = A;
        this.f6178c = A2;
        this.f6179d = A3;
        this.f6180e = f6;
    }
}
