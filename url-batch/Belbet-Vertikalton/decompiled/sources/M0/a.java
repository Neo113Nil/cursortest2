package M0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f805k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f806l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f807a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f808b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f810d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f811f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f812g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f813h;

    public a() {
        Paint paint = new Paint();
        this.f813h = paint;
        Paint paint2 = new Paint();
        this.f807a = paint2;
        this.f810d = E.a.d(-16777216, 68);
        this.e = E.a.d(-16777216, 20);
        this.f811f = E.a.d(-16777216, 0);
        paint2.setColor(this.f810d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f808b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f809c = new Paint(paint3);
    }
}
