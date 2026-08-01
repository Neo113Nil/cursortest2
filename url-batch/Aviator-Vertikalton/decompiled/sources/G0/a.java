package G0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f205j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f206k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f207l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f208a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f209b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f210c;

    /* renamed from: d, reason: collision with root package name */
    public final int f211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f212e;

    /* renamed from: f, reason: collision with root package name */
    public final int f213f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f214g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f208a = paint2;
        this.f211d = C.a.d(-16777216, 68);
        this.f212e = C.a.d(-16777216, 20);
        this.f213f = C.a.d(-16777216, 0);
        paint2.setColor(this.f211d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f209b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f210c = new Paint(paint3);
    }
}
