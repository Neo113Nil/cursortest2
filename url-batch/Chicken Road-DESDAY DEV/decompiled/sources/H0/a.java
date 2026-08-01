package H0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f230j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f231k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f232l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f233a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f234b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f235c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f237f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f238g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f233a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f236e = C.a.d(-16777216, 20);
        this.f237f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f234b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f235c = new Paint(paint3);
    }
}
