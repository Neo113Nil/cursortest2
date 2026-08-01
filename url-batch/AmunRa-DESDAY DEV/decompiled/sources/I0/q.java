package I0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f320b;

    /* renamed from: c, reason: collision with root package name */
    public final float f321c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f322e;

    /* renamed from: f, reason: collision with root package name */
    public float f323f;

    /* renamed from: g, reason: collision with root package name */
    public float f324g;

    public q(float f2, float f3, float f4, float f5) {
        this.f320b = f2;
        this.f321c = f3;
        this.d = f4;
        this.f322e = f5;
    }

    @Override // I0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f327a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f320b, this.f321c, this.d, this.f322e);
        path.arcTo(rectF, this.f323f, this.f324g, false);
        path.transform(matrix);
    }
}
