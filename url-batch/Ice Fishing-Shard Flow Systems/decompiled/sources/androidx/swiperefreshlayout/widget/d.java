package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f4031a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4032b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4033c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4034d;

    /* renamed from: e, reason: collision with root package name */
    public float f4035e;

    /* renamed from: f, reason: collision with root package name */
    public float f4036f;

    /* renamed from: g, reason: collision with root package name */
    public float f4037g;

    /* renamed from: h, reason: collision with root package name */
    public float f4038h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f4039i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f4040k;

    /* renamed from: l, reason: collision with root package name */
    public float f4041l;

    /* renamed from: m, reason: collision with root package name */
    public float f4042m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4043n;

    /* renamed from: o, reason: collision with root package name */
    public Path f4044o;

    /* renamed from: p, reason: collision with root package name */
    public float f4045p;

    /* renamed from: q, reason: collision with root package name */
    public float f4046q;

    /* renamed from: r, reason: collision with root package name */
    public int f4047r;

    /* renamed from: s, reason: collision with root package name */
    public int f4048s;

    /* renamed from: t, reason: collision with root package name */
    public int f4049t;

    /* renamed from: u, reason: collision with root package name */
    public int f4050u;

    public d() {
        Paint paint = new Paint();
        this.f4032b = paint;
        Paint paint2 = new Paint();
        this.f4033c = paint2;
        Paint paint3 = new Paint();
        this.f4034d = paint3;
        this.f4035e = 0.0f;
        this.f4036f = 0.0f;
        this.f4037g = 0.0f;
        this.f4038h = 5.0f;
        this.f4045p = 1.0f;
        this.f4049t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i2) {
        this.j = i2;
        this.f4050u = this.f4039i[i2];
    }
}
