package N0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f499j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f500k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f501l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f502a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f503b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f504c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f505e;

    /* renamed from: f, reason: collision with root package name */
    public final int f506f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f507g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f502a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f505e = C.a.d(-16777216, 20);
        this.f506f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f503b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f504c = new Paint(paint3);
    }
}
