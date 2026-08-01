package f2;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1728i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f1729j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1730k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1731l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1732a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1733b;
    public final Paint c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1735e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1736f;
    public final Path g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f1732a = paint2;
        this.f1734d = c0.a.d(-16777216, 68);
        this.f1735e = c0.a.d(-16777216, 20);
        this.f1736f = c0.a.d(-16777216, 0);
        paint2.setColor(this.f1734d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1733b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
