package H0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f330b;

    /* renamed from: c, reason: collision with root package name */
    public final float f331c;

    /* renamed from: d, reason: collision with root package name */
    public final float f332d;

    /* renamed from: e, reason: collision with root package name */
    public final float f333e;

    /* renamed from: f, reason: collision with root package name */
    public float f334f;

    /* renamed from: g, reason: collision with root package name */
    public float f335g;

    public q(float f2, float f3, float f4, float f5) {
        this.f330b = f2;
        this.f331c = f3;
        this.f332d = f4;
        this.f333e = f5;
    }

    @Override // H0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f338a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f330b, this.f331c, this.f332d, this.f333e);
        path.arcTo(rectF, this.f334f, this.f335g, false);
        path.transform(matrix);
    }
}
