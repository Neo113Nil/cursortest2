package H0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f308b;

    /* renamed from: c, reason: collision with root package name */
    public final float f309c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f310e;

    /* renamed from: f, reason: collision with root package name */
    public float f311f;

    /* renamed from: g, reason: collision with root package name */
    public float f312g;

    public q(float f2, float f3, float f4, float f5) {
        this.f308b = f2;
        this.f309c = f3;
        this.d = f4;
        this.f310e = f5;
    }

    @Override // H0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f315a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f308b, this.f309c, this.d, this.f310e);
        path.arcTo(rectF, this.f311f, this.f312g, false);
        path.transform(matrix);
    }
}
