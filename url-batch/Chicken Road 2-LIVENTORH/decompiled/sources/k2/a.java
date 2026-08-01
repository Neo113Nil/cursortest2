package k2;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f2230j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2231k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f2232l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2233a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2234b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2235c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2236e;

    /* renamed from: f, reason: collision with root package name */
    public int f2237f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2238g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f2239h;

    public a() {
        Paint paint = new Paint();
        this.f2239h = paint;
        this.f2233a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f2234b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f2235c = new Paint(paint2);
    }

    public final void a(int i4) {
        this.d = f0.a.d(i4, 68);
        this.f2236e = f0.a.d(i4, 20);
        this.f2237f = f0.a.d(i4, 0);
        this.f2233a.setColor(this.d);
    }
}
