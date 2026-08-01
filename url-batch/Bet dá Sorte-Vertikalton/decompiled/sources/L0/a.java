package L0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f467j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f468k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f469l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f470a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f471b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f472c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f473e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f475g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f470a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f473e = C.a.d(-16777216, 20);
        this.f474f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f471b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f472c = new Paint(paint3);
    }
}
