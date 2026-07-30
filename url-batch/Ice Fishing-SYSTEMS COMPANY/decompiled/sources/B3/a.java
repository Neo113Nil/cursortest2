package B3;

import G.c;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f324j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f325k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f326l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f327a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f328b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f329c;

    /* renamed from: d, reason: collision with root package name */
    public final int f330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f331e;

    /* renamed from: f, reason: collision with root package name */
    public final int f332f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f333g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f334h;

    public a() {
        Paint paint = new Paint();
        this.f334h = paint;
        Paint paint2 = new Paint();
        this.f327a = paint2;
        this.f330d = c.d(-16777216, 68);
        this.f331e = c.d(-16777216, 20);
        this.f332f = c.d(-16777216, 0);
        paint2.setColor(this.f330d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f328b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f329c = new Paint(paint3);
    }
}
