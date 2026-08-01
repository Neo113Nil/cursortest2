package R0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f969b;

    /* renamed from: c, reason: collision with root package name */
    public final float f970c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f971e;

    /* renamed from: f, reason: collision with root package name */
    public float f972f;

    /* renamed from: g, reason: collision with root package name */
    public float f973g;

    public q(float f2, float f3, float f4, float f5) {
        this.f969b = f2;
        this.f970c = f3;
        this.d = f4;
        this.f971e = f5;
    }

    @Override // R0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f976a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f969b, this.f970c, this.d, this.f971e);
        path.arcTo(rectF, this.f972f, this.f973g, false);
        path.transform(matrix);
    }
}
