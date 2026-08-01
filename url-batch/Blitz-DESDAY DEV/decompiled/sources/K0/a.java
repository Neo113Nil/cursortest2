package K0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f402j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f403k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f404l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f405a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f406b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f407c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f408e;

    /* renamed from: f, reason: collision with root package name */
    public int f409f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f410g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        this.f405a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f406b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f407c = new Paint(paint2);
    }

    public final void a(int i2) {
        this.d = E.a.d(i2, 68);
        this.f408e = E.a.d(i2, 20);
        this.f409f = E.a.d(i2, 0);
        this.f405a.setColor(this.d);
    }
}
