package I0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f380b;

    /* renamed from: c, reason: collision with root package name */
    public final float f381c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f382e;

    /* renamed from: f, reason: collision with root package name */
    public float f383f;

    /* renamed from: g, reason: collision with root package name */
    public float f384g;

    public q(float f2, float f3, float f4, float f5) {
        this.f380b = f2;
        this.f381c = f3;
        this.d = f4;
        this.f382e = f5;
    }

    @Override // I0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f387a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f380b, this.f381c, this.d, this.f382e);
        path.arcTo(rectF, this.f383f, this.f384g, false);
        path.transform(matrix);
    }
}
