package J0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f387b;

    /* renamed from: c, reason: collision with root package name */
    public final float f388c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f389e;

    /* renamed from: f, reason: collision with root package name */
    public float f390f;

    /* renamed from: g, reason: collision with root package name */
    public float f391g;

    public q(float f2, float f3, float f4, float f5) {
        this.f387b = f2;
        this.f388c = f3;
        this.d = f4;
        this.f389e = f5;
    }

    @Override // J0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f394a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f387b, this.f388c, this.d, this.f389e);
        path.arcTo(rectF, this.f390f, this.f391g, false);
        path.transform(matrix);
    }
}
