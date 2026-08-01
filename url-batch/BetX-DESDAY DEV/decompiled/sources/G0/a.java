package G0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f204j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f205k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f206l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f207a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f208b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f210d;

    /* renamed from: e, reason: collision with root package name */
    public final int f211e;

    /* renamed from: f, reason: collision with root package name */
    public final int f212f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f213g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f207a = paint2;
        this.f210d = C.a.d(-16777216, 68);
        this.f211e = C.a.d(-16777216, 20);
        this.f212f = C.a.d(-16777216, 0);
        paint2.setColor(this.f210d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f208b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f209c = new Paint(paint3);
    }
}
