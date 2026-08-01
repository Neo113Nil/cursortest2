package I0;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f304j = {RecyclerView.f1530C0, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f305k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f306l = {RecyclerView.f1530C0, RecyclerView.f1530C0, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f307a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f308b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f309c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f310e;

    /* renamed from: f, reason: collision with root package name */
    public final int f311f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f312g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f307a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f310e = C.a.d(-16777216, 20);
        this.f311f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f308b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f309c = new Paint(paint3);
    }
}
