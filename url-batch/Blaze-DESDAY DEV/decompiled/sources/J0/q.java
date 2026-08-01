package J0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f404b;

    /* renamed from: c, reason: collision with root package name */
    public final float f405c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f406e;

    /* renamed from: f, reason: collision with root package name */
    public float f407f;

    /* renamed from: g, reason: collision with root package name */
    public float f408g;

    public q(float f2, float f3, float f4, float f5) {
        this.f404b = f2;
        this.f405c = f3;
        this.d = f4;
        this.f406e = f5;
    }

    @Override // J0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f411a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f404b, this.f405c, this.d, this.f406e);
        path.arcTo(rectF, this.f407f, this.f408g, false);
        path.transform(matrix);
    }
}
