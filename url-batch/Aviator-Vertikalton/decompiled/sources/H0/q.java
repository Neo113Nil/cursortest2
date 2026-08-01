package H0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f331b;

    /* renamed from: c, reason: collision with root package name */
    public final float f332c;

    /* renamed from: d, reason: collision with root package name */
    public final float f333d;

    /* renamed from: e, reason: collision with root package name */
    public final float f334e;

    /* renamed from: f, reason: collision with root package name */
    public float f335f;

    /* renamed from: g, reason: collision with root package name */
    public float f336g;

    public q(float f2, float f3, float f4, float f5) {
        this.f331b = f2;
        this.f332c = f3;
        this.f333d = f4;
        this.f334e = f5;
    }

    @Override // H0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f339a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f331b, this.f332c, this.f333d, this.f334e);
        path.arcTo(rectF, this.f335f, this.f336g, false);
        path.transform(matrix);
    }
}
