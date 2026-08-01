package I0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f327b;

    /* renamed from: c, reason: collision with root package name */
    public final float f328c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f329e;

    /* renamed from: f, reason: collision with root package name */
    public float f330f;

    /* renamed from: g, reason: collision with root package name */
    public float f331g;

    public q(float f2, float f3, float f4, float f5) {
        this.f327b = f2;
        this.f328c = f3;
        this.d = f4;
        this.f329e = f5;
    }

    @Override // I0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f334a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f327b, this.f328c, this.d, this.f329e);
        path.arcTo(rectF, this.f330f, this.f331g, false);
        path.transform(matrix);
    }
}
