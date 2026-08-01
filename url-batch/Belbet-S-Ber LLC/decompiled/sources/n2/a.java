package n2;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f2858j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2859k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f2860l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2861a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2862b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2863c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2864e;

    /* renamed from: f, reason: collision with root package name */
    public int f2865f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2866g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        this.f2861a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f2862b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f2863c = new Paint(paint2);
    }

    public final void a(int i4) {
        this.d = f0.a.d(i4, 68);
        this.f2864e = f0.a.d(i4, 20);
        this.f2865f = f0.a.d(i4, 0);
        this.f2861a.setColor(this.d);
    }
}
