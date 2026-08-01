package J0;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f364j = {RecyclerView.A0, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f365k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f366l = {RecyclerView.A0, RecyclerView.A0, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f367a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f368b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f369c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f370e;

    /* renamed from: f, reason: collision with root package name */
    public final int f371f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f372g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f373h;

    public a() {
        Paint paint = new Paint();
        this.f373h = paint;
        Paint paint2 = new Paint();
        this.f367a = paint2;
        this.d = D.a.d(-16777216, 68);
        this.f370e = D.a.d(-16777216, 20);
        this.f371f = D.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f368b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f369c = new Paint(paint3);
    }
}
