package Q0;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f888j = {RecyclerView.f1937A0, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f889k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f890l = {RecyclerView.f1937A0, RecyclerView.f1937A0, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f891a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f892b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f893c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f894e;

    /* renamed from: f, reason: collision with root package name */
    public final int f895f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f896g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f891a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f894e = C.a.d(-16777216, 20);
        this.f895f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f892b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f893c = new Paint(paint3);
    }
}
