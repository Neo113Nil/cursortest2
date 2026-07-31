package v5;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f7480j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f7481k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f7482l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7483a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7484b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f7485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7488f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f7489g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7490h;

    public a() {
        Paint paint = new Paint();
        this.f7490h = paint;
        Paint paint2 = new Paint();
        this.f7483a = paint2;
        this.f7486d = i3.a.d(-16777216, 68);
        this.f7487e = i3.a.d(-16777216, 20);
        this.f7488f = i3.a.d(-16777216, 0);
        paint2.setColor(this.f7486d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f7484b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f7485c = new Paint(paint3);
    }
}
