package M0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f547b;

    /* renamed from: c, reason: collision with root package name */
    public final float f548c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f549e;

    /* renamed from: f, reason: collision with root package name */
    public float f550f;

    /* renamed from: g, reason: collision with root package name */
    public float f551g;

    public q(float f2, float f3, float f4, float f5) {
        this.f547b = f2;
        this.f548c = f3;
        this.d = f4;
        this.f549e = f5;
    }

    @Override // M0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f554a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f547b, this.f548c, this.d, this.f549e);
        path.arcTo(rectF, this.f550f, this.f551g, false);
        path.transform(matrix);
    }
}
